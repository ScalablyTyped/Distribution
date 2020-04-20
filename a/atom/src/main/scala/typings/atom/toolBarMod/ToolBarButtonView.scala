package typings.atom.toolBarMod

import typings.atom.mod.Disposable
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarButtonView extends js.Object {
  var element: HTMLButtonElement
  var enabled: Boolean
  var group: String
  var options: ButtonOptions
  var priority: Double
  var subscriptions: Disposable
  def _onClick(event: MouseEvent): Unit
  def _onMouseDown(event: MouseEvent): Unit
  def destroy(): Unit
  def executeCallback(event: MouseEvent): Unit
  def getSelected(): Boolean
  def setEnabled(enabled: Boolean): Unit
  def setSelected(selected: Boolean): Unit
}

object ToolBarButtonView {
  @scala.inline
  def apply(
    _onClick: MouseEvent => Unit,
    _onMouseDown: MouseEvent => Unit,
    destroy: () => Unit,
    element: HTMLButtonElement,
    enabled: Boolean,
    executeCallback: MouseEvent => Unit,
    getSelected: () => Boolean,
    group: String,
    options: ButtonOptions,
    priority: Double,
    setEnabled: Boolean => Unit,
    setSelected: Boolean => Unit,
    subscriptions: Disposable
  ): ToolBarButtonView = {
    val __obj = js.Dynamic.literal(_onClick = js.Any.fromFunction1(_onClick), _onMouseDown = js.Any.fromFunction1(_onMouseDown), destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], executeCallback = js.Any.fromFunction1(executeCallback), getSelected = js.Any.fromFunction0(getSelected), group = group.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], setEnabled = js.Any.fromFunction1(setEnabled), setSelected = js.Any.fromFunction1(setSelected), subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarButtonView]
  }
}

