package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTransform")
@js.native
class SVGTransform protected () extends js.Object {
  var `MSHTML.SVGTransform_typekey`: SVGTransform = js.native
  var angle: Double = js.native
  var matrix: SVGMatrix = js.native
  var `type`: Double = js.native
  def setMatrix(matrix: SVGMatrix): Unit = js.native
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  def setScale(sx: Double, sy: Double): Unit = js.native
  def setSkewX(angle: Double): Unit = js.native
  def setSkewY(angle: Double): Unit = js.native
  def setTranslate(tx: Double, ty: Double): Unit = js.native
}

