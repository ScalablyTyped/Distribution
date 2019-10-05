package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobFlowInstancesDetail extends js.Object {
  /**
    * The name of an Amazon EC2 key pair that can be used to ssh to the master node.
    */
  var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * For clusters launched within Amazon Virtual Private Cloud, this is the identifier of the subnet where the cluster was launched.
    */
  var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The Hadoop version for the cluster.
    */
  var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The number of Amazon EC2 instances in the cluster. If the value is 1, the same instance serves as both the master and core and task node. If the value is greater than 1, one instance is the master node and all others are core and task nodes.
    */
  var InstanceCount: Integer
  /**
    * Details about the instance groups in a cluster.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.undefined
  /**
    * Specifies whether the cluster should remain available after completing all steps.
    */
  var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon EC2 instance identifier of the master node.
    */
  var MasterInstanceId: js.UndefOr[XmlString] = js.undefined
  /**
    * The Amazon EC2 master node instance type.
    */
  var MasterInstanceType: InstanceType
  /**
    * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
    */
  var MasterPublicDnsName: js.UndefOr[XmlString] = js.undefined
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour that an m1.small runs. Larger instances are weighted more, so an Amazon EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
  /**
    * The Amazon EC2 Availability Zone for the cluster.
    */
  var Placement: js.UndefOr[PlacementType] = js.undefined
  /**
    * The Amazon EC2 core and task node instance type.
    */
  var SlaveInstanceType: InstanceType
  /**
    * Specifies whether the Amazon EC2 instances in the cluster are protected from termination by API calls, user intervention, or in the event of a job-flow error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.undefined
}

object JobFlowInstancesDetail {
  @scala.inline
  def apply(
    InstanceCount: Integer,
    MasterInstanceType: InstanceType,
    SlaveInstanceType: InstanceType,
    Ec2KeyName: XmlStringMaxLen256 = null,
    Ec2SubnetId: XmlStringMaxLen256 = null,
    HadoopVersion: XmlStringMaxLen256 = null,
    InstanceGroups: InstanceGroupDetailList = null,
    KeepJobFlowAliveWhenNoSteps: js.UndefOr[scala.Boolean] = js.undefined,
    MasterInstanceId: XmlString = null,
    MasterPublicDnsName: XmlString = null,
    NormalizedInstanceHours: Int | Double = null,
    Placement: PlacementType = null,
    TerminationProtected: js.UndefOr[scala.Boolean] = js.undefined
  ): JobFlowInstancesDetail = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, MasterInstanceType = MasterInstanceType, SlaveInstanceType = SlaveInstanceType)
    if (Ec2KeyName != null) __obj.updateDynamic("Ec2KeyName")(Ec2KeyName)
    if (Ec2SubnetId != null) __obj.updateDynamic("Ec2SubnetId")(Ec2SubnetId)
    if (HadoopVersion != null) __obj.updateDynamic("HadoopVersion")(HadoopVersion)
    if (InstanceGroups != null) __obj.updateDynamic("InstanceGroups")(InstanceGroups)
    if (!js.isUndefined(KeepJobFlowAliveWhenNoSteps)) __obj.updateDynamic("KeepJobFlowAliveWhenNoSteps")(KeepJobFlowAliveWhenNoSteps)
    if (MasterInstanceId != null) __obj.updateDynamic("MasterInstanceId")(MasterInstanceId)
    if (MasterPublicDnsName != null) __obj.updateDynamic("MasterPublicDnsName")(MasterPublicDnsName)
    if (NormalizedInstanceHours != null) __obj.updateDynamic("NormalizedInstanceHours")(NormalizedInstanceHours.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (!js.isUndefined(TerminationProtected)) __obj.updateDynamic("TerminationProtected")(TerminationProtected)
    __obj.asInstanceOf[JobFlowInstancesDetail]
  }
}

