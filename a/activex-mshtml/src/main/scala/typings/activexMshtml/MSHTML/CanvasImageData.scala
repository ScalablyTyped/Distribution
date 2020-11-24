package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasImageData extends js.Object {
  
  @JSName("MSHTML.CanvasImageData_typekey")
  var MSHTMLDotCanvasImageData_typekey: CanvasImageData = js.native
  
  val data: js.Any = js.native
  
  val height: Double = js.native
  
  val width: Double = js.native
}
object CanvasImageData {
  
  @scala.inline
  def apply(MSHTMLDotCanvasImageData_typekey: CanvasImageData, data: js.Any, height: Double, width: Double): CanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CanvasImageData_typekey")(MSHTMLDotCanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageData]
  }
  
  @scala.inline
  implicit class CanvasImageDataOps[Self <: CanvasImageData] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotCanvasImageData_typekey(value: CanvasImageData): Self = this.set("MSHTML.CanvasImageData_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
