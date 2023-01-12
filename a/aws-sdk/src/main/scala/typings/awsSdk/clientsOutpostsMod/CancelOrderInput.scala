package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelOrderInput extends StObject {
  
  /**
    *  The ID of the order. 
    */
  var OrderId: typings.awsSdk.clientsOutpostsMod.OrderId
}
object CancelOrderInput {
  
  inline def apply(OrderId: OrderId): CancelOrderInput = {
    val __obj = js.Dynamic.literal(OrderId = OrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelOrderInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelOrderInput] (val x: Self) extends AnyVal {
    
    inline def setOrderId(value: OrderId): Self = StObject.set(x, "OrderId", value.asInstanceOf[js.Any])
  }
}
