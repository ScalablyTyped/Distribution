package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppResponse extends StObject {
  
  var ApplicationResponse: typings.awsSdk.clientsPinpointMod.ApplicationResponse
}
object GetAppResponse {
  
  inline def apply(ApplicationResponse: ApplicationResponse): GetAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAppResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationResponse(value: ApplicationResponse): Self = StObject.set(x, "ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
