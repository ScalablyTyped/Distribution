package typings.atom.toolBarMod

import typings.std.HTMLHRElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarSpacerView extends js.Object {
  
  def destroy(): Unit = js.native
  
  var element: HTMLHRElement = js.native
  
  var group: String = js.native
  
  var priority: Double = js.native
}
object ToolBarSpacerView {
  
  @scala.inline
  def apply(destroy: () => Unit, element: HTMLHRElement, group: String, priority: Double): ToolBarSpacerView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarSpacerView]
  }
  
  @scala.inline
  implicit class ToolBarSpacerViewOps[Self <: ToolBarSpacerView] (val x: Self) extends AnyVal {
    
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
    def setElement(value: HTMLHRElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
}
