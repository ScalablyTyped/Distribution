package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNetworksOutput extends js.Object {
  /**
    * An array of NetworkSummary objects that contain configuration properties for each network.
    */
  var Networks: js.UndefOr[NetworkSummaryList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListNetworksOutput {
  @scala.inline
  def apply(Networks: NetworkSummaryList = null, NextToken: PaginationToken = null): ListNetworksOutput = {
    val __obj = js.Dynamic.literal()
    if (Networks != null) __obj.updateDynamic("Networks")(Networks.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNetworksOutput]
  }
}

