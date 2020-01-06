package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateTransitVirtualInterfaceResult extends js.Object {
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}

object AllocateTransitVirtualInterfaceResult {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): AllocateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceResult]
  }
}

