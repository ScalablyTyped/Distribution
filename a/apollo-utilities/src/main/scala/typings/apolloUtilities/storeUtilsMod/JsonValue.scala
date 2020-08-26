package typings.apolloUtilities.storeUtilsMod

import typings.apolloUtilities.apolloUtilitiesStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonValue extends _StoreValue {
  var json: js.Any = js.native
  var `type`: json = js.native
}

object JsonValue {
  @scala.inline
  def apply(json: js.Any, `type`: json): JsonValue = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonValue]
  }
  @scala.inline
  implicit class JsonValueOps[Self <: JsonValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: json): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

