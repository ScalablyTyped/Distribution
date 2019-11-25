package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperRegisterupdateMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TriggerContextTimeContextFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterUpdateOptions extends js.Object {
  /**
    * The necessary arguments to fulfill the intent triggered on update.
    * These can be retrieved using {@link Arguments#get|conv.arguments.get}.
    * @public
    */
  var arguments: js.Array[GoogleActionsV2Argument]
  /**
    * The high-level frequency of the recurring update.
    * @public
    */
  var frequency: GoogleActionsV2TriggerContextTimeContextFrequency
  /**
    * The Dialogflow/Actions SDK intent name to be triggered when the update is received.
    * @public
    */
  var intent: String
}

object RegisterUpdateOptions {
  @scala.inline
  def apply(
    arguments: js.Array[GoogleActionsV2Argument],
    frequency: GoogleActionsV2TriggerContextTimeContextFrequency,
    intent: String
  ): RegisterUpdateOptions = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterUpdateOptions]
  }
}

