package typings.amqplib.propertiesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumeMessage extends Message {
  @JSName("fields")
  var fields_ConsumeMessage: ConsumeMessageFields
}

object ConsumeMessage {
  @scala.inline
  def apply(content: Buffer, fields: ConsumeMessageFields, properties: MessageProperties): ConsumeMessage = {
    val __obj = js.Dynamic.literal(content = content, fields = fields, properties = properties)
  
    __obj.asInstanceOf[ConsumeMessage]
  }
}

