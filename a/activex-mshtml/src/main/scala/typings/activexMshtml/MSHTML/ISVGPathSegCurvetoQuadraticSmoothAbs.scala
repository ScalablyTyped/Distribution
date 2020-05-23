package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoQuadraticSmoothAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs
  var x: Double
  var y: Double
}

object ISVGPathSegCurvetoQuadraticSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey: ISVGPathSegCurvetoQuadraticSmoothAbs,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothAbs]
  }
}

