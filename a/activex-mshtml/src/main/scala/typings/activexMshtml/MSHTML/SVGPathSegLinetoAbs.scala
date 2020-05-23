package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegLinetoAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegLinetoAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoAbs_typekey: SVGPathSegLinetoAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var y: Double
}

object SVGPathSegLinetoAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoAbs_typekey: SVGPathSegLinetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegLinetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoAbs_typekey")(MSHTMLDotSVGPathSegLinetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoAbs]
  }
}

