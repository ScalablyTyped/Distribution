package typings.apolloUtilities.storeUtilsMod

import typings.apolloUtilities.apolloUtilitiesStrings.id
import typings.apolloUtilities.apolloUtilitiesStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StoreValue extends js.Object

object _StoreValue {
  @scala.inline
  def IdValue(generated: Boolean, id: String, `type`: id, typename: String = null): _StoreValue = {
    val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typename != null) __obj.updateDynamic("typename")(typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StoreValue]
  }
  @scala.inline
  def JsonValue(json: js.Any, `type`: json): _StoreValue = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StoreValue]
  }
}

