package typings.awsLambda.lexMod

import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.awsLambdaStrings.Failed_
import typings.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionClose
  extends LexDialogActionBase
     with LexDialogAction {
  var fulfillmentState: Fulfilled | Failed_ = js.native
  @JSName("type")
  var type_LexDialogActionClose: Close = js.native
}

object LexDialogActionClose {
  @scala.inline
  def apply(fulfillmentState: Fulfilled | Failed_, `type`: Close): LexDialogActionClose = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionClose]
  }
  @scala.inline
  implicit class LexDialogActionCloseOps[Self <: LexDialogActionClose] (val x: Self) extends AnyVal {
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
    def setFulfillmentState(value: Fulfilled | Failed_): Self = this.set("fulfillmentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Close): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

