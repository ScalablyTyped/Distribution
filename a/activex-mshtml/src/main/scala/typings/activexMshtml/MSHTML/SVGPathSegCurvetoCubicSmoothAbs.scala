package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegCurvetoCubicSmoothAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey: SVGPathSegCurvetoCubicSmoothAbs = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var x: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y2: Double = js.native
}

object SVGPathSegCurvetoCubicSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey: SVGPathSegCurvetoCubicSmoothAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicSmoothAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey")(MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicSmoothAbs]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoCubicSmoothAbsOps[Self <: SVGPathSegCurvetoCubicSmoothAbs] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey(value: SVGPathSegCurvetoCubicSmoothAbs): Self = this.set("MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
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

