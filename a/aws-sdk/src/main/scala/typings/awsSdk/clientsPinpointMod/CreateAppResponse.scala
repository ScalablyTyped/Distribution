package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppResponse extends StObject {
  
  var ApplicationResponse: typings.awsSdk.clientsPinpointMod.ApplicationResponse
}
object CreateAppResponse {
  
  inline def apply(ApplicationResponse: ApplicationResponse): CreateAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  extension [Self <: CreateAppResponse](x: Self) {
    
    inline def setApplicationResponse(value: ApplicationResponse): Self = StObject.set(x, "ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
