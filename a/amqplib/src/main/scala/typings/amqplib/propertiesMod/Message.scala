package typings.amqplib.propertiesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: MessageFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: MessageProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
