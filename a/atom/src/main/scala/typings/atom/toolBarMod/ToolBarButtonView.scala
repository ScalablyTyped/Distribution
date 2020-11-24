package typings.atom.toolBarMod

import typings.atom.mod.Disposable
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarButtonView extends js.Object {
  
  def _onClick(event: MouseEvent): Unit = js.native
  
  def _onMouseDown(event: MouseEvent): Unit = js.native
  
  def destroy(): Unit = js.native
  
  var element: HTMLButtonElement = js.native
  
  var enabled: Boolean = js.native
  
  def executeCallback(event: MouseEvent): Unit = js.native
  
  def getSelected(): Boolean = js.native
  
  var group: String = js.native
  
  var options: ButtonOptions = js.native
  
  var priority: Double = js.native
  
  def setEnabled(enabled: Boolean): Unit = js.native
  
  def setSelected(selected: Boolean): Unit = js.native
  
  var subscriptions: Disposable = js.native
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
  
  @scala.inline
  implicit class ToolBarButtonViewOps[Self <: ToolBarButtonView] (val x: Self) extends AnyVal {
    
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
    def set_onClick(value: MouseEvent => Unit): Self = this.set("_onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_onMouseDown(value: MouseEvent => Unit): Self = this.set("_onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLButtonElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteCallback(value: MouseEvent => Unit): Self = this.set("executeCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelected(value: () => Boolean): Self = this.set("getSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ButtonOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelected(value: Boolean => Unit): Self = this.set("setSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscriptions(value: Disposable): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
  }
}
