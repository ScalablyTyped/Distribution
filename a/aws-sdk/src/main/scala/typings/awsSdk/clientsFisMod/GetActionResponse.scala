package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionResponse extends StObject {
  
  /**
    * Information about the action.
    */
  var action: js.UndefOr[Action] = js.undefined
}
object GetActionResponse {
  
  inline def apply(): GetActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetActionResponse] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
