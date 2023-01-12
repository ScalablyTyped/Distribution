package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateListenerResponse extends StObject {
  
  /**
    * Information for the updated listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.Listener] = js.undefined
}
object UpdateListenerResponse {
  
  inline def apply(): UpdateListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateListenerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateListenerResponse] (val x: Self) extends AnyVal {
    
    inline def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
