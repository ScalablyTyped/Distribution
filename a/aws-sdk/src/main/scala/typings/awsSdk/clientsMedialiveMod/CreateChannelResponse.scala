package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelResponse extends StObject {
  
  var Channel: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Channel] = js.undefined
}
object CreateChannelResponse {
  
  inline def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  
  extension [Self <: CreateChannelResponse](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
  }
}
