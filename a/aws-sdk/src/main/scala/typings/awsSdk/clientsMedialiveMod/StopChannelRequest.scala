package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopChannelRequest extends StObject {
  
  /**
    * A request to stop a running channel
    */
  var ChannelId: string
}
object StopChannelRequest {
  
  inline def apply(ChannelId: string): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopChannelRequest]
  }
  
  extension [Self <: StopChannelRequest](x: Self) {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
