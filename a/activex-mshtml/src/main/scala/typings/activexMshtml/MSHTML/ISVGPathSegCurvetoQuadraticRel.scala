package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoQuadraticRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel
  var x: Double
  var x1: Double
  var y: Double
  var y1: Double
}

object ISVGPathSegCurvetoQuadraticRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey: ISVGPathSegCurvetoQuadraticRel,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): ISVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotISVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoQuadraticRel]
  }
}

