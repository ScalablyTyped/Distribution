package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegCurvetoQuadraticAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey: ISVGPathSegCurvetoQuadraticAbs
  
  var x: Double
  
  var x1: Double
  
  var y: Double
  
  var y1: Double
}
object ISVGPathSegCurvetoQuadraticAbs {
  
  inline def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey: ISVGPathSegCurvetoQuadraticAbs,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): ISVGPathSegCurvetoQuadraticAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticAbs]
  }
  
  extension [Self <: ISVGPathSegCurvetoQuadraticAbs](x: Self) {
    
    inline def setMSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey(value: ISVGPathSegCurvetoQuadraticAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
