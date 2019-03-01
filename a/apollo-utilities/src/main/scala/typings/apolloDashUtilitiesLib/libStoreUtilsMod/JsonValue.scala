package typings
package apolloDashUtilitiesLib.libStoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonValue extends js.Object {
  var json: js.Any
  var `type`: apolloDashUtilitiesLib.apolloDashUtilitiesLibStrings.json
}

object JsonValue {
  @scala.inline
  def apply(json: js.Any, `type`: apolloDashUtilitiesLib.apolloDashUtilitiesLibStrings.json): JsonValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[JsonValue]
  }
}

