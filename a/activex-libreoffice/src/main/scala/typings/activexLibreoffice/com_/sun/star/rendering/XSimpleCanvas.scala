package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the basic graphical output operations for a canvas.
  *
  * This interface is a simplified version of the {@link XCanvas} interface. It holds explicit state, i.e. the pen and fill color, the current
  * transformation, clip and font are persistently remembered.
  *
  * In contrast to the {@link XCanvas} interface, {@link XSimpleCanvas} does not distinguish between stroke and fill operations; instead, switching
  * between stroke and fill (or taking both) works by setting appropriate pen and fill colors.
  */
@js.native
trait XSimpleCanvas extends XInterface {
  
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  val Canvas: XCanvas = js.native
  
  /** Retrieve current clip rect */
  val CurrentClipRect: RealRectangle2D = js.native
  
  /** Retrieve color currently used for fills */
  val CurrentFillColor: typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  val CurrentFont: XCanvasFont = js.native
  
  /** Retrieve color currently used for lines. */
  val CurrentPenColor: typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /** Retrieve current transformation matrix */
  val CurrentTransformation: AffineMatrix2D = js.native
  
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  val CurrentViewState: ViewState = js.native
  
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  val Device: XGraphicDevice = js.native
  
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  val FontMetrics: typings.activexLibreoffice.com_.sun.star.rendering.FontMetrics = js.native
  
  /**
    * Draws the bitmap on the canvas.
    * @param xBitmap Bitmap to render
    * @param aLeftTop Left, top position of the bitmap on the destination canvas.
    */
  def drawBitmap(xBitmap: XBitmap, aLeftTop: RealPoint2D): Unit = js.native
  
  /** Draws a line on the canvas. */
  def drawLine(aStartPoint: RealPoint2D, aEndPoint: RealPoint2D): Unit = js.native
  
  /** Sets a single pixel on the canvas. */
  def drawPixel(aPoint: RealPoint2D): Unit = js.native
  
  /** Draws a poly-polygon on the canvas. */
  def drawPolyPolygon(xPolyPolygon: XPolyPolygon2D): Unit = js.native
  
  /** Draws a rectangle on the canvas. */
  def drawRect(aRect: RealRectangle2D): Unit = js.native
  
  /**
    * Draws text on the canvas.
    * @param aText Text to render. The text color is the current pen color.
    * @param aOutPos Output position of the text. This is the left or right edge, depending on nTextDirection. Output position is always relative to the font
    * @param nTextDirection A value from the {@link TextDirection} collection, denoting the main writing direction for this string. The main writing direction
    */
  def drawText(aText: StringContext, aOutPos: RealPoint2D, nTextDirection: Double): Unit = js.native
  
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  def getCanvas(): XCanvas = js.native
  
  /** Retrieve current clip rect */
  def getCurrentClipRect(): RealRectangle2D = js.native
  
  /** Retrieve color currently used for fills */
  def getCurrentFillColor(): typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  def getCurrentFont(): XCanvasFont = js.native
  
  /** Retrieve color currently used for lines. */
  def getCurrentPenColor(): typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /**
    * Retrieve render state.
    * @param bUseFillColor When true, the Color member of the {@link RenderState} is initialized with the current fill color; when false, the current pen colo
    * @returns the render state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentRenderState(bUseFillColor: Boolean): RenderState = js.native
  
  /** Retrieve current transformation matrix */
  def getCurrentTransformation(): AffineMatrix2D = js.native
  
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentViewState(): ViewState = js.native
  
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  def getDevice(): XGraphicDevice = js.native
  
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  def getFontMetrics(): typings.activexLibreoffice.com_.sun.star.rendering.FontMetrics = js.native
  
  /**
    * Select a font.
    *
    * This method selects the specified font (or a close substitute) as the current font for text output.
    * @param sFontName The name of the font (like e.g. Arial)
    * @param size The size of the font (note that this is not the usual points unit, but in the same coordinate system as the other rendering operations - usu
    * @param bold When true, selected font is bold.
    * @param italic When true, selected font is italic
    */
  def selectFont(sFontName: String, size: Double, bold: Boolean, italic: Boolean): Unit = js.native
  
  /**
    * Sets the fill color.
    *
    * To disable filling, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setFillColor(nsRgbaColor: typings.activexLibreoffice.com_.sun.star.util.Color): Unit = js.native
  
  /**
    * Sets the color used by line and text operations.
    *
    * To disable stroking, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setPenColor(nsRgbaColor: typings.activexLibreoffice.com_.sun.star.util.Color): Unit = js.native
  
  /** Sets the clip to the specified rectangle. */
  def setRectClip(aRect: RealRectangle2D): Unit = js.native
  
  /** Set the current transform matrix. */
  def setTransformation(aTransform: AffineMatrix2D): Unit = js.native
}
object XSimpleCanvas {
  
