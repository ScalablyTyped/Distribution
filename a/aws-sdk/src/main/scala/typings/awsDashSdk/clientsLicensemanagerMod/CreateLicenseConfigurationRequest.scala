package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLicenseConfigurationRequest extends js.Object {
  /**
    * Human-friendly description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  /**
    * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked deployment of new instances.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  /**
    * Dimension to use to track the license inventory.
    */
  var LicenseCountingType: typings.awsDashSdk.clientsLicensemanagerMod.LicenseCountingType
  /**
    * Array of configured License Manager rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  /**
    * Name of the license configuration.
    */
  var Name: String
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags . 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateLicenseConfigurationRequest {
  @scala.inline
  def apply(
    LicenseCountingType: LicenseCountingType,
    Name: String,
    Description: String = null,
    LicenseCount: js.UndefOr[BoxLong] = js.undefined,
    LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
    LicenseRules: StringList = null,
    Tags: TagList = null
  ): CreateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseCountingType = LicenseCountingType.asInstanceOf[js.Any], Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(LicenseCount)) __obj.updateDynamic("LicenseCount")(LicenseCount)
    if (!js.isUndefined(LicenseCountHardLimit)) __obj.updateDynamic("LicenseCountHardLimit")(LicenseCountHardLimit)
    if (LicenseRules != null) __obj.updateDynamic("LicenseRules")(LicenseRules)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLicenseConfigurationRequest]
  }
}

