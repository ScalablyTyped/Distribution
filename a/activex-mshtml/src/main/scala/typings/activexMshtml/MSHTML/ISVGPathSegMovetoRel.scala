package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegMovetoRel extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegMovetoRel_typekey")
  var MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegMovetoRel {
  
  inline def apply(MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel, x: Double, y: Double): ISVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoRel_typekey")(MSHTMLDotISVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoRel]
  }
  
  extension [Self <: ISVGPathSegMovetoRel](x: Self) {
    
    inline def setMSHTMLDotISVGPathSegMovetoRel_typekey(value: ISVGPathSegMovetoRel): Self = StObject.set(x, "MSHTML.ISVGPathSegMovetoRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
