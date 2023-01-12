package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDashboardRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The new dashboard definition, as specified in a JSON literal. For detailed information, see Creating dashboards (CLI) in the IoT SiteWise User Guide.
    */
  var dashboardDefinition: DashboardDefinition
  
  /**
    * A new description for the dashboard.
    */
  var dashboardDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the dashboard to update.
    */
  var dashboardId: ID
  
  /**
    * A new friendly name for the dashboard.
    */
  var dashboardName: Name
}
object UpdateDashboardRequest {
  
  inline def apply(dashboardDefinition: DashboardDefinition, dashboardId: ID, dashboardName: Name): UpdateDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardId = dashboardId.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDashboardRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDashboardDefinition(value: DashboardDefinition): Self = StObject.set(x, "dashboardDefinition", value.asInstanceOf[js.Any])
    
    inline def setDashboardDescription(value: Description): Self = StObject.set(x, "dashboardDescription", value.asInstanceOf[js.Any])
    
    inline def setDashboardDescriptionUndefined: Self = StObject.set(x, "dashboardDescription", js.undefined)
    
    inline def setDashboardId(value: ID): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardName(value: Name): Self = StObject.set(x, "dashboardName", value.asInstanceOf[js.Any])
  }
}
