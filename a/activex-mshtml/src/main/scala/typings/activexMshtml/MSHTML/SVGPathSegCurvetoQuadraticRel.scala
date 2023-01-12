package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoQuadraticRel extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var x1: Double
  
  var y: Double
  
  var y1: Double
}
object SVGPathSegCurvetoQuadraticRel {
  
  inline def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): SVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey(value: SVGPathSegCurvetoQuadraticRel): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoQuadraticRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
