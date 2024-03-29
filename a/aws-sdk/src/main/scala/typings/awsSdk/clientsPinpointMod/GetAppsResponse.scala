package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppsResponse extends StObject {
  
  var ApplicationsResponse: typings.awsSdk.clientsPinpointMod.ApplicationsResponse
}
object GetAppsResponse {
  
  inline def apply(ApplicationsResponse: ApplicationsResponse): GetAppsResponse = {
    val __obj = js.Dynamic.literal(ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAppsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationsResponse(value: ApplicationsResponse): Self = StObject.set(x, "ApplicationsResponse", value.asInstanceOf[js.Any])
  }
}
