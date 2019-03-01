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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[GetMessage]
  }
}

