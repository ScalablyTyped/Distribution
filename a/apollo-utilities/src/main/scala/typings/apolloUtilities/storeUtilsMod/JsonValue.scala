package typings.apolloUtilities.storeUtilsMod

import typings.apolloUtilities.apolloUtilitiesStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonValue extends _StoreValue {
  var json: js.Any
  var `type`: json
}

object JsonValue {
  @scala.inline
  def apply(json: js.Any, `type`: json): JsonValue = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonValue]
  }
}

