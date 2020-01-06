package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableManagementCidrRangesResult extends js.Object {
  /**
    * The list of available IP address ranges, specified as IPv4 CIDR blocks.
    */
  var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAvailableManagementCidrRangesResult {
  @scala.inline
  def apply(ManagementCidrRanges: DedicatedTenancyCidrRangeList = null, NextToken: PaginationToken = null): ListAvailableManagementCidrRangesResult = {
    val __obj = js.Dynamic.literal()
    if (ManagementCidrRanges != null) __obj.updateDynamic("ManagementCidrRanges")(ManagementCidrRanges.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
  }
}

