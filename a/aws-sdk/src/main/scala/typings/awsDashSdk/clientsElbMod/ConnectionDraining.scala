package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionDraining extends js.Object {
  /**
    * Specifies whether connection draining is enabled for the load balancer.
    */
  var Enabled: ConnectionDrainingEnabled
  /**
    * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
    */
  var Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.undefined
}

object ConnectionDraining {
  @scala.inline
  def apply(Enabled: ConnectionDrainingEnabled, Timeout: Int | Double = null): ConnectionDraining = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionDraining]
  }
}

