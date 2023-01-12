package typings.amqplib.propertiesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessage
  extends StObject
     with Message {
  
  @JSName("fields")
  var fields_GetMessage: GetMessageFields
}
object GetMessage {
  
  inline def apply(content: Buffer, fields: GetMessageFields, properties: MessageProperties): GetMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMessage] (val x: Self) extends AnyVal {
    
    inline def setFields(value: GetMessageFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
