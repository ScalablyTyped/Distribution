package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLicenseConfigurationRequest extends js.Object {
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new instances.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * Dimension used to track the license inventory.
    */
  var LicenseCountingType: typings.awsDashSdk.clientsLicensemanagerMod.LicenseCountingType = js.native
  /**
    * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary by dimension.    Cores dimension: allowedTenancy | maximumCores | minimumCores     Instances dimension: allowedTenancy | maximumCores | minimumCores | maximumSockets | minimumSockets | maximumVcpus | minimumVcpus     Sockets dimension: allowedTenancy | maximumSockets | minimumSockets     vCPUs dimension: allowedTenancy | honorVcpuOptimization | maximumVcpus | minimumVcpus   
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * Name of the license configuration.
    */
  var Name: String = js.native
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ProductInformationList] = js.native
  /**
    * Tags to add to the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateLicenseConfigurationRequest {
  @scala.inline
  def apply(
    LicenseCountingType: LicenseCountingType,
    Name: String,
    Description: String = null,
    LicenseCount: Int | Double = null,
    LicenseCountHardLimit: js.UndefOr[scala.Boolean] = js.undefined,
    LicenseRules: StringList = null,
    ProductInformationList: ProductInformationList = null,
    Tags: TagList = null
  ): CreateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseCountingType = LicenseCountingType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LicenseCount != null) __obj.updateDynamic("LicenseCount")(LicenseCount.asInstanceOf[js.Any])
    if (!js.isUndefined(LicenseCountHardLimit)) __obj.updateDynamic("LicenseCountHardLimit")(LicenseCountHardLimit.asInstanceOf[js.Any])
    if (LicenseRules != null) __obj.updateDynamic("LicenseRules")(LicenseRules.asInstanceOf[js.Any])
    if (ProductInformationList != null) __obj.updateDynamic("ProductInformationList")(ProductInformationList.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseConfigurationRequest]
  }
}

