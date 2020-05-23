package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasImageData extends js.Object {
  @JSName("MSHTML.ICanvasImageData_typekey")
  var MSHTMLDotICanvasImageData_typekey: ICanvasImageData
  val data: js.Any
  val height: Double
  val width: Double
}

object ICanvasImageData {
  @scala.inline
  def apply(MSHTMLDotICanvasImageData_typekey: ICanvasImageData, data: js.Any, height: Double, width: Double): ICanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasImageData_typekey")(MSHTMLDotICanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasImageData]
  }
}

