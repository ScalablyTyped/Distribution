package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegLinetoHorizontalRel extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
}

object SVGPathSegLinetoHorizontalRel {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalRel]
  }
}

