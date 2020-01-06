package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockRule extends js.Object {
  /**
    * The default retention period that you want to apply to new objects placed in the specified bucket.
    */
  var DefaultRetention: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DefaultRetention] = js.native
}

object ObjectLockRule {
  @scala.inline
  def apply(DefaultRetention: DefaultRetention = null): ObjectLockRule = {
    val __obj = js.Dynamic.literal()
    if (DefaultRetention != null) __obj.updateDynamic("DefaultRetention")(DefaultRetention.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLockRule]
  }
}

