package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StandardIntents extends js.Object

@JSImport("actions-on-google/assistant-app", "StandardIntents")
@js.native
object StandardIntents extends js.Object {
  /** App fires CANCEL intent when user exits app mid-dialog. */
  @js.native
  sealed trait CANCEL extends StandardIntents
  
  /** App receives CONFIGURE_UPDATES intent to indicate a REGISTER_UPDATE intent should be sent. */
  @js.native
  sealed trait CONFIGURE_UPDATES extends StandardIntents
  
  /** App fires CONFIRMATION intent when requesting affirmation from user. */
  @js.native
  sealed trait CONFIRMATION extends StandardIntents
  
  /** App fires DATETIME intent when requesting date/time from user. */
  @js.native
  sealed trait DATETIME extends StandardIntents
  
  /** App fires DELIVERY_ADDRESS intent when action asks for delivery address. */
  @js.native
  sealed trait DELIVERY_ADDRESS extends StandardIntents
  
  /** App fires LINK intent to request user to open to link. */
  @js.native
  sealed trait LINK extends StandardIntents
  
  /** App fires MAIN intent for queries like [talk to $app]. */
  @js.native
  sealed trait MAIN extends StandardIntents
  
  /** App receives MEDIA_STATUS intent when the MediaResponse status is updated from user. */
  @js.native
  sealed trait MEDIA_STATUS extends StandardIntents
  
  /** App fires NEW_SURFACE intent when requesting handoff to a new surface from user. */
  @js.native
  sealed trait NEW_SURFACE extends StandardIntents
  
  /** App fires NO_INPUT intent when user doesn't provide input. */
  @js.native
  sealed trait NO_INPUT extends StandardIntents
  
  /** App fires OPTION intent when user chooses from options provided. */
  @js.native
  sealed trait OPTION extends StandardIntents
  
  /** App fires PERMISSION intent when action invokes askForPermission. */
  @js.native
  sealed trait PERMISSION extends StandardIntents
  
  /** App fires PLACE intent when action asks for place. */
  @js.native
  sealed trait PLACE extends StandardIntents
  
  /** App fires REGISTER_UPDATE intent when requesting user to register for proactive updates. */
  @js.native
  sealed trait REGISTER_UPDATE extends StandardIntents
  
  /** App fires SIGN_IN intent when requesting sign-in from user. */
  @js.native
  sealed trait SIGN_IN extends StandardIntents
  
  /** App fires TEXT intent when action issues ask intent. */
  @js.native
  sealed trait TEXT extends StandardIntents
  
  /** App fires TRANSACTION_DECISION intent when action asks for transaction decision. */
  @js.native
  sealed trait TRANSACTION_DECISION extends StandardIntents
  
  /** App fires TRANSACTION_REQUIREMENTS_CHECK intent when action sets up transaction. */
  @js.native
  sealed trait TRANSACTION_REQUIREMENTS_CHECK extends StandardIntents
  
  /* 12 */ val CANCEL: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.CANCEL with Double = js.native
  /* 15 */ val CONFIGURE_UPDATES: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.CONFIGURE_UPDATES with Double = js.native
  /* 8 */ val CONFIRMATION: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.CONFIRMATION with Double = js.native
  /* 9 */ val DATETIME: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.DATETIME with Double = js.native
  /* 5 */ val DELIVERY_ADDRESS: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.DELIVERY_ADDRESS with Double = js.native
  /* 16 */ val LINK: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.LINK with Double = js.native
  /* 0 */ val MAIN: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.MAIN with Double = js.native
  /* 17 */ val MEDIA_STATUS: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.MEDIA_STATUS with Double = js.native
  /* 13 */ val NEW_SURFACE: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.NEW_SURFACE with Double = js.native
  /* 11 */ val NO_INPUT: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.NO_INPUT with Double = js.native
  /* 3 */ val OPTION: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.OPTION with Double = js.native
  /* 2 */ val PERMISSION: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.PERMISSION with Double = js.native
  /* 7 */ val PLACE: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.PLACE with Double = js.native
  /* 14 */ val REGISTER_UPDATE: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.REGISTER_UPDATE with Double = js.native
  /* 10 */ val SIGN_IN: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.SIGN_IN with Double = js.native
  /* 1 */ val TEXT: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.TEXT with Double = js.native
  /* 6 */ val TRANSACTION_DECISION: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.TRANSACTION_DECISION with Double = js.native
  /* 4 */ val TRANSACTION_REQUIREMENTS_CHECK: typings.actionsDashOnDashGoogle.assistantDashAppMod.StandardIntents.TRANSACTION_REQUIREMENTS_CHECK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StandardIntents with Double] = js.native
}

