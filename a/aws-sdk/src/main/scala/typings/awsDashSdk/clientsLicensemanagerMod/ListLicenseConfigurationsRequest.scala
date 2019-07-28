package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLicenseConfigurationsRequest extends js.Object {
  /**
    * One or more filters.
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.Filters] = js.undefined
  /**
    * An array of ARNs for the calling account’s license configurations.
    */
  var LicenseConfigurationArns: js.UndefOr[StringList] = js.undefined
  /**
    * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListLicenseConfigurationsRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    LicenseConfigurationArns: StringList = null,
    MaxResults: js.UndefOr[BoxInteger] = js.undefined,
    NextToken: String = null
  ): ListLicenseConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (LicenseConfigurationArns != null) __obj.updateDynamic("LicenseConfigurationArns")(LicenseConfigurationArns)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLicenseConfigurationsRequest]
  }
}

