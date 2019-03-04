package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel[T] extends js.Object {
  /** Whether or not the Panel is visible. */
  val visible: scala.Boolean
  // Construction and Destruction
  /** Destroy and remove this panel from the UI. */
  def destroy(): scala.Unit
  // Panel Details
  /** Returns the panel's item. */
  def getItem(): T
  /** Returns a number indicating this panel's priority. */
  def getPriority(): scala.Double
  /** Hide this panel. */
  def hide(): scala.Unit
  /** Returns a boolean true when the panel is visible. */
  def isVisible(): scala.Boolean
  // Event Subscription
  /** Invoke the given callback when the pane hidden or shown. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ scala.Boolean, scala.Unit]): Disposable
  /** Invoke the given callback when the pane is destroyed. */
  def onDidDestroy(callback: js.Function1[/* panel */ Panel[T], scala.Unit]): Disposable
  /** Show this panel. */
  def show(): scala.Unit
}

object Panel {
  @scala.inline
  def apply[T](
    destroy: js.Function0[scala.Unit],
    getItem: js.Function0[T],
    getPriority: js.Function0[scala.Double],
    hide: js.Function0[scala.Unit],
    isVisible: js.Function0[scala.Boolean],
    onDidChangeVisible: js.Function1[js.Function1[/* visible */ scala.Boolean, scala.Unit], Disposable],
    onDidDestroy: js.Function1[js.Function1[/* panel */ Panel[T], scala.Unit], Disposable],
    show: js.Function0[scala.Unit],
    visible: scala.Boolean
  ): Panel[T] = {
    val __obj = js.Dynamic.literal(destroy = destroy, getItem = getItem, getPriority = getPriority, hide = hide, isVisible = isVisible, onDidChangeVisible = onDidChangeVisible, onDidDestroy = onDidDestroy, show = show, visible = visible)
  
    __obj.asInstanceOf[Panel[T]]
  }
}

