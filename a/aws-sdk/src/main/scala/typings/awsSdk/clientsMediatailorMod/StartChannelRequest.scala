package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChannelRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: _String
}
object StartChannelRequest {
  
  inline def apply(ChannelName: _String): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChannelRequest]
  }
  
  extension [Self <: StartChannelRequest](x: Self) {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
