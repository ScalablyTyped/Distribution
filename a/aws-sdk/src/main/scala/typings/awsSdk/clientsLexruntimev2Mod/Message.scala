package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The text of the message.
    */
  var content: js.UndefOr[Text] = js.undefined
  
  /**
    * Indicates the type of response.
    */
  var contentType: MessageContentType
  
  var imageResponseCard: js.UndefOr[ImageResponseCard] = js.undefined
}
object Message {
  
  inline def apply(contentType: MessageContentType): Message = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setContent(value: Text): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: MessageContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setImageResponseCard(value: ImageResponseCard): Self = StObject.set(x, "imageResponseCard", value.asInstanceOf[js.Any])
    
    inline def setImageResponseCardUndefined: Self = StObject.set(x, "imageResponseCard", js.undefined)
  }
}
