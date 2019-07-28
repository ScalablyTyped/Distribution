package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deserializer extends js.Object {
  var name: String
  def deserialize(state: js.Object): js.Object
}

object Deserializer {
  @scala.inline
  def apply(deserialize: js.Object => js.Object, name: String): Deserializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), name = name)
  
    __obj.asInstanceOf[Deserializer]
  }
}

