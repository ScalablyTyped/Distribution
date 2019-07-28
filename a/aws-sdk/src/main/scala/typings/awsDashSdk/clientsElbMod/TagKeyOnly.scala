package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagKeyOnly extends js.Object {
  /**
    * The name of the key.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
}

object TagKeyOnly {
  @scala.inline
  def apply(Key: TagKey = null): TagKeyOnly = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[TagKeyOnly]
  }
}

