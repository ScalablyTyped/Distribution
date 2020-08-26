package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoQuadraticSmoothAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ISVGPathSegCurvetoQuadraticSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothAbs]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoQuadraticSmoothAbsOps[Self <: ISVGPathSegCurvetoQuadraticSmoothAbs] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey(value: ISVGPathSegCurvetoQuadraticSmoothAbs): Self = this.set("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

