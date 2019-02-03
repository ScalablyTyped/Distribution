package typings
package androiduixLib.androidNs.graphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Canvas")
@js.native
class Canvas protected () extends js.Object {
  def this(width: scala.Double, height: scala.Double) = this()
  var _mCanvasContent: js.Any = js.native
  var _saveCount: js.Any = js.native
  var mCanvasElement: stdLib.HTMLCanvasElement = js.native
  var mClipStateMap: js.Any = js.native
  var mCurrentClip: Rect = js.native
  var mHeight: js.Any = js.native
  var mWidth: js.Any = js.native
  /* private */ def applyFillOrStrokeToContent(style: js.Any): js.Any = js.native
  def clearColor(): scala.Unit = js.native
  /* protected */ def clearColorImpl(): scala.Unit = js.native
  def clipRect(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  def clipRect(
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double
  ): scala.Boolean = js.native
  def clipRect(rect: Rect): scala.Boolean = js.native
  /* protected */ def clipRectImpl(left: scala.Double, top: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def clipRoundRect(
    r: Rect,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double
  ): scala.Boolean = js.native
  /* protected */ def clipRoundRectImpl(
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double
  ): scala.Unit = js.native
  def concat(m: Matrix): scala.Unit = js.native
  /* protected */ def concatImpl(
    MSCALE_X: scala.Double,
    MSKEW_X: scala.Double,
    MTRANS_X: scala.Double,
    MSKEW_Y: scala.Double,
    MSCALE_Y: scala.Double,
    MTRANS_Y: scala.Double,
    MPERSP_0: scala.Double,
    MPERSP_1: scala.Double,
    MPERSP_2: scala.Double
  ): scala.Unit = js.native
  /* private */ def doRoundRectPath(
    left: js.Any,
    top: js.Any,
    width: js.Any,
    height: js.Any,
    radiusTopLeft: js.Any,
    radiusTopRight: js.Any,
    radiusBottomRight: js.Any,
    radiusBottomLeft: js.Any
  ): js.Any = js.native
  def drawARGB(a: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  /* protected */ def drawARGBImpl(a: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def drawArc(
    oval: RectF,
    startAngle: scala.Double,
    sweepAngle: scala.Double,
    useCenter: scala.Boolean,
    paint: Paint
  ): scala.Unit = js.native
  /* protected */ def drawArcImpl(
    oval: RectF,
    startAngle: scala.Double,
    sweepAngle: scala.Double,
    useCenter: scala.Boolean,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawCanvas(canvas: Canvas): scala.Unit = js.native
  def drawCanvas(canvas: Canvas, offsetX: scala.Double): scala.Unit = js.native
  def drawCanvas(canvas: Canvas, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  /* protected */ def drawCanvasImpl(canvas: Canvas, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def drawCircle(cx: scala.Double, cy: scala.Double, radius: scala.Double, paint: Paint): scala.Unit = js.native
  /* protected */ def drawCircleImpl(
    cx: scala.Double,
    cy: scala.Double,
    radius: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawColor(color: scala.Double): scala.Unit = js.native
  def drawImage(image: androiduixLib.androiduiNs.imageNs.NetImage): scala.Unit = js.native
  def drawImage(image: androiduixLib.androiduiNs.imageNs.NetImage, srcRect: Rect): scala.Unit = js.native
  def drawImage(image: androiduixLib.androiduiNs.imageNs.NetImage, srcRect: Rect, dstRect: Rect): scala.Unit = js.native
  def drawImage(image: androiduixLib.androiduiNs.imageNs.NetImage, srcRect: Rect, dstRect: Rect, paint: Paint): scala.Unit = js.native
  /* protected */ def drawImageImpl(image: androiduixLib.androiduiNs.imageNs.NetImage): scala.Unit = js.native
  /* protected */ def drawImageImpl(image: androiduixLib.androiduiNs.imageNs.NetImage, srcRect: Rect): scala.Unit = js.native
  /* protected */ def drawImageImpl(image: androiduixLib.androiduiNs.imageNs.NetImage, srcRect: Rect, dstRect: Rect): scala.Unit = js.native
  def drawOval(oval: RectF, paint: Paint): scala.Unit = js.native
  /* protected */ def drawOvalImpl(oval: RectF, style: androiduixLib.androidNs.graphicsNs.PaintNs.Style): scala.Unit = js.native
  def drawPath(path: Path, paint: Paint): scala.Unit = js.native
  def drawRGB(r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def drawRect(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double, paint: Paint): js.Any = js.native
  def drawRect(rect: Rect, paint: Paint): js.Any = js.native
  /* protected */ def drawRectImpl(
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawRoundRect(
    rect: RectF,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double,
    paint: Paint
  ): scala.Unit = js.native
  /* protected */ def drawRoundRectImpl(
    rect: RectF,
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawText(text: java.lang.String, x: scala.Double, y: scala.Double, paint: Paint): scala.Unit = js.native
  /* protected */ def drawTextImpl(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    style: androiduixLib.androidNs.graphicsNs.PaintNs.Style
  ): scala.Unit = js.native
  def drawTextRun_count(
    text: java.lang.String,
    index: scala.Double,
    count: scala.Double,
    contextIndex: scala.Double,
    contextCount: scala.Double,
    x: scala.Double,
    y: scala.Double,
    dir: scala.Double,
    paint: Paint
  ): scala.Unit = js.native
  def drawTextRun_end(
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    contextStart: scala.Double,
    contextEnd: scala.Double,
    x: scala.Double,
    y: scala.Double,
    dir: scala.Double,
    paint: Paint
  ): scala.Unit = js.native
  def drawText_count(
    text: java.lang.String,
    index: scala.Double,
    count: scala.Double,
    x: scala.Double,
    y: scala.Double,
    paint: Paint
  ): scala.Unit = js.native
  def drawText_end(
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    x: scala.Double,
    y: scala.Double,
    paint: Paint
  ): scala.Unit = js.native
  def getClipBounds(): Rect = js.native
  def getClipBounds(bounds: Rect): Rect = js.native
  def getHeight(): scala.Double = js.native
  def getSaveCount(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  /* protected */ def initCanvasImpl(): scala.Unit = js.native
  def isImageSmoothingEnabled(): scala.Boolean = js.native
  /* protected */ def isImageSmoothingEnabledImpl(): scala.Boolean = js.native
  def isNativeAccelerated(): scala.Boolean = js.native
  def multiplyGlobalAlpha(alpha: scala.Double): scala.Unit = js.native
  /* protected */ def multiplyGlobalAlphaImpl(alpha: scala.Double): scala.Unit = js.native
  def quickReject(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  def quickReject(rect: Rect): scala.Boolean = js.native
  def recycle(): scala.Unit = js.native
  /* protected */ def recycleImpl(): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  /* protected */ def restoreImpl(): scala.Unit = js.native
  def restoreToCount(saveCount: scala.Double): scala.Unit = js.native
  def rotate(degrees: scala.Double): scala.Unit = js.native
  def rotate(degrees: scala.Double, px: scala.Double): scala.Unit = js.native
  def rotate(degrees: scala.Double, px: scala.Double, py: scala.Double): scala.Unit = js.native
  /* protected */ def rotateImpl(degrees: scala.Double): scala.Unit = js.native
  def save(): scala.Double = js.native
  /* protected */ def saveImpl(): scala.Unit = js.native
  def scale(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  def scale(sx: scala.Double, sy: scala.Double, px: scala.Double): scala.Unit = js.native
  def scale(sx: scala.Double, sy: scala.Double, px: scala.Double, py: scala.Double): scala.Unit = js.native
  /* protected */ def scaleImpl(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  def setColor(color: scala.Double): scala.Unit = js.native
  def setColor(color: scala.Double, style: androiduixLib.androidNs.graphicsNs.PaintNs.Style): scala.Unit = js.native
  /* protected */ def setColorImpl(color: scala.Double): scala.Unit = js.native
  /* protected */ def setColorImpl(color: scala.Double, style: androiduixLib.androidNs.graphicsNs.PaintNs.Style): scala.Unit = js.native
  def setFont(fontName: java.lang.String): scala.Unit = js.native
  /* protected */ def setFontImpl(fontName: java.lang.String): scala.Unit = js.native
  def setFontSize(size: scala.Double): scala.Unit = js.native
  /* protected */ def setFontSizeImpl(size: scala.Double): scala.Unit = js.native
  def setGlobalAlpha(alpha: scala.Double): scala.Unit = js.native
  /* protected */ def setGlobalAlphaImpl(alpha: scala.Double): scala.Unit = js.native
  def setImageSmoothingEnabled(enable: scala.Boolean): scala.Unit = js.native
  /* protected */ def setImageSmoothingEnabledImpl(enable: scala.Boolean): scala.Unit = js.native
  def setLineCap(lineCap: java.lang.String): scala.Unit = js.native
  /* protected */ def setLineCapImpl(lineCap: java.lang.String): scala.Unit = js.native
  def setLineJoin(lineJoin: java.lang.String): scala.Unit = js.native
  /* protected */ def setLineJoinImpl(lineJoin: java.lang.String): scala.Unit = js.native
  def setLineWidth(width: scala.Double): scala.Unit = js.native
  /* protected */ def setLineWidthImpl(width: scala.Double): scala.Unit = js.native
  def setShadow(radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double): scala.Unit = js.native
  /* protected */ def setShadowImpl(radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double): scala.Unit = js.native
  def setTextAlign(align: java.lang.String): scala.Unit = js.native
  /* protected */ def setTextAlignImpl(align: java.lang.String): scala.Unit = js.native
  def translate(dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  /* protected */ def translateImpl(dx: scala.Double, dy: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.Canvas")
@js.native
object Canvas extends js.Object {
  var DIRECTION_LTR: scala.Double = js.native
  var DIRECTION_RTL: scala.Double = js.native
  var TempMatrixValue: js.Array[scala.Double] = js.native
  var _measureCacheMap: js.Any = js.native
  var _measureCacheTextSize: js.Any = js.native
  var _measureTextContext: js.Any = js.native
  var _static: js.Any = js.native
  var sRectPool: js.Any = js.native
  /* protected */ def getMeasureTextFontFamily(): java.lang.String = js.native
  def measureText(text: java.lang.String, textSize: scala.Double): scala.Double = js.native
  /* protected */ def measureTextImpl(text: java.lang.String, textSize: scala.Double): scala.Double = js.native
  /* private */ def obtainRect(): js.Any = js.native
  /* private */ def obtainRect(copy: js.Any): js.Any = js.native
  /* private */ def recycleRect(rect: js.Any): js.Any = js.native
}

