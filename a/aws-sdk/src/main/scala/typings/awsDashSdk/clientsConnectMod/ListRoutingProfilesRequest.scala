package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRoutingProfilesRequest extends js.Object {
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
  /**
    * The maximum number of routing profiles to return in the response.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
}

object ListRoutingProfilesRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListRoutingProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListRoutingProfilesRequest]
  }
}

