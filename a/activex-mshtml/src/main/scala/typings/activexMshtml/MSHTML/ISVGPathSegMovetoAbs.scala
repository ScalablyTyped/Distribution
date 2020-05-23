package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegMovetoAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegMovetoAbs_typekey")
  var MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs
  var x: Double
  var y: Double
}

object ISVGPathSegMovetoAbs {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs, x: Double, y: Double): ISVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoAbs_typekey")(MSHTMLDotISVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoAbs]
  }
}

