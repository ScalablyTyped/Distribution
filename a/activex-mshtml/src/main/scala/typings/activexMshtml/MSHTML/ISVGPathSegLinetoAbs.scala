package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegLinetoAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegLinetoAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoAbs_typekey: ISVGPathSegLinetoAbs
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegLinetoAbs {
  
  inline def apply(MSHTMLDotISVGPathSegLinetoAbs_typekey: ISVGPathSegLinetoAbs, x: Double, y: Double): ISVGPathSegLinetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoAbs_typekey")(MSHTMLDotISVGPathSegLinetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoAbs]
  }
  
  extension [Self <: ISVGPathSegLinetoAbs](x: Self) {
    
    inline def setMSHTMLDotISVGPathSegLinetoAbs_typekey(value: ISVGPathSegLinetoAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
