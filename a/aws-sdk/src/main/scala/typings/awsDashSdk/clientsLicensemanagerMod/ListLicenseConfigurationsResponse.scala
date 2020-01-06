package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLicenseConfigurationsResponse extends js.Object {
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurations: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseConfigurations] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListLicenseConfigurationsResponse {
  @scala.inline
  def apply(LicenseConfigurations: LicenseConfigurations = null, NextToken: String = null): ListLicenseConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurations != null) __obj.updateDynamic("LicenseConfigurations")(LicenseConfigurations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseConfigurationsResponse]
  }
}

