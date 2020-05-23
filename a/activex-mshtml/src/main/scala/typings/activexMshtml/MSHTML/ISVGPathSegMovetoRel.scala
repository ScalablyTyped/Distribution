package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegMovetoRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegMovetoRel_typekey")
  var MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel
  var x: Double
  var y: Double
}

object ISVGPathSegMovetoRel {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegMovetoRel_typekey: ISVGPathSegMovetoRel, x: Double, y: Double): ISVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoRel_typekey")(MSHTMLDotISVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoRel]
  }
}

