package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesHealthStatusResponse extends js.Object {
  /**
    * If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  /**
    * A complex type that contains the IDs and the health status of the instances that you specified in the GetInstancesHealthStatus request.
    */
  var Status: js.UndefOr[InstanceHealthStatusMap] = js.undefined
}

object GetInstancesHealthStatusResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Status: InstanceHealthStatusMap = null): GetInstancesHealthStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[GetInstancesHealthStatusResponse]
  }
}

