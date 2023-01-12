package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDashboardPermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * Updates the permissions of a shared link to an Amazon QuickSight dashboard.
    */
  var LinkSharingConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LinkSharingConfiguration] = js.undefined
  
  /**
    * Information about the permissions on the dashboard.
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
object UpdateDashboardPermissionsResponse {
  
  inline def apply(): UpdateDashboardPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDashboardPermissionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDashboardPermissionsResponse] (val x: Self) extends AnyVal {
    
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
