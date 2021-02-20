package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegMovetoAbs extends StObject {
  
  @JSName("MSHTML.ISVGPathSegMovetoAbs_typekey")
  var MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegMovetoAbs {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs, x: Double, y: Double): ISVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoAbs_typekey")(MSHTMLDotISVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegMovetoAbsMutableBuilder[Self <: ISVGPathSegMovetoAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegMovetoAbs_typekey(value: ISVGPathSegMovetoAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegMovetoAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
