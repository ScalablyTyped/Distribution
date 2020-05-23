package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegLinetoRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoRel_typekey")
  var MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel
  var x: Double
  var y: Double
}

object ISVGPathSegLinetoRel {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoRel_typekey: ISVGPathSegLinetoRel, x: Double, y: Double): ISVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoRel_typekey")(MSHTMLDotISVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoRel]
  }
}

