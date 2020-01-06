package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfacePermissionsRequest extends js.Object {
  /**
    * One or more filters.    network-interface-permission.network-interface-permission-id - The ID of the permission.    network-interface-permission.network-interface-id - The ID of the network interface.    network-interface-permission.aws-account-id - The AWS account ID.    network-interface-permission.aws-service - The AWS service.    network-interface-permission.permission - The type of permission (INSTANCE-ATTACH | EIP-ASSOCIATE).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. If this parameter is not specified, up to 50 results are returned by default.
    */
  var MaxResults: js.UndefOr[DescribeNetworkInterfacePermissionsMaxResults] = js.native
  /**
    * One or more network interface permission IDs.
    */
  var NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeNetworkInterfacePermissionsRequest {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NetworkInterfacePermissionIds: NetworkInterfacePermissionIdList = null,
    NextToken: String = null
  ): DescribeNetworkInterfacePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NetworkInterfacePermissionIds != null) __obj.updateDynamic("NetworkInterfacePermissionIds")(NetworkInterfacePermissionIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsRequest]
  }
}

