package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginationRoute extends js.Object {
  /**
    * The FODN or IP address to contact for origination traffic.
    */
  var Host: js.UndefOr[String] = js.undefined
  /**
    * The designated origination route port. Defaults to 5060.
    */
  var Port: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Port] = js.undefined
  /**
    * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
    */
  var Priority: js.UndefOr[OriginationRoutePriority] = js.undefined
  /**
    * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
    */
  var Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined
  /**
    * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on their relative weight.
    */
  var Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
}

object OriginationRoute {
  @scala.inline
  def apply(
    Host: String = null,
    Port: Int | Double = null,
    Priority: Int | Double = null,
    Protocol: OriginationRouteProtocol = null,
    Weight: Int | Double = null
  ): OriginationRoute = {
    val __obj = js.Dynamic.literal()
    if (Host != null) __obj.updateDynamic("Host")(Host)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (Weight != null) __obj.updateDynamic("Weight")(Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginationRoute]
  }
}

