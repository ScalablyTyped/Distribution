package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChannelRequest extends StObject {
  
  /**
    * The identifier for the channel you are working on.
    */
  var ChannelName: string
}
object StartChannelRequest {
  
  inline def apply(ChannelName: string): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChannelRequest]
  }
  
  extension [Self <: StartChannelRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
