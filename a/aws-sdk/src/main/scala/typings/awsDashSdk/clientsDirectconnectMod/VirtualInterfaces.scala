package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualInterfaces extends js.Object {
  /**
    * The virtual interfaces
    */
  var virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.native
}

object VirtualInterfaces {
  @scala.inline
  def apply(virtualInterfaces: VirtualInterfaceList = null): VirtualInterfaces = {
    val __obj = js.Dynamic.literal()
    if (virtualInterfaces != null) __obj.updateDynamic("virtualInterfaces")(virtualInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualInterfaces]
  }
}

