package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGMatrix")
@js.native
class SVGMatrix protected () extends js.Object {
  @JSName("MSHTML.SVGMatrix_typekey")
  var MSHTMLDotSVGMatrix_typekey: SVGMatrix = js.native
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  def flipX(): SVGMatrix = js.native
  def flipY(): SVGMatrix = js.native
  def inverse(): SVGMatrix = js.native
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = js.native
  def rotate(angle: Double): SVGMatrix = js.native
  def rotateFromVector(x: Double, y: Double): SVGMatrix = js.native
  def scale(scaleFactor: Double): SVGMatrix = js.native
  def scaleNonUniform(scaleFactorX: Double, scaleFactorY: Double): SVGMatrix = js.native
  def skewX(angle: Double): SVGMatrix = js.native
  def skewY(angle: Double): SVGMatrix = js.native
  def translate(x: Double, y: Double): SVGMatrix = js.native
}

