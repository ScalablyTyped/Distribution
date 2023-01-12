package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomRoutingListenerResponse extends StObject {
  
  /**
    * The listener that you've created for a custom routing accelerator.
    */
  var Listener: js.UndefOr[CustomRoutingListener] = js.undefined
}
object CreateCustomRoutingListenerResponse {
  
  inline def apply(): CreateCustomRoutingListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomRoutingListenerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomRoutingListenerResponse] (val x: Self) extends AnyVal {
    
    inline def setListener(value: CustomRoutingListener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
