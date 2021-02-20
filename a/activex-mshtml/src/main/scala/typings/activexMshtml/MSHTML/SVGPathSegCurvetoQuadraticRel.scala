package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegCurvetoQuadraticRel extends StObject {
  
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var x: Double = js.native
  
  var x1: Double = js.native
  
  var y: Double = js.native
  
  var y1: Double = js.native
}
object SVGPathSegCurvetoQuadraticRel {
  
  @scala.inline
  def apply(
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
  implicit class SVGPathSegCurvetoQuadraticRelMutableBuilder[Self <: SVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey(value: SVGPathSegCurvetoQuadraticRel): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoQuadraticRel_typekey", value.asInstanceOf[js.Any])
    
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
