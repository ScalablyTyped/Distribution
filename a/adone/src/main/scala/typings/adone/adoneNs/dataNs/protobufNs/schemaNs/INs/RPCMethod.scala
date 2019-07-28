package typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCMethod extends js.Object {
  var client_streaming: Boolean
  var input_type: String | Null
  var name: String
  var options: js.Object
  var output_type: String | Null
  var server_streaming: Boolean
}

object RPCMethod {
  @scala.inline
  def apply(
    client_streaming: Boolean,
    name: String,
    options: js.Object,
    server_streaming: Boolean,
    input_type: String = null,
    output_type: String = null
  ): RPCMethod = {
    val __obj = js.Dynamic.literal(client_streaming = client_streaming, name = name, options = options, server_streaming = server_streaming)
    if (input_type != null) __obj.updateDynamic("input_type")(input_type)
    if (output_type != null) __obj.updateDynamic("output_type")(output_type)
    __obj.asInstanceOf[RPCMethod]
  }
}

