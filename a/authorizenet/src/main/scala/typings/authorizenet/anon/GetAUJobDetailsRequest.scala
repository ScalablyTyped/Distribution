package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAUJobDetailsRequest extends StObject {
  
  var getAUJobDetailsRequest: typings.authorizenet.mod.APIContracts.GetAUJobDetailsRequest
}
object GetAUJobDetailsRequest {
  
  inline def apply(getAUJobDetailsRequest: typings.authorizenet.mod.APIContracts.GetAUJobDetailsRequest): GetAUJobDetailsRequest = {
    val __obj = js.Dynamic.literal(getAUJobDetailsRequest = getAUJobDetailsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAUJobDetailsRequest]
  }
  
  extension [Self <: GetAUJobDetailsRequest](x: Self) {
    
    inline def setGetAUJobDetailsRequest(value: typings.authorizenet.mod.APIContracts.GetAUJobDetailsRequest): Self = StObject.set(x, "getAUJobDetailsRequest", value.asInstanceOf[js.Any])
  }
}
