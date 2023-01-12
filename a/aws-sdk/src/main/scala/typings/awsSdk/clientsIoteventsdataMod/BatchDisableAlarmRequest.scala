package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisableAlarmRequest extends StObject {
  
  /**
    * The list of disable action requests. You can specify up to 10 requests per operation.
    */
  var disableActionRequests: DisableAlarmActionRequests
}
object BatchDisableAlarmRequest {
  
  inline def apply(disableActionRequests: DisableAlarmActionRequests): BatchDisableAlarmRequest = {
    val __obj = js.Dynamic.literal(disableActionRequests = disableActionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisableAlarmRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisableAlarmRequest] (val x: Self) extends AnyVal {
    
    inline def setDisableActionRequests(value: DisableAlarmActionRequests): Self = StObject.set(x, "disableActionRequests", value.asInstanceOf[js.Any])
    
    inline def setDisableActionRequestsVarargs(value: DisableAlarmActionRequest*): Self = StObject.set(x, "disableActionRequests", js.Array(value*))
  }
}
