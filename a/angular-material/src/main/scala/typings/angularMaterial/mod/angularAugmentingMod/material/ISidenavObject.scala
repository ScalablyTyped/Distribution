package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISidenavObject extends StObject {
  
  def close(): IPromise[Unit]
  
  def isLockedOpen(): Boolean
  
  def isOpen(): Boolean
  
  def onClose(onClose: js.Function0[Unit]): Unit
  
  def open(): IPromise[Unit]
  
  def toggle(): IPromise[Unit]
}
object ISidenavObject {
  
  inline def apply(
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
  
  extension [Self <: ISidenavObject](x: Self) {
    
    inline def setClose(value: () => IPromise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setIsLockedOpen(value: () => Boolean): Self = StObject.set(x, "isLockedOpen", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    inline def setOnClose(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOpen(value: () => IPromise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setToggle(value: () => IPromise[Unit]): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
