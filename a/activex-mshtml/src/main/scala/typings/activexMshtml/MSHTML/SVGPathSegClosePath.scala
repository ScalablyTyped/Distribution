package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegClosePath extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegClosePath_typekey")
  var MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
}
object SVGPathSegClosePath {
  
  inline def apply(
    MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath,
    pathSegType: Double,
    pathSegTypeAsLetter: String
  ): SVGPathSegClosePath = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegClosePath_typekey")(MSHTMLDotSVGPathSegClosePath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegClosePath]
  }
  
  extension [Self <: SVGPathSegClosePath](x: Self) {
    
    inline def setMSHTMLDotSVGPathSegClosePath_typekey(value: SVGPathSegClosePath): Self = StObject.set(x, "MSHTML.SVGPathSegClosePath_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
  }
}
