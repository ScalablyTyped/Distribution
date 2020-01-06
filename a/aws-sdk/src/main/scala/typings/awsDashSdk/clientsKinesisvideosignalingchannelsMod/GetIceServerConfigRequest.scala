package typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIceServerConfigRequest extends js.Object {
  /**
    * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers. 
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * Unique identifier for the viewer. Must be unique within the signaling channel.
    */
  var ClientId: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.ClientId] = js.native
  /**
    * Specifies the desired service. Currently, TURN is the only valid value.
    */
  var Service: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Service] = js.native
  /**
    * An optional user ID to be associated with the credentials.
    */
  var Username: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Username] = js.native
}

object GetIceServerConfigRequest {
  @scala.inline
  def apply(
    ChannelARN: ResourceARN,
    ClientId: ClientId = null,
    Service: Service = null,
    Username: Username = null
  ): GetIceServerConfigRequest = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (Service != null) __obj.updateDynamic("Service")(Service.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIceServerConfigRequest]
  }
}

