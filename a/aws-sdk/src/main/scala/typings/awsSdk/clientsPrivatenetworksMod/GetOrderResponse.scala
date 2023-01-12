package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderResponse extends StObject {
  
  /**
    * Information about the order.
    */
  var order: Order
  
  /**
    *  The order tags. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetOrderResponse {
  
  inline def apply(order: Order): GetOrderResponse = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOrderResponse] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
