package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalSecondaryIndexAction extends StObject {
  
  /**
    * The name of the global secondary index to be created.
    */
  var IndexName: typings.awsSdk.clientsDynamodbMod.IndexName
  
  /**
    * The key schema for the global secondary index.
    */
  var KeySchema: typings.awsSdk.clientsDynamodbMod.KeySchema
  
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: typings.awsSdk.clientsDynamodbMod.Projection
  
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ProvisionedThroughput] = js.undefined
}
object CreateGlobalSecondaryIndexAction {
  
  inline def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
  
  extension [Self <: CreateGlobalSecondaryIndexAction](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
