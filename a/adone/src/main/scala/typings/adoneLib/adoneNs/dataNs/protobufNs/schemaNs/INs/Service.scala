package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var methods: js.Array[RPCMethod]
  var name: java.lang.String
  var options: js.Object
}

object Service {
  @scala.inline
  def apply(methods: js.Array[RPCMethod], name: java.lang.String, options: js.Object): Service = {
    val __obj = js.Dynamic.literal(methods = methods, name = name, options = options)
  
    __obj.asInstanceOf[Service]
  }
}

