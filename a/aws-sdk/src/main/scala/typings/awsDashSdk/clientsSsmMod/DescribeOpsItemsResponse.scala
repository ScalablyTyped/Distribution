package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOpsItemsResponse extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OpsItems.
    */
  var OpsItemSummaries: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OpsItemSummaries] = js.native
}

object DescribeOpsItemsResponse {
  @scala.inline
  def apply(NextToken: String = null, OpsItemSummaries: OpsItemSummaries = null): DescribeOpsItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OpsItemSummaries != null) __obj.updateDynamic("OpsItemSummaries")(OpsItemSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOpsItemsResponse]
  }
}

