package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoQuadraticAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticAbs_typekey: SVGPathSegCurvetoQuadraticAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var x1: Double
  var y: Double
  var y1: Double
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
}

