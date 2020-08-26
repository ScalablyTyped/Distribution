package typings.awsLambda.lexMod

import typings.awsLambda.awsLambdaStrings.ElicitIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionElicitIntent
  extends LexDialogActionBase
     with LexDialogAction {
  @JSName("type")
  var type_LexDialogActionElicitIntent: ElicitIntent = js.native
}

object LexDialogActionElicitIntent {
  @scala.inline
  def apply(`type`: ElicitIntent): LexDialogActionElicitIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionElicitIntent]
  }
  @scala.inline
  implicit class LexDialogActionElicitIntentOps[Self <: LexDialogActionElicitIntent] (val x: Self) extends AnyVal {
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
    def setType(value: ElicitIntent): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

