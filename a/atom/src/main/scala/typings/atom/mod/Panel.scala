package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Panel[T] extends StObject {
  
  // Construction and Destruction
  /** Destroy and remove this panel from the UI. */
  def destroy(): Unit
  
  // Panel Details
  /** Returns the panel's item. */
  def getItem(): T
  
  /** Returns a number indicating this panel's priority. */
  def getPriority(): Double
  
  /** Hide this panel. */
  def hide(): Unit
  
  /** Returns a boolean true when the panel is visible. */
  def isVisible(): Boolean
  
  // Event Subscription
  /** Invoke the given callback when the pane hidden or shown. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable
  
  /** Invoke the given callback when the pane is destroyed. */
  def onDidDestroy(callback: js.Function1[/* panel */ Panel[T], Unit]): Disposable
  
  /** Show this panel. */
  def show(): Unit
  
  /** Whether or not the Panel is visible. */
  val visible: Boolean
}
object Panel {
  
  inline def apply[T](
    destroy: () => Unit,
    getItem: () => T,
    getPriority: () => Double,
    hide: () => Unit,
    isVisible: () => Boolean,
    onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
    onDidDestroy: js.Function1[/* panel */ Panel[T], Unit] => Disposable,
    show: () => Unit,
    visible: Boolean
  ): Panel[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getItem = js.Any.fromFunction0(getItem), getPriority = js.Any.fromFunction0(getPriority), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroy = js.Any.fromFunction1(onDidDestroy), show = js.Any.fromFunction0(show), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panel[T]]
  }
  
  extension [Self <: Panel[?], T](x: Self & Panel[T]) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: () => T): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
    
    inline def setGetPriority(value: () => Double): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setOnDidChangeVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = StObject.set(x, "onDidChangeVisible", js.Any.fromFunction1(value))
    
    inline def setOnDidDestroy(value: js.Function1[/* panel */ Panel[T], Unit] => Disposable): Self = StObject.set(x, "onDidDestroy", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
