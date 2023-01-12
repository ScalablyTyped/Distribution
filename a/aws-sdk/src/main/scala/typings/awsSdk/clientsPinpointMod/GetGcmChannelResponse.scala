package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGcmChannelResponse extends StObject {
  
  var GCMChannelResponse: typings.awsSdk.clientsPinpointMod.GCMChannelResponse
}
object GetGcmChannelResponse {
  
  inline def apply(GCMChannelResponse: GCMChannelResponse): GetGcmChannelResponse = {
    val __obj = js.Dynamic.literal(GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGcmChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGcmChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setGCMChannelResponse(value: GCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
  }
}
