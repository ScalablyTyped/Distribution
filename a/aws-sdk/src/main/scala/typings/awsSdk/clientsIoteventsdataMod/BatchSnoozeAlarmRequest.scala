package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSnoozeAlarmRequest extends StObject {
  
  /**
    * The list of snooze action requests. You can specify up to 10 requests per operation.
    */
  var snoozeActionRequests: SnoozeAlarmActionRequests
}
object BatchSnoozeAlarmRequest {
  
  inline def apply(snoozeActionRequests: SnoozeAlarmActionRequests): BatchSnoozeAlarmRequest = {
    val __obj = js.Dynamic.literal(snoozeActionRequests = snoozeActionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSnoozeAlarmRequest]
  }
  
  extension [Self <: BatchSnoozeAlarmRequest](x: Self) {
    
    inline def setSnoozeActionRequests(value: SnoozeAlarmActionRequests): Self = StObject.set(x, "snoozeActionRequests", value.asInstanceOf[js.Any])
    
    inline def setSnoozeActionRequestsVarargs(value: SnoozeAlarmActionRequest*): Self = StObject.set(x, "snoozeActionRequests", js.Array(value*))
  }
}
