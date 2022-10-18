package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdmChannelResponse extends StObject {
  
  var ADMChannelResponse: typings.awsSdk.clientsPinpointMod.ADMChannelResponse
}
object GetAdmChannelResponse {
  
  inline def apply(ADMChannelResponse: ADMChannelResponse): GetAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdmChannelResponse]
  }
  
  extension [Self <: GetAdmChannelResponse](x: Self) {
    
    inline def setADMChannelResponse(value: ADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
