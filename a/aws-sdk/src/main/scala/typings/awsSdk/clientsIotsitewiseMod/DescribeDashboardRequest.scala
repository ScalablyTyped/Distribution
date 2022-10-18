package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardRequest extends StObject {
  
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID
}
object DescribeDashboardRequest {
  
  inline def apply(dashboardId: ID): DescribeDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardId = dashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardRequest]
  }
  
  extension [Self <: DescribeDashboardRequest](x: Self) {
    
    inline def setDashboardId(value: ID): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
  }
}
