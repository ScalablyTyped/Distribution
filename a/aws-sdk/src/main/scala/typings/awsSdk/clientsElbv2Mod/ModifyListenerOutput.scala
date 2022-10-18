package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyListenerOutput extends StObject {
  
  /**
    * Information about the modified listener.
    */
  var Listeners: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Listeners] = js.undefined
}
object ModifyListenerOutput {
  
  inline def apply(): ModifyListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyListenerOutput]
  }
  
  extension [Self <: ModifyListenerOutput](x: Self) {
    
    inline def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value*))
  }
}
