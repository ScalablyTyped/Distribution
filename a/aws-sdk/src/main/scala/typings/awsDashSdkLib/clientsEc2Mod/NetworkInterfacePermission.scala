package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfacePermission extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.undefined
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: js.UndefOr[String] = js.undefined
  /**
    * The type of permission.
    */
  var Permission: js.UndefOr[InterfacePermissionType] = js.undefined
  /**
    * Information about the state of the permission.
    */
  var PermissionState: js.UndefOr[NetworkInterfacePermissionState] = js.undefined
}

object NetworkInterfacePermission {
  @scala.inline
  def apply(
    AwsAccountId: String = null,
    AwsService: String = null,
    NetworkInterfaceId: String = null,
    NetworkInterfacePermissionId: String = null,
    Permission: InterfacePermissionType = null,
    PermissionState: NetworkInterfacePermissionState = null
  ): NetworkInterfacePermission = {
    val __obj = js.Dynamic.literal()
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId)
    if (AwsService != null) __obj.updateDynamic("AwsService")(AwsService)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (NetworkInterfacePermissionId != null) __obj.updateDynamic("NetworkInterfacePermissionId")(NetworkInterfacePermissionId)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    if (PermissionState != null) __obj.updateDynamic("PermissionState")(PermissionState)
    __obj.asInstanceOf[NetworkInterfacePermission]
  }
}

