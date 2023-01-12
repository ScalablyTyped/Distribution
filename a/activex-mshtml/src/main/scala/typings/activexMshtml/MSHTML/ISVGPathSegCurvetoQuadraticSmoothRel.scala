package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegCurvetoQuadraticSmoothRel extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegCurvetoQuadraticSmoothRel {
  
  inline def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegCurvetoQuadraticSmoothRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey(value: ISVGPathSegCurvetoQuadraticSmoothRel): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
