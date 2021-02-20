package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoAbs extends StObject {
  
  @JSName("MSHTML.ISVGPathSegLinetoAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoAbs_typekey: ISVGPathSegLinetoAbs = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegLinetoAbs {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoAbs_typekey: ISVGPathSegLinetoAbs, x: Double, y: Double): ISVGPathSegLinetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoAbs_typekey")(MSHTMLDotISVGPathSegLinetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoAbsMutableBuilder[Self <: ISVGPathSegLinetoAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegLinetoAbs_typekey(value: ISVGPathSegLinetoAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
