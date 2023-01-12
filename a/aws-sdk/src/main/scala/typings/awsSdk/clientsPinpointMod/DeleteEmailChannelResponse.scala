package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailChannelResponse extends StObject {
  
  var EmailChannelResponse: typings.awsSdk.clientsPinpointMod.EmailChannelResponse
}
object DeleteEmailChannelResponse {
  
  inline def apply(EmailChannelResponse: EmailChannelResponse): DeleteEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEmailChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setEmailChannelResponse(value: EmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
  }
}
