package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegMovetoRel extends js.Object {
  
  @JSName("MSHTML.ISVGPathSegMovetoRel_typekey")
  var MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegMovetoRel {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel, x: Double, y: Double): ISVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoRel_typekey")(MSHTMLDotISVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegMovetoRelOps[Self <: ISVGPathSegMovetoRel] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGPathSegMovetoRel_typekey(value: ISVGPathSegMovetoRel): Self = this.set("MSHTML.ISVGPathSegMovetoRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
