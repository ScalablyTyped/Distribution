package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The tag's key.
    */
  var Key: js.UndefOr[typings.awsDashSdk.clientsCodedeployMod.Key] = js.native
  /**
    * The tag's value.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsCodedeployMod.Value] = js.native
}

object Tag {
  @scala.inline
  def apply(Key: Key = null, Value: Value = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

