package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegLinetoHorizontalRel extends js.Object {
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
  implicit class ISVGPathSegLinetoHorizontalRelOps[Self <: ISVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegLinetoHorizontalRel_typekey(value: ISVGPathSegLinetoHorizontalRel): Self = this.set("MSHTML.ISVGPathSegLinetoHorizontalRel_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
  }
  
}

