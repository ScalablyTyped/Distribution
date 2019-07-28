package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailableManagementCidrRangesResult extends js.Object {
  /**
    * The list of available IP address ranges, specified as IPv4 CIDR blocks.
    */
  var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.undefined
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAvailableManagementCidrRangesResult {
  @scala.inline
  def apply(ManagementCidrRanges: DedicatedTenancyCidrRangeList = null, NextToken: PaginationToken = null): ListAvailableManagementCidrRangesResult = {
    val __obj = js.Dynamic.literal()
    if (ManagementCidrRanges != null) __obj.updateDynamic("ManagementCidrRanges")(ManagementCidrRanges)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
  }
}

