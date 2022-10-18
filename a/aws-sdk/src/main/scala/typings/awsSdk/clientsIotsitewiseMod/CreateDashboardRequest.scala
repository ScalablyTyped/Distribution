package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDashboardRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The dashboard definition specified in a JSON literal. For detailed information, see Creating dashboards (CLI) in the IoT SiteWise User Guide.
    */
  var dashboardDefinition: DashboardDefinition
  
  /**
    * A description for the dashboard.
    */
  var dashboardDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * A friendly name for the dashboard.
    */
  var dashboardName: Name
  
  /**
    * The ID of the project in which to create the dashboard.
    */
  var projectId: ID
  
  /**
    * A list of key-value pairs that contain metadata for the dashboard. For more information, see Tagging your IoT SiteWise resources in the IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDashboardRequest {
  
  inline def apply(dashboardDefinition: DashboardDefinition, dashboardName: Name, projectId: ID): CreateDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardDefinition = dashboardDefinition.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardRequest]
  }
  
  extension [Self <: CreateDashboardRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDashboardDefinition(value: DashboardDefinition): Self = StObject.set(x, "dashboardDefinition", value.asInstanceOf[js.Any])
    
    inline def setDashboardDescription(value: Description): Self = StObject.set(x, "dashboardDescription", value.asInstanceOf[js.Any])
    
    inline def setDashboardDescriptionUndefined: Self = StObject.set(x, "dashboardDescription", js.undefined)
    
    inline def setDashboardName(value: Name): Self = StObject.set(x, "dashboardName", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
