package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedProfilePageRequest extends StObject {
  
  var getHostedProfilePageRequest: typings.authorizenet.mod.APIContracts.GetHostedProfilePageRequest
}
object GetHostedProfilePageRequest {
  
  inline def apply(getHostedProfilePageRequest: typings.authorizenet.mod.APIContracts.GetHostedProfilePageRequest): GetHostedProfilePageRequest = {
    val __obj = js.Dynamic.literal(getHostedProfilePageRequest = getHostedProfilePageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedProfilePageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHostedProfilePageRequest] (val x: Self) extends AnyVal {
    
    inline def setGetHostedProfilePageRequest(value: typings.authorizenet.mod.APIContracts.GetHostedProfilePageRequest): Self = StObject.set(x, "getHostedProfilePageRequest", value.asInstanceOf[js.Any])
  }
}
