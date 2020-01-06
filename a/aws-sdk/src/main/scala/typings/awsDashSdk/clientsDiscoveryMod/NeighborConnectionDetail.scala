package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeighborConnectionDetail extends js.Object {
  /**
    * The number of open network connections with the neighboring server.
    */
  var connectionsCount: Long = js.native
  /**
    * The destination network port for the connection.
    */
  var destinationPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The ID of the server that accepted the network connection.
    */
  var destinationServerId: ConfigurationId = js.native
  /**
    * The ID of the server that opened the network connection.
    */
  var sourceServerId: ConfigurationId = js.native
  /**
    * The network protocol used for the connection.
    */
  var transportProtocol: js.UndefOr[String] = js.native
}

object NeighborConnectionDetail {
  @scala.inline
  def apply(
    connectionsCount: Long,
    destinationServerId: ConfigurationId,
    sourceServerId: ConfigurationId,
    destinationPort: Int | Double = null,
    transportProtocol: String = null
  ): NeighborConnectionDetail = {
    val __obj = js.Dynamic.literal(connectionsCount = connectionsCount.asInstanceOf[js.Any], destinationServerId = destinationServerId.asInstanceOf[js.Any], sourceServerId = sourceServerId.asInstanceOf[js.Any])
    if (destinationPort != null) __obj.updateDynamic("destinationPort")(destinationPort.asInstanceOf[js.Any])
    if (transportProtocol != null) __obj.updateDynamic("transportProtocol")(transportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborConnectionDetail]
  }
}

