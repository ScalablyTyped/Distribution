package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStacksResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the stacks.
    */
  var Stacks: js.UndefOr[StackList] = js.undefined
}

object DescribeStacksResult {
  @scala.inline
  def apply(NextToken: String = null, Stacks: StackList = null): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Stacks != null) __obj.updateDynamic("Stacks")(Stacks)
    __obj.asInstanceOf[DescribeStacksResult]
  }
}

