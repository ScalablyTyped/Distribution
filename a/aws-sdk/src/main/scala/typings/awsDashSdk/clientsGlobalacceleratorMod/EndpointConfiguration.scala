package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConfiguration extends js.Object {
  /**
    * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value is true or false. The default value is true for new accelerators.  If the value is set to true, the client's IP address is preserved in the X-Forwarded-For request header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator. For more information, see  Viewing Client IP Addresses in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
    */
  var EndpointId: js.UndefOr[GenericString] = js.undefined
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide.
    */
  var Weight: js.UndefOr[EndpointWeight] = js.undefined
}

object EndpointConfiguration {
  @scala.inline
  def apply(
    ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.undefined,
    EndpointId: GenericString = null,
    Weight: js.UndefOr[EndpointWeight] = js.undefined
  ): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClientIPPreservationEnabled)) __obj.updateDynamic("ClientIPPreservationEnabled")(ClientIPPreservationEnabled)
    if (EndpointId != null) __obj.updateDynamic("EndpointId")(EndpointId)
    if (!js.isUndefined(Weight)) __obj.updateDynamic("Weight")(Weight)
    __obj.asInstanceOf[EndpointConfiguration]
  }
}

