package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegCurvetoQuadraticSmoothAbs extends StObject {
  
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegCurvetoQuadraticSmoothAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticSmoothAbsMutableBuilder[Self <: ISVGPathSegCurvetoQuadraticSmoothAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey(value: ISVGPathSegCurvetoQuadraticSmoothAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
