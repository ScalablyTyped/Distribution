package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualInterfaces extends js.Object {
  /**
    * The virtual interfaces
    */
  var virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.undefined
}

object VirtualInterfaces {
  @scala.inline
  def apply(virtualInterfaces: VirtualInterfaceList = null): VirtualInterfaces = {
    val __obj = js.Dynamic.literal()
    if (virtualInterfaces != null) __obj.updateDynamic("virtualInterfaces")(virtualInterfaces)
    __obj.asInstanceOf[VirtualInterfaces]
  }
}

