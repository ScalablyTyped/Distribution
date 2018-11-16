package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGMatrix")
@js.native
class SVGMatrix protected () extends js.Object {
  var `MSHTML.SVGMatrix_typekey`: SVGMatrix = js.native
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var e: scala.Double = js.native
  var f: scala.Double = js.native
  def flipX(): SVGMatrix = js.native
  def flipY(): SVGMatrix = js.native
  def inverse(): SVGMatrix = js.native
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = js.native
  def rotate(angle: scala.Double): SVGMatrix = js.native
  def rotateFromVector(x: scala.Double, y: scala.Double): SVGMatrix = js.native
  def scale(scaleFactor: scala.Double): SVGMatrix = js.native
  def scaleNonUniform(scaleFactorX: scala.Double, scaleFactorY: scala.Double): SVGMatrix = js.native
  def skewX(angle: scala.Double): SVGMatrix = js.native
  def skewY(angle: scala.Double): SVGMatrix = js.native
  def translate(x: scala.Double, y: scala.Double): SVGMatrix = js.native
}

