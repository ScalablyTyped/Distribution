package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.ICanvasRenderingContext2D")
@js.native
class ICanvasRenderingContext2D protected () extends js.Object {
  var `MSHTML.ICanvasRenderingContext2D_typekey`: ICanvasRenderingContext2D = js.native
  val canvas: IHTMLCanvasElement = js.native
  var fillStyle: js.Any = js.native
  var font: java.lang.String = js.native
  var globalAlpha: scala.Double = js.native
  var globalCompositeOperation: java.lang.String = js.native
  var lineCap: java.lang.String = js.native
  var lineJoin: java.lang.String = js.native
  var lineWidth: scala.Double = js.native
  var miterLimit: scala.Double = js.native
  var shadowBlur: scala.Double = js.native
  var shadowColor: java.lang.String = js.native
  var shadowOffsetX: scala.Double = js.native
  var shadowOffsetY: scala.Double = js.native
  var strokeStyle: js.Any = js.native
  var textAlign: java.lang.String = js.native
  var textBaseline: java.lang.String = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Double
  ): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): scala.Unit = js.native
  def beginPath(): scala.Unit = js.native
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def clip(): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def createImageData(a1: js.Any, a2: js.Any): ICanvasImageData = js.native
  def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): ICanvasGradient = js.native
  def createPattern(Image: js.Any, repetition: js.Any): ICanvasPattern = js.native
  def createRadialGradient(
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): ICanvasGradient = js.native
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
  ): scala.Unit = js.native
  def fill(): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: js.Any): scala.Unit = js.native
  def getImageData(sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): ICanvasImageData = js.native
  def isPointInPath(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def measureText(text: java.lang.String): ICanvasTextMetrics = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def putImageData(
    imagedata: ICanvasImageData,
    dx: scala.Double,
    dy: scala.Double,
    dirtyX: js.Any,
    dirtyY: js.Any,
    dirtyWidth: js.Any,
    dirtyHeight: js.Any
  ): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def rotate(angle: scala.Double): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setTransform(
    m11: scala.Double,
    m12: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Unit = js.native
  def stroke(): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: js.Any): scala.Unit = js.native
  def transform(
    m11: scala.Double,
    m12: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

