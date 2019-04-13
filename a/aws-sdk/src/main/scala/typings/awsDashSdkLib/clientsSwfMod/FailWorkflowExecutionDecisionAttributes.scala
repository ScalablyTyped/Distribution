package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    *  Details of the failure.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * A descriptive reason for the failure that may help in diagnostics.
    */
  var reason: js.UndefOr[FailureReason] = js.undefined
}

object FailWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(details: Data = null, reason: FailureReason = null): FailWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[FailWorkflowExecutionDecisionAttributes]
  }
}

