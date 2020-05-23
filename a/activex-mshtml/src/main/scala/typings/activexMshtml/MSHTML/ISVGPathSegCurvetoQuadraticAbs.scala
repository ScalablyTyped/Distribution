package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoQuadraticAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey: ISVGPathSegCurvetoQuadraticAbs
  var x: Double
  var x1: Double
  var y: Double
  var y1: Double
}

object ISVGPathSegCurvetoQuadraticAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey: ISVGPathSegCurvetoQuadraticAbs,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): ISVGPathSegCurvetoQuadraticAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticAbs_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticAbs]
  }
}

