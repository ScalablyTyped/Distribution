package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoQuadraticSmoothRel extends StObject {
  
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey: SVGPathSegCurvetoQuadraticSmoothRel
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var y: Double
}
object SVGPathSegCurvetoQuadraticSmoothRel {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey: SVGPathSegCurvetoQuadraticSmoothRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticSmoothRel]
  }
  
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticSmoothRelMutableBuilder[Self <: SVGPathSegCurvetoQuadraticSmoothRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey(value: SVGPathSegCurvetoQuadraticSmoothRel): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
