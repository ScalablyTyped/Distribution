package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStringKeyValuePair extends js.Object {
  /**
    * The key. You can omit the key.
    */
  var Key: js.UndefOr[StringValue] = js.native
  /**
    * The value.
    */
  var Value: js.UndefOr[StringValue] = js.native
}

object QueryStringKeyValuePair {
  @scala.inline
  def apply(Key: StringValue = null, Value: StringValue = null): QueryStringKeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringKeyValuePair]
  }
}

