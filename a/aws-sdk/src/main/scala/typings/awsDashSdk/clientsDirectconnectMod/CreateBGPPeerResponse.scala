package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBGPPeerResponse extends js.Object {
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}

object CreateBGPPeerResponse {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): CreateBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBGPPeerResponse]
  }
}

