package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of a resource that has an associated license configuration.
    */
  var ResourceArn: String = js.native
}

object ListLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, MaxResults: Int | Double = null, NextToken: String = null): ListLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
  }
}

