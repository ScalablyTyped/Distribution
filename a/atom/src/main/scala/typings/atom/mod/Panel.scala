package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panel[T] extends js.Object {
  
  // Construction and Destruction
  /** Destroy and remove this panel from the UI. */
  def destroy(): Unit = js.native
  
  // Panel Details
  /** Returns the panel's item. */
  def getItem(): T = js.native
  
  /** Returns a number indicating this panel's priority. */
  def getPriority(): Double = js.native
  
  /** Hide this panel. */
  def hide(): Unit = js.native
  
  /** Returns a boolean true when the panel is visible. */
  def isVisible(): Boolean = js.native
  
  // Event Subscription
  /** Invoke the given callback when the pane hidden or shown. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the pane is destroyed. */
  def onDidDestroy(callback: js.Function1[/* panel */ Panel[T], Unit]): Disposable = js.native
  
  /** Show this panel. */
  def show(): Unit = js.native
  
  /** Whether or not the Panel is visible. */
  val visible: Boolean = js.native
}
object Panel {
  
  @scala.inline
  def apply[T](
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
  
  @scala.inline
  implicit class PanelOps[Self <: Panel[_], T] (val x: Self with Panel[T]) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: () => T): Self = this.set("getItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPriority(value: () => Double): Self = this.set("getPriority", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDidChangeVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = this.set("onDidChangeVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidDestroy(value: js.Function1[/* panel */ Panel[T], Unit] => Disposable): Self = this.set("onDidDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
