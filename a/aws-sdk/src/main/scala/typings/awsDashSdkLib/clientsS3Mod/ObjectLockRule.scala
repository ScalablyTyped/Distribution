package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLockRule extends js.Object {
  /**
    * The default retention period that you want to apply to new objects placed in the specified bucket.
    */
  var DefaultRetention: js.UndefOr[DefaultRetention] = js.undefined
}

object ObjectLockRule {
  @scala.inline
  def apply(DefaultRetention: DefaultRetention = null): ObjectLockRule = {
    val __obj = js.Dynamic.literal()
    if (DefaultRetention != null) __obj.updateDynamic("DefaultRetention")(DefaultRetention)
    __obj.asInstanceOf[ObjectLockRule]
  }
}

