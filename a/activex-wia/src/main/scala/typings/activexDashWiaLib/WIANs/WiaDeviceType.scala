package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WiaDeviceType enumeration specifies the type of device attached to a user's computer. Use the Type property on the DeviceInfo object or the Device
  * object to obtain these values from the device.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashWiaLib.activexDashWiaLibNumbers.`2`
  - activexDashWiaLib.activexDashWiaLibNumbers.`1`
  - activexDashWiaLib.activexDashWiaLibNumbers.`0`
  - activexDashWiaLib.activexDashWiaLibNumbers.`3`
*/
trait WiaDeviceType extends js.Object

object WiaDeviceType {
  @scala.inline
  def CameraDeviceType: activexDashWiaLib.activexDashWiaLibNumbers.`2` = this.cast(2)
  @scala.inline
  def ScannerDeviceType: activexDashWiaLib.activexDashWiaLibNumbers.`1` = this.cast(1)
  @scala.inline
  def UnspecifiedDeviceType: activexDashWiaLib.activexDashWiaLibNumbers.`0` = this.cast(0)
  @scala.inline
  def VideoDeviceType: activexDashWiaLib.activexDashWiaLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

