package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the basic output operation of a device. */
@js.native
trait XGraphics2 extends XGraphics {
  /**
    * clears the given rectangle on the device
    * @since LibreOffice 4.1
    */
  def clear(aRect: Rectangle): Unit = js.native
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
  def drawImage(nX: Double, nY: Double, nWidth: Double, nHeight: Double, nStyle: Double, aGraphic: XGraphic): Unit = js.native
}

object XGraphics2 {
  @scala.inline
  def apply(
    Device: XDevice,
    FontMetric: SimpleFontMetric,
    acquire: () => Unit,
    clear: Rectangle => Unit,
    copy: (XDevice, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    draw: (XDisplayBitmap, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawChord: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawEllipse: (Double, Double, Double, Double) => Unit,
    drawGradient: (Double, Double, Double, Double, Gradient) => Unit,
    drawImage: (Double, Double, Double, Double, Double, XGraphic) => Unit,
    drawLine: (Double, Double, Double, Double) => Unit,
    drawPie: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    drawPixel: (Double, Double) => Unit,
    drawPolyLine: (SeqEquiv[Double], SeqEquiv[Double]) => Unit,
    drawPolyPolygon: (SeqEquiv[SeqEquiv[Double]], SeqEquiv[SeqEquiv[Double]]) => Unit,
    drawPolygon: (SeqEquiv[Double], SeqEquiv[Double]) => Unit,
    drawRect: (Double, Double, Double, Double) => Unit,
    drawRoundedRect: (Double, Double, Double, Double, Double, Double) => Unit,
    drawText: (Double, Double, String) => Unit,
    drawTextArray: (Double, Double, String, SeqEquiv[Double]) => Unit,
    getDevice: () => XDevice,
    getFontMetric: () => SimpleFontMetric,
    intersectClipRegion: XRegion => Unit,
    pop: () => Unit,
    push: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectFont: FontDescriptor => Unit,
    setClipRegion: XRegion => Unit,
    setFillColor: Color => Unit,
    setFont: XFont => Unit,
    setLineColor: Color => Unit,
    setRasterOp: RasterOperation => Unit,
    setTextColor: Color => Unit,
    setTextFillColor: Color => Unit
  ): XGraphics2 = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction1(clear), copy = js.Any.fromFunction9(copy), draw = js.Any.fromFunction9(draw), drawArc = js.Any.fromFunction8(drawArc), drawChord = js.Any.fromFunction8(drawChord), drawEllipse = js.Any.fromFunction4(drawEllipse), drawGradient = js.Any.fromFunction5(drawGradient), drawImage = js.Any.fromFunction6(drawImage), drawLine = js.Any.fromFunction4(drawLine), drawPie = js.Any.fromFunction8(drawPie), drawPixel = js.Any.fromFunction2(drawPixel), drawPolyLine = js.Any.fromFunction2(drawPolyLine), drawPolyPolygon = js.Any.fromFunction2(drawPolyPolygon), drawPolygon = js.Any.fromFunction2(drawPolygon), drawRect = js.Any.fromFunction4(drawRect), drawRoundedRect = js.Any.fromFunction6(drawRoundedRect), drawText = js.Any.fromFunction3(drawText), drawTextArray = js.Any.fromFunction4(drawTextArray), getDevice = js.Any.fromFunction0(getDevice), getFontMetric = js.Any.fromFunction0(getFontMetric), intersectClipRegion = js.Any.fromFunction1(intersectClipRegion), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction0(push), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectFont = js.Any.fromFunction1(selectFont), setClipRegion = js.Any.fromFunction1(setClipRegion), setFillColor = js.Any.fromFunction1(setFillColor), setFont = js.Any.fromFunction1(setFont), setLineColor = js.Any.fromFunction1(setLineColor), setRasterOp = js.Any.fromFunction1(setRasterOp), setTextColor = js.Any.fromFunction1(setTextColor), setTextFillColor = js.Any.fromFunction1(setTextFillColor))
    __obj.asInstanceOf[XGraphics2]
  }
  @scala.inline
  implicit class XGraphics2Ops[Self <: XGraphics2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: Rectangle => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setDrawImage(value: (Double, Double, Double, Double, Double, XGraphic) => Unit): Self = this.set("drawImage", js.Any.fromFunction6(value))
  }
  
}

