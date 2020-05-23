package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegArcAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegArcAbs_typekey")
  var MSHTMLDotSVGPathSegArcAbs_typekey: SVGPathSegArcAbs
  var angle: Double
  var largeArcFlag: Boolean
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var r1: Double
  var r2: Double
  var sweepFlag: Boolean
  var x: Double
  var y: Double
}

object SVGPathSegArcAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegArcAbs_typekey: SVGPathSegArcAbs,
    angle: Double,
    largeArcFlag: Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcAbs = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegArcAbs_typekey")(MSHTMLDotSVGPathSegArcAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcAbs]
  }
}

