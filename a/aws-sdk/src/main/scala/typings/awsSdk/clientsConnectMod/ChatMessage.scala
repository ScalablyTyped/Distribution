package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessage extends StObject {
  
  /**
    * The content of the chat message.
    */
  var Content: ChatContent
  
  /**
    * The type of the content. Supported types are text/plain.
    */
  var ContentType: ChatContentType
}
object ChatMessage {
  
  inline def apply(Content: ChatContent, ContentType: ChatContentType): ChatMessage = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessage]
  }
  
  extension [Self <: ChatMessage](x: Self) {
    
    inline def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
  }
}
