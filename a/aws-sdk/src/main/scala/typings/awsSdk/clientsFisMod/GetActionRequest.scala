package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionRequest extends StObject {
  
  /**
    * The ID of the action.
    */
  var id: ActionId
}
object GetActionRequest {
  
  inline def apply(id: ActionId): GetActionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetActionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ActionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
