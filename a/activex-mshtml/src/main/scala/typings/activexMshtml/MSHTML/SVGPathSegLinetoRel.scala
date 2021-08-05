package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegLinetoRel extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegLinetoRel_typekey")
  var MSHTMLDotSVGPathSegLinetoRel_typekey: SVGPathSegLinetoRel
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var y: Double
}
object SVGPathSegLinetoRel {
  
  inline def apply(
    MSHTMLDotSVGPathSegLinetoRel_typekey: SVGPathSegLinetoRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoRel_typekey")(MSHTMLDotSVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoRel]
  }
  
  extension [Self <: SVGPathSegLinetoRel](x: Self) {
    
    inline def setMSHTMLDotSVGPathSegLinetoRel_typekey(value: SVGPathSegLinetoRel): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
