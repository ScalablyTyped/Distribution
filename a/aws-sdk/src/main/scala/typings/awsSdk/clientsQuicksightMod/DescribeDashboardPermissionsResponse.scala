package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardPermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * A structure that contains the configuration of a shareable link that grants access to the dashboard. Your users can use the link to view and interact with the dashboard, if the dashboard has been shared with them. For more information about sharing dashboards, see Sharing Dashboards.
    */
  var LinkSharingConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LinkSharingConfiguration] = js.undefined
  
  /**
    * A structure that contains the permissions for the dashboard.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeDashboardPermissionsResponse {
  
  inline def apply(): DescribeDashboardPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDashboardPermissionsResponse]
  }
  
  extension [Self <: DescribeDashboardPermissionsResponse](x: Self) {
    
    inline def setDashboardArn(value: Arn): Self = StObject.set(x, "DashboardArn", value.asInstanceOf[js.Any])
    
    inline def setDashboardArnUndefined: Self = StObject.set(x, "DashboardArn", js.undefined)
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardIdUndefined: Self = StObject.set(x, "DashboardId", js.undefined)
    
    inline def setLinkSharingConfiguration(value: LinkSharingConfiguration): Self = StObject.set(x, "LinkSharingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLinkSharingConfigurationUndefined: Self = StObject.set(x, "LinkSharingConfiguration", js.undefined)
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
