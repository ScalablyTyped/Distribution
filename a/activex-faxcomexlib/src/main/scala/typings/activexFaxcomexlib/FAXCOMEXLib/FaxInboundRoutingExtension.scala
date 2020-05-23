package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingExtension Class */
trait FaxInboundRoutingExtension extends js.Object {
  /** Is extension built in debug environment */
  val Debug: Boolean
  @JSName("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension
  /** Extension's friendly name */
  val FriendlyName: String
  /** Full path and file name of the extension DLL */
  val ImageName: String
  /** Last error code at load or initialization */
  val InitErrorCode: Double
  /** The major part of extension's build number */
  val MajorBuild: Double
  /** The major part of extension's version number */
  val MajorVersion: Double
  /** Array of methods exposed by extension */
  val Methods: SafeArray[String]
  /** The minor part of extension's build number */
  val MinorBuild: Double
  /** The minor part of extension's version number */
  val MinorVersion: Double
  /** Load and initialization status of the extension */
  val Status: FAX_PROVIDER_STATUS_ENUM
  /** Extension's unique name */
  val UniqueName: String
}

object FaxInboundRoutingExtension {
  @scala.inline
  def apply(
    Debug: Boolean,
    FAXCOMEXLibDotFaxInboundRoutingExtension_typekey: FaxInboundRoutingExtension,
    FriendlyName: String,
    ImageName: String,
    InitErrorCode: Double,
    MajorBuild: Double,
    MajorVersion: Double,
    Methods: SafeArray[String],
    MinorBuild: Double,
    MinorVersion: Double,
    Status: FAX_PROVIDER_STATUS_ENUM,
    UniqueName: String
  ): FaxInboundRoutingExtension = {
    val __obj = js.Dynamic.literal(Debug = Debug.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], InitErrorCode = InitErrorCode.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], Methods = Methods.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UniqueName = UniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRoutingExtension_typekey")(FAXCOMEXLibDotFaxInboundRoutingExtension_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRoutingExtension]
  }
}

