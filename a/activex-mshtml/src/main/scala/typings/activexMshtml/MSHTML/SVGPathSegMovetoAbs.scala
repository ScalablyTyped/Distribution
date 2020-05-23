package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegMovetoAbs extends js.Object {
  @JSName("MSHTML.SVGPathSegMovetoAbs_typekey")
  var MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs
  var pathSegType: Double
  val pathSegTypeAsLetter: String
  var x: Double
  var y: Double
}

object SVGPathSegMovetoAbs {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoAbs_typekey")(MSHTMLDotSVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoAbs]
  }
}

