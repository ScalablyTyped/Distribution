package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasImageData extends js.Object {
  @JSName("MSHTML.ICanvasImageData_typekey")
  var MSHTMLDotICanvasImageData_typekey: ICanvasImageData = js.native
  val data: js.Any = js.native
  val height: Double = js.native
  val width: Double = js.native
}

object ICanvasImageData {
  @scala.inline
  def apply(MSHTMLDotICanvasImageData_typekey: ICanvasImageData, data: js.Any, height: Double, width: Double): ICanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasImageData_typekey")(MSHTMLDotICanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasImageData]
  }
  @scala.inline
  implicit class ICanvasImageDataOps[Self <: ICanvasImageData] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotICanvasImageData_typekey(value: ICanvasImageData): Self = this.set("MSHTML.ICanvasImageData_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

