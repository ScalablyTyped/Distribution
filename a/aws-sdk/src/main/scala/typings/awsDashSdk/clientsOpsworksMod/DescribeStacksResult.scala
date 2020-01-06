package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksResult extends js.Object {
  /**
    * An array of Stack objects that describe the stacks.
    */
  var Stacks: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Stacks] = js.native
}

object DescribeStacksResult {
  @scala.inline
  def apply(Stacks: Stacks = null): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    if (Stacks != null) __obj.updateDynamic("Stacks")(Stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStacksResult]
  }
}

