package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationInstance extends js.Object {
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * Boolean value indicating if minor version upgrades will be automatically applied to the instance.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The DNS name servers for the replication instance.
    */
  var DnsNameServers: js.UndefOr[String] = js.undefined
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    *  The expiration date of the free replication instance that is part of the Free DMS program. 
    */
  var FreeUntil: js.UndefOr[TStamp] = js.undefined
  /**
    * The time the replication instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * An AWS KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  /**
    * The pending modification values.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.undefined
  /**
    * The maintenance window times for the replication instance.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address. The default value is true. 
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The private IP address of the replication instance.
    */
  var ReplicationInstancePrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * One or more private IP addresses for the replication instance.
    */
  var ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList] = js.undefined
  /**
    * The public IP address of the replication instance.
    */
  var ReplicationInstancePublicIpAddress: js.UndefOr[String] = js.undefined
  /**
    * One or more public IP addresses for the replication instance.
    */
  var ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList] = js.undefined
  /**
    * The status of the replication instance.
    */
  var ReplicationInstanceStatus: js.UndefOr[String] = js.undefined
  /**
    * The subnet group for the replication instance.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationSubnetGroup] = js.undefined
  /**
    * The availability zone of the standby replication instance in a Multi-AZ deployment.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The VPC security group for the instance.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}

object ReplicationInstance {
  @scala.inline
  def apply(
    AllocatedStorage: Int | Double = null,
    AutoMinorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    AvailabilityZone: String = null,
    DnsNameServers: String = null,
    EngineVersion: String = null,
    FreeUntil: TStamp = null,
    InstanceCreateTime: TStamp = null,
    KmsKeyId: String = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    PendingModifiedValues: ReplicationPendingModifiedValues = null,
    PreferredMaintenanceWindow: String = null,
    PubliclyAccessible: js.UndefOr[scala.Boolean] = js.undefined,
    ReplicationInstanceArn: String = null,
    ReplicationInstanceClass: String = null,
    ReplicationInstanceIdentifier: String = null,
    ReplicationInstancePrivateIpAddress: String = null,
    ReplicationInstancePrivateIpAddresses: ReplicationInstancePrivateIpAddressList = null,
    ReplicationInstancePublicIpAddress: String = null,
    ReplicationInstancePublicIpAddresses: ReplicationInstancePublicIpAddressList = null,
    ReplicationInstanceStatus: String = null,
    ReplicationSubnetGroup: ReplicationSubnetGroup = null,
    SecondaryAvailabilityZone: String = null,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): ReplicationInstance = {
    val __obj = js.Dynamic.literal()
    if (AllocatedStorage != null) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (DnsNameServers != null) __obj.updateDynamic("DnsNameServers")(DnsNameServers)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (FreeUntil != null) __obj.updateDynamic("FreeUntil")(FreeUntil)
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (ReplicationInstanceArn != null) __obj.updateDynamic("ReplicationInstanceArn")(ReplicationInstanceArn)
    if (ReplicationInstanceClass != null) __obj.updateDynamic("ReplicationInstanceClass")(ReplicationInstanceClass)
    if (ReplicationInstanceIdentifier != null) __obj.updateDynamic("ReplicationInstanceIdentifier")(ReplicationInstanceIdentifier)
    if (ReplicationInstancePrivateIpAddress != null) __obj.updateDynamic("ReplicationInstancePrivateIpAddress")(ReplicationInstancePrivateIpAddress)
    if (ReplicationInstancePrivateIpAddresses != null) __obj.updateDynamic("ReplicationInstancePrivateIpAddresses")(ReplicationInstancePrivateIpAddresses)
    if (ReplicationInstancePublicIpAddress != null) __obj.updateDynamic("ReplicationInstancePublicIpAddress")(ReplicationInstancePublicIpAddress)
    if (ReplicationInstancePublicIpAddresses != null) __obj.updateDynamic("ReplicationInstancePublicIpAddresses")(ReplicationInstancePublicIpAddresses)
    if (ReplicationInstanceStatus != null) __obj.updateDynamic("ReplicationInstanceStatus")(ReplicationInstanceStatus)
    if (ReplicationSubnetGroup != null) __obj.updateDynamic("ReplicationSubnetGroup")(ReplicationSubnetGroup)
    if (SecondaryAvailabilityZone != null) __obj.updateDynamic("SecondaryAvailabilityZone")(SecondaryAvailabilityZone)
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups)
    __obj.asInstanceOf[ReplicationInstance]
  }
}

