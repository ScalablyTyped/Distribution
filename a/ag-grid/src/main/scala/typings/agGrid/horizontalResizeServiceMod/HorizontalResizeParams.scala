package typings.agGrid.horizontalResizeServiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalResizeParams extends js.Object {
  
  var eResizeBar: HTMLElement = js.native
  
  def onResizeEnd(delta: Double): Unit = js.native
  
  def onResizeStart(shiftKey: Boolean): Unit = js.native
  
  def onResizing(delta: Double): Unit = js.native
}
object HorizontalResizeParams {
  
  @scala.inline
  def apply(
    eResizeBar: HTMLElement,
    onResizeEnd: Double => Unit,
    onResizeStart: Boolean => Unit,
    onResizing: Double => Unit
  ): HorizontalResizeParams = {
    val __obj = js.Dynamic.literal(eResizeBar = eResizeBar.asInstanceOf[js.Any], onResizeEnd = js.Any.fromFunction1(onResizeEnd), onResizeStart = js.Any.fromFunction1(onResizeStart), onResizing = js.Any.fromFunction1(onResizing))
    __obj.asInstanceOf[HorizontalResizeParams]
  }
  
  @scala.inline
  implicit class HorizontalResizeParamsOps[Self <: HorizontalResizeParams] (val x: Self) extends AnyVal {
    
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
    def setEResizeBar(value: HTMLElement): Self = this.set("eResizeBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResizeEnd(value: Double => Unit): Self = this.set("onResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizeStart(value: Boolean => Unit): Self = this.set("onResizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizing(value: Double => Unit): Self = this.set("onResizing", js.Any.fromFunction1(value))
  }
}
