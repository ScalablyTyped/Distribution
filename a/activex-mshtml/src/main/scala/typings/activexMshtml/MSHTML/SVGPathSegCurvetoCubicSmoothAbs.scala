package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoCubicSmoothAbs extends StObject {
  
  @JSName("MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey: SVGPathSegCurvetoCubicSmoothAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var x2: Double
  
  var y: Double
  
  var y2: Double
}
object SVGPathSegCurvetoCubicSmoothAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey: SVGPathSegCurvetoCubicSmoothAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicSmoothAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey")(MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicSmoothAbs]
  }
  
  @scala.inline
  implicit class SVGPathSegCurvetoCubicSmoothAbsMutableBuilder[Self <: SVGPathSegCurvetoCubicSmoothAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey(value: SVGPathSegCurvetoCubicSmoothAbs): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
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
