package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoCubicSmoothRel extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoCubicSmoothRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey: SVGPathSegCurvetoCubicSmoothRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object SVGPathSegCurvetoCubicSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey: SVGPathSegCurvetoCubicSmoothRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicSmoothRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicSmoothRel_typekey")(MSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicSmoothRel]
  }
}

