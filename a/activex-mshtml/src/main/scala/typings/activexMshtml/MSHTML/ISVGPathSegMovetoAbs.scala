package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegMovetoAbs extends js.Object {
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
  implicit class ISVGPathSegMovetoAbsOps[Self <: ISVGPathSegMovetoAbs] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegMovetoAbs_typekey(value: ISVGPathSegMovetoAbs): Self = this.set("MSHTML.ISVGPathSegMovetoAbs_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

