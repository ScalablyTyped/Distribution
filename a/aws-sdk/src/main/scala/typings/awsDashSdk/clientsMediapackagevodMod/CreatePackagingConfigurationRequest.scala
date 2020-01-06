package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackagingConfigurationRequest extends js.Object {
  var CmafPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.CmafPackage] = js.native
  var DashPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.DashPackage] = js.native
  var HlsPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.HlsPackage] = js.native
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: __string = js.native
  var MssPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.MssPackage] = js.native
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: __string = js.native
}

object CreatePackagingConfigurationRequest {
  @scala.inline
  def apply(
    Id: __string,
    PackagingGroupId: __string,
    CmafPackage: CmafPackage = null,
    DashPackage: DashPackage = null,
    HlsPackage: HlsPackage = null,
    MssPackage: MssPackage = null
  ): CreatePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any])
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage.asInstanceOf[js.Any])
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage.asInstanceOf[js.Any])
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage.asInstanceOf[js.Any])
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingConfigurationRequest]
  }
}

