package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLicenseConfigurationRequest extends js.Object {
  /**
    * New human-friendly description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * ARN for a license configuration.
    */
  var LicenseConfigurationArn: String
  /**
    * New status of the license configuration (ACTIVE or INACTIVE).
    */
  var LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus] = js.undefined
  /**
    * New number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  /**
    * Sets the number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  /**
    * List of flexible text strings designating license rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  /**
    * New name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object UpdateLicenseConfigurationRequest {
  @scala.inline
  def apply(
    LicenseConfigurationArn: String,
    Description: String = null,
    LicenseConfigurationStatus: LicenseConfigurationStatus = null,
    LicenseCount: js.UndefOr[BoxLong] = js.undefined,
    LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
    LicenseRules: StringList = null,
    Name: String = null
  ): UpdateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LicenseConfigurationStatus != null) __obj.updateDynamic("LicenseConfigurationStatus")(LicenseConfigurationStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(LicenseCount)) __obj.updateDynamic("LicenseCount")(LicenseCount)
    if (!js.isUndefined(LicenseCountHardLimit)) __obj.updateDynamic("LicenseCountHardLimit")(LicenseCountHardLimit)
    if (LicenseRules != null) __obj.updateDynamic("LicenseRules")(LicenseRules)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
  }
}

