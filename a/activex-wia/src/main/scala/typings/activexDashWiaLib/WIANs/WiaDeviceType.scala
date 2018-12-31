package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiaDeviceType extends js.Object

/**
  * The WiaDeviceType enumeration specifies the type of device attached to a user's computer. Use the Type property on the DeviceInfo object or the Device
  * object to obtain these values from the device.
  */
@JSGlobal("WIA.WiaDeviceType")
@js.native
object WiaDeviceType extends js.Object {
  @js.native
  sealed trait CameraDeviceType
    extends activexDashWiaLib.WIANs.WiaDeviceType
  
  @js.native
  sealed trait ScannerDeviceType
    extends activexDashWiaLib.WIANs.WiaDeviceType
  
  @js.native
  sealed trait UnspecifiedDeviceType
    extends activexDashWiaLib.WIANs.WiaDeviceType
  
  @js.native
  sealed trait VideoDeviceType
    extends activexDashWiaLib.WIANs.WiaDeviceType
  
  /* 2 */ val CameraDeviceType: CameraDeviceType with scala.Double = js.native
  /* 1 */ val ScannerDeviceType: ScannerDeviceType with scala.Double = js.native
  /* 0 */ val UnspecifiedDeviceType: UnspecifiedDeviceType with scala.Double = js.native
  /* 3 */ val VideoDeviceType: VideoDeviceType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWiaLib.WIANs.WiaDeviceType with scala.Double] = js.native
}

