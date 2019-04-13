package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkInterfacePermissionResult extends js.Object {
  /**
    * Information about the permission for the network interface.
    */
  var InterfacePermission: js.UndefOr[NetworkInterfacePermission] = js.undefined
}

object CreateNetworkInterfacePermissionResult {
  @scala.inline
  def apply(InterfacePermission: NetworkInterfacePermission = null): CreateNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    if (InterfacePermission != null) __obj.updateDynamic("InterfacePermission")(InterfacePermission)
    __obj.asInstanceOf[CreateNetworkInterfacePermissionResult]
  }
}

