package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNetworkInterfacePermissionsResult extends js.Object {
  /**
    * The network interface permissions.
    */
  var NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeNetworkInterfacePermissionsResult {
  @scala.inline
  def apply(NetworkInterfacePermissions: NetworkInterfacePermissionList = null, NextToken: String = null): DescribeNetworkInterfacePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkInterfacePermissions != null) __obj.updateDynamic("NetworkInterfacePermissions")(NetworkInterfacePermissions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsResult]
  }
}

