package typings.androiduix.androidui.native.NativeApi

import typings.androiduix.android.graphics.Paint.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeApi.CanvasApi")
@js.native
class CanvasApi () extends js.Object {
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

