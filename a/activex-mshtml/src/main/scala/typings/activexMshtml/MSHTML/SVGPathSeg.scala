package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSeg extends js.Object {
  @JSName("MSHTML.SVGPathSeg_typekey")
  var MSHTMLDotSVGPathSeg_typekey: SVGPathSeg
  var pathSegType: Double
  val pathSegTypeAsLetter: String
}

object SVGPathSeg {
  @scala.inline
  def apply(MSHTMLDotSVGPathSeg_typekey: SVGPathSeg, pathSegType: Double, pathSegTypeAsLetter: String): SVGPathSeg = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSeg_typekey")(MSHTMLDotSVGPathSeg_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSeg]
  }
}

