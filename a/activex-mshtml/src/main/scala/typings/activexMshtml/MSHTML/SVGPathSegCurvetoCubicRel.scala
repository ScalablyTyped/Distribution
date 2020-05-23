package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoCubicRel extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoCubicRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicRel_typekey: SVGPathSegCurvetoCubicRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var x1: Double
  var x2: Double
  var y: Double
  var y1: Double
  var y2: Double
}

object SVGPathSegCurvetoCubicRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicRel_typekey: SVGPathSegCurvetoCubicRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicRel_typekey")(MSHTMLDotSVGPathSegCurvetoCubicRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicRel]
  }
}

