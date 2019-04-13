package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticLoadBalancer extends js.Object {
  /**
    * A list of Availability Zones.
    */
  var AvailabilityZones: js.UndefOr[Strings] = js.undefined
  /**
    * The instance's public DNS name.
    */
  var DnsName: js.UndefOr[String] = js.undefined
  /**
    * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
    */
  var Ec2InstanceIds: js.UndefOr[Strings] = js.undefined
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the layer that the instance is attached to.
    */
  var LayerId: js.UndefOr[String] = js.undefined
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.undefined
  /**
    * The ID of the stack that the instance is associated with.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * A list of subnet IDs, if the stack is running in a VPC.
    */
  var SubnetIds: js.UndefOr[Strings] = js.undefined
  /**
    * The VPC ID.
    */
  var VpcId: js.UndefOr[String] = js.undefined
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
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName)
    if (Ec2InstanceIds != null) __obj.updateDynamic("Ec2InstanceIds")(Ec2InstanceIds)
    if (ElasticLoadBalancerName != null) __obj.updateDynamic("ElasticLoadBalancerName")(ElasticLoadBalancerName)
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[ElasticLoadBalancer]
  }
}

