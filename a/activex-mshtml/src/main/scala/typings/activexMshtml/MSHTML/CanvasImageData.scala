package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasImageData extends js.Object {
  @JSName("MSHTML.CanvasImageData_typekey")
  var MSHTMLDotCanvasImageData_typekey: CanvasImageData
  val data: js.Any
  val height: Double
  val width: Double
}

object CanvasImageData {
  @scala.inline
  def apply(MSHTMLDotCanvasImageData_typekey: CanvasImageData, data: js.Any, height: Double, width: Double): CanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CanvasImageData_typekey")(MSHTMLDotCanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageData]
  }
}

