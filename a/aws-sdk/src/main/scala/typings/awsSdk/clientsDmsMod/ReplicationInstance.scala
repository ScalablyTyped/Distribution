package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationInstance extends StObject {
  
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
    * The DNS name servers supported for the replication instance to access your on-premise source or target database.
    */
  var DnsNameServers: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version number of the replication instance. If an engine version number is not specified when a replication instance is created, the default is the latest engine version available. When modifying a major engine version of an instance, also set AllowMajorVersionUpgrade to true.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    *  The expiration date of the free replication instance that is part of the Free DMS program. 
    */
  var FreeUntil: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the replication instance was created.
    */
  var InstanceCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value for the KmsKeyId parameter, then DMS uses your default encryption key. KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key for each Amazon Web Services Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The pending modification values.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.undefined
  
  /**
    * The maintenance window times for the replication instance. Any pending upgrades to the replication instance are performed during this time.
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
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. It is a required parameter, although a default value is pre-selected in the DMS console. For more information on the settings and capacities for the available replication instance classes, see  Selecting the right DMS replication instance for your migration. 
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The replication instance identifier is a required parameter. This parameter is stored as a lowercase string. Constraints:   Must contain 1-63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
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
    * The status of the replication instance. The possible return values include:    "available"     "creating"     "deleted"     "deleting"     "failed"     "modifying"     "upgrading"     "rebooting"     "resetting-master-credentials"     "storage-full"     "incompatible-credentials"     "incompatible-network"     "maintenance"   
    */
  var ReplicationInstanceStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet group for the replication instance.
    */
  var ReplicationSubnetGroup: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationSubnetGroup] = js.undefined
  
  /**
    * The Availability Zone of the standby replication instance in a Multi-AZ deployment.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC security group for the instance.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object ReplicationInstance {
  
  inline def apply(): ReplicationInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstance]
  }
  
  extension [Self <: ReplicationInstance](x: Self) {
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDnsNameServers(value: String): Self = StObject.set(x, "DnsNameServers", value.asInstanceOf[js.Any])
    
    inline def setDnsNameServersUndefined: Self = StObject.set(x, "DnsNameServers", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setFreeUntil(value: js.Date): Self = StObject.set(x, "FreeUntil", value.asInstanceOf[js.Any])
    
    inline def setFreeUntilUndefined: Self = StObject.set(x, "FreeUntil", js.undefined)
    
    inline def setInstanceCreateTime(value: js.Date): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setPendingModifiedValues(value: ReplicationPendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    inline def setReplicationInstanceClass(value: String): Self = StObject.set(x, "ReplicationInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceClassUndefined: Self = StObject.set(x, "ReplicationInstanceClass", js.undefined)
    
    inline def setReplicationInstanceIdentifier(value: String): Self = StObject.set(x, "ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceIdentifierUndefined: Self = StObject.set(x, "ReplicationInstanceIdentifier", js.undefined)
    
    inline def setReplicationInstancePrivateIpAddress(value: String): Self = StObject.set(x, "ReplicationInstancePrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstancePrivateIpAddressUndefined: Self = StObject.set(x, "ReplicationInstancePrivateIpAddress", js.undefined)
    
    inline def setReplicationInstancePrivateIpAddresses(value: ReplicationInstancePrivateIpAddressList): Self = StObject.set(x, "ReplicationInstancePrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstancePrivateIpAddressesUndefined: Self = StObject.set(x, "ReplicationInstancePrivateIpAddresses", js.undefined)
    
    inline def setReplicationInstancePrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "ReplicationInstancePrivateIpAddresses", js.Array(value*))
    
    inline def setReplicationInstancePublicIpAddress(value: String): Self = StObject.set(x, "ReplicationInstancePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstancePublicIpAddressUndefined: Self = StObject.set(x, "ReplicationInstancePublicIpAddress", js.undefined)
    
    inline def setReplicationInstancePublicIpAddresses(value: ReplicationInstancePublicIpAddressList): Self = StObject.set(x, "ReplicationInstancePublicIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstancePublicIpAddressesUndefined: Self = StObject.set(x, "ReplicationInstancePublicIpAddresses", js.undefined)
    
    inline def setReplicationInstancePublicIpAddressesVarargs(value: String*): Self = StObject.set(x, "ReplicationInstancePublicIpAddresses", js.Array(value*))
    
    inline def setReplicationInstanceStatus(value: String): Self = StObject.set(x, "ReplicationInstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceStatusUndefined: Self = StObject.set(x, "ReplicationInstanceStatus", js.undefined)
    
    inline def setReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = StObject.set(x, "ReplicationSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationSubnetGroupUndefined: Self = StObject.set(x, "ReplicationSubnetGroup", js.undefined)
    
    inline def setSecondaryAvailabilityZone(value: String): Self = StObject.set(x, "SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAvailabilityZoneUndefined: Self = StObject.set(x, "SecondaryAvailabilityZone", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value*))
  }
}
