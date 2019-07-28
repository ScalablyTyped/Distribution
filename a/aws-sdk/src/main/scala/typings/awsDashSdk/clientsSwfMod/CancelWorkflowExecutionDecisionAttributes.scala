package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    *  Details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.undefined
}

object CancelWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(details: Data = null): CancelWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
  }
}

