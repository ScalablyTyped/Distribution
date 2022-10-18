package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * A message in a custom format defined by the client application.
    */
  var customPayload: js.UndefOr[CustomPayload] = js.undefined
  
  /**
    * A message that defines a response card that the client application can show to the user.
    */
  var imageResponseCard: js.UndefOr[ImageResponseCard] = js.undefined
  
  /**
    * A message in plain text format.
    */
  var plainTextMessage: js.UndefOr[PlainTextMessage] = js.undefined
  
  /**
    * A message in Speech Synthesis Markup Language (SSML).
    */
  var ssmlMessage: js.UndefOr[SSMLMessage] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setCustomPayload(value: CustomPayload): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
    
    inline def setCustomPayloadUndefined: Self = StObject.set(x, "customPayload", js.undefined)
    
    inline def setImageResponseCard(value: ImageResponseCard): Self = StObject.set(x, "imageResponseCard", value.asInstanceOf[js.Any])
    
    inline def setImageResponseCardUndefined: Self = StObject.set(x, "imageResponseCard", js.undefined)
    
    inline def setPlainTextMessage(value: PlainTextMessage): Self = StObject.set(x, "plainTextMessage", value.asInstanceOf[js.Any])
    
    inline def setPlainTextMessageUndefined: Self = StObject.set(x, "plainTextMessage", js.undefined)
    
    inline def setSsmlMessage(value: SSMLMessage): Self = StObject.set(x, "ssmlMessage", value.asInstanceOf[js.Any])
    
    inline def setSsmlMessageUndefined: Self = StObject.set(x, "ssmlMessage", js.undefined)
  }
}
