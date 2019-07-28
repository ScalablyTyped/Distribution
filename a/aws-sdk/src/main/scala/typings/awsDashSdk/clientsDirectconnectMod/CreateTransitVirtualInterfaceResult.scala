package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitVirtualInterfaceResult extends js.Object {
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}

object CreateTransitVirtualInterfaceResult {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): CreateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface)
    __obj.asInstanceOf[CreateTransitVirtualInterfaceResult]
  }
}

