package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPoint extends js.Object {
  @JSName("MSHTML.SVGPoint_typekey")
  var MSHTMLDotSVGPoint_typekey: SVGPoint
  var x: Double
  var y: Double
  def matrixTransform(pMatrix: SVGMatrix): SVGPoint
}

object SVGPoint {
  @scala.inline
  def apply(MSHTMLDotSVGPoint_typekey: SVGPoint, matrixTransform: SVGMatrix => SVGPoint, x: Double, y: Double): SVGPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPoint_typekey")(MSHTMLDotSVGPoint_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPoint]
  }
}

