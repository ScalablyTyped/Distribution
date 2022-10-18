package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelRequest extends StObject {
  
  /**
    * Unique ID of the channel.
    */
  var ChannelId: string
}
object DeleteChannelRequest {
  
  inline def apply(ChannelId: string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  extension [Self <: DeleteChannelRequest](x: Self) {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
