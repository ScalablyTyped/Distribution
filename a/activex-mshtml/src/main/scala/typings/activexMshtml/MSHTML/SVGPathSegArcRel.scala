package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegArcRel extends js.Object {
  @JSName("MSHTML.SVGPathSegArcRel_typekey")
  var MSHTMLDotSVGPathSegArcRel_typekey: SVGPathSegArcRel = js.native
  var angle: Double = js.native
  var largeArcFlag: Boolean = js.native
  var pathSegType: Double = js.native
  val pathSegTypeAsLetter: String = js.native
  var r1: Double = js.native
  var r2: Double = js.native
  var sweepFlag: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegArcRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegArcRel_typekey: SVGPathSegArcRel,
    angle: Double,
    largeArcFlag: Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcRel = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegArcRel_typekey")(MSHTMLDotSVGPathSegArcRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcRel]
  }
  @scala.inline
  implicit class SVGPathSegArcRelOps[Self <: SVGPathSegArcRel] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGPathSegArcRel_typekey(value: SVGPathSegArcRel): Self = this.set("MSHTML.SVGPathSegArcRel_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLargeArcFlag(value: Boolean): Self = this.set("largeArcFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    @scala.inline
    def setSweepFlag(value: Boolean): Self = this.set("sweepFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

