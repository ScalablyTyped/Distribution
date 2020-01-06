package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceStatusResponse extends js.Object {
  /**
    * If you have more PolicyComplianceStatus objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicyComplianceStatus objects, submit another ListComplianceStatus request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of PolicyComplianceStatus objects.
    */
  var PolicyComplianceStatusList: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyComplianceStatusList] = js.native
}

object ListComplianceStatusResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, PolicyComplianceStatusList: PolicyComplianceStatusList = null): ListComplianceStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PolicyComplianceStatusList != null) __obj.updateDynamic("PolicyComplianceStatusList")(PolicyComplianceStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComplianceStatusResponse]
  }
}

