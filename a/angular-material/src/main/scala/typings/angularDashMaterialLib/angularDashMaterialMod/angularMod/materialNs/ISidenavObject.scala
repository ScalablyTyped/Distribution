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
    close: () => angularLib.angularMod.angularNs.IPromise[scala.Unit],
    isLockedOpen: () => scala.Boolean,
    isOpen: () => scala.Boolean,
    onClose: js.Function0[scala.Unit] => scala.Unit,
    open: () => angularLib.angularMod.angularNs.IPromise[scala.Unit],
    toggle: () => angularLib.angularMod.angularNs.IPromise[scala.Unit]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isLockedOpen = js.Any.fromFunction0(isLockedOpen), isOpen = js.Any.fromFunction0(isOpen), onClose = js.Any.fromFunction1(onClose), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[ISidenavObject]
  }
}

