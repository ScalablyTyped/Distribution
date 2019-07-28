package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltInArgNames extends js.Object

@JSImport("actions-on-google/assistant-app", "BuiltInArgNames")
@js.native
object BuiltInArgNames extends js.Object {
  /**
    * Confirmation argument.
    */
  @js.native
  sealed trait CONFIRMATION extends BuiltInArgNames
  
  /**
    * DateTime argument.
    */
  @js.native
  sealed trait DATETIME extends BuiltInArgNames
  
  /**
    * Delivery address value argument.
    */
  @js.native
  sealed trait DELIVERY_ADDRESS_VALUE extends BuiltInArgNames
  
  /**
    * Flag representing finality of NO_INPUT intent.
    */
  @js.native
  sealed trait IS_FINAL_REPROMPT extends BuiltInArgNames
  
  /** Link request result argument. */
  @js.native
  sealed trait LINK extends BuiltInArgNames
  
  /** MediaStatus value argument. */
  @js.native
  sealed trait MEDIA_STATUS extends BuiltInArgNames
  
  /**
    * New surface value argument.
    */
  @js.native
  sealed trait NEW_SURFACE extends BuiltInArgNames
  
  /**
    * Option selected argument.
    */
  @js.native
  sealed trait OPTION extends BuiltInArgNames
  
  /**
    * Permission granted argument.
    */
  @js.native
  sealed trait PERMISSION_GRANTED extends BuiltInArgNames
  
  /**
    * Place value argument.
    */
  @js.native
  sealed trait PLACE extends BuiltInArgNames
  
  /** Update registration value argument. */
  @js.native
  sealed trait REGISTER_UPDATE extends BuiltInArgNames
  
  /**
    * Reprompt count for consecutive NO_INPUT intents.
    */
  @js.native
  sealed trait REPROMPT_COUNT extends BuiltInArgNames
  
  /**
    * Sign in status argument.
    */
  @js.native
  sealed trait SIGN_IN extends BuiltInArgNames
  
  /**
    * Transactions decision argument.
    */
  @js.native
  sealed trait TRANSACTION_DECISION_VALUE extends BuiltInArgNames
  
  /**
    * Transaction requirements check result argument.
    */
  @js.native
  sealed trait TRANSACTION_REQ_CHECK_RESULT extends BuiltInArgNames
  
  /* 6 */ val CONFIRMATION: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.CONFIRMATION with Double = js.native
  /* 7 */ val DATETIME: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.DATETIME with Double = js.native
  /* 3 */ val DELIVERY_ADDRESS_VALUE: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.DELIVERY_ADDRESS_VALUE with Double = js.native
  /* 10 */ val IS_FINAL_REPROMPT: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.IS_FINAL_REPROMPT with Double = js.native
  /* 13 */ val LINK: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.LINK with Double = js.native
  /* 14 */ val MEDIA_STATUS: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.MEDIA_STATUS with Double = js.native
  /* 11 */ val NEW_SURFACE: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.NEW_SURFACE with Double = js.native
  /* 1 */ val OPTION: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.OPTION with Double = js.native
  /* 0 */ val PERMISSION_GRANTED: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.PERMISSION_GRANTED with Double = js.native
  /* 5 */ val PLACE: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.PLACE with Double = js.native
  /* 12 */ val REGISTER_UPDATE: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.REGISTER_UPDATE with Double = js.native
  /* 9 */ val REPROMPT_COUNT: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.REPROMPT_COUNT with Double = js.native
  /* 8 */ val SIGN_IN: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.SIGN_IN with Double = js.native
  /* 4 */ val TRANSACTION_DECISION_VALUE: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.TRANSACTION_DECISION_VALUE with Double = js.native
  /* 2 */ val TRANSACTION_REQ_CHECK_RESULT: typings.actionsDashOnDashGoogle.assistantDashAppMod.BuiltInArgNames.TRANSACTION_REQ_CHECK_RESULT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltInArgNames with Double] = js.native
}

