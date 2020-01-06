package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceEndpointListItem extends js.Object {
  /**
    * The protocol of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var Protocol: js.UndefOr[ChannelProtocol] = js.native
  /**
    * The endpoint of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var ResourceEndpoint: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.ResourceEndpoint] = js.native
}

object ResourceEndpointListItem {
  @scala.inline
  def apply(Protocol: ChannelProtocol = null, ResourceEndpoint: ResourceEndpoint = null): ResourceEndpointListItem = {
    val __obj = js.Dynamic.literal()
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (ResourceEndpoint != null) __obj.updateDynamic("ResourceEndpoint")(ResourceEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceEndpointListItem]
  }
}

