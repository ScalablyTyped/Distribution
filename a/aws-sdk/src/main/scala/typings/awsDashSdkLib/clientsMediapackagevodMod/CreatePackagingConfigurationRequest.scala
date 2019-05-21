package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePackagingConfigurationRequest extends js.Object {
  var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
  var DashPackage: js.UndefOr[DashPackage] = js.undefined
  var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: __string
  var MssPackage: js.UndefOr[MssPackage] = js.undefined
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: __string
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
    val __obj = js.Dynamic.literal(Id = Id, PackagingGroupId = PackagingGroupId)
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage)
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage)
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage)
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage)
    __obj.asInstanceOf[CreatePackagingConfigurationRequest]
  }
}

