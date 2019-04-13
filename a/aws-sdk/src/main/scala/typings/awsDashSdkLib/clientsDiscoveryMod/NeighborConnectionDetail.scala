package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeighborConnectionDetail extends js.Object {
  /**
    * The number of open network connections with the neighboring server.
    */
  var connectionsCount: Long
  /**
    * The destination network port for the connection.
    */
  var destinationPort: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The ID of the server that accepted the network connection.
    */
  var destinationServerId: ConfigurationId
  /**
    * The ID of the server that opened the network connection.
    */
  var sourceServerId: ConfigurationId
  /**
    * The network protocol used for the connection.
    */
  var transportProtocol: js.UndefOr[String] = js.undefined
}

object NeighborConnectionDetail {
  @scala.inline
  def apply(
    connectionsCount: Long,
    destinationServerId: ConfigurationId,
    sourceServerId: ConfigurationId,
    destinationPort: js.UndefOr[BoxedInteger] = js.undefined,
    transportProtocol: String = null
  ): NeighborConnectionDetail = {
    val __obj = js.Dynamic.literal(connectionsCount = connectionsCount, destinationServerId = destinationServerId, sourceServerId = sourceServerId)
    if (!js.isUndefined(destinationPort)) __obj.updateDynamic("destinationPort")(destinationPort)
    if (transportProtocol != null) __obj.updateDynamic("transportProtocol")(transportProtocol)
    __obj.asInstanceOf[NeighborConnectionDetail]
  }
}

