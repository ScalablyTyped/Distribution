package typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  var name: String
  var options: js.Object
  var values: js.Object
}

object Enum {
  @scala.inline
  def apply(name: String, options: js.Object, values: js.Object): Enum = {
    val __obj = js.Dynamic.literal(name = name, options = options, values = values)
  
    __obj.asInstanceOf[Enum]
  }
}

