package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingExtension Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRoutingExtension")
@js.native
class FaxInboundRoutingExtension protected () extends js.Object {
  /** Is extension built in debug environment */
  val Debug: scala.Boolean = js.native
  var `FAXCOMEXLib.FaxInboundRoutingExtension_typekey`: FaxInboundRoutingExtension = js.native
  /** Extension's friendly name */
  val FriendlyName: java.lang.String = js.native
  /** Full path and file name of the extension DLL */
  val ImageName: java.lang.String = js.native
  /** Last error code at load or initialization */
  val InitErrorCode: scala.Double = js.native
  /** The major part of extension's build number */
  val MajorBuild: scala.Double = js.native
  /** The major part of extension's version number */
  val MajorVersion: scala.Double = js.native
  /** Array of methods exposed by extension */
  val Methods: stdLib.SafeArray[java.lang.String] = js.native
  /** The minor part of extension's build number */
  val MinorBuild: scala.Double = js.native
  /** The minor part of extension's version number */
  val MinorVersion: scala.Double = js.native
  /** Load and initialization status of the extension */
  val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** Extension's unique name */
  val UniqueName: java.lang.String = js.native
}

