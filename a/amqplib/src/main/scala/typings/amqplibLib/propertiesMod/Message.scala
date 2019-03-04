package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var content: nodeLib.Buffer
  var fields: MessageFields
  var properties: MessageProperties
}

object Message {
  @scala.inline
  def apply(content: nodeLib.Buffer, fields: MessageFields, properties: MessageProperties): Message = {
    val __obj = js.Dynamic.literal(content = content, fields = fields, properties = properties)
  
    __obj.asInstanceOf[Message]
  }
}

