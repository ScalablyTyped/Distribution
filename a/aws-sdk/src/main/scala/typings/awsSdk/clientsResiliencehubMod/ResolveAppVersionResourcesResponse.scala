package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveAppVersionResourcesResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * The identifier for a specific resolution.
    */
  var resolutionId: String255
  
  /**
    * The status of the action.
    */
  var status: ResourceResolutionStatusType
}
object ResolveAppVersionResourcesResponse {
  
  inline def apply(
    appArn: Arn,
    appVersion: EntityVersion,
    resolutionId: String255,
    status: ResourceResolutionStatusType
  ): ResolveAppVersionResourcesResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], resolutionId = resolutionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAppVersionResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveAppVersionResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setResolutionId(value: String255): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResourceResolutionStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
