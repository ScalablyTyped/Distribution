package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegLinetoVerticalAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoVerticalAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoVerticalAbs_typekey: SVGPathSegLinetoVerticalAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var y: Double
}

object SVGPathSegLinetoVerticalAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoVerticalAbs_typekey: SVGPathSegLinetoVerticalAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    y: Double
  ): SVGPathSegLinetoVerticalAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoVerticalAbs_typekey")(MSHTMLDotSVGPathSegLinetoVerticalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoVerticalAbs]
  }
}

