package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpAddressUpdate extends js.Object {
  /**
    * The new IP address.
    */
  var Ip: js.UndefOr[Ip] = js.undefined
  /**
    *  Only when removing an IP address from a resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
    */
  var IpId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
    */
  var SubnetId: js.UndefOr[SubnetId] = js.undefined
}

object IpAddressUpdate {
  @scala.inline
  def apply(Ip: Ip = null, IpId: ResourceId = null, SubnetId: SubnetId = null): IpAddressUpdate = {
    val __obj = js.Dynamic.literal()
    if (Ip != null) __obj.updateDynamic("Ip")(Ip)
    if (IpId != null) __obj.updateDynamic("IpId")(IpId)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[IpAddressUpdate]
  }
}

