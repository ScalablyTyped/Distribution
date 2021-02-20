package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanvasImageData extends StObject {
  
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
  implicit class ICanvasImageDataMutableBuilder[Self <: ICanvasImageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotICanvasImageData_typekey(value: ICanvasImageData): Self = StObject.set(x, "MSHTML.ICanvasImageData_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
