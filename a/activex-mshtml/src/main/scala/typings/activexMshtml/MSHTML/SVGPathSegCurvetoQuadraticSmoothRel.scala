package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoQuadraticSmoothRel extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey: SVGPathSegCurvetoQuadraticSmoothRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var y: Double
}

object SVGPathSegCurvetoQuadraticSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey: SVGPathSegCurvetoQuadraticSmoothRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegCurvetoQuadraticSmoothRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticSmoothRel_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticSmoothRel]
  }
}

