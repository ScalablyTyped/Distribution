package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDeviceProvider Class */
@JSGlobal("FAXCOMEXLib.FaxDeviceProvider")
@js.native
class FaxDeviceProvider protected () extends js.Object {
  /** Is device provider built in debug environment */
  val Debug: scala.Boolean = js.native
  /** Array of device IDs exposed by the provider */
  val DeviceIds: activexDashInteropLib.SafeArray[scala.Double] = js.native
  var `FAXCOMEXLib.FaxDeviceProvider_typekey`: FaxDeviceProvider = js.native
  /** Provider's friendly name */
  val FriendlyName: java.lang.String = js.native
  /** Full path and file name of the provider DLL */
  val ImageName: java.lang.String = js.native
  /** Last error code at load or initialization */
  val InitErrorCode: scala.Double = js.native
  /** The major part of the device provider's build number */
  val MajorBuild: scala.Double = js.native
  /** The major part of the device provider's version number */
  val MajorVersion: scala.Double = js.native
  /** The minor part of the device provider's build number */
  val MinorBuild: scala.Double = js.native
  /** The minor part of the device provider's version number */
  val MinorVersion: scala.Double = js.native
  /** Status of the device provider */
  val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** TSP name used by the provider */
  val TapiProviderName: java.lang.String = js.native
  /** Unique name of the provider */
  val UniqueName: java.lang.String = js.native
}

