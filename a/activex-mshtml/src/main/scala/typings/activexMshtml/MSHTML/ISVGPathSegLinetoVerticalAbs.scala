package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoVerticalAbs extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs = js.native
  
  var y: Double = js.native
}
object ISVGPathSegLinetoVerticalAbs {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs, y: Double): ISVGPathSegLinetoVerticalAbs = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoVerticalAbsOps[Self <: ISVGPathSegLinetoVerticalAbs] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegLinetoVerticalAbs_typekey(value: ISVGPathSegLinetoVerticalAbs): Self = this.set("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
