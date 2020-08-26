package typings.awsLambda.lexMod

import typings.awsLambda.anon.Content
import typings.awsLambda.anon.ContentType
import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import typings.awsLambda.awsLambdaStrings.ElicitIntent
import typings.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[Content] = js.native
  var responseCard: js.UndefOr[ContentType] = js.native
  var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent = js.native
}

object LexDialogActionBase {
  @scala.inline
  def apply(`type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionBase]
  }
  @scala.inline
  implicit class LexDialogActionBaseOps[Self <: LexDialogActionBase] (val x: Self) extends AnyVal {
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
    def setType(value: Close | ElicitIntent | ElicitSlot | ConfirmIntent): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Content): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setResponseCard(value: ContentType): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
  }
  
}

