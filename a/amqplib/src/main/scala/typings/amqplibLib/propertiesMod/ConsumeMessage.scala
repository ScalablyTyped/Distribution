package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumeMessage extends Message {
  @JSName("fields")
  var fields_ConsumeMessage: ConsumeMessageFields
}

object ConsumeMessage {
  @scala.inline
  def apply(content: nodeLib.Buffer, fields: ConsumeMessageFields, properties: MessageProperties): ConsumeMessage = {
    val __obj = js.Dynamic.literal(content = content, fields = fields, properties = properties)
  
    __obj.asInstanceOf[ConsumeMessage]
  }
}

