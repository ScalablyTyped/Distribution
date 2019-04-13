package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailableManagementCidrRangesRequest extends js.Object {
  /**
    * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block).
    */
  var ManagementCidrRangeConstraint: awsDashSdkLib.clientsWorkspacesMod.ManagementCidrRangeConstraint
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAvailableManagementCidrRangesRequest {
  @scala.inline
  def apply(
    ManagementCidrRangeConstraint: ManagementCidrRangeConstraint,
    MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined,
    NextToken: PaginationToken = null
  ): ListAvailableManagementCidrRangesRequest = {
    val __obj = js.Dynamic.literal(ManagementCidrRangeConstraint = ManagementCidrRangeConstraint)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAvailableManagementCidrRangesRequest]
  }
}

