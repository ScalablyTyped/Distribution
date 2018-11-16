package typings
package androiduixLib.androiduiNs.nativeNs.NativeApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeApi.CanvasApi")
@js.native
class CanvasApi () extends js.Object {
  def clearColor(canvasId: scala.Double): scala.Unit = js.native
  def clipRect(
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def clipRoundRectImpl(
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double
  ): scala.Unit = js.native
  def concat(
    canvasId: scala.Double,
    MSCALE_X: scala.Double,
    MSKEW_X: scala.Double,
    MTRANS_X: scala.Double,
    MSKEW_Y: scala.Double,
    MSCALE_Y: scala.Double,
    MTRANS_Y: scala.Double
  ): scala.Unit = js.native
  def createCanvas(canvasId: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def drawArc(
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    startAngle: scala.Double,
    sweepAngle: scala.Double,
    useCenter: scala.Boolean,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawCanvas(canvasId: scala.Double, drawCanvasId: scala.Double, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def drawCircle(
    canvasId: scala.Double,
    cx: scala.Double,
    cy: scala.Double,
    radius: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawColor(canvasId: scala.Double, color: scala.Double): scala.Unit = js.native
  def drawImage2args(canvasId: scala.Double, drawImageId: scala.Double, left: scala.Double, top: scala.Double): scala.Unit = js.native
  def drawImage4args(
    canvasId: scala.Double,
    drawImageId: scala.Double,
    dstLeft: scala.Double,
    dstTop: scala.Double,
    dstRight: scala.Double,
    dstBottom: scala.Double
  ): scala.Unit = js.native
  def drawImage8args(
    canvasId: scala.Double,
    drawImageId: scala.Double,
    srcLeft: scala.Double,
    srcTop: scala.Double,
    srcRight: scala.Double,
    srcBottom: scala.Double,
    dstLeft: scala.Double,
    dstTop: scala.Double,
    dstRight: scala.Double,
    dstBottom: scala.Double
  ): scala.Unit = js.native
  def drawOval(
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawRect(
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawRoundRectImpl(
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawText(
    canvasId: scala.Double,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fillStyle: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def multiplyGlobalAlpha(canvasId: scala.Double, alpha: scala.Double): scala.Unit = js.native
  def recycleCanvas(canvasId: scala.Double): scala.Unit = js.native
  def restore(canvasId: scala.Double): scala.Unit = js.native
  def rotate(canvasId: scala.Double, degrees: scala.Double): scala.Unit = js.native
  def save(canvasId: scala.Double): scala.Unit = js.native
  def scale(canvasId: scala.Double, sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  def setFillColor(
    canvasId: scala.Double,
    color: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def setFont(canvasId: scala.Double, fontName: java.lang.String): scala.Unit = js.native
  def setFontSize(canvasId: scala.Double, size: scala.Double): scala.Unit = js.native
  def setGlobalAlpha(canvasId: scala.Double, alpha: scala.Double): scala.Unit = js.native
  def setLineCap(canvasId: scala.Double, lineCap: java.lang.String): scala.Unit = js.native
  def setLineJoin(canvasId: scala.Double, lineJoin: java.lang.String): scala.Unit = js.native
  def setLineWidth(canvasId: scala.Double, width: scala.Double): scala.Unit = js.native
  def setShadow(
    canvasId: scala.Double,
    radius: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    color: scala.Double
  ): scala.Unit = js.native
  def setTextAlign(canvasId: scala.Double, align: java.lang.String): scala.Unit = js.native
  def translate(canvasId: scala.Double, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
}

