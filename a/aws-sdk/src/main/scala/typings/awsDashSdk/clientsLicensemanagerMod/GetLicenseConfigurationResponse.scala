package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLicenseConfigurationResponse extends js.Object {
  /**
    * Automated discovery information.
    */
  var AutomatedDiscoveryInformation: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.AutomatedDiscoveryInformation] = js.native
  /**
    * Summaries of the licenses consumed by resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ConsumedLicenseSummaryList] = js.native
  /**
    * Number of licenses assigned to resources.
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
    * Unique ID for the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.native
  /**
    * Number of available licenses.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * Sets the number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * Dimension on which the licenses are counted.
    */
  var LicenseCountingType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseCountingType] = js.native
  /**
    * License rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * Summaries of the managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ManagedResourceSummaryList] = js.native
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Account ID of the owner of the license configuration.
    */
  var OwnerAccountId: js.UndefOr[String] = js.native
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ProductInformationList] = js.native
  /**
    * License configuration status.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Tags for the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GetLicenseConfigurationResponse {
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
    Status: String = null,
    Tags: TagList = null
  ): GetLicenseConfigurationResponse = {
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
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLicenseConfigurationResponse]
  }
}

