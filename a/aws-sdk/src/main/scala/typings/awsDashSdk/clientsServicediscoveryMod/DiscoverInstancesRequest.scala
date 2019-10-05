package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverInstancesRequest extends js.Object {
  /**
    * The health status of the instances that you want to discover.
    */
  var HealthStatus: js.UndefOr[HealthStatusFilter] = js.undefined
  /**
    * The maximum number of instances that you want Cloud Map to return in the response to a DiscoverInstances request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.MaxResults] = js.undefined
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: typings.awsDashSdk.clientsServicediscoveryMod.NamespaceName
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all the specified key/value pairs will be returned.
    */
  var QueryParameters: js.UndefOr[Attributes] = js.undefined
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: typings.awsDashSdk.clientsServicediscoveryMod.ServiceName
}

object DiscoverInstancesRequest {
  @scala.inline
  def apply(
    NamespaceName: NamespaceName,
    ServiceName: ServiceName,
    HealthStatus: HealthStatusFilter = null,
    MaxResults: Int | Double = null,
    QueryParameters: Attributes = null
  ): DiscoverInstancesRequest = {
    val __obj = js.Dynamic.literal(NamespaceName = NamespaceName, ServiceName = ServiceName)
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (QueryParameters != null) __obj.updateDynamic("QueryParameters")(QueryParameters)
    __obj.asInstanceOf[DiscoverInstancesRequest]
  }
}

