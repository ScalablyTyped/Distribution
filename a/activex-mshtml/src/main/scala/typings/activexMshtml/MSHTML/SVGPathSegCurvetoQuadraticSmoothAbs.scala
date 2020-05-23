package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoQuadraticSmoothAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey: SVGPathSegCurvetoQuadraticSmoothAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var y: Double
}

object SVGPathSegCurvetoQuadraticSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey: SVGPathSegCurvetoQuadraticSmoothAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticSmoothAbs]
  }
}

