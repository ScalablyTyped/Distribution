package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStacksRequest extends js.Object {
  /**
    * An array of stack IDs that specify the stacks to be described. If you omit this parameter, DescribeStacks returns a description of every stack.
    */
  var StackIds: js.UndefOr[Strings] = js.undefined
}

object DescribeStacksRequest {
  @scala.inline
  def apply(StackIds: Strings = null): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    if (StackIds != null) __obj.updateDynamic("StackIds")(StackIds)
    __obj.asInstanceOf[DescribeStacksRequest]
  }
}

