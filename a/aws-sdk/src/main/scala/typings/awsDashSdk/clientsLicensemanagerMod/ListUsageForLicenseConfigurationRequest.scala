package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsageForLicenseConfigurationRequest extends js.Object {
  /**
    * List of filters to apply.
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.Filters] = js.undefined
  /**
    * ARN of the targeted LicenseConfiguration object.
    */
  var LicenseConfigurationArn: String
  /**
    * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListUsageForLicenseConfigurationRequest {
  @scala.inline
  def apply(
    LicenseConfigurationArn: String,
    Filters: Filters = null,
    MaxResults: js.UndefOr[BoxInteger] = js.undefined,
    NextToken: String = null
  ): ListUsageForLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsageForLicenseConfigurationRequest]
  }
}

