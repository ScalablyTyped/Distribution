package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelResponse extends StObject {
  
  /**
    * 
    */
  var channel: js.UndefOr[Channel] = js.undefined
}
object GetChannelResponse {
  
  inline def apply(): GetChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelResponse]
  }
  
  extension [Self <: GetChannelResponse](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
