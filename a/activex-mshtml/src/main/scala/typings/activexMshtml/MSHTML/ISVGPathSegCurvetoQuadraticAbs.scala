package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegCurvetoQuadraticAbs extends StObject {
  
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey: ISVGPathSegCurvetoQuadraticAbs = js.native
  
  var x: Double = js.native
  
  var x1: Double = js.native
  
  var y: Double = js.native
  
  var y1: Double = js.native
}
object ISVGPathSegCurvetoQuadraticAbs {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticAbsMutableBuilder[Self <: ISVGPathSegCurvetoQuadraticAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey(value: ISVGPathSegCurvetoQuadraticAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey", value.asInstanceOf[js.Any])
    
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
