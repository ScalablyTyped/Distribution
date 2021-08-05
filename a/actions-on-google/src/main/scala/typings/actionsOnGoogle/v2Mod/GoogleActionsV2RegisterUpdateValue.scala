package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2RegisterUpdateValue extends StObject {
  
  /**
    * The status of the registering the update requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2RegisterUpdateValueStatus] = js.undefined
}
object GoogleActionsV2RegisterUpdateValue {
  
  inline def apply(): GoogleActionsV2RegisterUpdateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValue]
  }
  
  extension [Self <: GoogleActionsV2RegisterUpdateValue](x: Self) {
    
    inline def setStatus(value: GoogleActionsV2RegisterUpdateValueStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
