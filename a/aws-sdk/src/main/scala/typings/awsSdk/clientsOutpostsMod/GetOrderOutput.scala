package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderOutput extends StObject {
  
  var Order: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Order] = js.undefined
}
object GetOrderOutput {
  
  inline def apply(): GetOrderOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrderOutput]
  }
  
  extension [Self <: GetOrderOutput](x: Self) {
    
    inline def setOrder(value: Order): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
  }
}
