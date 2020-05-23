package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoCubicSmoothRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey: ISVGPathSegCurvetoCubicSmoothRel
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object ISVGPathSegCurvetoCubicSmoothRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey: ISVGPathSegCurvetoCubicSmoothRel,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothRel]
  }
}

