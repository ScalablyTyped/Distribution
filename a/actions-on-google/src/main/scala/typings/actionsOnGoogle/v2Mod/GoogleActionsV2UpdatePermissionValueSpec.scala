package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UpdatePermissionValueSpec extends StObject {
  
  /**
    * The list of arguments necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
  
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.native
}
object GoogleActionsV2UpdatePermissionValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2UpdatePermissionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UpdatePermissionValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UpdatePermissionValueSpecMutableBuilder[Self <: GoogleActionsV2UpdatePermissionValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
