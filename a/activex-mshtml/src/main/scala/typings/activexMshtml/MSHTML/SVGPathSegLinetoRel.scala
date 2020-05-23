package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegLinetoRel extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoRel_typekey")
  var MSHTMLDotSVGPathSegLinetoRel_typekey: SVGPathSegLinetoRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var y: Double
}

object SVGPathSegLinetoRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoRel_typekey: SVGPathSegLinetoRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoRel_typekey")(MSHTMLDotSVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoRel]
  }
}

