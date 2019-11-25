package typings.amqplib.propertiesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var content: Buffer
  var fields: MessageFields
  var properties: MessageProperties
}

object Message {
  @scala.inline
  def apply(content: Buffer, fields: MessageFields, properties: MessageProperties): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

