package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  var message: Message
  var name: java.lang.String
}

object Extend {
  @scala.inline
  def apply(message: Message, name: java.lang.String): Extend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Extend]
  }
}

