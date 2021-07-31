package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegLinetoRel extends StObject {
  
  @JSName("MSHTML.ISVGPathSegLinetoRel_typekey")
  var MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegLinetoRel {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel, x: Double, y: Double): ISVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoRel_typekey")(MSHTMLDotISVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoRelMutableBuilder[Self <: ISVGPathSegLinetoRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegLinetoRel_typekey(value: ISVGPathSegLinetoRel): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
