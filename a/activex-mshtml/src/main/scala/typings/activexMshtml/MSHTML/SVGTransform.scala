package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTransform extends js.Object {
  @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: SVGTransform
  var angle: Double
  var matrix: SVGMatrix
  var `type`: Double
  def setMatrix(matrix: SVGMatrix): Unit
  def setRotate(angle: Double, cx: Double, cy: Double): Unit
  def setScale(sx: Double, sy: Double): Unit
  def setSkewX(angle: Double): Unit
  def setSkewY(angle: Double): Unit
  def setTranslate(tx: Double, ty: Double): Unit
}

object SVGTransform {
  @scala.inline
  def apply(
    MSHTMLDotSVGTransform_typekey: SVGTransform,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Unit,
    setRotate: (Double, Double, Double) => Unit,
    setScale: (Double, Double) => Unit,
    setSkewX: Double => Unit,
    setSkewY: Double => Unit,
    setTranslate: (Double, Double) => Unit,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1(setMatrix), setRotate = js.Any.fromFunction3(setRotate), setScale = js.Any.fromFunction2(setScale), setSkewX = js.Any.fromFunction1(setSkewX), setSkewY = js.Any.fromFunction1(setSkewY), setTranslate = js.Any.fromFunction2(setTranslate))
    __obj.updateDynamic("MSHTML.SVGTransform_typekey")(MSHTMLDotSVGTransform_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
}

