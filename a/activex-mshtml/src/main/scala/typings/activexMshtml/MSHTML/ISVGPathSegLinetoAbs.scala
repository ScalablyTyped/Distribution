package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegLinetoAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoAbs_typekey: ISVGPathSegLinetoAbs
  var x: Double
  var y: Double
}

object ISVGPathSegLinetoAbs {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoAbs_typekey: ISVGPathSegLinetoAbs, x: Double, y: Double): ISVGPathSegLinetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoAbs_typekey")(MSHTMLDotISVGPathSegLinetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoAbs]
  }
}

