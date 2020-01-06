package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key, or name, for the resource tag.
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * The value for the resource tag.
    */
  var Value: js.UndefOr[String] = js.native
}

object Tag {
  @scala.inline
  def apply(Key: String = null, Value: String = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

