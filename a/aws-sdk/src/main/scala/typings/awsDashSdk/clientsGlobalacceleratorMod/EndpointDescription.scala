package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointDescription extends js.Object {
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
    */
  var EndpointId: js.UndefOr[GenericString] = js.undefined
  /**
    * The reason code associated with why the endpoint is not healthy. If the endpoint state is healthy, a reason code is not provided. If the endpoint state is unhealthy, the reason code can be one of the following values:    Timeout: The health check requests to the endpoint are timing out before returning a status.    Failed: The health check failed, for example because the endpoint response was invalid (malformed).   If the endpoint state is initial, the reason code can be one of the following values:    ProvisioningInProgress: The endpoint is in the process of being provisioned.    InitialHealthChecking: Global Accelerator is still setting up the minimum number of health checks for the endpoint that are required to determine its health status.  
    */
  var HealthReason: js.UndefOr[GenericString] = js.undefined
  /**
    * The health status of the endpoint.
    */
  var HealthState: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthState] = js.undefined
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide. 
    */
  var Weight: js.UndefOr[EndpointWeight] = js.undefined
}

object EndpointDescription {
  @scala.inline
  def apply(
    EndpointId: GenericString = null,
    HealthReason: GenericString = null,
    HealthState: HealthState = null,
    Weight: js.UndefOr[EndpointWeight] = js.undefined
  ): EndpointDescription = {
    val __obj = js.Dynamic.literal()
    if (EndpointId != null) __obj.updateDynamic("EndpointId")(EndpointId)
    if (HealthReason != null) __obj.updateDynamic("HealthReason")(HealthReason)
    if (HealthState != null) __obj.updateDynamic("HealthState")(HealthState.asInstanceOf[js.Any])
    if (!js.isUndefined(Weight)) __obj.updateDynamic("Weight")(Weight)
    __obj.asInstanceOf[EndpointDescription]
  }
}

