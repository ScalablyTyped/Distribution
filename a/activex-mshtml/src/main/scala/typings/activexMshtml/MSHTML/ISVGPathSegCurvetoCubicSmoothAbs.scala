package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegCurvetoCubicSmoothAbs extends StObject {
  
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs = js.native
  
  var x: Double = js.native
  
  var x2: Double = js.native
  
  var y: Double = js.native
  
  var y2: Double = js.native
}
object ISVGPathSegCurvetoCubicSmoothAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegCurvetoCubicSmoothAbsMutableBuilder[Self <: ISVGPathSegCurvetoCubicSmoothAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey(value: ISVGPathSegCurvetoCubicSmoothAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
