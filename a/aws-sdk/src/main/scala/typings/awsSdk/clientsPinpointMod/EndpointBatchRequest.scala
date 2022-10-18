package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointBatchRequest extends StObject {
  
  /**
    * An array that defines the endpoints to create or update and, for each endpoint, the property values to set or change. An array can contain a maximum of 100 items.
    */
  var Item: ListOfEndpointBatchItem
}
object EndpointBatchRequest {
  
  inline def apply(Item: ListOfEndpointBatchItem): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointBatchRequest]
  }
  
  extension [Self <: EndpointBatchRequest](x: Self) {
    
    inline def setItem(value: ListOfEndpointBatchItem): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: EndpointBatchItem*): Self = StObject.set(x, "Item", js.Array(value*))
  }
}
