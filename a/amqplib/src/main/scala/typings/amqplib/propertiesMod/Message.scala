package typings.amqplib.propertiesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var content: Buffer = js.native
  
  var fields: MessageFields = js.native
  
  var properties: MessageProperties = js.native
}
object Message {
  
  @scala.inline
  def apply(content: Buffer, fields: MessageFields, properties: MessageProperties): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: MessageFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: MessageProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
