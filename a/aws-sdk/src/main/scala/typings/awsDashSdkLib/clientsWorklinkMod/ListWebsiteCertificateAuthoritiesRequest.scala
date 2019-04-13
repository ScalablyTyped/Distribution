package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebsiteCertificateAuthoritiesRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListWebsiteCertificateAuthoritiesRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListWebsiteCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesRequest]
  }
}

