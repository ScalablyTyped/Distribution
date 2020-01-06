package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfiguration extends js.Object {
  /**
    * Automated discovery information.
    */
  var AutomatedDiscoveryInformation: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.AutomatedDiscoveryInformation] = js.native
  /**
    * Summaries for licenses consumed by various resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ConsumedLicenseSummaryList] = js.native
  /**
    * Number of licenses consumed. 
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
  /**
    * Unique ID of the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * Number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * Dimension to use to track the license inventory.
    */
  var LicenseCountingType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseCountingType] = js.native
  /**
    * License rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * Summaries for managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ManagedResourceSummaryList] = js.native
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Account ID of the license configuration's owner.
    */
  var OwnerAccountId: js.UndefOr[String] = js.native
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ProductInformationList] = js.native
  /**
    * Status of the license configuration.
    */
  var Status: js.UndefOr[String] = js.native
}

object LicenseConfiguration {
  @scala.inline
  def apply(
    AutomatedDiscoveryInformation: AutomatedDiscoveryInformation = null,
    ConsumedLicenseSummaryList: ConsumedLicenseSummaryList = null,
    ConsumedLicenses: Int | Double = null,
    Description: String = null,
    LicenseConfigurationArn: String = null,
    LicenseConfigurationId: String = null,
    LicenseCount: Int | Double = null,
    LicenseCountHardLimit: js.UndefOr[scala.Boolean] = js.undefined,
    LicenseCountingType: LicenseCountingType = null,
    LicenseRules: StringList = null,
    ManagedResourceSummaryList: ManagedResourceSummaryList = null,
    Name: String = null,
    OwnerAccountId: String = null,
    ProductInformationList: ProductInformationList = null,
    Status: String = null
  ): LicenseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AutomatedDiscoveryInformation != null) __obj.updateDynamic("AutomatedDiscoveryInformation")(AutomatedDiscoveryInformation.asInstanceOf[js.Any])
    if (ConsumedLicenseSummaryList != null) __obj.updateDynamic("ConsumedLicenseSummaryList")(ConsumedLicenseSummaryList.asInstanceOf[js.Any])
    if (ConsumedLicenses != null) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LicenseConfigurationArn != null) __obj.updateDynamic("LicenseConfigurationArn")(LicenseConfigurationArn.asInstanceOf[js.Any])
    if (LicenseConfigurationId != null) __obj.updateDynamic("LicenseConfigurationId")(LicenseConfigurationId.asInstanceOf[js.Any])
    if (LicenseCount != null) __obj.updateDynamic("LicenseCount")(LicenseCount.asInstanceOf[js.Any])
    if (!js.isUndefined(LicenseCountHardLimit)) __obj.updateDynamic("LicenseCountHardLimit")(LicenseCountHardLimit.asInstanceOf[js.Any])
    if (LicenseCountingType != null) __obj.updateDynamic("LicenseCountingType")(LicenseCountingType.asInstanceOf[js.Any])
    if (LicenseRules != null) __obj.updateDynamic("LicenseRules")(LicenseRules.asInstanceOf[js.Any])
    if (ManagedResourceSummaryList != null) __obj.updateDynamic("ManagedResourceSummaryList")(ManagedResourceSummaryList.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerAccountId != null) __obj.updateDynamic("OwnerAccountId")(OwnerAccountId.asInstanceOf[js.Any])
    if (ProductInformationList != null) __obj.updateDynamic("ProductInformationList")(ProductInformationList.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfiguration]
  }
}

