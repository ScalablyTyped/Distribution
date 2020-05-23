package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRenderingContext2D extends js.Object {
  @JSName("MSHTML.CanvasRenderingContext2D_typekey")
  var MSHTMLDotCanvasRenderingContext2D_typekey: CanvasRenderingContext2D
  val canvas: IHTMLCanvasElement
  var fillStyle: js.Any
  var font: String
  var globalAlpha: Double
  var globalCompositeOperation: String
  var lineCap: String
  var lineJoin: String
  var lineWidth: Double
  var miterLimit: Double
  var shadowBlur: Double
  var shadowColor: String
  var shadowOffsetX: Double
  var shadowOffsetY: Double
  var strokeStyle: js.Any
  var textAlign: String
  var textBaseline: String
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double): Unit
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit
  def beginPath(): Unit
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit
  def clip(): Unit
  def closePath(): Unit
  def createImageData(a1: js.Any, a2: js.Any): ICanvasImageData
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): ICanvasGradient
  def createPattern(Image: js.Any, repetition: js.Any): ICanvasPattern
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): ICanvasGradient
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
  ): Unit
  def fill(): Unit
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit
  def fillText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ICanvasImageData
  def isPointInPath(x: Double, y: Double): Boolean
  def lineTo(x: Double, y: Double): Unit
  def measureText(text: String): ICanvasTextMetrics
  def moveTo(x: Double, y: Double): Unit
  def putImageData(
    imagedata: ICanvasImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.Any,
    dirtyY: js.Any,
    dirtyWidth: js.Any,
    dirtyHeight: js.Any
  ): Unit
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit
  def rect(x: Double, y: Double, w: Double, h: Double): Unit
  def restore(): Unit
  def rotate(angle: Double): Unit
  def save(): Unit
  def scale(x: Double, y: Double): Unit
  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit
  def stroke(): Unit
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
  def strokeText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit
  def translate(x: Double, y: Double): Unit
}

object CanvasRenderingContext2D {
  @scala.inline
  def apply(
    MSHTMLDotCanvasRenderingContext2D_typekey: CanvasRenderingContext2D,
    arc: (Double, Double, Double, Double, Double, Double) => Unit,
    arcTo: (Double, Double, Double, Double, Double) => Unit,
    beginPath: () => Unit,
    bezierCurveTo: (Double, Double, Double, Double, Double, Double) => Unit,
    canvas: IHTMLCanvasElement,
    clearRect: (Double, Double, Double, Double) => Unit,
    clip: () => Unit,
    closePath: () => Unit,
    createImageData: (js.Any, js.Any) => ICanvasImageData,
    createLinearGradient: (Double, Double, Double, Double) => ICanvasGradient,
    createPattern: (js.Any, js.Any) => ICanvasPattern,
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => ICanvasGradient,
    drawImage: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    fill: () => Unit,
    fillRect: (Double, Double, Double, Double) => Unit,
    fillStyle: js.Any,
    fillText: (String, Double, Double, js.Any) => Unit,
    font: String,
    getImageData: (Double, Double, Double, Double) => ICanvasImageData,
    globalAlpha: Double,
    globalCompositeOperation: String,
    isPointInPath: (Double, Double) => Boolean,
    lineCap: String,
    lineJoin: String,
    lineTo: (Double, Double) => Unit,
    lineWidth: Double,
    measureText: String => ICanvasTextMetrics,
    miterLimit: Double,
    moveTo: (Double, Double) => Unit,
    putImageData: (ICanvasImageData, Double, Double, js.Any, js.Any, js.Any, js.Any) => Unit,
    quadraticCurveTo: (Double, Double, Double, Double) => Unit,
    rect: (Double, Double, Double, Double) => Unit,
    restore: () => Unit,
    rotate: Double => Unit,
    save: () => Unit,
    scale: (Double, Double) => Unit,
    setTransform: (Double, Double, Double, Double, Double, Double) => Unit,
    shadowBlur: Double,
    shadowColor: String,
    shadowOffsetX: Double,
    shadowOffsetY: Double,
    stroke: () => Unit,
    strokeRect: (Double, Double, Double, Double) => Unit,
    strokeStyle: js.Any,
    strokeText: (String, Double, Double, js.Any) => Unit,
    textAlign: String,
    textBaseline: String,
    transform: (Double, Double, Double, Double, Double, Double) => Unit,
    translate: (Double, Double) => Unit
  ): CanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(arc = js.Any.fromFunction6(arc), arcTo = js.Any.fromFunction5(arcTo), beginPath = js.Any.fromFunction0(beginPath), bezierCurveTo = js.Any.fromFunction6(bezierCurveTo), canvas = canvas.asInstanceOf[js.Any], clearRect = js.Any.fromFunction4(clearRect), clip = js.Any.fromFunction0(clip), closePath = js.Any.fromFunction0(closePath), createImageData = js.Any.fromFunction2(createImageData), createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), drawImage = js.Any.fromFunction9(drawImage), fill = js.Any.fromFunction0(fill), fillRect = js.Any.fromFunction4(fillRect), fillStyle = fillStyle.asInstanceOf[js.Any], fillText = js.Any.fromFunction4(fillText), font = font.asInstanceOf[js.Any], getImageData = js.Any.fromFunction4(getImageData), globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any], isPointInPath = js.Any.fromFunction2(isPointInPath), lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineTo = js.Any.fromFunction2(lineTo), lineWidth = lineWidth.asInstanceOf[js.Any], measureText = js.Any.fromFunction1(measureText), miterLimit = miterLimit.asInstanceOf[js.Any], moveTo = js.Any.fromFunction2(moveTo), putImageData = js.Any.fromFunction7(putImageData), quadraticCurveTo = js.Any.fromFunction4(quadraticCurveTo), rect = js.Any.fromFunction4(rect), restore = js.Any.fromFunction0(restore), rotate = js.Any.fromFunction1(rotate), save = js.Any.fromFunction0(save), scale = js.Any.fromFunction2(scale), setTransform = js.Any.fromFunction6(setTransform), shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any], stroke = js.Any.fromFunction0(stroke), strokeRect = js.Any.fromFunction4(strokeRect), strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeText = js.Any.fromFunction4(strokeText), textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], transform = js.Any.fromFunction6(transform), translate = js.Any.fromFunction2(translate))
    __obj.updateDynamic("MSHTML.CanvasRenderingContext2D_typekey")(MSHTMLDotCanvasRenderingContext2D_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2D]
  }
}

