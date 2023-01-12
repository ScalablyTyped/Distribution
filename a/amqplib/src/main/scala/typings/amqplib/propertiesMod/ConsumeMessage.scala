package typings.amqplib.propertiesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumeMessage
  extends StObject
     with Message {
  
  @JSName("fields")
  var fields_ConsumeMessage: ConsumeMessageFields
}
object ConsumeMessage {
  
  inline def apply(content: Buffer, fields: ConsumeMessageFields, properties: MessageProperties): ConsumeMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumeMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumeMessage] (val x: Self) extends AnyVal {
    
    inline def setFields(value: ConsumeMessageFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
