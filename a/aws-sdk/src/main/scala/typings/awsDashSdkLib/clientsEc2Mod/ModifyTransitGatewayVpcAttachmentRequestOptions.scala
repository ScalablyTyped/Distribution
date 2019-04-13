package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTransitGatewayVpcAttachmentRequestOptions extends js.Object {
  /**
    * Enable or disable DNS support. The default is enable.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  /**
    * Enable or disable IPv6 support. The default is enable.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.undefined
}

object ModifyTransitGatewayVpcAttachmentRequestOptions {
  @scala.inline
  def apply(DnsSupport: DnsSupportValue = null, Ipv6Support: Ipv6SupportValue = null): ModifyTransitGatewayVpcAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (DnsSupport != null) __obj.updateDynamic("DnsSupport")(DnsSupport.asInstanceOf[js.Any])
    if (Ipv6Support != null) __obj.updateDynamic("Ipv6Support")(Ipv6Support.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequestOptions]
  }
}

