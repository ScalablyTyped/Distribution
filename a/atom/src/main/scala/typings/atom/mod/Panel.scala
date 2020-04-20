package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel[T] extends js.Object {
  /** Whether or not the Panel is visible. */
  val visible: Boolean
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
}

