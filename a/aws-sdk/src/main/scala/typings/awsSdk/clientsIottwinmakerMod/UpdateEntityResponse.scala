package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEntityResponse extends StObject {
  
  /**
    * The current state of the entity update.
    */
  var state: State
  
  /**
    * The date and time when the entity was last updated.
    */
  var updateDateTime: js.Date
}
object UpdateEntityResponse {
  
  inline def apply(state: State, updateDateTime: js.Date): UpdateEntityResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityResponse]
  }
  
  extension [Self <: UpdateEntityResponse](x: Self) {
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
  }
}
