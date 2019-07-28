package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringKeyValuePair extends js.Object {
  /**
    * The key. You can omit the key.
    */
  var Key: js.UndefOr[StringValue] = js.undefined
  /**
    * The value.
    */
  var Value: js.UndefOr[StringValue] = js.undefined
}

object QueryStringKeyValuePair {
  @scala.inline
  def apply(Key: StringValue = null, Value: StringValue = null): QueryStringKeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[QueryStringKeyValuePair]
  }
}

