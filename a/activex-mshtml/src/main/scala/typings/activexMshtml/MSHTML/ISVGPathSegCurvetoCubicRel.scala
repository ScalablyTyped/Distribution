package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoCubicRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicRel_typekey: ISVGPathSegCurvetoCubicRel = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
  var y2: Double = js.native
}

object ISVGPathSegCurvetoCubicRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicRel_typekey: ISVGPathSegCurvetoCubicRel,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicRel_typekey")(MSHTMLDotISVGPathSegCurvetoCubicRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicRel]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoCubicRelOps[Self <: ISVGPathSegCurvetoCubicRel] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegCurvetoCubicRel_typekey(value: ISVGPathSegCurvetoCubicRel): Self = this.set("MSHTML.ISVGPathSegCurvetoCubicRel_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

