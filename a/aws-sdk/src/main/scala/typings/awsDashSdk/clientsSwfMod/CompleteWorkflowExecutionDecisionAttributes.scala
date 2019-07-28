package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * The result of the workflow execution. The form of the result is implementation defined.
    */
  var result: js.UndefOr[Data] = js.undefined
}

object CompleteWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(result: Data = null): CompleteWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[CompleteWorkflowExecutionDecisionAttributes]
  }
}

