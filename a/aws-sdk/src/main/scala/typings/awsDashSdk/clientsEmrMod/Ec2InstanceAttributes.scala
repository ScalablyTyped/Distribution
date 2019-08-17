package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ec2InstanceAttributes extends js.Object {
  /**
    * A list of additional Amazon EC2 security group IDs for the master node.
    */
  var AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.undefined
  /**
    * A list of additional Amazon EC2 security group IDs for the core and task nodes.
    */
  var AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.undefined
  /**
    * The Availability Zone in which the cluster will run. 
    */
  var Ec2AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named "hadoop".
    */
  var Ec2KeyName: js.UndefOr[String] = js.undefined
  /**
    * Set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value, and your account supports EC2-Classic, the cluster launches in EC2-Classic.
    */
  var Ec2SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the Amazon EC2 security group for the master node.
    */
  var EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the Amazon EC2 security group for the core and task nodes.
    */
  var EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined
  /**
    * The IAM role that was specified when the cluster was launched. The EC2 instances of the cluster assume this role.
    */
  var IamInstanceProfile: js.UndefOr[String] = js.undefined
  /**
    * Applies to clusters configured with the instance fleets option. Specifies one or more Availability Zones in which to launch EC2 cluster instances when the EC2-Classic network configuration is supported. Amazon EMR chooses the Availability Zone with the best fit from among the list of RequestedEc2AvailabilityZones, and then launches all cluster instances within that Availability Zone. If you do not specify this value, Amazon EMR chooses the Availability Zone for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
    */
  var RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined
  /**
    * Applies to clusters configured with the instance fleets option. Specifies the unique identifier of one or more Amazon EC2 subnets in which to launch EC2 cluster instances. Subnets must exist within the same VPC. Amazon EMR chooses the EC2 subnet with the best fit from among the list of RequestedEc2SubnetIds, and then launches all cluster instances within that Subnet. If this value is not specified, and the account and Region support EC2-Classic networks, the cluster launches instances in the EC2-Classic network and uses RequestedEc2AvailabilityZones instead of this setting. If EC2-Classic is not supported, and no Subnet is specified, Amazon EMR chooses the subnet for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
    */
  var RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined
  /**
    * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
    */
  var ServiceAccessSecurityGroup: js.UndefOr[String] = js.undefined
}

object Ec2InstanceAttributes {
  @scala.inline
  def apply(
    AdditionalMasterSecurityGroups: StringList = null,
    AdditionalSlaveSecurityGroups: StringList = null,
    Ec2AvailabilityZone: String = null,
    Ec2KeyName: String = null,
    Ec2SubnetId: String = null,
    EmrManagedMasterSecurityGroup: String = null,
    EmrManagedSlaveSecurityGroup: String = null,
    IamInstanceProfile: String = null,
    RequestedEc2AvailabilityZones: XmlStringMaxLen256List = null,
    RequestedEc2SubnetIds: XmlStringMaxLen256List = null,
    ServiceAccessSecurityGroup: String = null
  ): Ec2InstanceAttributes = {
    val __obj = js.Dynamic.literal()
    if (AdditionalMasterSecurityGroups != null) __obj.updateDynamic("AdditionalMasterSecurityGroups")(AdditionalMasterSecurityGroups)
    if (AdditionalSlaveSecurityGroups != null) __obj.updateDynamic("AdditionalSlaveSecurityGroups")(AdditionalSlaveSecurityGroups)
    if (Ec2AvailabilityZone != null) __obj.updateDynamic("Ec2AvailabilityZone")(Ec2AvailabilityZone)
    if (Ec2KeyName != null) __obj.updateDynamic("Ec2KeyName")(Ec2KeyName)
    if (Ec2SubnetId != null) __obj.updateDynamic("Ec2SubnetId")(Ec2SubnetId)
    if (EmrManagedMasterSecurityGroup != null) __obj.updateDynamic("EmrManagedMasterSecurityGroup")(EmrManagedMasterSecurityGroup)
    if (EmrManagedSlaveSecurityGroup != null) __obj.updateDynamic("EmrManagedSlaveSecurityGroup")(EmrManagedSlaveSecurityGroup)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (RequestedEc2AvailabilityZones != null) __obj.updateDynamic("RequestedEc2AvailabilityZones")(RequestedEc2AvailabilityZones)
    if (RequestedEc2SubnetIds != null) __obj.updateDynamic("RequestedEc2SubnetIds")(RequestedEc2SubnetIds)
    if (ServiceAccessSecurityGroup != null) __obj.updateDynamic("ServiceAccessSecurityGroup")(ServiceAccessSecurityGroup)
    __obj.asInstanceOf[Ec2InstanceAttributes]
  }
}

