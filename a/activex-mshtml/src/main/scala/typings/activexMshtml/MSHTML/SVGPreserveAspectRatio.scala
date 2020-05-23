package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPreserveAspectRatio extends js.Object {
  @JSName("MSHTML.SVGPreserveAspectRatio_typekey")
  var MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio
  var align: Double
  var meetOrSlice: Double
}

object SVGPreserveAspectRatio {
  @scala.inline
  def apply(
    MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio,
    align: Double,
    meetOrSlice: Double
  ): SVGPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPreserveAspectRatio_typekey")(MSHTMLDotSVGPreserveAspectRatio_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPreserveAspectRatio]
  }
}

