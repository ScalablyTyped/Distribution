package typings
package agDashGridLib.distLibHeaderRenderingHorizontalResizeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalResizeParams extends js.Object {
  var eResizeBar: stdLib.HTMLElement
  def onResizeEnd(delta: scala.Double): scala.Unit
  def onResizeStart(shiftKey: scala.Boolean): scala.Unit
  def onResizing(delta: scala.Double): scala.Unit
}

object HorizontalResizeParams {
  @scala.inline
  def apply(
    eResizeBar: stdLib.HTMLElement,
    onResizeEnd: scala.Double => scala.Unit,
    onResizeStart: scala.Boolean => scala.Unit,
    onResizing: scala.Double => scala.Unit
  ): HorizontalResizeParams = {
    val __obj = js.Dynamic.literal(eResizeBar = eResizeBar, onResizeEnd = js.Any.fromFunction1(onResizeEnd), onResizeStart = js.Any.fromFunction1(onResizeStart), onResizing = js.Any.fromFunction1(onResizing))
  
    __obj.asInstanceOf[HorizontalResizeParams]
  }
}

