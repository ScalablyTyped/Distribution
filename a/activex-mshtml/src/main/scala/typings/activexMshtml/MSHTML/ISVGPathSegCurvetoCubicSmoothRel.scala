package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoCubicSmoothRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey: ISVGPathSegCurvetoCubicSmoothRel = js.native
  var x: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y2: Double = js.native
}

object ISVGPathSegCurvetoCubicSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey: ISVGPathSegCurvetoCubicSmoothRel,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothRel]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoCubicSmoothRelOps[Self <: ISVGPathSegCurvetoCubicSmoothRel] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey(value: ISVGPathSegCurvetoCubicSmoothRel): Self = this.set("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

