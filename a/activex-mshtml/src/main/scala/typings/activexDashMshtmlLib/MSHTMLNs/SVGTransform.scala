package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTransform")
@js.native
class SVGTransform protected () extends js.Object {
  var `MSHTML.SVGTransform_typekey`: SVGTransform = js.native
  var angle: scala.Double = js.native
  var matrix: SVGMatrix = js.native
  var `type`: scala.Double = js.native
  def setMatrix(matrix: SVGMatrix): scala.Unit = js.native
  def setRotate(angle: scala.Double, cx: scala.Double, cy: scala.Double): scala.Unit = js.native
  def setScale(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  def setSkewX(angle: scala.Double): scala.Unit = js.native
  def setSkewY(angle: scala.Double): scala.Unit = js.native
  def setTranslate(tx: scala.Double, ty: scala.Double): scala.Unit = js.native
}

