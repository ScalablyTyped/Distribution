package typings
package adoneLib.adoneNs.dataNs.jsonNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareValue extends js.Object {
  var key: java.lang.String
  var value: js.Any
}

object CompareValue {
  @scala.inline
  def apply(key: java.lang.String, value: js.Any): CompareValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CompareValue]
  }
}

