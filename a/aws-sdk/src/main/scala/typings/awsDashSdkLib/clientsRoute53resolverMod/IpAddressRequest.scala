package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpAddressRequest extends js.Object {
  /**
    * The IP address that you want to use for DNS queries.
    */
  var Ip: js.UndefOr[Ip] = js.undefined
  /**
    * The subnet that contains the IP address.
    */
  var SubnetId: awsDashSdkLib.clientsRoute53resolverMod.SubnetId
}

object IpAddressRequest {
  @scala.inline
  def apply(SubnetId: SubnetId, Ip: Ip = null): IpAddressRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId)
    if (Ip != null) __obj.updateDynamic("Ip")(Ip)
    __obj.asInstanceOf[IpAddressRequest]
  }
}

