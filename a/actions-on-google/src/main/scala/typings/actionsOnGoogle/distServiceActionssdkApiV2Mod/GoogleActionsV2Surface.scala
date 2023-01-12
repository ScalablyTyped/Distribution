package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2Surface extends StObject {
  
  /**
    * A list of capabilities the surface supports at the time of the request
    * e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var capabilities: js.UndefOr[js.Array[GoogleActionsV2Capability]] = js.undefined
}
object GoogleActionsV2Surface {
  
  inline def apply(): GoogleActionsV2Surface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Surface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2Surface] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: js.Array[GoogleActionsV2Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: GoogleActionsV2Capability*): Self = StObject.set(x, "capabilities", js.Array(value*))
  }
}
