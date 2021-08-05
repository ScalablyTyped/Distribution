package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegLinetoVerticalAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs
  
  var y: Double
}
object ISVGPathSegLinetoVerticalAbs {
  
  inline def apply(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs, y: Double): ISVGPathSegLinetoVerticalAbs = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalAbs]
  }
  
  extension [Self <: ISVGPathSegLinetoVerticalAbs](x: Self) {
    
    inline def setMSHTMLDotISVGPathSegLinetoVerticalAbs_typekey(value: ISVGPathSegLinetoVerticalAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoVerticalAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
