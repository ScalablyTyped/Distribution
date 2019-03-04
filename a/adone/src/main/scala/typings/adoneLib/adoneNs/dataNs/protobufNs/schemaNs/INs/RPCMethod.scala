package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCMethod extends js.Object {
  var client_streaming: scala.Boolean
  var input_type: java.lang.String | scala.Null
  var name: java.lang.String
  var options: js.Object
  var output_type: java.lang.String | scala.Null
  var server_streaming: scala.Boolean
}

object RPCMethod {
  @scala.inline
  def apply(
    client_streaming: scala.Boolean,
    name: java.lang.String,
    options: js.Object,
    server_streaming: scala.Boolean,
    input_type: java.lang.String = null,
    output_type: java.lang.String = null
  ): RPCMethod = {
    val __obj = js.Dynamic.literal(client_streaming = client_streaming, name = name, options = options, server_streaming = server_streaming)
    if (input_type != null) __obj.updateDynamic("input_type")(input_type)
    if (output_type != null) __obj.updateDynamic("output_type")(output_type)
    __obj.asInstanceOf[RPCMethod]
  }
}

