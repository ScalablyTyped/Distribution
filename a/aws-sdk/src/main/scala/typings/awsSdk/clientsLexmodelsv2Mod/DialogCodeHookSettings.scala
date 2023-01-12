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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogCodeHookSettings] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
