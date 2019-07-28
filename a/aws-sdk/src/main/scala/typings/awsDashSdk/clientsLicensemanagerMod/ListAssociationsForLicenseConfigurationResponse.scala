package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
  /**
    * Lists association objects for the license configuration, each containing the association time, number of consumed licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
    */
  var LicenseConfigurationAssociations: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.LicenseConfigurationAssociations] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListAssociationsForLicenseConfigurationResponse {
  @scala.inline
  def apply(
    LicenseConfigurationAssociations: LicenseConfigurationAssociations = null,
    NextToken: String = null
  ): ListAssociationsForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationAssociations != null) __obj.updateDynamic("LicenseConfigurationAssociations")(LicenseConfigurationAssociations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
  }
}

