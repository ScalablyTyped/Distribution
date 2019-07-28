package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
  /**
    * The ID of the instance that you want to change the health status for.
    */
  var InstanceId: ResourceId
  /**
    * The ID of the service that includes the configuration for the custom health check that you want to change the status for.
    */
  var ServiceId: ResourceId
  /**
    * The new status of the instance, HEALTHY or UNHEALTHY.
    */
  var Status: CustomHealthStatus
}

object UpdateInstanceCustomHealthStatusRequest {
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId, Status: CustomHealthStatus): UpdateInstanceCustomHealthStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, ServiceId = ServiceId, Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateInstanceCustomHealthStatusRequest]
  }
}

