package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateTransitVirtualInterfaceResult extends js.Object {
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}

object AllocateTransitVirtualInterfaceResult {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): AllocateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface)
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceResult]
  }
}

