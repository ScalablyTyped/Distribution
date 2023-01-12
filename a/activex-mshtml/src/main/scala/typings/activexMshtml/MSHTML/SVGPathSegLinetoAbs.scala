package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegLinetoAbs extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegLinetoAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoAbs_typekey: SVGPathSegLinetoAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var y: Double
}
object SVGPathSegLinetoAbs {
  
  inline def apply(
    MSHTMLDotSVGPathSegLinetoAbs_typekey: SVGPathSegLinetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegLinetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoAbs_typekey")(MSHTMLDotSVGPathSegLinetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegLinetoAbs] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegLinetoAbs_typekey(value: SVGPathSegLinetoAbs): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
