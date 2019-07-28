package typings.angularDashMaterial.angularDashMaterialMod.angularMod.materialNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISidenavObject extends js.Object {
  def close(): IPromise[Unit]
  def isLockedOpen(): Boolean
  def isOpen(): Boolean
  def onClose(onClose: js.Function0[Unit]): Unit
  def open(): IPromise[Unit]
  def toggle(): IPromise[Unit]
}

object ISidenavObject {
  @scala.inline
  def apply(
    close: () => IPromise[Unit],
    isLockedOpen: () => Boolean,
    isOpen: () => Boolean,
    onClose: js.Function0[Unit] => Unit,
    open: () => IPromise[Unit],
    toggle: () => IPromise[Unit]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isLockedOpen = js.Any.fromFunction0(isLockedOpen), isOpen = js.Any.fromFunction0(isOpen), onClose = js.Any.fromFunction1(onClose), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[ISidenavObject]
  }
}

