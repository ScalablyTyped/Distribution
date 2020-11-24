package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISidenavObject extends js.Object {
  
  def close(): IPromise[Unit] = js.native
  
  def isLockedOpen(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  def onClose(onClose: js.Function0[Unit]): Unit = js.native
  
  def open(): IPromise[Unit] = js.native
  
  def toggle(): IPromise[Unit] = js.native
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
  
  @scala.inline
  implicit class ISidenavObjectOps[Self <: ISidenavObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => IPromise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLockedOpen(value: () => Boolean): Self = this.set("isLockedOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClose(value: js.Function0[Unit] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: () => IPromise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => IPromise[Unit]): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
