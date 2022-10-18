package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceMessageContent extends StObject {
  
  var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.undefined
  
  var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.undefined
  
  var SSMLMessage: js.UndefOr[SSMLMessageType] = js.undefined
}
object VoiceMessageContent {
  
  inline def apply(): VoiceMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessageContent]
  }
  
  extension [Self <: VoiceMessageContent](x: Self) {
    
    inline def setCallInstructionsMessage(value: CallInstructionsMessageType): Self = StObject.set(x, "CallInstructionsMessage", value.asInstanceOf[js.Any])
    
    inline def setCallInstructionsMessageUndefined: Self = StObject.set(x, "CallInstructionsMessage", js.undefined)
    
    inline def setPlainTextMessage(value: PlainTextMessageType): Self = StObject.set(x, "PlainTextMessage", value.asInstanceOf[js.Any])
    
    inline def setPlainTextMessageUndefined: Self = StObject.set(x, "PlainTextMessage", js.undefined)
    
    inline def setSSMLMessage(value: SSMLMessageType): Self = StObject.set(x, "SSMLMessage", value.asInstanceOf[js.Any])
    
    inline def setSSMLMessageUndefined: Self = StObject.set(x, "SSMLMessage", js.undefined)
  }
}
