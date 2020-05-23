package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoCubicSmoothAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicSmoothAbs_typekey: SVGPathSegCurvetoCubicSmoothAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
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
}

