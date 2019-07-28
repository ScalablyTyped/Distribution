package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLicenseSpecificationsForResourceResponse extends js.Object {
  /**
    * License configurations associated with a resource.
    */
  var LicenseSpecifications: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseSpecifications] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListLicenseSpecificationsForResourceResponse {
  @scala.inline
  def apply(LicenseSpecifications: LicenseSpecifications = null, NextToken: String = null): ListLicenseSpecificationsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
  }
}

