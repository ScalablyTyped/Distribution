package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanvasRenderingContext2D extends StObject {
  
  @JSName("MSHTML.ICanvasRenderingContext2D_typekey")
  var MSHTMLDotICanvasRenderingContext2D_typekey: ICanvasRenderingContext2D = js.native
  
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double): Unit = js.native
  
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  
  def beginPath(): Unit = js.native
  
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  val canvas: IHTMLCanvasElement = js.native
  
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
  
  var fillStyle: js.Any = js.native
  
  def fillText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  
  var font: String = js.native
  
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ICanvasImageData = js.native
  
  var globalAlpha: Double = js.native
  
  var globalCompositeOperation: String = js.native
  
  def isPointInPath(x: Double, y: Double): Boolean = js.native
  
  var lineCap: String = js.native
  
  var lineJoin: String = js.native
  
  def lineTo(x: Double, y: Double): Unit = js.native
  
  var lineWidth: Double = js.native
  
  def measureText(text: String): ICanvasTextMetrics = js.native
  
  var miterLimit: Double = js.native
  
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
  
  var shadowBlur: Double = js.native
  
  var shadowColor: String = js.native
  
  var shadowOffsetX: Double = js.native
  
  var shadowOffsetY: Double = js.native
  
  def stroke(): Unit = js.native
  
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  var strokeStyle: js.Any = js.native
  
  def strokeText(text: String, x: Double, y: Double, maxWidth: js.Any): Unit = js.native
  
  var textAlign: String = js.native
  
  var textBaseline: String = js.native
  
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  
  def translate(x: Double, y: Double): Unit = js.native
}
object ICanvasRenderingContext2D {
  
  @scala.inline
  def apply(
    MSHTMLDotICanvasRenderingContext2D_typekey: ICanvasRenderingContext2D,
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
  ): ICanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(arc = js.Any.fromFunction6(arc), arcTo = js.Any.fromFunction5(arcTo), beginPath = js.Any.fromFunction0(beginPath), bezierCurveTo = js.Any.fromFunction6(bezierCurveTo), canvas = canvas.asInstanceOf[js.Any], clearRect = js.Any.fromFunction4(clearRect), clip = js.Any.fromFunction0(clip), closePath = js.Any.fromFunction0(closePath), createImageData = js.Any.fromFunction2(createImageData), createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), drawImage = js.Any.fromFunction9(drawImage), fill = js.Any.fromFunction0(fill), fillRect = js.Any.fromFunction4(fillRect), fillStyle = fillStyle.asInstanceOf[js.Any], fillText = js.Any.fromFunction4(fillText), font = font.asInstanceOf[js.Any], getImageData = js.Any.fromFunction4(getImageData), globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any], isPointInPath = js.Any.fromFunction2(isPointInPath), lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineTo = js.Any.fromFunction2(lineTo), lineWidth = lineWidth.asInstanceOf[js.Any], measureText = js.Any.fromFunction1(measureText), miterLimit = miterLimit.asInstanceOf[js.Any], moveTo = js.Any.fromFunction2(moveTo), putImageData = js.Any.fromFunction7(putImageData), quadraticCurveTo = js.Any.fromFunction4(quadraticCurveTo), rect = js.Any.fromFunction4(rect), restore = js.Any.fromFunction0(restore), rotate = js.Any.fromFunction1(rotate), save = js.Any.fromFunction0(save), scale = js.Any.fromFunction2(scale), setTransform = js.Any.fromFunction6(setTransform), shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any], stroke = js.Any.fromFunction0(stroke), strokeRect = js.Any.fromFunction4(strokeRect), strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeText = js.Any.fromFunction4(strokeText), textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], transform = js.Any.fromFunction6(transform), translate = js.Any.fromFunction2(translate))
    __obj.updateDynamic("MSHTML.ICanvasRenderingContext2D_typekey")(MSHTMLDotICanvasRenderingContext2D_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasRenderingContext2D]
  }
  
  @scala.inline
  implicit class ICanvasRenderingContext2DMutableBuilder[Self <: ICanvasRenderingContext2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "arc", js.Any.fromFunction6(value))
    
    @scala.inline
    def setArcTo(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "arcTo", js.Any.fromFunction5(value))
    
    @scala.inline
    def setBeginPath(value: () => Unit): Self = StObject.set(x, "beginPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBezierCurveTo(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "bezierCurveTo", js.Any.fromFunction6(value))
    
    @scala.inline
    def setCanvas(value: IHTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "clearRect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setClip(value: () => Unit): Self = StObject.set(x, "clip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosePath(value: () => Unit): Self = StObject.set(x, "closePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateImageData(value: (js.Any, js.Any) => ICanvasImageData): Self = StObject.set(x, "createImageData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateLinearGradient(value: (Double, Double, Double, Double) => ICanvasGradient): Self = StObject.set(x, "createLinearGradient", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreatePattern(value: (js.Any, js.Any) => ICanvasPattern): Self = StObject.set(x, "createPattern", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateRadialGradient(value: (Double, Double, Double, Double, Double, Double) => ICanvasGradient): Self = StObject.set(x, "createRadialGradient", js.Any.fromFunction6(value))
    
    @scala.inline
    def setDrawImage(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "drawImage", js.Any.fromFunction9(value))
    
    @scala.inline
    def setFill(value: () => Unit): Self = StObject.set(x, "fill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFillRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "fillRect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFillStyle(value: js.Any): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillText(value: (String, Double, Double, js.Any) => Unit): Self = StObject.set(x, "fillText", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetImageData(value: (Double, Double, Double, Double) => ICanvasImageData): Self = StObject.set(x, "getImageData", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGlobalAlpha(value: Double): Self = StObject.set(x, "globalAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalCompositeOperation(value: String): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPointInPath(value: (Double, Double) => Boolean): Self = StObject.set(x, "isPointInPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTo(value: (Double, Double) => Unit): Self = StObject.set(x, "lineTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotICanvasRenderingContext2D_typekey(value: ICanvasRenderingContext2D): Self = StObject.set(x, "MSHTML.ICanvasRenderingContext2D_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureText(value: String => ICanvasTextMetrics): Self = StObject.set(x, "measureText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveTo(value: (Double, Double) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPutImageData(value: (ICanvasImageData, Double, Double, js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "putImageData", js.Any.fromFunction7(value))
    
    @scala.inline
    def setQuadraticCurveTo(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "quadraticCurveTo", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "rect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRotate(value: Double => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScale(value: (Double, Double) => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTransform(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setTransform", js.Any.fromFunction6(value))
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: () => Unit): Self = StObject.set(x, "stroke", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStrokeRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "strokeRect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStrokeStyle(value: js.Any): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeText(value: (String, Double, Double, js.Any) => Unit): Self = StObject.set(x, "strokeText", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction6(value))
    
    @scala.inline
    def setTranslate(value: (Double, Double) => Unit): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
  }
}
