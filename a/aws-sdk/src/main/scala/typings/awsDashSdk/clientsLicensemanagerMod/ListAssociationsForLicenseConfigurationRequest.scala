package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociationsForLicenseConfigurationRequest extends js.Object {
  /**
    * ARN of a LicenseConfiguration object.
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

object ListAssociationsForLicenseConfigurationRequest {
  @scala.inline
  def apply(
    LicenseConfigurationArn: String,
    MaxResults: js.UndefOr[BoxInteger] = js.undefined,
    NextToken: String = null
  ): ListAssociationsForLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociationsForLicenseConfigurationRequest]
  }
}

