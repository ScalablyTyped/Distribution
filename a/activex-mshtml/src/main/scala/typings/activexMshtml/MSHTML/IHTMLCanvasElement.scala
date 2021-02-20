package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLCanvasElement extends StObject {
  
  @JSName("MSHTML.IHTMLCanvasElement_typekey")
  var MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement = js.native
  
  def getContext(contextId: String): ICanvasRenderingContext2D = js.native
  
  var height: Double = js.native
  
  def toDataURL(`type`: String, jpegquality: js.Any): String = js.native
  
  var width: Double = js.native
}
object IHTMLCanvasElement {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement,
    getContext: String => ICanvasRenderingContext2D,
    height: Double,
    toDataURL: (String, js.Any) => String,
    width: Double
  ): IHTMLCanvasElement = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], toDataURL = js.Any.fromFunction2(toDataURL), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLCanvasElement_typekey")(MSHTMLDotIHTMLCanvasElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLCanvasElement]
  }
  
  @scala.inline
  implicit class IHTMLCanvasElementMutableBuilder[Self <: IHTMLCanvasElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContext(value: String => ICanvasRenderingContext2D): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLCanvasElement_typekey(value: IHTMLCanvasElement): Self = StObject.set(x, "MSHTML.IHTMLCanvasElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDataURL(value: (String, js.Any) => String): Self = StObject.set(x, "toDataURL", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
