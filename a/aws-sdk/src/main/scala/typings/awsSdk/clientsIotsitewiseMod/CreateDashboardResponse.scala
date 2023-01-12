package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDashboardResponse extends StObject {
  
  /**
    * The ARN of the dashboard, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:dashboard/${DashboardId} 
    */
  var dashboardArn: ARN
  
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID
}
object CreateDashboardResponse {
  
  inline def apply(dashboardArn: ARN, dashboardId: ID): CreateDashboardResponse = {
    val __obj = js.Dynamic.literal(dashboardArn = dashboardArn.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDashboardResponse] (val x: Self) extends AnyVal {
    
    inline def setDashboardArn(value: ARN): Self = StObject.set(x, "dashboardArn", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: ID): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
  }
}
