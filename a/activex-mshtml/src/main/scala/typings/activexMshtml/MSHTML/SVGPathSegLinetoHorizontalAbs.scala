package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegLinetoHorizontalAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
}

object SVGPathSegLinetoHorizontalAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalAbs]
  }
}

