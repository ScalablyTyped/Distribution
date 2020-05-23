package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegLinetoHorizontalAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs
  var x: Double
}

object ISVGPathSegLinetoHorizontalAbs {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey: ISVGPathSegLinetoHorizontalAbs, x: Double): ISVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotISVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoHorizontalAbs]
  }
}

