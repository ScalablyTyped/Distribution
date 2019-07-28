package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined
  /**
    * The port mapping information for the listener.
    */
  var portMapping: PortMapping
}

object Listener {
  @scala.inline
  def apply(portMapping: PortMapping, healthCheck: HealthCheckPolicy = null): Listener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping)
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    __obj.asInstanceOf[Listener]
  }
}

