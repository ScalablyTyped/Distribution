package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegCurvetoQuadraticRel extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel
  
  var x: Double
  
  var x1: Double
  
  var y: Double
  
  var y1: Double
}
object ISVGPathSegCurvetoQuadraticRel {
  
  inline def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): ISVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey(value: ISVGPathSegCurvetoQuadraticRel): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
