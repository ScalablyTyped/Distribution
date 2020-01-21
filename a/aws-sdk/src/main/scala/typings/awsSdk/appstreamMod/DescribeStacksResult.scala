package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the stacks.
    */
  var Stacks: js.UndefOr[StackList] = js.native
}

object DescribeStacksResult {
  @scala.inline
  def apply(NextToken: String = null, Stacks: StackList = null): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Stacks != null) __obj.updateDynamic("Stacks")(Stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStacksResult]
  }
}

