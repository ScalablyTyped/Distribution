package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the basic output operation of a device. */
trait XGraphics
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the device of this graphics. */
  val Device: XDevice
  /** returns the font metric of the current font. */
  val FontMetric: SimpleFontMetric
  /** copies a rectangle of pixels from another device into this one. */
  def copy(
    xSource: XDevice,
    nSourceX: scala.Double,
    nSourceY: scala.Double,
    nSourceWidth: scala.Double,
    nSourceHeight: scala.Double,
    nDestX: scala.Double,
    nDestY: scala.Double,
    nDestWidth: scala.Double,
    nDestHeight: scala.Double
  ): scala.Unit
  /** draws a part of the specified bitmap to the output device. */
  def draw(
    xBitmapHandle: XDisplayBitmap,
    SourceX: scala.Double,
    SourceY: scala.Double,
    SourceWidth: scala.Double,
    SourceHeight: scala.Double,
    DestX: scala.Double,
    DestY: scala.Double,
    DestWidth: scala.Double,
    DestHeight: scala.Double
  ): scala.Unit
  /** draws an arc (part of a circle) in the output device. */
  def drawArc(
    X: scala.Double,
    Y: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double
  ): scala.Unit
  /**
    * draws a chord of a circular area in the output device.
    *
    * A chord is a segment of a circle. You get two chords from a circle if you intersect the circle with a straight line joining two points on the circle.
    */
  def drawChord(
    nX: scala.Double,
    nY: scala.Double,
    nWidth: scala.Double,
    nHeight: scala.Double,
    nX1: scala.Double,
    nY1: scala.Double,
    nX2: scala.Double,
    nY2: scala.Double
  ): scala.Unit
  /** draws an ellipse in the output device. */
  def drawEllipse(X: scala.Double, Y: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit
  /** draws a color dispersion in the output device. */
  def drawGradient(
    nX: scala.Double,
    nY: scala.Double,
    nWidth: scala.Double,
    Height: scala.Double,
    aGradient: Gradient
  ): scala.Unit
  /** draws a line in the output device. */
  def drawLine(X1: scala.Double, Y1: scala.Double, X2: scala.Double, Y2: scala.Double): scala.Unit
  /** draws a circular area in the output device. */
  def drawPie(
    X: scala.Double,
    Y: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double
  ): scala.Unit
  /** sets a single pixel in the output device. */
  def drawPixel(X: scala.Double, Y: scala.Double): scala.Unit
  /** draws multiple lines in the output device at once. */
  def drawPolyLine(
    DataX: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    DataY: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
  /** draws multiple polygons in the output device at once. */
  def drawPolyPolygon(
    DataX: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    DataY: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): scala.Unit
  /** draws a polygon line in the output device. */
  def drawPolygon(
    DataX: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    DataY: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
  /** draws a rectangle in the output device. */
  def drawRect(X: scala.Double, Y: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit
  /** draws a rectangle with rounded corners in the output device. */
  def drawRoundedRect(
    X: scala.Double,
    Y: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    nHorzRound: scala.Double,
    nVertRound: scala.Double
  ): scala.Unit
  /** draws text in the output device. */
  def drawText(X: scala.Double, Y: scala.Double, Text: java.lang.String): scala.Unit
  /** draws texts in the output device using an explicit kerning table. */
  def drawTextArray(
    X: scala.Double,
    Y: scala.Double,
    Text: java.lang.String,
    Longs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
  /** returns the device of this graphics. */
  def getDevice(): XDevice
  /** returns the font metric of the current font. */
  def getFontMetric(): SimpleFontMetric
  /** builds the intersection with the current region. */
  def intersectClipRegion(xClipping: XRegion): scala.Unit
  /** restores all previous saved settings. */
  def pop(): scala.Unit
  /** saves all current settings (Font, TextColor, TextFillColor, LineColor, FillColor, RasterOp, ClipRegion). */
  def push(): scala.Unit
  /** creates a new font and sets the font. */
  def selectFont(aDescription: FontDescriptor): scala.Unit
  /** sets the clip region to specified clipping. */
  def setClipRegion(Clipping: XRegion): scala.Unit
  /** sets the fill color. */
  def setFillColor(nColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /** sets the font used by text operations. */
  def setFont(xNewFont: XFont): scala.Unit
  /** sets the line color. */
  def setLineColor(nColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /**
    * sets the raster operation.
    *
    * If the device does not support raster operations then this call is ignored.
    */
  def setRasterOp(ROP: RasterOperation): scala.Unit
  /** sets the text color used by text operations. */
  def setTextColor(nColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /** sets the fill color used by text operations. */
  def setTextFillColor(nColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
}

object XGraphics {
  @scala.inline
  def apply(
    Device: XDevice,
    FontMetric: SimpleFontMetric,
    acquire: () => scala.Unit,
    copy: (XDevice, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    draw: (XDisplayBitmap, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawArc: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawChord: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawEllipse: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawGradient: (scala.Double, scala.Double, scala.Double, scala.Double, Gradient) => scala.Unit,
    drawLine: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawPie: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawPixel: (scala.Double, scala.Double) => scala.Unit,
    drawPolyLine: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    drawPolyPolygon: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]) => scala.Unit,
    drawPolygon: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    drawRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawRoundedRect: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawText: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    drawTextArray: (scala.Double, scala.Double, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    getDevice: () => XDevice,
    getFontMetric: () => SimpleFontMetric,
    intersectClipRegion: XRegion => scala.Unit,
    pop: () => scala.Unit,
    push: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    selectFont: FontDescriptor => scala.Unit,
    setClipRegion: XRegion => scala.Unit,
    setFillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setFont: XFont => scala.Unit,
    setLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setRasterOp: RasterOperation => scala.Unit,
    setTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setTextFillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit
  ): XGraphics = {
    val __obj = js.Dynamic.literal(Device = Device, FontMetric = FontMetric, acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction9(copy), draw = js.Any.fromFunction9(draw), drawArc = js.Any.fromFunction8(drawArc), drawChord = js.Any.fromFunction8(drawChord), drawEllipse = js.Any.fromFunction4(drawEllipse), drawGradient = js.Any.fromFunction5(drawGradient), drawLine = js.Any.fromFunction4(drawLine), drawPie = js.Any.fromFunction8(drawPie), drawPixel = js.Any.fromFunction2(drawPixel), drawPolyLine = js.Any.fromFunction2(drawPolyLine), drawPolyPolygon = js.Any.fromFunction2(drawPolyPolygon), drawPolygon = js.Any.fromFunction2(drawPolygon), drawRect = js.Any.fromFunction4(drawRect), drawRoundedRect = js.Any.fromFunction6(drawRoundedRect), drawText = js.Any.fromFunction3(drawText), drawTextArray = js.Any.fromFunction4(drawTextArray), getDevice = js.Any.fromFunction0(getDevice), getFontMetric = js.Any.fromFunction0(getFontMetric), intersectClipRegion = js.Any.fromFunction1(intersectClipRegion), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction0(push), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction1(selectFont), setClipRegion = js.Any.fromFunction1(setClipRegion), setFillColor = js.Any.fromFunction1(setFillColor), setFont = js.Any.fromFunction1(setFont), setLineColor = js.Any.fromFunction1(setLineColor), setRasterOp = js.Any.fromFunction1(setRasterOp), setTextColor = js.Any.fromFunction1(setTextColor), setTextFillColor = js.Any.fromFunction1(setTextFillColor))
  
    __obj.asInstanceOf[XGraphics]
  }
}

