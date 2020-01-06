package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var Days: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Days] = js.native
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var Years: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Years] = js.native
}

object DefaultRetention {
  @scala.inline
  def apply(Days: Int | Double = null, Mode: ObjectLockRetentionMode = null, Years: Int | Double = null): DefaultRetention = {
    val __obj = js.Dynamic.literal()
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Years != null) __obj.updateDynamic("Years")(Years.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRetention]
  }
}

