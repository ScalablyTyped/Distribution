package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedactChannelMessageResponse extends StObject {
  
  /**
    * The ARN of the channel containing the messages that you want to redact.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ID of the message being redacted.
    */
  var MessageId: js.UndefOr[typings.awsSdk.clientsChimeMod.MessageId] = js.undefined
}
object RedactChannelMessageResponse {
  
  inline def apply(): RedactChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactChannelMessageResponse]
  }
  
  extension [Self <: RedactChannelMessageResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
