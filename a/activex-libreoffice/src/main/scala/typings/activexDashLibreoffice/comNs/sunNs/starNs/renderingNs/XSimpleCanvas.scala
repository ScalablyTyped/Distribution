package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealPoint2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealRectangle2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the basic graphical output operations for a canvas.
  *
  * This interface is a simplified version of the {@link XCanvas} interface. It holds explicit state, i.e. the pen and fill color, the current
  * transformation, clip and font are persistently remembered.
  *
  * In contrast to the {@link XCanvas} interface, {@link XSimpleCanvas} does not distinguish between stroke and fill operations; instead, switching
  * between stroke and fill (or taking both) works by setting appropriate pen and fill colors.
  */
trait XSimpleCanvas extends XInterface {
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  val Canvas: XCanvas
  /** Retrieve current clip rect */
  val CurrentClipRect: RealRectangle2D
  /** Retrieve color currently used for fills */
  val CurrentFillColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  val CurrentFont: XCanvasFont
  /** Retrieve color currently used for lines. */
  val CurrentPenColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  /** Retrieve current transformation matrix */
  val CurrentTransformation: AffineMatrix2D
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  val CurrentViewState: ViewState
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  val Device: XGraphicDevice
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  val FontMetrics: typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.FontMetrics
  /**
    * Draws the bitmap on the canvas.
    * @param xBitmap Bitmap to render
    * @param aLeftTop Left, top position of the bitmap on the destination canvas.
    */
  def drawBitmap(xBitmap: XBitmap, aLeftTop: RealPoint2D): Unit
  /** Draws a line on the canvas. */
  def drawLine(aStartPoint: RealPoint2D, aEndPoint: RealPoint2D): Unit
  /** Sets a single pixel on the canvas. */
  def drawPixel(aPoint: RealPoint2D): Unit
  /** Draws a poly-polygon on the canvas. */
  def drawPolyPolygon(xPolyPolygon: XPolyPolygon2D): Unit
  /** Draws a rectangle on the canvas. */
  def drawRect(aRect: RealRectangle2D): Unit
  /**
    * Draws text on the canvas.
    * @param aText Text to render. The text color is the current pen color.
    * @param aOutPos Output position of the text. This is the left or right edge, depending on nTextDirection. Output position is always relative to the font
    * @param nTextDirection A value from the {@link TextDirection} collection, denoting the main writing direction for this string. The main writing direction
    */
  def drawText(aText: StringContext, aOutPos: RealPoint2D, nTextDirection: Double): Unit
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  def getCanvas(): XCanvas
  /** Retrieve current clip rect */
  def getCurrentClipRect(): RealRectangle2D
  /** Retrieve color currently used for fills */
  def getCurrentFillColor(): typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  def getCurrentFont(): XCanvasFont
  /** Retrieve color currently used for lines. */
  def getCurrentPenColor(): typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  /**
    * Retrieve render state.
    * @param bUseFillColor When true, the Color member of the {@link RenderState} is initialized with the current fill color; when false, the current pen colo
    * @returns the render state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentRenderState(bUseFillColor: Boolean): RenderState
  /** Retrieve current transformation matrix */
  def getCurrentTransformation(): AffineMatrix2D
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentViewState(): ViewState
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  def getDevice(): XGraphicDevice
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  def getFontMetrics(): typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.FontMetrics
  /**
    * Select a font.
    *
    * This method selects the specified font (or a close substitute) as the current font for text output.
    * @param sFontName The name of the font (like e.g. Arial)
    * @param size The size of the font (note that this is not the usual points unit, but in the same coordinate system as the other rendering operations - usu
    * @param bold When true, selected font is bold.
    * @param italic When true, selected font is italic
    */
  def selectFont(sFontName: String, size: Double, bold: Boolean, italic: Boolean): Unit
  /**
    * Sets the fill color.
    *
    * To disable filling, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setFillColor(nsRgbaColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color): Unit
  /**
    * Sets the color used by line and text operations.
    *
    * To disable stroking, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setPenColor(nsRgbaColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color): Unit
  /** Sets the clip to the specified rectangle. */
  def setRectClip(aRect: RealRectangle2D): Unit
  /** Set the current transform matrix. */
  def setTransformation(aTransform: AffineMatrix2D): Unit
}

