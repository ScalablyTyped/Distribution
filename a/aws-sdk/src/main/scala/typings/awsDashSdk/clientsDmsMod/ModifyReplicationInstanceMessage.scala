package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReplicationInstanceMessage extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage, and the change is asynchronously applied as soon as possible. This parameter must be set to true when specifying a value for the EngineVersion parameter that is a different major version than the replication instance's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  /**
    *  Indicates that minor version upgrades will be applied automatically to the replication instance during the maintenance window. Changing this parameter does not result in an outage except in the following case and the change is asynchronously applied as soon as possible. An outage will result if this parameter is set to true during the maintenance window, and a newer minor version is available, and AWS DMS has enabled auto patching for that engine version. 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter does not result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object ModifyReplicationInstanceMessage {
  @scala.inline
  def apply(
    ReplicationInstanceArn: String,
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    EngineVersion: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    PreferredMaintenanceWindow: String = null,
    ReplicationInstanceClass: String = null,
    ReplicationInstanceIdentifier: String = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): ModifyReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn)
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (!js.isUndefined(AllowMajorVersionUpgrade)) __obj.updateDynamic("AllowMajorVersionUpgrade")(AllowMajorVersionUpgrade)
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ReplicationInstanceClass != null) __obj.updateDynamic("ReplicationInstanceClass")(ReplicationInstanceClass)
    if (ReplicationInstanceIdentifier != null) __obj.updateDynamic("ReplicationInstanceIdentifier")(ReplicationInstanceIdentifier)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[ModifyReplicationInstanceMessage]
  }
}

