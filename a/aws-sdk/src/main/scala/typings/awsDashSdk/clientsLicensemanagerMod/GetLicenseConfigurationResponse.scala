package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLicenseConfigurationResponse extends js.Object {
  /**
    * List of summaries for consumed licenses used by various resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ConsumedLicenseSummaryList] = js.undefined
  /**
    * Number of licenses assigned to resources.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * ARN of the license configuration requested.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
  /**
    * Unique ID for the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.undefined
  /**
    * Number of available licenses.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  /**
    * Sets the number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  /**
    * Dimension on which the licenses are counted (for example, instances, cores, sockets, or VCPUs).
    */
  var LicenseCountingType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseCountingType] = js.undefined
  /**
    * List of flexible text strings designating license rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  /**
    * List of summaries of managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ManagedResourceSummaryList] = js.undefined
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * Owner account ID for the license configuration.
    */
  var OwnerAccountId: js.UndefOr[String] = js.undefined
  /**
    * License configuration status (active, etc.).
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * List of tags attached to the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object GetLicenseConfigurationResponse {
  @scala.inline
  def apply(
    ConsumedLicenseSummaryList: ConsumedLicenseSummaryList = null,
    ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
    Description: String = null,
    LicenseConfigurationArn: String = null,
    LicenseConfigurationId: String = null,
    LicenseCount: js.UndefOr[BoxLong] = js.undefined,
    LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
    LicenseCountingType: LicenseCountingType = null,
    LicenseRules: StringList = null,
    ManagedResourceSummaryList: ManagedResourceSummaryList = null,
    Name: String = null,
    OwnerAccountId: String = null,
    Status: String = null,
    Tags: TagList = null
  ): GetLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ConsumedLicenseSummaryList != null) __obj.updateDynamic("ConsumedLicenseSummaryList")(ConsumedLicenseSummaryList)
    if (!js.isUndefined(ConsumedLicenses)) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LicenseConfigurationArn != null) __obj.updateDynamic("LicenseConfigurationArn")(LicenseConfigurationArn)
    if (LicenseConfigurationId != null) __obj.updateDynamic("LicenseConfigurationId")(LicenseConfigurationId)
    if (!js.isUndefined(LicenseCount)) __obj.updateDynamic("LicenseCount")(LicenseCount)
    if (!js.isUndefined(LicenseCountHardLimit)) __obj.updateDynamic("LicenseCountHardLimit")(LicenseCountHardLimit)
    if (LicenseCountingType != null) __obj.updateDynamic("LicenseCountingType")(LicenseCountingType.asInstanceOf[js.Any])
    if (LicenseRules != null) __obj.updateDynamic("LicenseRules")(LicenseRules)
    if (ManagedResourceSummaryList != null) __obj.updateDynamic("ManagedResourceSummaryList")(ManagedResourceSummaryList)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerAccountId != null) __obj.updateDynamic("OwnerAccountId")(OwnerAccountId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetLicenseConfigurationResponse]
  }
}

