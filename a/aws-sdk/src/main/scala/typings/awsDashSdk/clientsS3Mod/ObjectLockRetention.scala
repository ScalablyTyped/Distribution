package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLockRetention extends js.Object {
  /**
    * Indicates the Retention mode for the specified object.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined
  /**
    * The date on which this object lock retention expires.
    */
  var RetainUntilDate: js.UndefOr[_Date] = js.undefined
}

object ObjectLockRetention {
  @scala.inline
  def apply(Mode: ObjectLockRetentionMode = null, RetainUntilDate: _Date = null): ObjectLockRetention = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (RetainUntilDate != null) __obj.updateDynamic("RetainUntilDate")(RetainUntilDate)
    __obj.asInstanceOf[ObjectLockRetention]
  }
}

