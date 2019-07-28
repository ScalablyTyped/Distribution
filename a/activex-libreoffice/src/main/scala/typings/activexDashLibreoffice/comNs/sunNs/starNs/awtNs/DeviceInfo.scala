package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains information about a device. */
trait DeviceInfo extends js.Object {
  /** contains the color-depth of the device. */
  var BitsPerPixel: Double
  /** contains the inset from the bottom. */
  var BottomInset: Double
  /**
    * specifies special operations which are possible on the device.
    * @see DeviceCapability
    */
  var Capabilities: Double
  /** contains the height of the device in pixels. */
  var Height: Double
  /** contains the inset from the left. */
  var LeftInset: Double
  /** contains the X-axis resolution of the device in pixel/meter. */
  var PixelPerMeterX: Double
  /** contains the Y-axis resolution of the device in pixel/meter. */
  var PixelPerMeterY: Double
  /** contains the inset from the right. */
  var RightInset: Double
  /** contains the inset from the top. */
  var TopInset: Double
  /** contains the width of the device in pixels. */
  var Width: Double
}

object DeviceInfo {
  @scala.inline
  def apply(
    BitsPerPixel: Double,
    BottomInset: Double,
    Capabilities: Double,
    Height: Double,
    LeftInset: Double,
    PixelPerMeterX: Double,
    PixelPerMeterY: Double,
    RightInset: Double,
    TopInset: Double,
    Width: Double
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(BitsPerPixel = BitsPerPixel, BottomInset = BottomInset, Capabilities = Capabilities, Height = Height, LeftInset = LeftInset, PixelPerMeterX = PixelPerMeterX, PixelPerMeterY = PixelPerMeterY, RightInset = RightInset, TopInset = TopInset, Width = Width)
  
    __obj.asInstanceOf[DeviceInfo]
  }
}

