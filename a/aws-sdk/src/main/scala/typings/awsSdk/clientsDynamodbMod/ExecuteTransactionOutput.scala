package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteTransactionOutput extends StObject {
  
  /**
    * The capacity units consumed by the entire operation. The values of the list are ordered according to the ordering of the statements.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
  
  /**
    * The response to a PartiQL transaction.
    */
  var Responses: js.UndefOr[ItemResponseList] = js.undefined
}
object ExecuteTransactionOutput {
  
  inline def apply(): ExecuteTransactionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteTransactionOutput]
  }
  
  extension [Self <: ExecuteTransactionOutput](x: Self) {
    
    inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setResponses(value: ItemResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setResponsesVarargs(value: ItemResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
  }
}
