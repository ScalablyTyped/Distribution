package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterToPointInTimeMessage extends StObject {
  
  /**
    * The name of the new cluster to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var DBClusterIdentifier: String
  
  /**
    * The subnet group name to use for the new cluster. Constraints: If provided, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * The KMS key identifier to use when restoring an encrypted cluster from an encrypted cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a cluster with the same Amazon Web Services account that owns the KMS encryption key used to encrypt the new cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. You can restore to a new cluster and encrypt the new cluster with an KMS key that is different from the KMS key used to encrypt the source cluster. The new DB cluster is encrypted with the KMS key identified by the KmsKeyId parameter. If you do not specify a value for the KmsKeyId parameter, then the following occurs:   If the cluster is encrypted, then the restored cluster is encrypted using the KMS key that was used to encrypt the source cluster.   If the cluster is not encrypted, then the restored cluster is not encrypted.   If DBClusterIdentifier refers to a cluster that is not encrypted, then the restore request is rejected.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the new cluster accepts connections. Constraints: Must be a value from 1150 to 65535.  Default: The default port for the engine.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The date and time to restore the cluster to. Valid values: A time in Universal Coordinated Time (UTC) format. Constraints:   Must be before the latest restorable time for the instance.   Must be specified if the UseLatestRestorableTime parameter is not provided.   Cannot be specified if the UseLatestRestorableTime parameter is true.   Cannot be specified if the RestoreType parameter is copy-on-write.   Example: 2015-03-07T23:45:00Z 
    */
  var RestoreToTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of restore to be performed. You can specify one of the following values:    full-copy - The new DB cluster is restored as a full copy of the source DB cluster.    copy-on-write - The new DB cluster is restored as a clone of the source DB cluster.   If you don't specify a RestoreType value, then the new DB cluster is restored as a full copy of the source DB cluster.
    */
  var RestoreType: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the source cluster from which to restore. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var SourceDBClusterIdentifier: String
  
  /**
    * The tags to be assigned to the restored cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A value that is set to true to restore the cluster to the latest restorable backup time, and false otherwise.  Default: false  Constraints: Cannot be specified if the RestoreToTime parameter is provided.
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of VPC security groups that the new cluster belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object RestoreDBClusterToPointInTimeMessage {
  
  inline def apply(DBClusterIdentifier: String, SourceDBClusterIdentifier: String): RestoreDBClusterToPointInTimeMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], SourceDBClusterIdentifier = SourceDBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeMessage]
  }
  
  extension [Self <: RestoreDBClusterToPointInTimeMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEnableCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnableCloudwatchLogsExports", js.undefined)
    
    inline def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnableCloudwatchLogsExports", js.Array(value*))
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRestoreToTime(value: js.Date): Self = StObject.set(x, "RestoreToTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreToTimeUndefined: Self = StObject.set(x, "RestoreToTime", js.undefined)
    
    inline def setRestoreType(value: String): Self = StObject.set(x, "RestoreType", value.asInstanceOf[js.Any])
    
    inline def setRestoreTypeUndefined: Self = StObject.set(x, "RestoreType", js.undefined)
    
    inline def setSourceDBClusterIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUseLatestRestorableTime(value: Boolean): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
