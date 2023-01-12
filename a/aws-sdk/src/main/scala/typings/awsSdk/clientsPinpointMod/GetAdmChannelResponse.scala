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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAdmChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setADMChannelResponse(value: ADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
