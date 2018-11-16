package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

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
  sealed trait CONFIRMATION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * DateTime argument.
       */
  @js.native
  sealed trait DATETIME
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Delivery address value argument.
       */
  @js.native
  sealed trait DELIVERY_ADDRESS_VALUE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Flag representing finality of NO_INPUT intent.
       */
  @js.native
  sealed trait IS_FINAL_REPROMPT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /** Link request result argument. */
  @js.native
  sealed trait LINK
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /** MediaStatus value argument. */
  @js.native
  sealed trait MEDIA_STATUS
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * New surface value argument.
       */
  @js.native
  sealed trait NEW_SURFACE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Option selected argument.
       */
  @js.native
  sealed trait OPTION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Permission granted argument.
       */
  @js.native
  sealed trait PERMISSION_GRANTED
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Place value argument.
       */
  @js.native
  sealed trait PLACE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /** Update registration value argument. */
  @js.native
  sealed trait REGISTER_UPDATE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Reprompt count for consecutive NO_INPUT intents.
       */
  @js.native
  sealed trait REPROMPT_COUNT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Sign in status argument.
       */
  @js.native
  sealed trait SIGN_IN
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Transactions decision argument.
       */
  @js.native
  sealed trait TRANSACTION_DECISION_VALUE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  /**
       * Transaction requirements check result argument.
       */
  @js.native
  sealed trait TRANSACTION_REQ_CHECK_RESULT
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames
  
  val CONFIRMATION: CONFIRMATION with java.lang.String = js.native
  val DATETIME: DATETIME with java.lang.String = js.native
  val DELIVERY_ADDRESS_VALUE: DELIVERY_ADDRESS_VALUE with java.lang.String = js.native
  val IS_FINAL_REPROMPT: IS_FINAL_REPROMPT with java.lang.String = js.native
  val LINK: LINK with java.lang.String = js.native
  val MEDIA_STATUS: MEDIA_STATUS with java.lang.String = js.native
  val NEW_SURFACE: NEW_SURFACE with java.lang.String = js.native
  val OPTION: OPTION with java.lang.String = js.native
  val PERMISSION_GRANTED: PERMISSION_GRANTED with java.lang.String = js.native
  val PLACE: PLACE with java.lang.String = js.native
  val REGISTER_UPDATE: REGISTER_UPDATE with java.lang.String = js.native
  val REPROMPT_COUNT: REPROMPT_COUNT with java.lang.String = js.native
  val SIGN_IN: SIGN_IN with java.lang.String = js.native
  val TRANSACTION_DECISION_VALUE: TRANSACTION_DECISION_VALUE with java.lang.String = js.native
  val TRANSACTION_REQ_CHECK_RESULT: TRANSACTION_REQ_CHECK_RESULT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.BuiltInArgNames with java.lang.String
  ] = js.native
}

