package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoHorizontalRel extends StObject {
  
  @JSName("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey: ISVGPathSegLinetoHorizontalRel = js.native
  
  var x: Double = js.native
}
object ISVGPathSegLinetoHorizontalRel {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey: ISVGPathSegLinetoHorizontalRel, x: Double): ISVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoHorizontalRelMutableBuilder[Self <: ISVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegLinetoHorizontalRel_typekey(value: ISVGPathSegLinetoHorizontalRel): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoHorizontalRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
