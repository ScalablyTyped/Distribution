package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGRect extends StObject {
  
  @JSName("MSHTML.SVGRect_typekey")
  var MSHTMLDotSVGRect_typekey: SVGRect = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SVGRect {
  
  @scala.inline
  def apply(MSHTMLDotSVGRect_typekey: SVGRect, height: Double, width: Double, x: Double, y: Double): SVGRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRect_typekey")(MSHTMLDotSVGRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRect]
  }
  
  @scala.inline
  implicit class SVGRectMutableBuilder[Self <: SVGRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGRect_typekey(value: SVGRect): Self = StObject.set(x, "MSHTML.SVGRect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
