package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelResponse extends StObject {
  
  var channel: js.UndefOr[Channel] = js.undefined
}
object UpdateChannelResponse {
  
  inline def apply(): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelResponse]
  }
  
  extension [Self <: UpdateChannelResponse](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
