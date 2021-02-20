package typings.androiduix.android.graphics

import typings.androiduix.android.graphics.Paint.Style
import typings.androiduix.androidui.image.NetImage
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends StObject {
  
  var _mCanvasContent: js.Any = js.native
  
  var _saveCount: js.Any = js.native
  
  /* private */ def applyFillOrStrokeToContent(style: js.Any): js.Any = js.native
  
  def clearColor(): Unit = js.native
  
  /* protected */ def clearColorImpl(): Unit = js.native
  
  def clipRect(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def clipRect(
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Boolean = js.native
  def clipRect(rect: Rect): Boolean = js.native
  
  /* protected */ def clipRectImpl(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  
  def clipRoundRect(
    r: Rect,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Boolean = js.native
  
  /* protected */ def clipRoundRectImpl(
    left: Double,
    top: Double,
    width: Double,
    height: Double,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Unit = js.native
  
  def concat(m: Matrix): Unit = js.native
  
  /* protected */ def concatImpl(
    MSCALE_X: Double,
    MSKEW_X: Double,
    MTRANS_X: Double,
    MSKEW_Y: Double,
    MSCALE_Y: Double,
    MTRANS_Y: Double,
    MPERSP_0: Double,
    MPERSP_1: Double,
    MPERSP_2: Double
  ): Unit = js.native
  
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
  
  def drawARGB(a: Double, r: Double, g: Double, b: Double): Unit = js.native
  
  /* protected */ def drawARGBImpl(a: Double, r: Double, g: Double, b: Double): Unit = js.native
  
  def drawArc(oval: RectF, startAngle: Double, sweepAngle: Double, useCenter: Boolean, paint: Paint): Unit = js.native
  
  /* protected */ def drawArcImpl(oval: RectF, startAngle: Double, sweepAngle: Double, useCenter: Boolean, style: Style): Unit = js.native
  
  def drawCanvas(canvas: Canvas): Unit = js.native
  def drawCanvas(canvas: Canvas, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): Unit = js.native
  def drawCanvas(canvas: Canvas, offsetX: Double): Unit = js.native
  def drawCanvas(canvas: Canvas, offsetX: Double, offsetY: Double): Unit = js.native
  
  /* protected */ def drawCanvasImpl(canvas: Canvas, offsetX: Double, offsetY: Double): Unit = js.native
  
  def drawCircle(cx: Double, cy: Double, radius: Double, paint: Paint): Unit = js.native
  
  /* protected */ def drawCircleImpl(cx: Double, cy: Double, radius: Double, style: Style): Unit = js.native
  
  def drawColor(color: Double): Unit = js.native
  
  def drawImage(image: NetImage): Unit = js.native
  def drawImage(
    image: NetImage,
    srcRect: js.UndefOr[scala.Nothing],
    dstRect: js.UndefOr[scala.Nothing],
    paint: Paint
  ): Unit = js.native
  def drawImage(image: NetImage, srcRect: js.UndefOr[scala.Nothing], dstRect: Rect): Unit = js.native
  def drawImage(image: NetImage, srcRect: js.UndefOr[scala.Nothing], dstRect: Rect, paint: Paint): Unit = js.native
  def drawImage(image: NetImage, srcRect: Rect): Unit = js.native
  def drawImage(image: NetImage, srcRect: Rect, dstRect: js.UndefOr[scala.Nothing], paint: Paint): Unit = js.native
  def drawImage(image: NetImage, srcRect: Rect, dstRect: Rect): Unit = js.native
  def drawImage(image: NetImage, srcRect: Rect, dstRect: Rect, paint: Paint): Unit = js.native
  
  /* protected */ def drawImageImpl(image: NetImage): Unit = js.native
  /* protected */ def drawImageImpl(image: NetImage, srcRect: js.UndefOr[scala.Nothing], dstRect: Rect): Unit = js.native
  /* protected */ def drawImageImpl(image: NetImage, srcRect: Rect): Unit = js.native
  /* protected */ def drawImageImpl(image: NetImage, srcRect: Rect, dstRect: Rect): Unit = js.native
  
  def drawOval(oval: RectF, paint: Paint): Unit = js.native
  
  /* protected */ def drawOvalImpl(oval: RectF, style: Style): Unit = js.native
  
  def drawPath(path: Path, paint: Paint): Unit = js.native
  
  def drawRGB(r: Double, g: Double, b: Double): Unit = js.native
  
  def drawRect(left: Double, top: Double, right: Double, bottom: Double, paint: Paint): js.Any = js.native
  def drawRect(rect: Rect, paint: Paint): js.Any = js.native
  
  /* protected */ def drawRectImpl(left: Double, top: Double, width: Double, height: Double, style: Style): Unit = js.native
  
  def drawRoundRect(
    rect: RectF,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double,
    paint: Paint
  ): Unit = js.native
  
  /* protected */ def drawRoundRectImpl(
    rect: RectF,
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: Double,
    radiusBottomLeft: Double,
    style: Style
  ): Unit = js.native
  
  def drawText(text: String, x: Double, y: Double, paint: Paint): Unit = js.native
  
  /* protected */ def drawTextImpl(text: String, x: Double, y: Double, style: Style): Unit = js.native
  
  def drawTextRun_count(
    text: String,
    index: Double,
    count: Double,
    contextIndex: Double,
    contextCount: Double,
    x: Double,
    y: Double,
    dir: Double,
    paint: Paint
  ): Unit = js.native
  
  def drawTextRun_end(
    text: String,
    start: Double,
    end: Double,
    contextStart: Double,
    contextEnd: Double,
    x: Double,
    y: Double,
    dir: Double,
    paint: Paint
  ): Unit = js.native
  
  def drawText_count(text: String, index: Double, count: Double, x: Double, y: Double, paint: Paint): Unit = js.native
  
  def drawText_end(text: String, start: Double, end: Double, x: Double, y: Double, paint: Paint): Unit = js.native
  
  def getClipBounds(): Rect = js.native
  def getClipBounds(bounds: Rect): Rect = js.native
  
  def getHeight(): Double = js.native
  
  def getSaveCount(): Double = js.native
  
  def getWidth(): Double = js.native
  
  /* protected */ def initCanvasImpl(): Unit = js.native
  
  def isImageSmoothingEnabled(): Boolean = js.native
  
  /* protected */ def isImageSmoothingEnabledImpl(): Boolean = js.native
  
  def isNativeAccelerated(): Boolean = js.native
  
  var mCanvasElement: HTMLCanvasElement = js.native
  
  var mClipStateMap: js.Any = js.native
  
  var mCurrentClip: Rect = js.native
  
  var mHeight: js.Any = js.native
  
  var mWidth: js.Any = js.native
  
  def multiplyGlobalAlpha(alpha: Double): Unit = js.native
  
  /* protected */ def multiplyGlobalAlphaImpl(alpha: Double): Unit = js.native
  
  def quickReject(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def quickReject(rect: Rect): Boolean = js.native
  
  def recycle(): Unit = js.native
  
  /* protected */ def recycleImpl(): Unit = js.native
  
  def restore(): Unit = js.native
  
  /* protected */ def restoreImpl(): Unit = js.native
  
  def restoreToCount(saveCount: Double): Unit = js.native
  
  def rotate(degrees: Double): Unit = js.native
  def rotate(degrees: Double, px: js.UndefOr[scala.Nothing], py: Double): Unit = js.native
  def rotate(degrees: Double, px: Double): Unit = js.native
  def rotate(degrees: Double, px: Double, py: Double): Unit = js.native
  
  /* protected */ def rotateImpl(degrees: Double): Unit = js.native
  
  def save(): Double = js.native
  
  /* protected */ def saveImpl(): Unit = js.native
  
  def scale(sx: Double, sy: Double): Unit = js.native
  def scale(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): Unit = js.native
  def scale(sx: Double, sy: Double, px: Double): Unit = js.native
  def scale(sx: Double, sy: Double, px: Double, py: Double): Unit = js.native
  
  /* protected */ def scaleImpl(sx: Double, sy: Double): Unit = js.native
  
  def setColor(color: Double): Unit = js.native
  def setColor(color: Double, style: Style): Unit = js.native
  
  /* protected */ def setColorImpl(color: Double): Unit = js.native
  /* protected */ def setColorImpl(color: Double, style: Style): Unit = js.native
  
  def setFont(fontName: String): Unit = js.native
  
  /* protected */ def setFontImpl(fontName: String): Unit = js.native
  
  def setFontSize(size: Double): Unit = js.native
  
  /* protected */ def setFontSizeImpl(size: Double): Unit = js.native
  
  def setGlobalAlpha(alpha: Double): Unit = js.native
  
  /* protected */ def setGlobalAlphaImpl(alpha: Double): Unit = js.native
  
  def setImageSmoothingEnabled(enable: Boolean): Unit = js.native
  
  /* protected */ def setImageSmoothingEnabledImpl(enable: Boolean): Unit = js.native
  
  def setLineCap(lineCap: String): Unit = js.native
  
  /* protected */ def setLineCapImpl(lineCap: String): Unit = js.native
  
  def setLineJoin(lineJoin: String): Unit = js.native
  
  /* protected */ def setLineJoinImpl(lineJoin: String): Unit = js.native
  
  def setLineWidth(width: Double): Unit = js.native
  
  /* protected */ def setLineWidthImpl(width: Double): Unit = js.native
  
  def setShadow(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  /* protected */ def setShadowImpl(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  def setTextAlign(align: String): Unit = js.native
  
  /* protected */ def setTextAlignImpl(align: String): Unit = js.native
  
  def translate(dx: Double, dy: Double): Unit = js.native
  
  /* protected */ def translateImpl(dx: Double, dy: Double): Unit = js.native
}
