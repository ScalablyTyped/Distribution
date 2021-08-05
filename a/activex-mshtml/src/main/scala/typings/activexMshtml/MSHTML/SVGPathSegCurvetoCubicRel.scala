package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegCurvetoCubicRel extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegCurvetoCubicRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicRel_typekey: SVGPathSegCurvetoCubicRel
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var x1: Double
  
  var x2: Double
  
  var y: Double
  
  var y1: Double
  
  var y2: Double
}
object SVGPathSegCurvetoCubicRel {
  
  inline def apply(
    MSHTMLDotSVGPathSegCurvetoCubicRel_typekey: SVGPathSegCurvetoCubicRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicRel_typekey")(MSHTMLDotSVGPathSegCurvetoCubicRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicRel]
  }
  
  extension [Self <: SVGPathSegCurvetoCubicRel](x: Self) {
    
    inline def setMSHTMLDotSVGPathSegCurvetoCubicRel_typekey(value: SVGPathSegCurvetoCubicRel): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoCubicRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
