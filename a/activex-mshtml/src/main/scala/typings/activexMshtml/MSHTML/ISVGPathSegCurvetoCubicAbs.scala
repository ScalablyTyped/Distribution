package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegCurvetoCubicAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegCurvetoCubicAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicAbs_typekey: ISVGPathSegCurvetoCubicAbs
  
  var x: Double
  
  var x1: Double
  
  var x2: Double
  
  var y: Double
  
  var y1: Double
  
  var y2: Double
}
object ISVGPathSegCurvetoCubicAbs {
  
  inline def apply(
    MSHTMLDotISVGPathSegCurvetoCubicAbs_typekey: ISVGPathSegCurvetoCubicAbs,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicAbs_typekey")(MSHTMLDotISVGPathSegCurvetoCubicAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicAbs]
  }
  
  extension [Self <: ISVGPathSegCurvetoCubicAbs](x: Self) {
    
    inline def setMSHTMLDotISVGPathSegCurvetoCubicAbs_typekey(value: ISVGPathSegCurvetoCubicAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoCubicAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
