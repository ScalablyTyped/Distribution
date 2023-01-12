package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegLinetoVerticalRel extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegLinetoVerticalRel_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalRel_typekey: ISVGPathSegLinetoVerticalRel
  
  var y: Double
}
object ISVGPathSegLinetoVerticalRel {
  
  inline def apply(MSHTMLDotISVGPathSegLinetoVerticalRel_typekey: ISVGPathSegLinetoVerticalRel, y: Double): ISVGPathSegLinetoVerticalRel = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalRel_typekey")(MSHTMLDotISVGPathSegLinetoVerticalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegLinetoVerticalRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotISVGPathSegLinetoVerticalRel_typekey(value: ISVGPathSegLinetoVerticalRel): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoVerticalRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
