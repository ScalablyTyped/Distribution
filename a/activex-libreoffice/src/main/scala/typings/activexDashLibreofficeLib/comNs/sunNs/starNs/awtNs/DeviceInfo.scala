package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains information about a device. */
trait DeviceInfo extends js.Object {
  /** contains the color-depth of the device. */
  var BitsPerPixel: scala.Double
  /** contains the inset from the bottom. */
  var BottomInset: scala.Double
  /**
    * specifies special operations which are possible on the device.
    * @see DeviceCapability
    */
  var Capabilities: scala.Double
  /** contains the height of the device in pixels. */
  var Height: scala.Double
  /** contains the inset from the left. */
  var LeftInset: scala.Double
  /** contains the X-axis resolution of the device in pixel/meter. */
  var PixelPerMeterX: scala.Double
  /** contains the Y-axis resolution of the device in pixel/meter. */
  var PixelPerMeterY: scala.Double
  /** contains the inset from the right. */
  var RightInset: scala.Double
  /** contains the inset from the top. */
  var TopInset: scala.Double
  /** contains the width of the device in pixels. */
  var Width: scala.Double
}

object DeviceInfo {
  @scala.inline
  def apply(
    BitsPerPixel: scala.Double,
    BottomInset: scala.Double,
    Capabilities: scala.Double,
    Height: scala.Double,
    LeftInset: scala.Double,
    PixelPerMeterX: scala.Double,
    PixelPerMeterY: scala.Double,
    RightInset: scala.Double,
    TopInset: scala.Double,
    Width: scala.Double
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(BitsPerPixel = BitsPerPixel, BottomInset = BottomInset, Capabilities = Capabilities, Height = Height, LeftInset = LeftInset, PixelPerMeterX = PixelPerMeterX, PixelPerMeterY = PixelPerMeterY, RightInset = RightInset, TopInset = TopInset, Width = Width)
  
    __obj.asInstanceOf[DeviceInfo]
  }
}

