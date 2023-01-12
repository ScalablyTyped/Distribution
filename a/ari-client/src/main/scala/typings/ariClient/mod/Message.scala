package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The unique ID for the Asterisk instance that raised this event.
    */
  var asterisk_id: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the type of this message.
    */
  var `type`: String
}
object Message {
  
  inline def apply(`type`: String): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setAsterisk_id(value: String): Self = StObject.set(x, "asterisk_id", value.asInstanceOf[js.Any])
    
    inline def setAsterisk_idUndefined: Self = StObject.set(x, "asterisk_id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
