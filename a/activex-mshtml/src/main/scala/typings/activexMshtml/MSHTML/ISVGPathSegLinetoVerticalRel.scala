package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoVerticalRel extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegLinetoVerticalRel_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalRel_typekey: ISVGPathSegLinetoVerticalRel = js.native
  
  var y: Double = js.native
}
object ISVGPathSegLinetoVerticalRel {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoVerticalRel_typekey: ISVGPathSegLinetoVerticalRel, y: Double): ISVGPathSegLinetoVerticalRel = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalRel_typekey")(MSHTMLDotISVGPathSegLinetoVerticalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoVerticalRelOps[Self <: ISVGPathSegLinetoVerticalRel] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegLinetoVerticalRel_typekey(value: ISVGPathSegLinetoVerticalRel): Self = this.set("MSHTML.ISVGPathSegLinetoVerticalRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
