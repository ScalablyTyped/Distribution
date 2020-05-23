package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_PROVIDER_STATUS_ENUM
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingExtension Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRoutingExtension")
@js.native
class FaxInboundRoutingExtension protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingExtension {
  /** Is extension built in debug environment */
  /* CompleteClass */
  override val Debug: Boolean = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")
  override var FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingExtension = js.native
  /** Extension's friendly name */
  /* CompleteClass */
  override val FriendlyName: String = js.native
  /** Full path and file name of the extension DLL */
  /* CompleteClass */
  override val ImageName: String = js.native
  /** Last error code at load or initialization */
  /* CompleteClass */
  override val InitErrorCode: Double = js.native
  /** The major part of extension's build number */
  /* CompleteClass */
  override val MajorBuild: Double = js.native
  /** The major part of extension's version number */
  /* CompleteClass */
  override val MajorVersion: Double = js.native
  /** Array of methods exposed by extension */
  /* CompleteClass */
  override val Methods: SafeArray[String] = js.native
  /** The minor part of extension's build number */
  /* CompleteClass */
  override val MinorBuild: Double = js.native
  /** The minor part of extension's version number */
  /* CompleteClass */
  override val MinorVersion: Double = js.native
  /** Load and initialization status of the extension */
  /* CompleteClass */
  override val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** Extension's unique name */
  /* CompleteClass */
  override val UniqueName: String = js.native
}

