package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.CanvasRenderingContext2D")
@js.native
class CanvasRenderingContext2D protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.CanvasRenderingContext2D {
  
  /* CompleteClass */
  @JSName("MSHTML.CanvasRenderingContext2D_typekey")
  var MSHTMLDotCanvasRenderingContext2D_typekey: typings.activexMshtml.MSHTML.CanvasRenderingContext2D = js.native
  
  /* CompleteClass */
  override def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double): Unit = js.native
  
  /* CompleteClass */
  override def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  
  /* CompleteClass */
  override def beginPath(): Unit = js.native
  
  /* CompleteClass */
  override def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  override val canvas: typings.activexMshtml.MSHTML.IHTMLCanvasElement = js.native
  
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  override def clip(): Unit = js.native
  
  /* CompleteClass */
  override def closePath(): Unit = js.native
  
  /* CompleteClass */
  override def createImageData(a1: js.Any, a2: js.Any): typings.activexMshtml.MSHTML.ICanvasImageData = js.native
  
  /* CompleteClass */
  override def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): typings.activexMshtml.MSHTML.ICanvasGradient = js.native
  
  /* CompleteClass */
  override def createPattern(Image: js.Any, repetition: js.Any): typings.activexMshtml.MSHTML.ICanvasPattern = js.native
  
  /* CompleteClass */
  override def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): typings.activexMshtml.MSHTML.ICanvasGradient = js.native
  
  /* CompleteClass */
  override def drawImage(
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
  
  /* CompleteClass */
  override def fill(): Unit = js.native
  
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  var fillStyle: js.Any = js.native
  
  /* CompleteClass */
  override def fillText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  
  /* CompleteClass */
  var font: String = js.native
  
  /* CompleteClass */
  override def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): typings.activexMshtml.MSHTML.ICanvasImageData = js.native
  
  /* CompleteClass */
  var globalAlpha: Double = js.native
  
  /* CompleteClass */
  var globalCompositeOperation: String = js.native
  
  /* CompleteClass */
  override def isPointInPath(x: Double, y: Double): Boolean = js.native
  
  /* CompleteClass */
  var lineCap: String = js.native
  
  /* CompleteClass */
  var lineJoin: String = js.native
  
  /* CompleteClass */
  override def lineTo(x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  var lineWidth: Double = js.native
  
  /* CompleteClass */
  override def measureText(text: String): typings.activexMshtml.MSHTML.ICanvasTextMetrics = js.native
  
  /* CompleteClass */
  var miterLimit: Double = js.native
  
  /* CompleteClass */
  override def moveTo(x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  override def putImageData(
    imagedata: typings.activexMshtml.MSHTML.ICanvasImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.Any,
    dirtyY: js.Any,
    dirtyWidth: js.Any,
    dirtyHeight: js.Any
  ): Unit = js.native
  
  /* CompleteClass */
  override def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  override def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  override def restore(): Unit = js.native
  
  /* CompleteClass */
  override def rotate(angle: Double): Unit = js.native
  
  /* CompleteClass */
  override def save(): Unit = js.native
  
  /* CompleteClass */
  override def scale(x: Double, y: Double): Unit = js.native
  
  /* CompleteClass */
  override def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  
  /* CompleteClass */
  var shadowBlur: Double = js.native
  
  /* CompleteClass */
  var shadowColor: String = js.native
  
  /* CompleteClass */
  var shadowOffsetX: Double = js.native
  
  /* CompleteClass */
  var shadowOffsetY: Double = js.native
  
  /* CompleteClass */
  override def stroke(): Unit = js.native
  
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  var strokeStyle: js.Any = js.native
  
  /* CompleteClass */
  override def strokeText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  
  /* CompleteClass */
  var textAlign: String = js.native
  
  /* CompleteClass */
  var textBaseline: String = js.native
  
  /* CompleteClass */
  override def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  
  /* CompleteClass */
  override def translate(x: Double, y: Double): Unit = js.native
}
