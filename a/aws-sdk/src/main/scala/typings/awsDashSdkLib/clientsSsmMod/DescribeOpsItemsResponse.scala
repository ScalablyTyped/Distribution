package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOpsItemsResponse extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of OpsItems.
    */
  var OpsItemSummaries: js.UndefOr[OpsItemSummaries] = js.undefined
}

object DescribeOpsItemsResponse {
  @scala.inline
  def apply(NextToken: String = null, OpsItemSummaries: OpsItemSummaries = null): DescribeOpsItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OpsItemSummaries != null) __obj.updateDynamic("OpsItemSummaries")(OpsItemSummaries)
    __obj.asInstanceOf[DescribeOpsItemsResponse]
  }
}

