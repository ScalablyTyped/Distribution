package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteControlRequest extends StObject {
  
  /**
    *  The unique identifier for the control. 
    */
  var controlId: UUID
}
object DeleteControlRequest {
  
  inline def apply(controlId: UUID): DeleteControlRequest = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteControlRequest] (val x: Self) extends AnyVal {
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
  }
}
