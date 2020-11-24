package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoRel extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegLinetoRel_typekey")
  var MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegLinetoRel {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel, x: Double, y: Double): ISVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoRel_typekey")(MSHTMLDotISVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoRelOps[Self <: ISVGPathSegLinetoRel] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegLinetoRel_typekey(value: ISVGPathSegLinetoRel): Self = this.set("MSHTML.ISVGPathSegLinetoRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
