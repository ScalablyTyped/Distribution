package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegArcAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegArcAbs_typekey")
  var MSHTMLDotISVGPathSegArcAbs_typekey: ISVGPathSegArcAbs
  var angle: Double
  var largeArcFlag: Boolean
  var r1: Double
  var r2: Double
  var sweepFlag: Boolean
  var x: Double
  var y: Double
}

object ISVGPathSegArcAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegArcAbs_typekey: ISVGPathSegArcAbs,
    angle: Double,
    largeArcFlag: Boolean,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): ISVGPathSegArcAbs = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegArcAbs_typekey")(MSHTMLDotISVGPathSegArcAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegArcAbs]
  }
}

