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
  
  extension [Self <: GetActionRequest](x: Self) {
    
    inline def setId(value: ActionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
