package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseConfiguration extends js.Object {
  /**
    * List of summaries for licenses consumed by various resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined
  /**
    * Number of licenses consumed. 
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * ARN of the LicenseConfiguration object.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
  /**
    * Unique ID of the LicenseConfiguration object.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.undefined
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  /**
    * Sets the number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  /**
    * Dimension to use to track license inventory.
    */
  var LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined
  /**
    * Array of configured License Manager rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  /**
    * List of summaries for managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * Account ID of the license configuration's owner.
    */
  var OwnerAccountId: js.UndefOr[String] = js.undefined
  /**
    * Status of the license configuration.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object LicenseConfiguration {
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
    Status: String = null
  ): LicenseConfiguration = {
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
    __obj.asInstanceOf[LicenseConfiguration]
  }
}

