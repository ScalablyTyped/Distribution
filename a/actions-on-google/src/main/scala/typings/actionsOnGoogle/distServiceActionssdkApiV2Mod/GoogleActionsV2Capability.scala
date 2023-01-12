package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2Capability extends StObject {
  
  /**
    * The name of the capability, e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2Capability {
  
  inline def apply(): GoogleActionsV2Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Capability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2Capability] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
