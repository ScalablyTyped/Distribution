package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegArcRel extends js.Object {
  @JSName("MSHTML.SVGPathSegArcRel_typekey")
  var MSHTMLDotSVGPathSegArcRel_typekey: SVGPathSegArcRel
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
}

