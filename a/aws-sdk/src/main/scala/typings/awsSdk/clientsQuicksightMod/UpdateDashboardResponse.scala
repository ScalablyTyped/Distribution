package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDashboardResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The creation status of the request.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ARN of the dashboard, including the version number.
    */
  var VersionArn: js.UndefOr[Arn] = js.undefined
}
object UpdateDashboardResponse {
  
  inline def apply(): UpdateDashboardResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDashboardResponse]
  }
  
  extension [Self <: UpdateDashboardResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationStatus(value: ResourceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardIdUndefined: Self = StObject.set(x, "DashboardId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersionArn(value: Arn): Self = StObject.set(x, "VersionArn", value.asInstanceOf[js.Any])
    
    inline def setVersionArnUndefined: Self = StObject.set(x, "VersionArn", js.undefined)
  }
}
