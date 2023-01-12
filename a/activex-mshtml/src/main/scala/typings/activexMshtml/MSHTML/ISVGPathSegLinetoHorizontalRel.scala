package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegLinetoHorizontalRel extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey: ISVGPathSegLinetoHorizontalRel
  
  var x: Double
}
object ISVGPathSegLinetoHorizontalRel {
  
  inline def apply(MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey: ISVGPathSegLinetoHorizontalRel, x: Double): ISVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotISVGPathSegLinetoHorizontalRel_typekey(value: ISVGPathSegLinetoHorizontalRel): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoHorizontalRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
