package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRefreshSchedulesResponse extends StObject {
  
  /**
    * The list of refresh schedules for the dataset.
    */
  var RefreshSchedules: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RefreshSchedules] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListRefreshSchedulesResponse {
  
  inline def apply(): ListRefreshSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRefreshSchedulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRefreshSchedulesResponse] (val x: Self) extends AnyVal {
    
    inline def setRefreshSchedules(value: RefreshSchedules): Self = StObject.set(x, "RefreshSchedules", value.asInstanceOf[js.Any])
    
    inline def setRefreshSchedulesUndefined: Self = StObject.set(x, "RefreshSchedules", js.undefined)
    
    inline def setRefreshSchedulesVarargs(value: RefreshSchedule*): Self = StObject.set(x, "RefreshSchedules", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
