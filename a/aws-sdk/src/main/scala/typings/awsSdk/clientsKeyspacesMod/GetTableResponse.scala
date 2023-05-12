package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableResponse extends StObject {
  
  /**
    * The read/write throughput capacity mode for a table. The options are:    throughputMode:PAY_PER_REQUEST     throughputMode:PROVISIONED   
    */
  var capacitySpecification: js.UndefOr[CapacitySpecificationSummary] = js.undefined
  
  /**
    *  The client-side timestamps setting of the table.
    */
  var clientSideTimestamps: js.UndefOr[ClientSideTimestamps] = js.undefined
  
  /**
    * The the description of the specified table.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * The creation timestamp of the specified table.
    */
  var creationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default Time to Live settings in seconds of the specified table.
    */
  var defaultTimeToLive: js.UndefOr[DefaultTimeToLive] = js.undefined
  
  /**
    * The encryption settings of the specified table.
    */
  var encryptionSpecification: js.UndefOr[EncryptionSpecification] = js.undefined
  
  /**
    * The name of the keyspace that the specified table is stored in.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * The point-in-time recovery status of the specified table.
    */
  var pointInTimeRecovery: js.UndefOr[PointInTimeRecoverySummary] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified table.
    */
  var resourceArn: ARN
  
  /**
    * The schema definition of the specified table.
    */
  var schemaDefinition: js.UndefOr[SchemaDefinition] = js.undefined
  
  /**
    * The current status of the specified table.
    */
  var status: js.UndefOr[TableStatus] = js.undefined
  
  /**
    * The name of the specified table.
    */
  var tableName: TableName
  
  /**
    * The custom Time to Live settings of the specified table.
    */
  var ttl: js.UndefOr[TimeToLive] = js.undefined
}
object GetTableResponse {
  
  inline def apply(keyspaceName: KeyspaceName, resourceArn: ARN, tableName: TableName): GetTableResponse = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTableResponse] (val x: Self) extends AnyVal {
    
    inline def setCapacitySpecification(value: CapacitySpecificationSummary): Self = StObject.set(x, "capacitySpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacitySpecificationUndefined: Self = StObject.set(x, "capacitySpecification", js.undefined)
    
    inline def setClientSideTimestamps(value: ClientSideTimestamps): Self = StObject.set(x, "clientSideTimestamps", value.asInstanceOf[js.Any])
    
    inline def setClientSideTimestampsUndefined: Self = StObject.set(x, "clientSideTimestamps", js.undefined)
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDefaultTimeToLive(value: DefaultTimeToLive): Self = StObject.set(x, "defaultTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeToLiveUndefined: Self = StObject.set(x, "defaultTimeToLive", js.undefined)
    
    inline def setEncryptionSpecification(value: EncryptionSpecification): Self = StObject.set(x, "encryptionSpecification", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSpecificationUndefined: Self = StObject.set(x, "encryptionSpecification", js.undefined)
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecovery(value: PointInTimeRecoverySummary): Self = StObject.set(x, "pointInTimeRecovery", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryUndefined: Self = StObject.set(x, "pointInTimeRecovery", js.undefined)
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinition(value: SchemaDefinition): Self = StObject.set(x, "schemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinitionUndefined: Self = StObject.set(x, "schemaDefinition", js.undefined)
    
    inline def setStatus(value: TableStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: TimeToLive): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
