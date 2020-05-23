package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegCurvetoCubicRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicRel_typekey: ISVGPathSegCurvetoCubicRel
  var x: Double
  var x1: Double
  var x2: Double
  var y: Double
  var y1: Double
  var y2: Double
}

object ISVGPathSegCurvetoCubicRel {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicRel_typekey: ISVGPathSegCurvetoCubicRel,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicRel_typekey")(MSHTMLDotISVGPathSegCurvetoCubicRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicRel]
  }
}

