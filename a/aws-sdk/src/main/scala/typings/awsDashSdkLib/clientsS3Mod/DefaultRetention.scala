package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var Days: js.UndefOr[Days] = js.undefined
  /**
    * The default object lock retention mode you want to apply to new objects placed in the specified bucket.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var Years: js.UndefOr[Years] = js.undefined
}

object DefaultRetention {
  @scala.inline
  def apply(
    Days: js.UndefOr[Days] = js.undefined,
    Mode: ObjectLockRetentionMode = null,
    Years: js.UndefOr[Years] = js.undefined
  ): DefaultRetention = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (!js.isUndefined(Years)) __obj.updateDynamic("Years")(Years)
    __obj.asInstanceOf[DefaultRetention]
  }
}

