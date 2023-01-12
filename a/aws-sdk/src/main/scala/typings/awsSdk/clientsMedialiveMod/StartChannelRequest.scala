package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChannelRequest extends StObject {
  
  /**
    * A request to start a channel
    */
  var ChannelId: string
}
object StartChannelRequest {
  
  inline def apply(ChannelId: string): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
