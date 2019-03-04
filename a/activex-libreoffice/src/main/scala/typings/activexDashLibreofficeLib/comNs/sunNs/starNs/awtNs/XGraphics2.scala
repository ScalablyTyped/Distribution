package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the basic output operation of a device. */
trait XGraphics2 extends XGraphics {
  /**
    * clears the given rectangle on the device
    * @since LibreOffice 4.1
    */
  def clear(aRect: Rectangle): scala.Unit
  /**
    * draws a {@link com.sun.star.graphic.XGraphic} in the output device.
    *
    * Note that some devices may not support this operation.
    * @param nX the X coordinate on the device where the graphic will be drawn
    * @param nY the Y coordinate on the device where the graphic will be drawn
    * @param nWidth the width of the region on the device
    * @param nHeight the height of the region on the device
    * @param nStyle the style used to draw the image. See {@link com.sun.star.awt.ImageDrawMode} .
    * @param aGraphic the {@link com.sun.star.graphic.XGraphic} to be drawn onto the device
    * @since LibreOffice 4.1
    */
  def drawImage(
    nX: scala.Double,
    nY: scala.Double,
    nWidth: scala.Double,
    nHeight: scala.Double,
    nStyle: scala.Double,
    aGraphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  ): scala.Unit
}

object XGraphics2 {
  @scala.inline
  def apply(
    Device: XDevice,
    FontMetric: SimpleFontMetric,
    acquire: js.Function0[scala.Unit],
    clear: js.Function1[Rectangle, scala.Unit],
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
    drawImage: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic, 
      scala.Unit
    ],
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
  ): XGraphics2 = {
    val __obj = js.Dynamic.literal(Device = Device, FontMetric = FontMetric, acquire = acquire, clear = clear, copy = copy, draw = draw, drawArc = drawArc, drawChord = drawChord, drawEllipse = drawEllipse, drawGradient = drawGradient, drawImage = drawImage, drawLine = drawLine, drawPie = drawPie, drawPixel = drawPixel, drawPolyLine = drawPolyLine, drawPolyPolygon = drawPolyPolygon, drawPolygon = drawPolygon, drawRect = drawRect, drawRoundedRect = drawRoundedRect, drawText = drawText, drawTextArray = drawTextArray, getDevice = getDevice, getFontMetric = getFontMetric, intersectClipRegion = intersectClipRegion, pop = pop, push = push, queryInterface = queryInterface, release = release, selectFont = selectFont, setClipRegion = setClipRegion, setFillColor = setFillColor, setFont = setFont, setLineColor = setLineColor, setRasterOp = setRasterOp, setTextColor = setTextColor, setTextFillColor = setTextFillColor)
  
    __obj.asInstanceOf[XGraphics2]
  }
}

