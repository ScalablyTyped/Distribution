package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  /**
    * The unique ID for the Asterisk instance that raised this event.
    */
  var asterisk_id: js.UndefOr[String] = js.native
  
  /**
    * Indicates the type of this message.
    */
  var `type`: String = js.native
}
object Message {
  
  @scala.inline
  def apply(`type`: String): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsterisk_id(value: String): Self = StObject.set(x, "asterisk_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsterisk_idUndefined: Self = StObject.set(x, "asterisk_id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
