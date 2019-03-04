package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISidenavObject extends js.Object {
  def close(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def isLockedOpen(): scala.Boolean
  def isOpen(): scala.Boolean
  def onClose(onClose: js.Function0[scala.Unit]): scala.Unit
  def open(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def toggle(): angularLib.angularMod.angularNs.IPromise[scala.Unit]
}

object ISidenavObject {
  @scala.inline
  def apply(
    close: js.Function0[angularLib.angularMod.angularNs.IPromise[scala.Unit]],
    isLockedOpen: js.Function0[scala.Boolean],
    isOpen: js.Function0[scala.Boolean],
    onClose: js.Function1[js.Function0[scala.Unit], scala.Unit],
    open: js.Function0[angularLib.angularMod.angularNs.IPromise[scala.Unit]],
    toggle: js.Function0[angularLib.angularMod.angularNs.IPromise[scala.Unit]]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal(close = close, isLockedOpen = isLockedOpen, isOpen = isOpen, onClose = onClose, open = open, toggle = toggle)
  
    __obj.asInstanceOf[ISidenavObject]
  }
}

