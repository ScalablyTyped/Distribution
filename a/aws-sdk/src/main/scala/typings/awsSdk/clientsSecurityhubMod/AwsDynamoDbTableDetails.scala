package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableDetails extends StObject {
  
  /**
    * A list of attribute definitions for the table.
    */
  var AttributeDefinitions: js.UndefOr[AwsDynamoDbTableAttributeDefinitionList] = js.undefined
  
  /**
    * Information about the billing for read/write capacity on the table.
    */
  var BillingModeSummary: js.UndefOr[AwsDynamoDbTableBillingModeSummary] = js.undefined
  
  /**
    * Indicates when the table was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreationDateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * List of global secondary indexes for the table.
    */
  var GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableGlobalSecondaryIndexList] = js.undefined
  
  /**
    * The version of global tables being used.
    */
  var GlobalTableVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of items in the table.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The primary key structure for the table.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.undefined
  
  /**
    * The ARN of the latest stream for the table.
    */
  var LatestStreamArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The label of the latest stream. The label is not a unique identifier.
    */
  var LatestStreamLabel: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of local secondary indexes for the table.
    */
  var LocalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableLocalSecondaryIndexList] = js.undefined
  
  /**
    * Information about the provisioned throughput for the table.
    */
  var ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput] = js.undefined
  
  /**
    * The list of replicas of this table.
    */
  var Replicas: js.UndefOr[AwsDynamoDbTableReplicaList] = js.undefined
  
  /**
    * Information about the restore for the table.
    */
  var RestoreSummary: js.UndefOr[AwsDynamoDbTableRestoreSummary] = js.undefined
  
  /**
    * Information about the server-side encryption for the table.
    */
  var SseDescription: js.UndefOr[AwsDynamoDbTableSseDescription] = js.undefined
  
  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var StreamSpecification: js.UndefOr[AwsDynamoDbTableStreamSpecification] = js.undefined
  
  /**
    * The identifier of the table.
    */
  var TableId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The total size of the table in bytes.
    */
  var TableSizeBytes: js.UndefOr[SizeBytes] = js.undefined
  
  /**
    * The current status of the table. Valid values are as follows:    ACTIVE     ARCHIVED     ARCHIVING     CREATING     DELETING     INACCESSIBLE_ENCRYPTION_CREDENTIALS     UPDATING   
    */
  var TableStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableDetails {
  
  inline def apply(): AwsDynamoDbTableDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsDynamoDbTableDetails] (val x: Self) extends AnyVal {
    
    inline def setAttributeDefinitions(value: AwsDynamoDbTableAttributeDefinitionList): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
    
    inline def setAttributeDefinitionsVarargs(value: AwsDynamoDbTableAttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
    
    inline def setBillingModeSummary(value: AwsDynamoDbTableBillingModeSummary): Self = StObject.set(x, "BillingModeSummary", value.asInstanceOf[js.Any])
    
    inline def setBillingModeSummaryUndefined: Self = StObject.set(x, "BillingModeSummary", js.undefined)
    
    inline def setCreationDateTime(value: NonEmptyString): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setGlobalSecondaryIndexes(value: AwsDynamoDbTableGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: AwsDynamoDbTableGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setGlobalTableVersion(value: NonEmptyString): Self = StObject.set(x, "GlobalTableVersion", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableVersionUndefined: Self = StObject.set(x, "GlobalTableVersion", js.undefined)
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setLatestStreamArn(value: NonEmptyString): Self = StObject.set(x, "LatestStreamArn", value.asInstanceOf[js.Any])
    
    inline def setLatestStreamArnUndefined: Self = StObject.set(x, "LatestStreamArn", js.undefined)
    
    inline def setLatestStreamLabel(value: NonEmptyString): Self = StObject.set(x, "LatestStreamLabel", value.asInstanceOf[js.Any])
    
    inline def setLatestStreamLabelUndefined: Self = StObject.set(x, "LatestStreamLabel", js.undefined)
    
    inline def setLocalSecondaryIndexes(value: AwsDynamoDbTableLocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    inline def setLocalSecondaryIndexesVarargs(value: AwsDynamoDbTableLocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
    
    inline def setProvisionedThroughput(value: AwsDynamoDbTableProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setReplicas(value: AwsDynamoDbTableReplicaList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
    
    inline def setReplicasVarargs(value: AwsDynamoDbTableReplica*): Self = StObject.set(x, "Replicas", js.Array(value*))
    
    inline def setRestoreSummary(value: AwsDynamoDbTableRestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
    
    inline def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
    
    inline def setSseDescription(value: AwsDynamoDbTableSseDescription): Self = StObject.set(x, "SseDescription", value.asInstanceOf[js.Any])
    
    inline def setSseDescriptionUndefined: Self = StObject.set(x, "SseDescription", js.undefined)
    
    inline def setStreamSpecification(value: AwsDynamoDbTableStreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    
    inline def setTableId(value: NonEmptyString): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    
    inline def setTableName(value: NonEmptyString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableSizeBytes(value: SizeBytes): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
    
    inline def setTableStatus(value: NonEmptyString): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
    
    inline def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
  }
}
