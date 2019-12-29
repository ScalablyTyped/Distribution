package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingExtension Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRoutingExtension")
@js.native
class FaxInboundRoutingExtension protected () extends js.Object {
  /** Is extension built in debug environment */
  val Debug: Boolean = js.native
  @JSName("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension = js.native
  /** Extension's friendly name */
  val FriendlyName: String = js.native
  /** Full path and file name of the extension DLL */
  val ImageName: String = js.native
  /** Last error code at load or initialization */
  val InitErrorCode: Double = js.native
  /** The major part of extension's build number */
  val MajorBuild: Double = js.native
  /** The major part of extension's version number */
  val MajorVersion: Double = js.native
  /** Array of methods exposed by extension */
  val Methods: SafeArray[String] = js.native
  /** The minor part of extension's build number */
  val MinorBuild: Double = js.native
  /** The minor part of extension's version number */
  val MinorVersion: Double = js.native
  /** Load and initialization status of the extension */
  val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** Extension's unique name */
  val UniqueName: String = js.native
}

