package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderInput extends StObject {
  
  /**
    * The ID of the order.
    */
  var OrderId: typings.awsSdk.clientsOutpostsMod.OrderId
}
object GetOrderInput {
  
  inline def apply(OrderId: OrderId): GetOrderInput = {
    val __obj = js.Dynamic.literal(OrderId = OrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOrderInput] (val x: Self) extends AnyVal {
    
    inline def setOrderId(value: OrderId): Self = StObject.set(x, "OrderId", value.asInstanceOf[js.Any])
  }
}
