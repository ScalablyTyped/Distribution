package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGPathSegLinetoVerticalRel extends js.Object {
  @JSName("MSHTML.ISVGPathSegLinetoVerticalRel_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalRel_typekey: ISVGPathSegLinetoVerticalRel
  var y: Double
}

object ISVGPathSegLinetoVerticalRel {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoVerticalRel_typekey: ISVGPathSegLinetoVerticalRel, y: Double): ISVGPathSegLinetoVerticalRel = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalRel_typekey")(MSHTMLDotISVGPathSegLinetoVerticalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalRel]
  }
}

