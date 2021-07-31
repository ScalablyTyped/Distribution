package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoQuadraticAbs extends StObject {
  
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey: SVGPathSegCurvetoQuadraticAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var x1: Double
  
  var y: Double
  
  var y1: Double
}
object SVGPathSegCurvetoQuadraticAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey: SVGPathSegCurvetoQuadraticAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): SVGPathSegCurvetoQuadraticAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticAbs]
  }
  
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticAbsMutableBuilder[Self <: SVGPathSegCurvetoQuadraticAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey(value: SVGPathSegCurvetoQuadraticAbs): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
