package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListenerResponse extends StObject {
  
  /**
    * The listener that you've created.
    */
  var Listener: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.Listener] = js.undefined
}
object CreateListenerResponse {
  
  inline def apply(): CreateListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateListenerResponse]
  }
  
  extension [Self <: CreateListenerResponse](x: Self) {
    
    inline def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
