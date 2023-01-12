package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAdmChannelResponse extends StObject {
  
  var ADMChannelResponse: typings.awsSdk.clientsPinpointMod.ADMChannelResponse
}
object UpdateAdmChannelResponse {
  
  inline def apply(ADMChannelResponse: ADMChannelResponse): UpdateAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAdmChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setADMChannelResponse(value: ADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
