package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegLinetoVerticalAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs
  var y: Double
}

object ISVGPathSegLinetoVerticalAbs {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs, y: Double): ISVGPathSegLinetoVerticalAbs = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalAbs]
  }
}

