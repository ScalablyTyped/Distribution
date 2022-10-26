package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopChannelRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: string
}
object StopChannelRequest {
  
  inline def apply(ChannelName: string): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopChannelRequest]
  }
  
  extension [Self <: StopChannelRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
