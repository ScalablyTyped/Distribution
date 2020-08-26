package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDeviceProvider Class */
@js.native
trait FaxDeviceProvider extends js.Object {
  /** Is device provider built in debug environment */
  val Debug: Boolean = js.native
  /** Array of device IDs exposed by the provider */
  val DeviceIds: SafeArray[Double] = js.native
  @JSName("FAXCOMEXLib.FaxDeviceProvider_typekey")
  var FAXCOMEXLibDotFaxDeviceProvider_typekey: FaxDeviceProvider = js.native
  /** Provider's friendly name */
  val FriendlyName: String = js.native
  /** Full path and file name of the provider DLL */
  val ImageName: String = js.native
  /** Last error code at load or initialization */
  val InitErrorCode: Double = js.native
  /** The major part of the device provider's build number */
  val MajorBuild: Double = js.native
  /** The major part of the device provider's version number */
  val MajorVersion: Double = js.native
  /** The minor part of the device provider's build number */
  val MinorBuild: Double = js.native
  /** The minor part of the device provider's version number */
  val MinorVersion: Double = js.native
  /** Status of the device provider */
  val Status: FAX_PROVIDER_STATUS_ENUM = js.native
  /** TSP name used by the provider */
  val TapiProviderName: String = js.native
  /** Unique name of the provider */
  val UniqueName: String = js.native
}

object FaxDeviceProvider {
  @scala.inline
  def apply(
    Debug: Boolean,
    DeviceIds: SafeArray[Double],
    FAXCOMEXLibDotFaxDeviceProvider_typekey: FaxDeviceProvider,
    FriendlyName: String,
    ImageName: String,
    InitErrorCode: Double,
    MajorBuild: Double,
    MajorVersion: Double,
    MinorBuild: Double,
    MinorVersion: Double,
    Status: FAX_PROVIDER_STATUS_ENUM,
    TapiProviderName: String,
    UniqueName: String
  ): FaxDeviceProvider = {
    val __obj = js.Dynamic.literal(Debug = Debug.asInstanceOf[js.Any], DeviceIds = DeviceIds.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], InitErrorCode = InitErrorCode.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TapiProviderName = TapiProviderName.asInstanceOf[js.Any], UniqueName = UniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxDeviceProvider_typekey")(FAXCOMEXLibDotFaxDeviceProvider_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxDeviceProvider]
  }
  @scala.inline
  implicit class FaxDeviceProviderOps[Self <: FaxDeviceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("Debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceIds(value: SafeArray[Double]): Self = this.set("DeviceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAXCOMEXLibDotFaxDeviceProvider_typekey(value: FaxDeviceProvider): Self = this.set("FAXCOMEXLib.FaxDeviceProvider_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("FriendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageName(value: String): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitErrorCode(value: Double): Self = this.set("InitErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorBuild(value: Double): Self = this.set("MajorBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("MajorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorBuild(value: Double): Self = this.set("MinorBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("MinorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: FAX_PROVIDER_STATUS_ENUM): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTapiProviderName(value: String): Self = this.set("TapiProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueName(value: String): Self = this.set("UniqueName", value.asInstanceOf[js.Any])
  }
  
}

