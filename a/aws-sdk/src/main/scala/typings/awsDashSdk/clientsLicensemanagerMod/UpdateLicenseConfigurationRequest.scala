package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLicenseConfigurationRequest extends js.Object {
  /**
    * New description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  /**
    * New status of the license configuration.
    */
  var LicenseConfigurationStatus: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseConfigurationStatus] = js.native
  /**
    * New number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * New hard limit of the number of available licenses.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * New license rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * New name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * New product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ProductInformationList] = js.native
}

object UpdateLicenseConfigurationRequest {
  @scala.inline
  def apply(
    LicenseConfigurationArn: String,
    Description: String = null,
    LicenseConfigurationStatus: LicenseConfigurationStatus = null,
    LicenseCount: Int | Double = null,
    LicenseCountHardLimit: js.UndefOr[scala.Boolean] = js.undefined,
    LicenseRules: StringList = null,
    Name: String = null,
    ProductInformationList: ProductInformationList = null
  ): UpdateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LicenseConfigurationStatus != null) __obj.updateDynamic("LicenseConfigurationStatus")(LicenseConfigurationStatus.asInstanceOf[js.Any])
    if (LicenseCount != null) __obj.updateDynamic("LicenseCount")(LicenseCount.asInstanceOf[js.Any])
    if (!js.isUndefined(LicenseCountHardLimit)) __obj.updateDynamic("LicenseCountHardLimit")(LicenseCountHardLimit.asInstanceOf[js.Any])
    if (LicenseRules != null) __obj.updateDynamic("LicenseRules")(LicenseRules.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ProductInformationList != null) __obj.updateDynamic("ProductInformationList")(ProductInformationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
  }
}

