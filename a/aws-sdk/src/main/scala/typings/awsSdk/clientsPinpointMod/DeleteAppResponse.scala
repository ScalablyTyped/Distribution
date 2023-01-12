package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppResponse extends StObject {
  
  var ApplicationResponse: typings.awsSdk.clientsPinpointMod.ApplicationResponse
}
object DeleteAppResponse {
  
  inline def apply(ApplicationResponse: ApplicationResponse): DeleteAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationResponse(value: ApplicationResponse): Self = StObject.set(x, "ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