object XSimpleCanvas {
  @scala.inline
  def apply(
    Canvas: XCanvas,
    CurrentClipRect: RealRectangle2D,
    CurrentFillColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color,
    CurrentFont: XCanvasFont,
    CurrentPenColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color,
    CurrentTransformation: AffineMatrix2D,
    CurrentViewState: ViewState,
    Device: XGraphicDevice,
    FontMetrics: FontMetrics,
    acquire: () => Unit,
    drawBitmap: (XBitmap, RealPoint2D) => Unit,
    drawLine: (RealPoint2D, RealPoint2D) => Unit,
    drawPixel: RealPoint2D => Unit,
    drawPolyPolygon: XPolyPolygon2D => Unit,
    drawRect: RealRectangle2D => Unit,
    drawText: (StringContext, RealPoint2D, Double) => Unit,
    getCanvas: () => XCanvas,
    getCurrentClipRect: () => RealRectangle2D,
    getCurrentFillColor: () => typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color,
    getCurrentFont: () => XCanvasFont,
    getCurrentPenColor: () => typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color,
    getCurrentRenderState: Boolean => RenderState,
    getCurrentTransformation: () => AffineMatrix2D,
    getCurrentViewState: () => ViewState,
    getDevice: () => XGraphicDevice,
    getFontMetrics: () => FontMetrics,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectFont: (String, Double, Boolean, Boolean) => Unit,
    setFillColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color => Unit,
    setPenColor: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color => Unit,
    setRectClip: RealRectangle2D => Unit,
    setTransformation: AffineMatrix2D => Unit
  ): XSimpleCanvas = {
    val __obj = js.Dynamic.literal(Canvas = Canvas, CurrentClipRect = CurrentClipRect, CurrentFillColor = CurrentFillColor, CurrentFont = CurrentFont, CurrentPenColor = CurrentPenColor, CurrentTransformation = CurrentTransformation, CurrentViewState = CurrentViewState, Device = Device, FontMetrics = FontMetrics, acquire = js.Any.fromFunction0(acquire), drawBitmap = js.Any.fromFunction2(drawBitmap), drawLine = js.Any.fromFunction2(drawLine), drawPixel = js.Any.fromFunction1(drawPixel), drawPolyPolygon = js.Any.fromFunction1(drawPolyPolygon), drawRect = js.Any.fromFunction1(drawRect), drawText = js.Any.fromFunction3(drawText), getCanvas = js.Any.fromFunction0(getCanvas), getCurrentClipRect = js.Any.fromFunction0(getCurrentClipRect), getCurrentFillColor = js.Any.fromFunction0(getCurrentFillColor), getCurrentFont = js.Any.fromFunction0(getCurrentFont), getCurrentPenColor = js.Any.fromFunction0(getCurrentPenColor), getCurrentRenderState = js.Any.fromFunction1(getCurrentRenderState), getCurrentTransformation = js.Any.fromFunction0(getCurrentTransformation), getCurrentViewState = js.Any.fromFunction0(getCurrentViewState), getDevice = js.Any.fromFunction0(getDevice), getFontMetrics = js.Any.fromFunction0(getFontMetrics), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction4(selectFont), setFillColor = js.Any.fromFunction1(setFillColor), setPenColor = js.Any.fromFunction1(setPenColor), setRectClip = js.Any.fromFunction1(setRectClip), setTransformation = js.Any.fromFunction1(setTransformation))
  
    __obj.asInstanceOf[XSimpleCanvas]
  }
}

