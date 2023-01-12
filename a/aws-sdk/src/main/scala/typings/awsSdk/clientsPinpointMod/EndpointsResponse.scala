package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointsResponse extends StObject {
  
  /**
    * An array of responses, one for each endpoint that's associated with the user ID.
    */
  var Item: ListOfEndpointResponse
}
object EndpointsResponse {
  
  inline def apply(Item: ListOfEndpointResponse): EndpointsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ListOfEndpointResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: EndpointResponse*): Self = StObject.set(x, "Item", js.Array(value*))
  }
}
