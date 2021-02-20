package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Capability extends StObject {
  
  /**
    * The name of the capability, e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleActionsV2Capability {
  
  @scala.inline
  def apply(): GoogleActionsV2Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Capability]
  }
  
  @scala.inline
  implicit class GoogleActionsV2CapabilityMutableBuilder[Self <: GoogleActionsV2Capability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
