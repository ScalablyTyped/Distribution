package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoHorizontalAbs extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs = js.native
  
  var x: Double = js.native
}
object ISVGPathSegLinetoHorizontalAbs {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs, x: Double): ISVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoHorizontalAbsOps[Self <: ISVGPathSegLinetoHorizontalAbs] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey(value: ISVGPathSegLinetoHorizontalAbs): Self = this.set("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
  }
}
