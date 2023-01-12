package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActionRequest extends StObject {
  
  /**
    * The name of the action to delete.
    */
  var ActionName: ExperimentEntityName
}
object DeleteActionRequest {
  
  inline def apply(ActionName: ExperimentEntityName): DeleteActionRequest = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: ExperimentEntityName): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
  }
}
