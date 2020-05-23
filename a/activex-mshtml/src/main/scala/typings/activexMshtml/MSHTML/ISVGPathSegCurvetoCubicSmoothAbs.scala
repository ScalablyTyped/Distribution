package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoCubicSmoothAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object ISVGPathSegCurvetoCubicSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothAbs]
  }
}

