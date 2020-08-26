package typings.actionsOnGoogle.registerupdateMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TriggerContextTimeContextFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUpdateOptions extends js.Object {
  /**
    * The necessary arguments to fulfill the intent triggered on update.
    * These can be retrieved using {@link Arguments#get|conv.arguments.get}.
    * @public
    */
  var arguments: js.Array[GoogleActionsV2Argument] = js.native
  /**
    * The high-level frequency of the recurring update.
    * @public
    */
  var frequency: GoogleActionsV2TriggerContextTimeContextFrequency = js.native
  /**
    * The Dialogflow/Actions SDK intent name to be triggered when the update is received.
    * @public
    */
  var intent: String = js.native
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
  @scala.inline
  implicit class RegisterUpdateOptionsOps[Self <: RegisterUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequency(value: GoogleActionsV2TriggerContextTimeContextFrequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
  }
  
}

