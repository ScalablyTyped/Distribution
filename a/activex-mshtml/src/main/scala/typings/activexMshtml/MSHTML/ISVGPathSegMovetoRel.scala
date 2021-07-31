package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegMovetoRel extends StObject {
  
  @JSName("MSHTML.ISVGPathSegMovetoRel_typekey")
  var MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegMovetoRel {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel, x: Double, y: Double): ISVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoRel_typekey")(MSHTMLDotISVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegMovetoRelMutableBuilder[Self <: ISVGPathSegMovetoRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegMovetoRel_typekey(value: ISVGPathSegMovetoRel): Self = StObject.set(x, "MSHTML.ISVGPathSegMovetoRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
