package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    *  Details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.native
}

object CancelWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(details: Data = null): CancelWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
  }
}

