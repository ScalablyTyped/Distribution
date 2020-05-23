package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegMovetoRel extends js.Object {
  @JSName("MSHTML.SVGPathSegMovetoRel_typekey")
  var MSHTMLDotSVGPathSegMovetoRel_typekey: SVGPathSegMovetoRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var y: Double
}

object SVGPathSegMovetoRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegMovetoRel_typekey: SVGPathSegMovetoRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoRel_typekey")(MSHTMLDotSVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoRel]
  }
}

