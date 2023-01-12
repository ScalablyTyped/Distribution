package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingListenersResponse extends StObject {
  
  /**
    * The list of listeners for a custom routing accelerator.
    */
  var Listeners: js.UndefOr[CustomRoutingListeners] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingListenersResponse {
  
  inline def apply(): ListCustomRoutingListenersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomRoutingListenersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomRoutingListenersResponse] (val x: Self) extends AnyVal {
    
    inline def setListeners(value: CustomRoutingListeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: CustomRoutingListener*): Self = StObject.set(x, "Listeners", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
