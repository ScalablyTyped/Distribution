package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpec extends js.Object {
  /**
    * A reference to an object that represents the defaults for backends.
    */
  var backendDefaults: js.UndefOr[BackendDefaults] = js.native
  /**
    * The backends that the virtual node is expected to send outbound traffic to.
    */
  var backends: js.UndefOr[Backends] = js.native
  /**
    * The listener that the virtual node is expected to receive inbound traffic from.
    You can specify one listener.
    */
  var listeners: js.UndefOr[Listeners] = js.native
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    * The service discovery information for the virtual node. If your virtual node does not
    expect ingress traffic, you can omit this parameter. If you specify a listener,
    then you must specify service discovery information.
    */
  var serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.native
}

object VirtualNodeSpec {
  @scala.inline
  def apply(
    backendDefaults: BackendDefaults = null,
    backends: Backends = null,
    listeners: Listeners = null,
    logging: Logging = null,
    serviceDiscovery: ServiceDiscovery = null
  ): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    if (backendDefaults != null) __obj.updateDynamic("backendDefaults")(backendDefaults.asInstanceOf[js.Any])
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (serviceDiscovery != null) __obj.updateDynamic("serviceDiscovery")(serviceDiscovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpec]
  }
}

