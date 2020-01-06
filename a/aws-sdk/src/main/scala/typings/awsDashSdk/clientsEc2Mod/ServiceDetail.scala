package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDetail extends js.Object {
  /**
    * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.native
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.native
  /**
    * Indicates whether the service manages it's VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.native
  /**
    * The AWS account ID of the service owner.
    */
  var Owner: js.UndefOr[String] = js.native
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.native
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Indicates whether the service supports endpoint policies.
    */
  var VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.native
}

object ServiceDetail {
  @scala.inline
  def apply(
    AcceptanceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    AvailabilityZones: ValueStringList = null,
    BaseEndpointDnsNames: ValueStringList = null,
    ManagesVpcEndpoints: js.UndefOr[scala.Boolean] = js.undefined,
    Owner: String = null,
    PrivateDnsName: String = null,
    ServiceId: String = null,
    ServiceName: String = null,
    ServiceType: ServiceTypeDetailSet = null,
    Tags: TagList = null,
    VpcEndpointPolicySupported: js.UndefOr[scala.Boolean] = js.undefined
  ): ServiceDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (BaseEndpointDnsNames != null) __obj.updateDynamic("BaseEndpointDnsNames")(BaseEndpointDnsNames.asInstanceOf[js.Any])
    if (!js.isUndefined(ManagesVpcEndpoints)) __obj.updateDynamic("ManagesVpcEndpoints")(ManagesVpcEndpoints.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(VpcEndpointPolicySupported)) __obj.updateDynamic("VpcEndpointPolicySupported")(VpcEndpointPolicySupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDetail]
  }
}

