package typings.amqplib.propertiesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumeMessage extends Message {
  
  @JSName("fields")
  var fields_ConsumeMessage: ConsumeMessageFields = js.native
}
object ConsumeMessage {
  
  @scala.inline
  def apply(content: Buffer, fields: ConsumeMessageFields, properties: MessageProperties): ConsumeMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumeMessage]
  }
  
  @scala.inline
  implicit class ConsumeMessageMutableBuilder[Self <: ConsumeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: ConsumeMessageFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
