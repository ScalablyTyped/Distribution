package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegCurvetoQuadraticSmoothAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegCurvetoQuadraticSmoothAbs {
  
  inline def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegCurvetoQuadraticSmoothAbs] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey(value: ISVGPathSegCurvetoQuadraticSmoothAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
