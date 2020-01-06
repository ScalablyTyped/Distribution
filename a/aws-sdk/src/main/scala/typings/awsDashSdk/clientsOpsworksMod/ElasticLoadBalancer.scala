package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticLoadBalancer extends js.Object {
  /**
    * A list of Availability Zones.
    */
  var AvailabilityZones: js.UndefOr[Strings] = js.native
  /**
    * The instance's public DNS name.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
    */
  var Ec2InstanceIds: js.UndefOr[Strings] = js.native
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: js.UndefOr[String] = js.native
  /**
    * The ID of the layer that the instance is attached to.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the stack that the instance is associated with.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * A list of subnet IDs, if the stack is running in a VPC.
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  /**
    * The VPC ID.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ElasticLoadBalancer {
  @scala.inline
  def apply(
    AvailabilityZones: Strings = null,
    DnsName: String = null,
    Ec2InstanceIds: Strings = null,
    ElasticLoadBalancerName: String = null,
    LayerId: String = null,
    Region: String = null,
    StackId: String = null,
    SubnetIds: Strings = null,
    VpcId: String = null
  ): ElasticLoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (Ec2InstanceIds != null) __obj.updateDynamic("Ec2InstanceIds")(Ec2InstanceIds.asInstanceOf[js.Any])
    if (ElasticLoadBalancerName != null) __obj.updateDynamic("ElasticLoadBalancerName")(ElasticLoadBalancerName.asInstanceOf[js.Any])
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticLoadBalancer]
  }
}

