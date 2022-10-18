package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReplicationGroupMemberAction extends StObject {
  
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.undefined
  
  /**
    * The KMS key of the replica that should be used for KMS encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk.clientsDynamodbMod.KMSMasterKeyId] = js.undefined
  
  /**
    * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ProvisionedThroughputOverride] = js.undefined
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk.clientsDynamodbMod.RegionName
  
  /**
    * Replica-specific table class. If not specified, uses the source table's table class.
    */
  var TableClassOverride: js.UndefOr[TableClass] = js.undefined
}
object UpdateReplicationGroupMemberAction {
  
  inline def apply(RegionName: RegionName): UpdateReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReplicationGroupMemberAction]
  }
  
  extension [Self <: UpdateReplicationGroupMemberAction](x: Self) {
    
    inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setTableClassOverride(value: TableClass): Self = StObject.set(x, "TableClassOverride", value.asInstanceOf[js.Any])
    
    inline def setTableClassOverrideUndefined: Self = StObject.set(x, "TableClassOverride", js.undefined)
  }
}
