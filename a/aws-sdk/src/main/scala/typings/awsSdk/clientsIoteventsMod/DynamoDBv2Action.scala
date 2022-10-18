package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamoDBv2Action extends StObject {
  
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: DynamoTableName
}
object DynamoDBv2Action {
  
  inline def apply(tableName: DynamoTableName): DynamoDBv2Action = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBv2Action]
  }
  
  extension [Self <: DynamoDBv2Action](x: Self) {
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setTableName(value: DynamoTableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
