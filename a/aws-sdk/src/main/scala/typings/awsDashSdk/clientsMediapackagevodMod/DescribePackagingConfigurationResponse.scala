package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingConfigurationResponse extends js.Object {
  /**
    * The ARN of the PackagingConfiguration.
    */
  var Arn: js.UndefOr[__string] = js.native
  var CmafPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.CmafPackage] = js.native
  var DashPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.DashPackage] = js.native
  var HlsPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.HlsPackage] = js.native
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: js.UndefOr[__string] = js.native
  var MssPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.MssPackage] = js.native
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[__string] = js.native
}

object DescribePackagingConfigurationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CmafPackage: CmafPackage = null,
    DashPackage: DashPackage = null,
    HlsPackage: HlsPackage = null,
    Id: __string = null,
    MssPackage: MssPackage = null,
    PackagingGroupId: __string = null
  ): DescribePackagingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage.asInstanceOf[js.Any])
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage.asInstanceOf[js.Any])
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage.asInstanceOf[js.Any])
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingConfigurationResponse]
  }
}

