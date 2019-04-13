package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStacksResult extends js.Object {
  /**
    * An array of Stack objects that describe the stacks.
    */
  var Stacks: js.UndefOr[Stacks] = js.undefined
}

object DescribeStacksResult {
  @scala.inline
  def apply(Stacks: Stacks = null): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    if (Stacks != null) __obj.updateDynamic("Stacks")(Stacks)
    __obj.asInstanceOf[DescribeStacksResult]
  }
}

