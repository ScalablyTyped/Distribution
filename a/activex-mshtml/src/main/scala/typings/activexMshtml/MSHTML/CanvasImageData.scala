package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasImageData extends StObject {
  
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
  
  @scala.inline
  implicit class CanvasImageDataMutableBuilder[Self <: CanvasImageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotCanvasImageData_typekey(value: CanvasImageData): Self = StObject.set(x, "MSHTML.CanvasImageData_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
