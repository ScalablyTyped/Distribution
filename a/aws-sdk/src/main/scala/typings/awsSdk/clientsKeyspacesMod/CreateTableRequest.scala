package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableRequest extends StObject {
  
  /**
    * Specifies the read/write throughput capacity mode for the table. The options are: • throughputMode:PAY_PER_REQUEST and  • throughputMode:PROVISIONED - Provisioned capacity mode requires readCapacityUnits and writeCapacityUnits as input. The default is throughput_mode:PAY_PER_REQUEST. For more information, see Read/write capacity modes in the Amazon Keyspaces Developer Guide.
    */
  var capacitySpecification: js.UndefOr[CapacitySpecification] = js.undefined
  
  /**
    * This parameter allows to enter a description of the table.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * The default Time to Live setting in seconds for the table. For more information, see Setting the default TTL value for a table in the Amazon Keyspaces Developer Guide.
    */
  var defaultTimeToLive: js.UndefOr[DefaultTimeToLive] = js.undefined
  
  /**
    * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the following KMS key (KMS key): • type:AWS_OWNED_KMS_KEY - This key is owned by Amazon Keyspaces.  • type:CUSTOMER_MANAGED_KMS_KEY - This key is stored in your account and is created, owned, and managed by you. This option requires the kms_key_identifier of the KMS key in Amazon Resource Name (ARN) format as input. The default is type:AWS_OWNED_KMS_KEY.  For more information, see Encryption at rest in the Amazon Keyspaces Developer Guide.
    */
  var encryptionSpecification: js.UndefOr[EncryptionSpecification] = js.undefined
  
  /**
    * The name of the keyspace that the table is going to be created in.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * Specifies if pointInTimeRecovery is enabled or disabled for the table. The options are: • ENABLED  • DISABLED  If it's not specified, the default is DISABLED. For more information, see Point-in-time recovery in the Amazon Keyspaces Developer Guide.
    */
  var pointInTimeRecovery: js.UndefOr[PointInTimeRecovery] = js.undefined
  
  /**
    * The schemaDefinition consists of the following parameters. For each column to be created: • name - The name of the column. • type - An Amazon Keyspaces data type. For more information, see Data types in the Amazon Keyspaces Developer Guide. The primary key of the table consists of the following columns: • partitionKeys - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data. • name - The name of each partition key column. • clusteringKeys - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition. • name - The name of the clustering column.  • orderBy - Sets the ascendant (ASC) or descendant (DESC) order modifier. To define a column as static use staticColumns - Static columns store values that are shared by all rows in the same partition: • name - The name of the column. • type - An Amazon Keyspaces data type.
    */
  var schemaDefinition: SchemaDefinition
  
  /**
    * The name of the table.
    */
  var tableName: TableName
  
  /**
    * A list of key-value pair tags to be attached to the resource.  For more information, see Adding tags and labels to Amazon Keyspaces resources in the Amazon Keyspaces Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Enables Time to Live custom settings for the table. The options are: • status:enabled  • status:disabled  The default is status:disabled. After ttl is enabled, you can't disable it for the table. For more information, see Expiring data by using Amazon Keyspaces Time to Live (TTL) in the Amazon Keyspaces Developer Guide.
    */
  var ttl: js.UndefOr[TimeToLive] = js.undefined
}
object CreateTableRequest {
  
  inline def apply(keyspaceName: KeyspaceName, schemaDefinition: SchemaDefinition, tableName: TableName): CreateTableRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], schemaDefinition = schemaDefinition.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTableRequest] (val x: Self) extends AnyVal {
    
    inline def setCapacitySpecification(value: CapacitySpecification): Self = StObject.set(x, "capacitySpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacitySpecificationUndefined: Self = StObject.set(x, "capacitySpecification", js.undefined)
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDefaultTimeToLive(value: DefaultTimeToLive): Self = StObject.set(x, "defaultTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeToLiveUndefined: Self = StObject.set(x, "defaultTimeToLive", js.undefined)
    
    inline def setEncryptionSpecification(value: EncryptionSpecification): Self = StObject.set(x, "encryptionSpecification", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSpecificationUndefined: Self = StObject.set(x, "encryptionSpecification", js.undefined)
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecovery(value: PointInTimeRecovery): Self = StObject.set(x, "pointInTimeRecovery", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryUndefined: Self = StObject.set(x, "pointInTimeRecovery", js.undefined)
    
    inline def setSchemaDefinition(value: SchemaDefinition): Self = StObject.set(x, "schemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTtl(value: TimeToLive): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
