package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIpAddressTypeOutput extends js.Object {
  /**
    * The IP address type.
    */
  var IpAddressType: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.IpAddressType] = js.native
}

object SetIpAddressTypeOutput {
  @scala.inline
  def apply(IpAddressType: IpAddressType = null): SetIpAddressTypeOutput = {
    val __obj = js.Dynamic.literal()
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIpAddressTypeOutput]
  }
}

