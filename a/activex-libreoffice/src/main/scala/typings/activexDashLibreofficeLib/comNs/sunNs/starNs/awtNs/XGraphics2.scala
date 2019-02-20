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

