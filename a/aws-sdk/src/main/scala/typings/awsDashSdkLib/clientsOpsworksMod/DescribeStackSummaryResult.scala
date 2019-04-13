package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackSummaryResult extends js.Object {
  /**
    * A StackSummary object that contains the results.
    */
  var StackSummary: js.UndefOr[StackSummary] = js.undefined
}

object DescribeStackSummaryResult {
  @scala.inline
  def apply(StackSummary: StackSummary = null): DescribeStackSummaryResult = {
    val __obj = js.Dynamic.literal()
    if (StackSummary != null) __obj.updateDynamic("StackSummary")(StackSummary)
    __obj.asInstanceOf[DescribeStackSummaryResult]
  }
}

