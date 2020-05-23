package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoQuadraticRel extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var x1: Double
  var y: Double
  var y1: Double
}

object SVGPathSegCurvetoQuadraticRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey: SVGPathSegCurvetoQuadraticRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): SVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoQuadraticRel_typekey")(MSHTMLDotSVGPathSegCurvetoQuadraticRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticRel]
  }
}

