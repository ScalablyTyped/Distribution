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
    acquire: js.Function0[scala.Unit],
    copy: js.Function9[
      XDevice, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    draw: js.Function9[
      XDisplayBitmap, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    drawArc: js.Function8[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    drawChord: js.Function8[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    drawEllipse: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    drawGradient: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, Gradient, scala.Unit],
    drawLine: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    drawPie: js.Function8[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    drawPixel: js.Function2[scala.Double, scala.Double, scala.Unit],
    drawPolyLine: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    drawPolyPolygon: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Unit
    ],
    drawPolygon: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    drawRect: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    drawRoundedRect: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    drawText: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    drawTextArray: js.Function4[
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    getDevice: js.Function0[XDevice],
    getFontMetric: js.Function0[SimpleFontMetric],
    intersectClipRegion: js.Function1[XRegion, scala.Unit],
    pop: js.Function0[scala.Unit],
    push: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    selectFont: js.Function1[FontDescriptor, scala.Unit],
    setClipRegion: js.Function1[XRegion, scala.Unit],
    setFillColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setFont: js.Function1[XFont, scala.Unit],
    setLineColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setRasterOp: js.Function1[RasterOperation, scala.Unit],
    setTextColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setTextFillColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit]
  ): XGraphics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Device")(Device)
    __obj.updateDynamic("FontMetric")(FontMetric)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("drawArc")(drawArc)
    __obj.updateDynamic("drawChord")(drawChord)
    __obj.updateDynamic("drawEllipse")(drawEllipse)
    __obj.updateDynamic("drawGradient")(drawGradient)
    __obj.updateDynamic("drawLine")(drawLine)
    __obj.updateDynamic("drawPie")(drawPie)
    __obj.updateDynamic("drawPixel")(drawPixel)
    __obj.updateDynamic("drawPolyLine")(drawPolyLine)
    __obj.updateDynamic("drawPolyPolygon")(drawPolyPolygon)
    __obj.updateDynamic("drawPolygon")(drawPolygon)
    __obj.updateDynamic("drawRect")(drawRect)
    __obj.updateDynamic("drawRoundedRect")(drawRoundedRect)
    __obj.updateDynamic("drawText")(drawText)
    __obj.updateDynamic("drawTextArray")(drawTextArray)
    __obj.updateDynamic("getDevice")(getDevice)
    __obj.updateDynamic("getFontMetric")(getFontMetric)
    __obj.updateDynamic("intersectClipRegion")(intersectClipRegion)
    __obj.updateDynamic("pop")(pop)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("selectFont")(selectFont)
    __obj.updateDynamic("setClipRegion")(setClipRegion)
    __obj.updateDynamic("setFillColor")(setFillColor)
    __obj.updateDynamic("setFont")(setFont)
    __obj.updateDynamic("setLineColor")(setLineColor)
    __obj.updateDynamic("setRasterOp")(setRasterOp)
    __obj.updateDynamic("setTextColor")(setTextColor)
    __obj.updateDynamic("setTextFillColor")(setTextFillColor)
    __obj.asInstanceOf[XGraphics]
  }
}

