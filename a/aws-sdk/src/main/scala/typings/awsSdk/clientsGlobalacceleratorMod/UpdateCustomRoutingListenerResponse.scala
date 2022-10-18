package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomRoutingListenerResponse extends StObject {
  
  /**
    * Information for the updated listener for a custom routing accelerator.
    */
  var Listener: js.UndefOr[CustomRoutingListener] = js.undefined
}
object UpdateCustomRoutingListenerResponse {
  
  inline def apply(): UpdateCustomRoutingListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomRoutingListenerResponse]
  }
  
  extension [Self <: UpdateCustomRoutingListenerResponse](x: Self) {
    
    inline def setListener(value: CustomRoutingListener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
