package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.ICanvasRenderingContext2D")
@js.native
class ICanvasRenderingContext2D protected () extends js.Object {
  var `MSHTML.ICanvasRenderingContext2D_typekey`: ICanvasRenderingContext2D = js.native
  val canvas: IHTMLCanvasElement = js.native
  var fillStyle: js.Any = js.native
  var font: String = js.native
  var globalAlpha: Double = js.native
  var globalCompositeOperation: String = js.native
  var lineCap: String = js.native
  var lineJoin: String = js.native
  var lineWidth: Double = js.native
  var miterLimit: Double = js.native
  var shadowBlur: Double = js.native
  var shadowColor: String = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var strokeStyle: js.Any = js.native
  var textAlign: String = js.native
  var textBaseline: String = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  def beginPath(): Unit = js.native
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def clip(): Unit = js.native
  def closePath(): Unit = js.native
  def createImageData(a1: js.Any, a2: js.Any): ICanvasImageData = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): ICanvasGradient = js.native
  def createPattern(Image: js.Any, repetition: js.Any): ICanvasPattern = js.native
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): ICanvasGradient = js.native
  def drawImage(
    pSrc: js.Any,
    a1: js.Any,
    a2: js.Any,
    a3: js.Any,
    a4: js.Any,
    a5: js.Any,
    a6: js.Any,
    a7: js.Any,
    a8: js.Any
  ): Unit = js.native
  def fill(): Unit = js.native
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ICanvasImageData = js.native
  def isPointInPath(x: Double, y: Double): Boolean = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def measureText(text: String): ICanvasTextMetrics = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def putImageData(
    imagedata: ICanvasImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.Any,
    dirtyY: js.Any,
    dirtyWidth: js.Any,
    dirtyHeight: js.Any
  ): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def restore(): Unit = js.native
  def rotate(angle: Double): Unit = js.native
  def save(): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  def stroke(): Unit = js.native
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
}

