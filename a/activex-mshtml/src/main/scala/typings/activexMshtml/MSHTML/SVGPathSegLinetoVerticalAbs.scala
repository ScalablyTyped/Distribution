package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegLinetoVerticalAbs extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegLinetoVerticalAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoVerticalAbs_typekey: SVGPathSegLinetoVerticalAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var y: Double
}
object SVGPathSegLinetoVerticalAbs {
  
  inline def apply(
    MSHTMLDotSVGPathSegLinetoVerticalAbs_typekey: SVGPathSegLinetoVerticalAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    y: Double
  ): SVGPathSegLinetoVerticalAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoVerticalAbs_typekey")(MSHTMLDotSVGPathSegLinetoVerticalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoVerticalAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegLinetoVerticalAbs] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegLinetoVerticalAbs_typekey(value: SVGPathSegLinetoVerticalAbs): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoVerticalAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
