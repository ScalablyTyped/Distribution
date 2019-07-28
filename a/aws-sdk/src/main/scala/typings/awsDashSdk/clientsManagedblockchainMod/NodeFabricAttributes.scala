package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeFabricAttributes extends js.Object {
  /**
    * The endpoint that identifies the peer node for all services except peer channel-based event services.
    */
  var PeerEndpoint: js.UndefOr[String] = js.undefined
  /**
    * The endpoint that identifies the peer node for peer channel-based event services.
    */
  var PeerEventEndpoint: js.UndefOr[String] = js.undefined
}

object NodeFabricAttributes {
  @scala.inline
  def apply(PeerEndpoint: String = null, PeerEventEndpoint: String = null): NodeFabricAttributes = {
    val __obj = js.Dynamic.literal()
    if (PeerEndpoint != null) __obj.updateDynamic("PeerEndpoint")(PeerEndpoint)
    if (PeerEventEndpoint != null) __obj.updateDynamic("PeerEventEndpoint")(PeerEventEndpoint)
    __obj.asInstanceOf[NodeFabricAttributes]
  }
}

