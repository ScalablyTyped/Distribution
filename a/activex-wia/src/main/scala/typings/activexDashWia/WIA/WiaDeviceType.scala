package typings.activexDashWia.WIA

import typings.activexDashWia.activexDashWiaNumbers.`0`
import typings.activexDashWia.activexDashWiaNumbers.`1`
import typings.activexDashWia.activexDashWiaNumbers.`2`
import typings.activexDashWia.activexDashWiaNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WiaDeviceType enumeration specifies the type of device attached to a user's computer. Use the Type property on the DeviceInfo object or the Device
  * object to obtain these values from the device.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashWia.activexDashWiaNumbers.`2`
  - typings.activexDashWia.activexDashWiaNumbers.`1`
  - typings.activexDashWia.activexDashWiaNumbers.`0`
  - typings.activexDashWia.activexDashWiaNumbers.`3`
*/
trait WiaDeviceType extends js.Object

object WiaDeviceType {
  @scala.inline
  def CameraDeviceType: `2` = this.cast(2)
  @scala.inline
  def ScannerDeviceType: `1` = this.cast(1)
  @scala.inline
  def UnspecifiedDeviceType: `0` = this.cast(0)
  @scala.inline
  def VideoDeviceType: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

