package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfiguration extends js.Object {
  /**
    * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * In the Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.undefined
  /**
    * Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using the VPC Endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  /**
    * The service state.
    */
  var ServiceState: js.UndefOr[ServiceState] = js.undefined
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.undefined
}

object ServiceConfiguration {
  @scala.inline
  def apply(
    AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZones: ValueStringList = null,
    BaseEndpointDnsNames: ValueStringList = null,
    ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined,
    NetworkLoadBalancerArns: ValueStringList = null,
    PrivateDnsName: String = null,
    ServiceId: String = null,
    ServiceName: String = null,
    ServiceState: ServiceState = null,
    ServiceType: ServiceTypeDetailSet = null
  ): ServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (BaseEndpointDnsNames != null) __obj.updateDynamic("BaseEndpointDnsNames")(BaseEndpointDnsNames)
    if (!js.isUndefined(ManagesVpcEndpoints)) __obj.updateDynamic("ManagesVpcEndpoints")(ManagesVpcEndpoints)
    if (NetworkLoadBalancerArns != null) __obj.updateDynamic("NetworkLoadBalancerArns")(NetworkLoadBalancerArns)
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (ServiceState != null) __obj.updateDynamic("ServiceState")(ServiceState.asInstanceOf[js.Any])
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType)
    __obj.asInstanceOf[ServiceConfiguration]
  }
}

