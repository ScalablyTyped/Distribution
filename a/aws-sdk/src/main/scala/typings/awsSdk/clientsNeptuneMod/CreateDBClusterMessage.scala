package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterMessage extends StObject {
  
  /**
    * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsNeptuneMod.AvailabilityZones] = js.undefined
  
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    *  (Not supported by Neptune) 
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  
  /**
    *  If set to true, tags are copied to any snapshot of the DB cluster that is created. 
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String
  
  /**
    *  The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default is used. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A DB subnet group to associate with this DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Neptune will not create a database in the DB cluster you are creating.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is enabled.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The list of log types that need to be enabled for exporting to CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * If set to true, enables Amazon Identity and Access Management (IAM) authentication for the entire DB cluster (this cannot be set at an instance level). Default: false.
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the database engine to be used for this DB cluster. Valid Values: neptune 
    */
  var Engine: String
  
  /**
    * The version number of the database engine to use for the new DB cluster. Example: 1.0.2.1 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Neptune global database to which this new DB cluster should be added.
    */
  var GlobalClusterIdentifier: js.UndefOr[typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier] = js.undefined
  
  /**
    * The Amazon KMS key identifier for an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB cluster with the same Amazon account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If an encryption key is not specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon Neptune will use the encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption key.   If the StorageEncrypted parameter is true and ReplicationSourceIdentifier is not specified, then Amazon Neptune will use your default encryption key.   Amazon KMS creates the default encryption key for your Amazon account. Your Amazon account has a different default encryption key for each Amazon Region. If you create a Read Replica of an encrypted DB cluster in another Amazon Region, you must set KmsKeyId to a KMS key ID that is valid in the destination Amazon Region. This key is used to encrypt the Read Replica in that Amazon Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported by Neptune.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported by Neptune.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the instances in the DB cluster accept connections.  Default: 8182 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * This parameter is not currently supported.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Region. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon Neptune User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon Neptune User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read Replica.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The tags to assign to the new DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of EC2 VPC security groups to associate with this DB cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object CreateDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String, Engine: String): CreateDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterMessage]
  }
  
  extension [Self <: CreateDBClusterMessage](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    inline def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
    
    inline def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEnableCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnableCloudwatchLogsExports", js.undefined)
    
    inline def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnableCloudwatchLogsExports", js.Array(value*))
    
    inline def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPreSignedUrl(value: String): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setReplicationSourceIdentifier(value: String): Self = StObject.set(x, "ReplicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationSourceIdentifierUndefined: Self = StObject.set(x, "ReplicationSourceIdentifier", js.undefined)
    
    inline def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
