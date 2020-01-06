package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsServersOptionsModifyStructure extends js.Object {
  /**
    * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
    */
  var CustomDnsServers: js.UndefOr[ValueStringList] = js.native
  /**
    * Indicates whether DNS servers should be used. Specify False to delete the existing DNS servers.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object DnsServersOptionsModifyStructure {
  @scala.inline
  def apply(CustomDnsServers: ValueStringList = null, Enabled: js.UndefOr[scala.Boolean] = js.undefined): DnsServersOptionsModifyStructure = {
    val __obj = js.Dynamic.literal()
    if (CustomDnsServers != null) __obj.updateDynamic("CustomDnsServers")(CustomDnsServers.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsServersOptionsModifyStructure]
  }
}

