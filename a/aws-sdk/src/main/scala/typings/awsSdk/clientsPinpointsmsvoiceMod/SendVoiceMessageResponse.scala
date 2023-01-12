package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVoiceMessageResponse extends StObject {
  
  /**
    * A unique identifier for the voice message.
    */
  var MessageId: js.UndefOr[String] = js.undefined
}
object SendVoiceMessageResponse {
  
  inline def apply(): SendVoiceMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendVoiceMessageResponse] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
