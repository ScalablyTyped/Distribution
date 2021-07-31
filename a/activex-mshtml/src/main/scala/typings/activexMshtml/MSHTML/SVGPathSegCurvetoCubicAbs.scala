package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoCubicAbs extends StObject {
  
  @JSName("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey: SVGPathSegCurvetoCubicAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var x1: Double
  
  var x2: Double
  
  var y: Double
  
  var y1: Double
  
  var y2: Double
}
object SVGPathSegCurvetoCubicAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey: SVGPathSegCurvetoCubicAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")(MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicAbs]
  }
  
  @scala.inline
  implicit class SVGPathSegCurvetoCubicAbsMutableBuilder[Self <: SVGPathSegCurvetoCubicAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegCurvetoCubicAbs_typekey(value: SVGPathSegCurvetoCubicAbs): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoCubicAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
