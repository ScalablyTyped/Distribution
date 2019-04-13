package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBGPPeerResponse extends js.Object {
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}

object CreateBGPPeerResponse {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): CreateBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface)
    __obj.asInstanceOf[CreateBGPPeerResponse]
  }
}

