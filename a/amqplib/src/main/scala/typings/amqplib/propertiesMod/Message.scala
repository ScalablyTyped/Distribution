package typings.amqplib.propertiesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var content: Buffer
  
  var fields: MessageFields
  
  var properties: MessageProperties
}
object Message {
  
  inline def apply(content: Buffer, fields: MessageFields, properties: MessageProperties): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFields(value: MessageFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: MessageProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
