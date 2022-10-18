package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemOutput extends StObject {
  
  /**
    * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ConsumedCapacity] = js.undefined
  
  /**
    * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
    */
  var Item: js.UndefOr[AttributeMap] = js.undefined
}
object GetItemOutput {
  
  inline def apply(): GetItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemOutput]
  }
  
  extension [Self <: GetItemOutput](x: Self) {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
  }
}
