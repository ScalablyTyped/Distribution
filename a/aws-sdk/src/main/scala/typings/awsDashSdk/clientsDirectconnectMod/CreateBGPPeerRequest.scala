package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBGPPeerRequest extends js.Object {
  /**
    * Information about the BGP peer.
    */
  var newBGPPeer: js.UndefOr[NewBGPPeer] = js.undefined
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}

object CreateBGPPeerRequest {
  @scala.inline
  def apply(newBGPPeer: NewBGPPeer = null, virtualInterfaceId: VirtualInterfaceId = null): CreateBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    if (newBGPPeer != null) __obj.updateDynamic("newBGPPeer")(newBGPPeer)
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId)
    __obj.asInstanceOf[CreateBGPPeerRequest]
  }
}

