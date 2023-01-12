package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetControlRequest extends StObject {
  
  /**
    *  The identifier for the control. 
    */
  var controlId: UUID
}
object GetControlRequest {
  
  inline def apply(controlId: UUID): GetControlRequest = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetControlRequest] (val x: Self) extends AnyVal {
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
  }
}
