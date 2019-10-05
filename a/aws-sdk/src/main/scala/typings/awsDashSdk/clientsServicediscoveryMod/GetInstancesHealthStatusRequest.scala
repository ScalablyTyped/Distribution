package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesHealthStatusRequest extends js.Object {
  /**
    * An array that contains the IDs of all the instances that you want to get the health status for. If you omit Instances, AWS Cloud Map returns the health status for all the instances that are associated with the specified service.  To get the IDs for the instances that you've registered by using a specified service, submit a ListInstances request. 
    */
  var Instances: js.UndefOr[InstanceIdList] = js.undefined
  /**
    * The maximum number of instances that you want AWS Cloud Map to return in the response to a GetInstancesHealthStatus request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  /**
    * For the first GetInstancesHealthStatus request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId
}

object GetInstancesHealthStatusRequest {
  @scala.inline
  def apply(
    ServiceId: ResourceId,
    Instances: InstanceIdList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): GetInstancesHealthStatusRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetInstancesHealthStatusRequest]
  }
}

