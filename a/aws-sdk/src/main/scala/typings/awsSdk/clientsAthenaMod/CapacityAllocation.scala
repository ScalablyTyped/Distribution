package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityAllocation extends StObject {
  
  /**
    * The time when the capacity allocation request was completed.
    */
  var RequestCompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the capacity allocation was requested.
    */
  var RequestTime: js.Date
  
  /**
    * The status of the capacity allocation.
    */
  var Status: CapacityAllocationStatus
  
  /**
    * The status message of the capacity allocation.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object CapacityAllocation {
  
  inline def apply(RequestTime: js.Date, Status: CapacityAllocationStatus): CapacityAllocation = {
    val __obj = js.Dynamic.literal(RequestTime = RequestTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityAllocation] (val x: Self) extends AnyVal {
    
    inline def setRequestCompletionTime(value: js.Date): Self = StObject.set(x, "RequestCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setRequestCompletionTimeUndefined: Self = StObject.set(x, "RequestCompletionTime", js.undefined)
    
    inline def setRequestTime(value: js.Date): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CapacityAllocationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
