package typings.androiduix.androidui.native.NativeApi

import typings.androiduix.android.graphics.Paint.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasApi extends js.Object {
  def clearColor(canvasId: Double): Unit = js.native
  def clipRect(canvasId: Double, left: Double, top: Double, width: Double, height: Double): Unit = js.native
  def clipRoundRectImpl(
    canvasId: Double,
    left: Double,
    top: Double,
    width: Double,
    height: Double,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Unit = js.native
  def concat(
    canvasId: Double,
    MSCALE_X: Double,
    MSKEW_X: Double,
    MTRANS_X: Double,
    MSKEW_Y: Double,
    MSCALE_Y: Double,
    MTRANS_Y: Double
  ): Unit = js.native
  def createCanvas(canvasId: Double, width: Double, height: Double): Unit = js.native
  def drawArc(
    canvasId: Double,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    startAngle: Double,
    sweepAngle: Double,
    useCenter: Boolean,
    style: Style
  ): Unit = js.native
  def drawCanvas(canvasId: Double, drawCanvasId: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def drawCircle(canvasId: Double, cx: Double, cy: Double, radius: Double, style: Style): Unit = js.native
  def drawColor(canvasId: Double, color: Double): Unit = js.native
  def drawImage2args(canvasId: Double, drawImageId: Double, left: Double, top: Double): Unit = js.native
  def drawImage4args(
    canvasId: Double,
    drawImageId: Double,
    dstLeft: Double,
    dstTop: Double,
    dstRight: Double,
    dstBottom: Double
  ): Unit = js.native
  def drawImage8args(
    canvasId: Double,
    drawImageId: Double,
    srcLeft: Double,
    srcTop: Double,
    srcRight: Double,
    srcBottom: Double,
    dstLeft: Double,
    dstTop: Double,
    dstRight: Double,
    dstBottom: Double
  ): Unit = js.native
  def drawOval(canvasId: Double, left: Double, top: Double, right: Double, bottom: Double, style: Style): Unit = js.native
  def drawRect(canvasId: Double, left: Double, top: Double, width: Double, height: Double, style: Style): Unit = js.native
  def drawRoundRectImpl(
    canvasId: Double,
    left: Double,
    top: Double,
    width: Double,
    height: Double,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double,
    style: Style
  ): Unit = js.native
  def drawText(canvasId: Double, text: String, x: Double, y: Double, fillStyle: Style): Unit = js.native
  def multiplyGlobalAlpha(canvasId: Double, alpha: Double): Unit = js.native
  def recycleCanvas(canvasId: Double): Unit = js.native
  def restore(canvasId: Double): Unit = js.native
  def rotate(canvasId: Double, degrees: Double): Unit = js.native
  def save(canvasId: Double): Unit = js.native
  def scale(canvasId: Double, sx: Double, sy: Double): Unit = js.native
  def setFillColor(canvasId: Double, color: Double, style: Style): Unit = js.native
  def setFont(canvasId: Double, fontName: String): Unit = js.native
  def setFontSize(canvasId: Double, size: Double): Unit = js.native
  def setGlobalAlpha(canvasId: Double, alpha: Double): Unit = js.native
  def setLineCap(canvasId: Double, lineCap: String): Unit = js.native
  def setLineJoin(canvasId: Double, lineJoin: String): Unit = js.native
  def setLineWidth(canvasId: Double, width: Double): Unit = js.native
  def setShadow(canvasId: Double, radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  def setTextAlign(canvasId: Double, align: String): Unit = js.native
  def translate(canvasId: Double, dx: Double, dy: Double): Unit = js.native
}

object CanvasApi {
  @scala.inline
  def apply(
    clearColor: Double => Unit,
    clipRect: (Double, Double, Double, Double, Double) => Unit,
    clipRoundRectImpl: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    concat: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    createCanvas: (Double, Double, Double) => Unit,
    drawArc: (Double, Double, Double, Double, Double, Double, Double, Boolean, Style) => Unit,
    drawCanvas: (Double, Double, Double, Double) => Unit,
    drawCircle: (Double, Double, Double, Double, Style) => Unit,
    drawColor: (Double, Double) => Unit,
    drawImage2args: (Double, Double, Double, Double) => Unit,
    drawImage4args: (Double, Double, Double, Double, Double, Double) => Unit,
    drawImage8args: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawOval: (Double, Double, Double, Double, Double, Style) => Unit,
    drawRect: (Double, Double, Double, Double, Double, Style) => Unit,
    drawRoundRectImpl: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Style) => Unit,
    drawText: (Double, String, Double, Double, Style) => Unit,
    multiplyGlobalAlpha: (Double, Double) => Unit,
    recycleCanvas: Double => Unit,
    restore: Double => Unit,
    rotate: (Double, Double) => Unit,
    save: Double => Unit,
    scale: (Double, Double, Double) => Unit,
    setFillColor: (Double, Double, Style) => Unit,
    setFont: (Double, String) => Unit,
    setFontSize: (Double, Double) => Unit,
    setGlobalAlpha: (Double, Double) => Unit,
    setLineCap: (Double, String) => Unit,
    setLineJoin: (Double, String) => Unit,
    setLineWidth: (Double, Double) => Unit,
    setShadow: (Double, Double, Double, Double, Double) => Unit,
    setTextAlign: (Double, String) => Unit,
    translate: (Double, Double, Double) => Unit
  ): CanvasApi = {
    val __obj = js.Dynamic.literal(clearColor = js.Any.fromFunction1(clearColor), clipRect = js.Any.fromFunction5(clipRect), clipRoundRectImpl = js.Any.fromFunction9(clipRoundRectImpl), concat = js.Any.fromFunction7(concat), createCanvas = js.Any.fromFunction3(createCanvas), drawArc = js.Any.fromFunction9(drawArc), drawCanvas = js.Any.fromFunction4(drawCanvas), drawCircle = js.Any.fromFunction5(drawCircle), drawColor = js.Any.fromFunction2(drawColor), drawImage2args = js.Any.fromFunction4(drawImage2args), drawImage4args = js.Any.fromFunction6(drawImage4args), drawImage8args = js.Any.fromFunction10(drawImage8args), drawOval = js.Any.fromFunction6(drawOval), drawRect = js.Any.fromFunction6(drawRect), drawRoundRectImpl = js.Any.fromFunction10(drawRoundRectImpl), drawText = js.Any.fromFunction5(drawText), multiplyGlobalAlpha = js.Any.fromFunction2(multiplyGlobalAlpha), recycleCanvas = js.Any.fromFunction1(recycleCanvas), restore = js.Any.fromFunction1(restore), rotate = js.Any.fromFunction2(rotate), save = js.Any.fromFunction1(save), scale = js.Any.fromFunction3(scale), setFillColor = js.Any.fromFunction3(setFillColor), setFont = js.Any.fromFunction2(setFont), setFontSize = js.Any.fromFunction2(setFontSize), setGlobalAlpha = js.Any.fromFunction2(setGlobalAlpha), setLineCap = js.Any.fromFunction2(setLineCap), setLineJoin = js.Any.fromFunction2(setLineJoin), setLineWidth = js.Any.fromFunction2(setLineWidth), setShadow = js.Any.fromFunction5(setShadow), setTextAlign = js.Any.fromFunction2(setTextAlign), translate = js.Any.fromFunction3(translate))
    __obj.asInstanceOf[CanvasApi]
  }
  @scala.inline
  implicit class CanvasApiOps[Self <: CanvasApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearColor(value: Double => Unit): Self = this.set("clearColor", js.Any.fromFunction1(value))
    @scala.inline
    def setClipRect(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("clipRect", js.Any.fromFunction5(value))
    @scala.inline
    def setClipRoundRectImpl(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("clipRoundRectImpl", js.Any.fromFunction9(value))
    @scala.inline
    def setConcat(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("concat", js.Any.fromFunction7(value))
    @scala.inline
    def setCreateCanvas(value: (Double, Double, Double) => Unit): Self = this.set("createCanvas", js.Any.fromFunction3(value))
    @scala.inline
    def setDrawArc(value: (Double, Double, Double, Double, Double, Double, Double, Boolean, Style) => Unit): Self = this.set("drawArc", js.Any.fromFunction9(value))
    @scala.inline
    def setDrawCanvas(value: (Double, Double, Double, Double) => Unit): Self = this.set("drawCanvas", js.Any.fromFunction4(value))
    @scala.inline
    def setDrawCircle(value: (Double, Double, Double, Double, Style) => Unit): Self = this.set("drawCircle", js.Any.fromFunction5(value))
    @scala.inline
    def setDrawColor(value: (Double, Double) => Unit): Self = this.set("drawColor", js.Any.fromFunction2(value))
    @scala.inline
    def setDrawImage2args(value: (Double, Double, Double, Double) => Unit): Self = this.set("drawImage2args", js.Any.fromFunction4(value))
    @scala.inline
    def setDrawImage4args(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("drawImage4args", js.Any.fromFunction6(value))
    @scala.inline
    def setDrawImage8args(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("drawImage8args", js.Any.fromFunction10(value))
    @scala.inline
    def setDrawOval(value: (Double, Double, Double, Double, Double, Style) => Unit): Self = this.set("drawOval", js.Any.fromFunction6(value))
    @scala.inline
    def setDrawRect(value: (Double, Double, Double, Double, Double, Style) => Unit): Self = this.set("drawRect", js.Any.fromFunction6(value))
    @scala.inline
    def setDrawRoundRectImpl(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Style) => Unit): Self = this.set("drawRoundRectImpl", js.Any.fromFunction10(value))
    @scala.inline
    def setDrawText(value: (Double, String, Double, Double, Style) => Unit): Self = this.set("drawText", js.Any.fromFunction5(value))
    @scala.inline
    def setMultiplyGlobalAlpha(value: (Double, Double) => Unit): Self = this.set("multiplyGlobalAlpha", js.Any.fromFunction2(value))
    @scala.inline
    def setRecycleCanvas(value: Double => Unit): Self = this.set("recycleCanvas", js.Any.fromFunction1(value))
    @scala.inline
    def setRestore(value: Double => Unit): Self = this.set("restore", js.Any.fromFunction1(value))
    @scala.inline
    def setRotate(value: (Double, Double) => Unit): Self = this.set("rotate", js.Any.fromFunction2(value))
    @scala.inline
    def setSave(value: Double => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def setScale(value: (Double, Double, Double) => Unit): Self = this.set("scale", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFillColor(value: (Double, Double, Style) => Unit): Self = this.set("setFillColor", js.Any.fromFunction3(value))
    @scala.inline
    def setSetFont(value: (Double, String) => Unit): Self = this.set("setFont", js.Any.fromFunction2(value))
    @scala.inline
    def setSetFontSize(value: (Double, Double) => Unit): Self = this.set("setFontSize", js.Any.fromFunction2(value))
    @scala.inline
    def setSetGlobalAlpha(value: (Double, Double) => Unit): Self = this.set("setGlobalAlpha", js.Any.fromFunction2(value))
    @scala.inline
    def setSetLineCap(value: (Double, String) => Unit): Self = this.set("setLineCap", js.Any.fromFunction2(value))
    @scala.inline
    def setSetLineJoin(value: (Double, String) => Unit): Self = this.set("setLineJoin", js.Any.fromFunction2(value))
    @scala.inline
    def setSetLineWidth(value: (Double, Double) => Unit): Self = this.set("setLineWidth", js.Any.fromFunction2(value))
    @scala.inline
    def setSetShadow(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("setShadow", js.Any.fromFunction5(value))
    @scala.inline
    def setSetTextAlign(value: (Double, String) => Unit): Self = this.set("setTextAlign", js.Any.fromFunction2(value))
    @scala.inline
    def setTranslate(value: (Double, Double, Double) => Unit): Self = this.set("translate", js.Any.fromFunction3(value))
  }
  
}

