package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLicenseConfigurationsResponse extends js.Object {
  /**
    * Array of license configuration objects.
    */
  var LicenseConfigurations: js.UndefOr[LicenseConfigurations] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListLicenseConfigurationsResponse {
  @scala.inline
  def apply(LicenseConfigurations: LicenseConfigurations = null, NextToken: String = null): ListLicenseConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurations != null) __obj.updateDynamic("LicenseConfigurations")(LicenseConfigurations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLicenseConfigurationsResponse]
  }
}

