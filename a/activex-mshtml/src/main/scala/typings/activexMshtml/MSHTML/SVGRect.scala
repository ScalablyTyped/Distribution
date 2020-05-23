package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGRect extends js.Object {
  @JSName("MSHTML.SVGRect_typekey")
  var MSHTMLDotSVGRect_typekey: SVGRect
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object SVGRect {
  @scala.inline
  def apply(MSHTMLDotSVGRect_typekey: SVGRect, height: Double, width: Double, x: Double, y: Double): SVGRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRect_typekey")(MSHTMLDotSVGRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRect]
  }
}

