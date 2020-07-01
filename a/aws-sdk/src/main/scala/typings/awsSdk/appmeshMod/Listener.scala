package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[HealthCheckPolicy] = js.native
  /**
    * The port mapping information for the listener.
    */
  var portMapping: PortMapping = js.native
  var timeout: js.UndefOr[ListenerTimeout] = js.native
  /**
    * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
    */
  var tls: js.UndefOr[ListenerTls] = js.native
}

object Listener {
  @scala.inline
  def apply(
    portMapping: PortMapping,
    healthCheck: HealthCheckPolicy = null,
    timeout: ListenerTimeout = null,
    tls: ListenerTls = null
  ): Listener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
}

