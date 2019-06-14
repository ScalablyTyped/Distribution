package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpec extends js.Object {
  /**
    * The backends that the virtual node is expected to send outbound traffic to.
    */
  var backends: js.UndefOr[Backends] = js.undefined
  /**
    * The listeners that the virtual node is expected to receive inbound traffic from.
    Currently only one listener is supported per virtual node.
    */
  var listeners: js.UndefOr[Listeners] = js.undefined
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Logging] = js.undefined
  /**
    * The service discovery information for the virtual node. If your virtual node does not
    expect ingress traffic, you can omit this parameter.
    */
  var serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined
}

object VirtualNodeSpec {
  @scala.inline
  def apply(
    backends: Backends = null,
    listeners: Listeners = null,
    logging: Logging = null,
    serviceDiscovery: ServiceDiscovery = null
  ): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    if (backends != null) __obj.updateDynamic("backends")(backends)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery)
    __obj.asInstanceOf[VirtualNodeSpec]
  }
}

