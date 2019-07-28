package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDhcpOptionsResult extends js.Object {
  /**
    * A set of DHCP options.
    */
  var DhcpOptions: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.DhcpOptions] = js.undefined
}

object CreateDhcpOptionsResult {
  @scala.inline
  def apply(DhcpOptions: DhcpOptions = null): CreateDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (DhcpOptions != null) __obj.updateDynamic("DhcpOptions")(DhcpOptions)
    __obj.asInstanceOf[CreateDhcpOptionsResult]
  }
}

