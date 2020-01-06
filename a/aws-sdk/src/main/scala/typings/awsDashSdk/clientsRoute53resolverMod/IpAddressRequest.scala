package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressRequest extends js.Object {
  /**
    * The IP address that you want to use for DNS queries.
    */
  var Ip: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Ip] = js.native
  /**
    * The subnet that contains the IP address.
    */
  var SubnetId: typings.awsDashSdk.clientsRoute53resolverMod.SubnetId = js.native
}

object IpAddressRequest {
  @scala.inline
  def apply(SubnetId: SubnetId, Ip: Ip = null): IpAddressRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    if (Ip != null) __obj.updateDynamic("Ip")(Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressRequest]
  }
}

