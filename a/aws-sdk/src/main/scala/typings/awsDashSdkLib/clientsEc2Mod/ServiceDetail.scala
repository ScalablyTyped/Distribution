package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDetail extends js.Object {
  /**
    * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.undefined
  /**
    * Indicates whether the service manages it's VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined
  /**
    * The AWS account ID of the service owner.
    */
  var Owner: js.UndefOr[String] = js.undefined
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.undefined
  /**
    * Indicates whether the service supports endpoint policies.
    */
  var VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.undefined
}

object ServiceDetail {
  @scala.inline
  def apply(
    AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZones: ValueStringList = null,
    BaseEndpointDnsNames: ValueStringList = null,
    ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined,
    Owner: String = null,
    PrivateDnsName: String = null,
    ServiceName: String = null,
    ServiceType: ServiceTypeDetailSet = null,
    VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.undefined
  ): ServiceDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (BaseEndpointDnsNames != null) __obj.updateDynamic("BaseEndpointDnsNames")(BaseEndpointDnsNames)
    if (!js.isUndefined(ManagesVpcEndpoints)) __obj.updateDynamic("ManagesVpcEndpoints")(ManagesVpcEndpoints)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType)
    if (!js.isUndefined(VpcEndpointPolicySupported)) __obj.updateDynamic("VpcEndpointPolicySupported")(VpcEndpointPolicySupported)
    __obj.asInstanceOf[ServiceDetail]
  }
}

