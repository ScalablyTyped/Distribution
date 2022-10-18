package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelRequest extends StObject {
  
  /**
    * The identifier for the channel you are working on.
    */
  var ChannelName: string
}
object DeleteChannelRequest {
  
  inline def apply(ChannelName: string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  extension [Self <: DeleteChannelRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
