package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMessage extends Message {
  @JSName("fields")
  var fields_GetMessage: GetMessageFields
}

object GetMessage {
  @scala.inline
  def apply(content: nodeLib.Buffer, fields: GetMessageFields, properties: MessageProperties): GetMessage = {
    val __obj = js.Dynamic.literal(content = content, fields = fields, properties = properties)
  
    __obj.asInstanceOf[GetMessage]
  }
}

