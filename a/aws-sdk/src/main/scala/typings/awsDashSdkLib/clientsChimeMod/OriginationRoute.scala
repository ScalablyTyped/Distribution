package typings
package awsDashSdkLib.clientsChimeMod

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
  var Port: js.UndefOr[Port] = js.undefined
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
    Port: js.UndefOr[Port] = js.undefined,
    Priority: js.UndefOr[OriginationRoutePriority] = js.undefined,
    Protocol: OriginationRouteProtocol = null,
    Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
  ): OriginationRoute = {
    val __obj = js.Dynamic.literal()
    if (Host != null) __obj.updateDynamic("Host")(Host)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(Weight)) __obj.updateDynamic("Weight")(Weight)
    __obj.asInstanceOf[OriginationRoute]
  }
}

