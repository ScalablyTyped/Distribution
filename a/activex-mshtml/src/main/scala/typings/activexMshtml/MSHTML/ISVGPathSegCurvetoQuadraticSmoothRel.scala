package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoQuadraticSmoothRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel
  var x: Double
  var y: Double
}

object ISVGPathSegCurvetoQuadraticSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey: ISVGPathSegCurvetoQuadraticSmoothRel,
    x: Double,
    y: Double
  ): ISVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticSmoothRel]
  }
}

