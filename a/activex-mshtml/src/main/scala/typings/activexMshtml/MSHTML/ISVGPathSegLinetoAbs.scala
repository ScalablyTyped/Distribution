package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoAbs extends js.Object {
  
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
  implicit class ISVGPathSegLinetoAbsOps[Self <: ISVGPathSegLinetoAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotISVGPathSegLinetoAbs_typekey(value: ISVGPathSegLinetoAbs): Self = this.set("MSHTML.ISVGPathSegLinetoAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
