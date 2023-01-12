package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardResponse extends StObject {
  
  /**
    * Information about the dashboard.
    */
  var Dashboard: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Dashboard] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of this request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeDashboardResponse {
  
  inline def apply(): DescribeDashboardResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDashboardResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDashboardResponse] (val x: Self) extends AnyVal {
    
    inline def setDashboard(value: Dashboard): Self = StObject.set(x, "Dashboard", value.asInstanceOf[js.Any])
    
    inline def setDashboardUndefined: Self = StObject.set(x, "Dashboard", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
