package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegCurvetoCubicAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey: SVGPathSegCurvetoCubicAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var x1: Double
  var x2: Double
  var y: Double
  var y1: Double
  var y2: Double
}

object SVGPathSegCurvetoCubicAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey: SVGPathSegCurvetoCubicAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicAbs_typekey")(MSHTMLDotSVGPathSegCurvetoCubicAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicAbs]
  }
}