  @scala.inline
  def apply(
    Canvas: XCanvas,
    CurrentClipRect: RealRectangle2D,
    CurrentFillColor: typings.activexLibreoffice.com_.sun.star.util.Color,
    CurrentFont: XCanvasFont,
    CurrentPenColor: typings.activexLibreoffice.com_.sun.star.util.Color,
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
    getCurrentFillColor: () => typings.activexLibreoffice.com_.sun.star.util.Color,
    getCurrentFont: () => XCanvasFont,
    getCurrentPenColor: () => typings.activexLibreoffice.com_.sun.star.util.Color,
    getCurrentRenderState: Boolean => RenderState,
    getCurrentTransformation: () => AffineMatrix2D,
    getCurrentViewState: () => ViewState,
    getDevice: () => XGraphicDevice,
    getFontMetrics: () => FontMetrics,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectFont: (String, Double, Boolean, Boolean) => Unit,
    setFillColor: typings.activexLibreoffice.com_.sun.star.util.Color => Unit,
    setPenColor: typings.activexLibreoffice.com_.sun.star.util.Color => Unit,
    setRectClip: RealRectangle2D => Unit,
    setTransformation: AffineMatrix2D => Unit
  ): XSimpleCanvas = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], CurrentClipRect = CurrentClipRect.asInstanceOf[js.Any], CurrentFillColor = CurrentFillColor.asInstanceOf[js.Any], CurrentFont = CurrentFont.asInstanceOf[js.Any], CurrentPenColor = CurrentPenColor.asInstanceOf[js.Any], CurrentTransformation = CurrentTransformation.asInstanceOf[js.Any], CurrentViewState = CurrentViewState.asInstanceOf[js.Any], Device = Device.asInstanceOf[js.Any], FontMetrics = FontMetrics.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), drawBitmap = js.Any.fromFunction2(drawBitmap), drawLine = js.Any.fromFunction2(drawLine), drawPixel = js.Any.fromFunction1(drawPixel), drawPolyPolygon = js.Any.fromFunction1(drawPolyPolygon), drawRect = js.Any.fromFunction1(drawRect), drawText = js.Any.fromFunction3(drawText), getCanvas = js.Any.fromFunction0(getCanvas), getCurrentClipRect = js.Any.fromFunction0(getCurrentClipRect), getCurrentFillColor = js.Any.fromFunction0(getCurrentFillColor), getCurrentFont = js.Any.fromFunction0(getCurrentFont), getCurrentPenColor = js.Any.fromFunction0(getCurrentPenColor), getCurrentRenderState = js.Any.fromFunction1(getCurrentRenderState), getCurrentTransformation = js.Any.fromFunction0(getCurrentTransformation), getCurrentViewState = js.Any.fromFunction0(getCurrentViewState), getDevice = js.Any.fromFunction0(getDevice), getFontMetrics = js.Any.fromFunction0(getFontMetrics), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction4(selectFont), setFillColor = js.Any.fromFunction1(setFillColor), setPenColor = js.Any.fromFunction1(setPenColor), setRectClip = js.Any.fromFunction1(setRectClip), setTransformation = js.Any.fromFunction1(setTransformation))
    __obj.asInstanceOf[XSimpleCanvas]
  }
  
  @scala.inline
  implicit class XSimpleCanvasMutableBuilder[Self <: XSimpleCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: XCanvas): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentClipRect(value: RealRectangle2D): Self = StObject.set(x, "CurrentClipRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFillColor(value: typings.activexLibreoffice.com_.sun.star.util.Color): Self = StObject.set(x, "CurrentFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFont(value: XCanvasFont): Self = StObject.set(x, "CurrentFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPenColor(value: typings.activexLibreoffice.com_.sun.star.util.Color): Self = StObject.set(x, "CurrentPenColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTransformation(value: AffineMatrix2D): Self = StObject.set(x, "CurrentTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentViewState(value: ViewState): Self = StObject.set(x, "CurrentViewState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: XGraphicDevice): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBitmap(value: (XBitmap, RealPoint2D) => Unit): Self = StObject.set(x, "drawBitmap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrawLine(value: (RealPoint2D, RealPoint2D) => Unit): Self = StObject.set(x, "drawLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrawPixel(value: RealPoint2D => Unit): Self = StObject.set(x, "drawPixel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrawPolyPolygon(value: XPolyPolygon2D => Unit): Self = StObject.set(x, "drawPolyPolygon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrawRect(value: RealRectangle2D => Unit): Self = StObject.set(x, "drawRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrawText(value: (StringContext, RealPoint2D, Double) => Unit): Self = StObject.set(x, "drawText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFontMetrics(value: FontMetrics): Self = StObject.set(x, "FontMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCanvas(value: () => XCanvas): Self = StObject.set(x, "getCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentClipRect(value: () => RealRectangle2D): Self = StObject.set(x, "getCurrentClipRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentFillColor(value: () => typings.activexLibreoffice.com_.sun.star.util.Color): Self = StObject.set(x, "getCurrentFillColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentFont(value: () => XCanvasFont): Self = StObject.set(x, "getCurrentFont", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentPenColor(value: () => typings.activexLibreoffice.com_.sun.star.util.Color): Self = StObject.set(x, "getCurrentPenColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentRenderState(value: Boolean => RenderState): Self = StObject.set(x, "getCurrentRenderState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentTransformation(value: () => AffineMatrix2D): Self = StObject.set(x, "getCurrentTransformation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentViewState(value: () => ViewState): Self = StObject.set(x, "getCurrentViewState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDevice(value: () => XGraphicDevice): Self = StObject.set(x, "getDevice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontMetrics(value: () => FontMetrics): Self = StObject.set(x, "getFontMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectFont(value: (String, Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "selectFont", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetFillColor(value: typings.activexLibreoffice.com_.sun.star.util.Color => Unit): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPenColor(value: typings.activexLibreoffice.com_.sun.star.util.Color => Unit): Self = StObject.set(x, "setPenColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRectClip(value: RealRectangle2D => Unit): Self = StObject.set(x, "setRectClip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransformation(value: AffineMatrix2D => Unit): Self = StObject.set(x, "setTransformation", js.Any.fromFunction1(value))
  }
}
