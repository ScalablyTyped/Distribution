package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegLinetoHorizontalAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs
  
  var x: Double
}
object ISVGPathSegLinetoHorizontalAbs {
  
  inline def apply(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs, x: Double): ISVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegLinetoHorizontalAbs] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey(value: ISVGPathSegLinetoHorizontalAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
