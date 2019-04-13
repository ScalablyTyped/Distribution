package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDiscovery extends js.Object {
  /**
    * Specifies the DNS information for the virtual node.
    */
  var dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
}

object ServiceDiscovery {
  @scala.inline
  def apply(dns: DnsServiceDiscovery = null): ServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    if (dns != null) __obj.updateDynamic("dns")(dns)
    __obj.asInstanceOf[ServiceDiscovery]
  }
}

