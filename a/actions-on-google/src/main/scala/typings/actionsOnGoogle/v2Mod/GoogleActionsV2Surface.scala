package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Surface extends StObject {
  
  /**
    * A list of capabilities the surface supports at the time of the request
    * e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var capabilities: js.UndefOr[js.Array[GoogleActionsV2Capability]] = js.native
}
object GoogleActionsV2Surface {
  
  @scala.inline
  def apply(): GoogleActionsV2Surface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Surface]
  }
  
  @scala.inline
  implicit class GoogleActionsV2SurfaceMutableBuilder[Self <: GoogleActionsV2Surface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: js.Array[GoogleActionsV2Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: GoogleActionsV2Capability*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
  }
}
