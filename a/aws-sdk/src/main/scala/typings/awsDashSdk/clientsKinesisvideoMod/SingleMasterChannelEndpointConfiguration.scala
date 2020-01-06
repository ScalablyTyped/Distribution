package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMasterChannelEndpointConfiguration extends js.Object {
  /**
    * This property is used to determine the nature of communication over this SINGLE_MASTER signaling channel. If WSS is specified, this API returns a websocket endpoint. If HTTPS is specified, this API returns an HTTPS endpoint.
    */
  var Protocols: js.UndefOr[ListOfProtocols] = js.native
  /**
    * This property is used to determine messaging permissions in this SINGLE_MASTER signaling channel. If MASTER is specified, this API returns an endpoint that a client can use to receive offers from and send answers to any of the viewers on this signaling channel. If VIEWER is specified, this API returns an endpoint that a client can use only to send offers to another MASTER client on this signaling channel. 
    */
  var Role: js.UndefOr[ChannelRole] = js.native
}

object SingleMasterChannelEndpointConfiguration {
  @scala.inline
  def apply(Protocols: ListOfProtocols = null, Role: ChannelRole = null): SingleMasterChannelEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Protocols != null) __obj.updateDynamic("Protocols")(Protocols.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleMasterChannelEndpointConfiguration]
  }
}

