package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameterGroupResponse extends StObject {
  
  /**
    * A user-specified message for this action (i.e., a reason for deleting the parameter group).
    */
  var DeletionMessage: js.UndefOr[String] = js.undefined
}
object DeleteParameterGroupResponse {
  
  inline def apply(): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameterGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setDeletionMessage(value: String): Self = StObject.set(x, "DeletionMessage", value.asInstanceOf[js.Any])
    
    inline def setDeletionMessageUndefined: Self = StObject.set(x, "DeletionMessage", js.undefined)
  }
}
