package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

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
trait XSimpleCanvas
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  val Canvas: XCanvas
  /** Retrieve current clip rect */
  val CurrentClipRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D
  /** Retrieve color currently used for fills */
  val CurrentFillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  val CurrentFont: XCanvasFont
  /** Retrieve color currently used for lines. */
  val CurrentPenColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** Retrieve current transformation matrix */
  val CurrentTransformation: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
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
  val FontMetrics: FontMetrics
  /**
    * Draws the bitmap on the canvas.
    * @param xBitmap Bitmap to render
    * @param aLeftTop Left, top position of the bitmap on the destination canvas.
    */
  def drawBitmap(xBitmap: XBitmap, aLeftTop: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D): scala.Unit
  /** Draws a line on the canvas. */
  def drawLine(
    aStartPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    aEndPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D
  ): scala.Unit
  /** Sets a single pixel on the canvas. */
  def drawPixel(aPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D): scala.Unit
  /** Draws a poly-polygon on the canvas. */
  def drawPolyPolygon(xPolyPolygon: XPolyPolygon2D): scala.Unit
  /** Draws a rectangle on the canvas. */
  def drawRect(aRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D): scala.Unit
  /**
    * Draws text on the canvas.
    * @param aText Text to render. The text color is the current pen color.
    * @param aOutPos Output position of the text. This is the left or right edge, depending on nTextDirection. Output position is always relative to the font
    * @param nTextDirection A value from the {@link TextDirection} collection, denoting the main writing direction for this string. The main writing direction
    */
  def drawText(
    aText: StringContext,
    aOutPos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    nTextDirection: scala.Double
  ): scala.Unit
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  def getCanvas(): XCanvas
  /** Retrieve current clip rect */
  def getCurrentClipRect(): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D
  /** Retrieve color currently used for fills */
  def getCurrentFillColor(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  def getCurrentFont(): XCanvasFont
  /** Retrieve color currently used for lines. */
  def getCurrentPenColor(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Retrieve render state.
    * @param bUseFillColor When true, the Color member of the {@link RenderState} is initialized with the current fill color; when false, the current pen colo
    * @returns the render state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentRenderState(bUseFillColor: scala.Boolean): RenderState
  /** Retrieve current transformation matrix */
  def getCurrentTransformation(): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
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
  def getFontMetrics(): FontMetrics
  /**
    * Select a font.
    *
    * This method selects the specified font (or a close substitute) as the current font for text output.
    * @param sFontName The name of the font (like e.g. Arial)
    * @param size The size of the font (note that this is not the usual points unit, but in the same coordinate system as the other rendering operations - usu
    * @param bold When true, selected font is bold.
    * @param italic When true, selected font is italic
    */
  def selectFont(sFontName: java.lang.String, size: scala.Double, bold: scala.Boolean, italic: scala.Boolean): scala.Unit
  /**
    * Sets the fill color.
    *
    * To disable filling, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setFillColor(nsRgbaColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /**
    * Sets the color used by line and text operations.
    *
    * To disable stroking, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setPenColor(nsRgbaColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /** Sets the clip to the specified rectangle. */
  def setRectClip(aRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D): scala.Unit
  /** Set the current transform matrix. */
  def setTransformation(aTransform: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D): scala.Unit
}

object XSimpleCanvas {
  @scala.inline
  def apply(
    Canvas: XCanvas,
    CurrentClipRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D,
    CurrentFillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CurrentFont: XCanvasFont,
    CurrentPenColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CurrentTransformation: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D,
    CurrentViewState: ViewState,
    Device: XGraphicDevice,
    FontMetrics: FontMetrics,
    acquire: js.Function0[scala.Unit],
    drawBitmap: js.Function2[
      XBitmap, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      scala.Unit
    ],
    drawLine: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      scala.Unit
    ],
    drawPixel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, scala.Unit],
    drawPolyPolygon: js.Function1[XPolyPolygon2D, scala.Unit],
    drawRect: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D, 
      scala.Unit
    ],
    drawText: js.Function3[
      StringContext, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      scala.Double, 
      scala.Unit
    ],
    getCanvas: js.Function0[XCanvas],
    getCurrentClipRect: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D],
    getCurrentFillColor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getCurrentFont: js.Function0[XCanvasFont],
    getCurrentPenColor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getCurrentRenderState: js.Function1[scala.Boolean, RenderState],
    getCurrentTransformation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D],
    getCurrentViewState: js.Function0[ViewState],
    getDevice: js.Function0[XGraphicDevice],
    getFontMetrics: js.Function0[FontMetrics],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    selectFont: js.Function4[java.lang.String, scala.Double, scala.Boolean, scala.Boolean, scala.Unit],
    setFillColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setPenColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setRectClip: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D, 
      scala.Unit
    ],
    setTransformation: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D, scala.Unit]
  ): XSimpleCanvas = {
    val __obj = js.Dynamic.literal(Canvas = Canvas, CurrentClipRect = CurrentClipRect, CurrentFillColor = CurrentFillColor, CurrentFont = CurrentFont, CurrentPenColor = CurrentPenColor, CurrentTransformation = CurrentTransformation, CurrentViewState = CurrentViewState, Device = Device, FontMetrics = FontMetrics, acquire = acquire, drawBitmap = drawBitmap, drawLine = drawLine, drawPixel = drawPixel, drawPolyPolygon = drawPolyPolygon, drawRect = drawRect, drawText = drawText, getCanvas = getCanvas, getCurrentClipRect = getCurrentClipRect, getCurrentFillColor = getCurrentFillColor, getCurrentFont = getCurrentFont, getCurrentPenColor = getCurrentPenColor, getCurrentRenderState = getCurrentRenderState, getCurrentTransformation = getCurrentTransformation, getCurrentViewState = getCurrentViewState, getDevice = getDevice, getFontMetrics = getFontMetrics, queryInterface = queryInterface, release = release, selectFont = selectFont, setFillColor = setFillColor, setPenColor = setPenColor, setRectClip = setRectClip, setTransformation = setTransformation)
  
    __obj.asInstanceOf[XSimpleCanvas]
  }
}

