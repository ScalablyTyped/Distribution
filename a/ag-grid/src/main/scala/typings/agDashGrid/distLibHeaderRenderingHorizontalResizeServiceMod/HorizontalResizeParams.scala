package typings.agDashGrid.distLibHeaderRenderingHorizontalResizeServiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalResizeParams extends js.Object {
  var eResizeBar: HTMLElement
  def onResizeEnd(delta: Double): Unit
  def onResizeStart(shiftKey: Boolean): Unit
  def onResizing(delta: Double): Unit
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
}

