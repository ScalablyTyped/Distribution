package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchScheduleActionDeleteRequest extends StObject {
  
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: listOfString
}
object BatchScheduleActionDeleteRequest {
  
  inline def apply(ActionNames: listOfString): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchScheduleActionDeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setActionNames(value: listOfString): Self = StObject.set(x, "ActionNames", value.asInstanceOf[js.Any])
    
    inline def setActionNamesVarargs(value: string*): Self = StObject.set(x, "ActionNames", js.Array(value*))
  }
}
