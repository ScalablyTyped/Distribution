package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UpdatePermissionValueSpec extends StObject {
  
  /**
    * The list of arguments necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UpdatePermissionValueSpec {
  
  inline def apply(): GoogleActionsV2UpdatePermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UpdatePermissionValueSpec]
  }
  
  extension [Self <: GoogleActionsV2UpdatePermissionValueSpec](x: Self) {
    
    inline def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
