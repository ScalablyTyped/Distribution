package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrderOutput extends StObject {
  
  /**
    * Information about this order.
    */
  var Order: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Order] = js.undefined
}
object CreateOrderOutput {
  
  inline def apply(): CreateOrderOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrderOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOrderOutput] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: Order): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
  }
}
