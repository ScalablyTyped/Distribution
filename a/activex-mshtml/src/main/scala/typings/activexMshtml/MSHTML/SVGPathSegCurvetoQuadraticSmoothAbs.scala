package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoQuadraticSmoothAbs extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey: SVGPathSegCurvetoQuadraticSmoothAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var y: Double
}
object SVGPathSegCurvetoQuadraticSmoothAbs {
  
  inline def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey: SVGPathSegCurvetoQuadraticSmoothAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticSmoothAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegCurvetoQuadraticSmoothAbs] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey(value: SVGPathSegCurvetoQuadraticSmoothAbs): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
