package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendTextMessageResult extends StObject {
  
  /**
    * The unique identifier for the message.
    */
  var MessageId: js.UndefOr[String] = js.undefined
}
object SendTextMessageResult {
  
  inline def apply(): SendTextMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendTextMessageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendTextMessageResult] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
