package typings.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionConfirmIntent
  extends LexDialogActionBase
     with LexDialogAction {
  var intentName: String = js.native
  var slots: StringDictionary[String | Null] = js.native
  @JSName("type")
  var type_LexDialogActionConfirmIntent: ConfirmIntent = js.native
}

object LexDialogActionConfirmIntent {
  @scala.inline
  def apply(intentName: String, slots: StringDictionary[String | Null], `type`: ConfirmIntent): LexDialogActionConfirmIntent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionConfirmIntent]
  }
  @scala.inline
  implicit class LexDialogActionConfirmIntentOps[Self <: LexDialogActionConfirmIntent] (val x: Self) extends AnyVal {
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
    def setIntentName(value: String): Self = this.set("intentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlots(value: StringDictionary[String | Null]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ConfirmIntent): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

