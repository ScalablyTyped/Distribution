package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackSetOperationOutput extends js.Object {
  /**
    * The specified stack set operation.
    */
  var StackSetOperation: js.UndefOr[StackSetOperation] = js.undefined
}

object DescribeStackSetOperationOutput {
  @scala.inline
  def apply(StackSetOperation: StackSetOperation = null): DescribeStackSetOperationOutput = {
    val __obj = js.Dynamic.literal()
    if (StackSetOperation != null) __obj.updateDynamic("StackSetOperation")(StackSetOperation)
    __obj.asInstanceOf[DescribeStackSetOperationOutput]
  }
}

