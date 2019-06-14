package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

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
  sealed trait CANCEL
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App receives CONFIGURE_UPDATES intent to indicate a REGISTER_UPDATE intent should be sent. */
  @js.native
  sealed trait CONFIGURE_UPDATES
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires CONFIRMATION intent when requesting affirmation from user. */
  @js.native
  sealed trait CONFIRMATION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires DATETIME intent when requesting date/time from user. */
  @js.native
  sealed trait DATETIME
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires DELIVERY_ADDRESS intent when action asks for delivery address. */
  @js.native
  sealed trait DELIVERY_ADDRESS
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires LINK intent to request user to open to link. */
  @js.native
  sealed trait LINK
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires MAIN intent for queries like [talk to $app]. */
  @js.native
  sealed trait MAIN
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App receives MEDIA_STATUS intent when the MediaResponse status is updated from user. */
  @js.native
  sealed trait MEDIA_STATUS
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires NEW_SURFACE intent when requesting handoff to a new surface from user. */
  @js.native
  sealed trait NEW_SURFACE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires NO_INPUT intent when user doesn't provide input. */
  @js.native
  sealed trait NO_INPUT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires OPTION intent when user chooses from options provided. */
  @js.native
  sealed trait OPTION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires PERMISSION intent when action invokes askForPermission. */
  @js.native
  sealed trait PERMISSION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires PLACE intent when action asks for place. */
  @js.native
  sealed trait PLACE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires REGISTER_UPDATE intent when requesting user to register for proactive updates. */
  @js.native
  sealed trait REGISTER_UPDATE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires SIGN_IN intent when requesting sign-in from user. */
  @js.native
  sealed trait SIGN_IN
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires TEXT intent when action issues ask intent. */
  @js.native
  sealed trait TEXT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires TRANSACTION_DECISION intent when action asks for transaction decision. */
  @js.native
  sealed trait TRANSACTION_DECISION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /** App fires TRANSACTION_REQUIREMENTS_CHECK intent when action sets up transaction. */
  @js.native
  sealed trait TRANSACTION_REQUIREMENTS_CHECK
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents
  
  /* 12 */ val CANCEL: CANCEL with scala.Double = js.native
  /* 15 */ val CONFIGURE_UPDATES: CONFIGURE_UPDATES with scala.Double = js.native
  /* 8 */ val CONFIRMATION: CONFIRMATION with scala.Double = js.native
  /* 9 */ val DATETIME: DATETIME with scala.Double = js.native
  /* 5 */ val DELIVERY_ADDRESS: DELIVERY_ADDRESS with scala.Double = js.native
  /* 16 */ val LINK: LINK with scala.Double = js.native
  /* 0 */ val MAIN: MAIN with scala.Double = js.native
  /* 17 */ val MEDIA_STATUS: MEDIA_STATUS with scala.Double = js.native
  /* 13 */ val NEW_SURFACE: NEW_SURFACE with scala.Double = js.native
  /* 11 */ val NO_INPUT: NO_INPUT with scala.Double = js.native
  /* 3 */ val OPTION: OPTION with scala.Double = js.native
  /* 2 */ val PERMISSION: PERMISSION with scala.Double = js.native
  /* 7 */ val PLACE: PLACE with scala.Double = js.native
  /* 14 */ val REGISTER_UPDATE: REGISTER_UPDATE with scala.Double = js.native
  /* 10 */ val SIGN_IN: SIGN_IN with scala.Double = js.native
  /* 1 */ val TEXT: TEXT with scala.Double = js.native
  /* 6 */ val TRANSACTION_DECISION: TRANSACTION_DECISION with scala.Double = js.native
  /* 4 */ val TRANSACTION_REQUIREMENTS_CHECK: TRANSACTION_REQUIREMENTS_CHECK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[actionsDashOnDashGoogleLib.assistantDashAppMod.StandardIntents with scala.Double] = js.native
}

