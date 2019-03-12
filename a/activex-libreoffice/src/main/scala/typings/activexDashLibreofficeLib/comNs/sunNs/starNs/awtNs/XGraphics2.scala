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
    acquire: () => scala.Unit,
    clear: Rectangle => scala.Unit,
    copy: (XDevice, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    draw: (XDisplayBitmap, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawArc: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawChord: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawEllipse: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    drawGradient: (scala.Double, scala.Double, scala.Double, scala.Double, Gradient) => scala.Unit,
    drawImage: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic) => scala.Unit,
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
  ): XGraphics2 = {
    val __obj = js.Dynamic.literal(Device = Device, FontMetric = FontMetric, acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction1(clear), copy = js.Any.fromFunction9(copy), draw = js.Any.fromFunction9(draw), drawArc = js.Any.fromFunction8(drawArc), drawChord = js.Any.fromFunction8(drawChord), drawEllipse = js.Any.fromFunction4(drawEllipse), drawGradient = js.Any.fromFunction5(drawGradient), drawImage = js.Any.fromFunction6(drawImage), drawLine = js.Any.fromFunction4(drawLine), drawPie = js.Any.fromFunction8(drawPie), drawPixel = js.Any.fromFunction2(drawPixel), drawPolyLine = js.Any.fromFunction2(drawPolyLine), drawPolyPolygon = js.Any.fromFunction2(drawPolyPolygon), drawPolygon = js.Any.fromFunction2(drawPolygon), drawRect = js.Any.fromFunction4(drawRect), drawRoundedRect = js.Any.fromFunction6(drawRoundedRect), drawText = js.Any.fromFunction3(drawText), drawTextArray = js.Any.fromFunction4(drawTextArray), getDevice = js.Any.fromFunction0(getDevice), getFontMetric = js.Any.fromFunction0(getFontMetric), intersectClipRegion = js.Any.fromFunction1(intersectClipRegion), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction0(push), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction1(selectFont), setClipRegion = js.Any.fromFunction1(setClipRegion), setFillColor = js.Any.fromFunction1(setFillColor), setFont = js.Any.fromFunction1(setFont), setLineColor = js.Any.fromFunction1(setLineColor), setRasterOp = js.Any.fromFunction1(setRasterOp), setTextColor = js.Any.fromFunction1(setTextColor), setTextFillColor = js.Any.fromFunction1(setTextFillColor))
  
    __obj.asInstanceOf[XGraphics2]
  }
}

