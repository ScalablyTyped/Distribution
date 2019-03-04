package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.dropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdown extends js.Object {
  def destroy(): scala.Unit
  def hide(): scala.Unit
  def show(): scala.Unit
}

object IDropdown {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): IDropdown = {
    val __obj = js.Dynamic.literal(destroy = destroy, hide = hide, show = show)
  
    __obj.asInstanceOf[IDropdown]
  }
}

