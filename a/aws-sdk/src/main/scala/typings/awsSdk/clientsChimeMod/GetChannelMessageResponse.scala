package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMessageResponse extends StObject {
  
  /**
    * The details of and content in the message.
    */
  var ChannelMessage: js.UndefOr[typings.awsSdk.clientsChimeMod.ChannelMessage] = js.undefined
}
object GetChannelMessageResponse {
  
  inline def apply(): GetChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelMessageResponse]
  }
  
  extension [Self <: GetChannelMessageResponse](x: Self) {
    
    inline def setChannelMessage(value: ChannelMessage): Self = StObject.set(x, "ChannelMessage", value.asInstanceOf[js.Any])
    
    inline def setChannelMessageUndefined: Self = StObject.set(x, "ChannelMessage", js.undefined)
  }
}
