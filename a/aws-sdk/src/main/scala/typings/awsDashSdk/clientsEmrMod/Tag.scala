package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * A user-defined key, which is the minimum required information for a valid tag. For more information, see Tag . 
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * A user-defined value, which is optional in a tag. For more information, see Tag Clusters. 
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

