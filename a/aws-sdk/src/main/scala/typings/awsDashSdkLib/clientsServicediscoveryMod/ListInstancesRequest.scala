package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstancesRequest extends js.Object {
  /**
    * The maximum number of instances that you want AWS Cloud Map to return in the response to a ListInstances request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * For the first ListInstances request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another ListInstances request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID of the service that you want to list instances for.
    */
  var ServiceId: ResourceId
}

object ListInstancesRequest {
  @scala.inline
  def apply(
    ServiceId: ResourceId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListInstancesRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInstancesRequest]
  }
}

