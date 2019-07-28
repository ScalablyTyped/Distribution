package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsageForLicenseConfigurationResponse extends js.Object {
  /**
    * An array of LicenseConfigurationUsage objects.
    */
  var LicenseConfigurationUsageList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseConfigurationUsageList] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListUsageForLicenseConfigurationResponse {
  @scala.inline
  def apply(LicenseConfigurationUsageList: LicenseConfigurationUsageList = null, NextToken: String = null): ListUsageForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationUsageList != null) __obj.updateDynamic("LicenseConfigurationUsageList")(LicenseConfigurationUsageList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
  }
}

