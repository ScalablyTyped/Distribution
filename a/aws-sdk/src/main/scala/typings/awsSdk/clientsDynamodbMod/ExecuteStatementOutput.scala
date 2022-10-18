package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementOutput extends StObject {
  
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ConsumedCapacity] = js.undefined
  
  /**
    * If a read operation was used, this property will contain the result of the read operation; a map of attribute names and their values. For the write operations this value will be empty.
    */
  var Items: js.UndefOr[ItemList] = js.undefined
  
  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty. 
    */
  var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
  
  /**
    * If the response of a read request exceeds the response payload limit DynamoDB will set this value in the response. If set, you can use that this value in the subsequent request to get the remaining results.
    */
  var NextToken: js.UndefOr[PartiQLNextToken] = js.undefined
}
object ExecuteStatementOutput {
  
  inline def apply(): ExecuteStatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementOutput]
  }
  
  extension [Self <: ExecuteStatementOutput](x: Self) {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    inline def setNextToken(value: PartiQLNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
