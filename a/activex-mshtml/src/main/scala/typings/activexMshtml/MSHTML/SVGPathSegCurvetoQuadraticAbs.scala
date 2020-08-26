package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegCurvetoQuadraticAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey: SVGPathSegCurvetoQuadraticAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
}

object SVGPathSegCurvetoQuadraticAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey: SVGPathSegCurvetoQuadraticAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): SVGPathSegCurvetoQuadraticAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticAbs]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticAbsOps[Self <: SVGPathSegCurvetoQuadraticAbs] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey(value: SVGPathSegCurvetoQuadraticAbs): Self = this.set("MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
  
}

