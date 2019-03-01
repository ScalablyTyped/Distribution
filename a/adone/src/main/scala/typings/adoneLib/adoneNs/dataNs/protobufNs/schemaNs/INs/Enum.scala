package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  var name: java.lang.String
  var options: js.Object
  var values: js.Object
}

object Enum {
  @scala.inline
  def apply(name: java.lang.String, options: js.Object, values: js.Object): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Enum]
  }
}

