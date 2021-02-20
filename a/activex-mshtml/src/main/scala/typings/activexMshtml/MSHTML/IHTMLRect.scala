package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLRect extends StObject {
  
  @JSName("MSHTML.IHTMLRect_typekey")
  var MSHTMLDotIHTMLRect_typekey: IHTMLRect = js.native
  
  var bottom: Double = js.native
  
  var left: Double = js.native
  
  var right: Double = js.native
  
  var top: Double = js.native
}
object IHTMLRect {
  
  @scala.inline
  def apply(MSHTMLDotIHTMLRect_typekey: IHTMLRect, bottom: Double, left: Double, right: Double, top: Double): IHTMLRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRect_typekey")(MSHTMLDotIHTMLRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRect]
  }
  
  @scala.inline
  implicit class IHTMLRectMutableBuilder[Self <: IHTMLRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLRect_typekey(value: IHTMLRect): Self = StObject.set(x, "MSHTML.IHTMLRect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
