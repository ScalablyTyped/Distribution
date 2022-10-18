package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAdmChannelResponse extends StObject {
  
  var ADMChannelResponse: typings.awsSdk.clientsPinpointMod.ADMChannelResponse
}
object DeleteAdmChannelResponse {
  
  inline def apply(ADMChannelResponse: ADMChannelResponse): DeleteAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAdmChannelResponse]
  }
  
  extension [Self <: DeleteAdmChannelResponse](x: Self) {
    
    inline def setADMChannelResponse(value: ADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
