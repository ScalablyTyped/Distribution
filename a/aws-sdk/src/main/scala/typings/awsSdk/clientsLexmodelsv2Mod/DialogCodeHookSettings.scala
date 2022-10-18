package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCodeHookSettings extends StObject {
  
  /**
    * Enables the dialog code hook so that it processes user requests.
    */
  var enabled: Boolean
}
object DialogCodeHookSettings {
  
  inline def apply(enabled: Boolean): DialogCodeHookSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCodeHookSettings]
  }
  
  extension [Self <: DialogCodeHookSettings](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
