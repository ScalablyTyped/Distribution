package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListenerOutput extends StObject {
  
  /**
    * Information about the listener.
    */
  var Listeners: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Listeners] = js.undefined
}
object CreateListenerOutput {
  
  inline def apply(): CreateListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateListenerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateListenerOutput] (val x: Self) extends AnyVal {
    
    inline def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value*))
  }
}
