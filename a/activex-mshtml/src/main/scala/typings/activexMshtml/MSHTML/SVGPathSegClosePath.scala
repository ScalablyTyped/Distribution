package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegClosePath extends js.Object {
  @JSName("MSHTML.SVGPathSegClosePath_typekey")
  var MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath
  var pathSegType: Double
  val pathSegTypeAsLetter: String
}

object SVGPathSegClosePath {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath,
    pathSegType: Double,
    pathSegTypeAsLetter: String
  ): SVGPathSegClosePath = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegClosePath_typekey")(MSHTMLDotSVGPathSegClosePath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegClosePath]
  }
}

