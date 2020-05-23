package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomRetentionSettings extends js.Object {
  /**
    * The number of days for which to retain chat room messages.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.chimeMod.RetentionDays] = js.native
}

object RoomRetentionSettings {
  @scala.inline
  def apply(RetentionDays: js.UndefOr[RetentionDays] = js.undefined): RoomRetentionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RetentionDays)) __obj.updateDynamic("RetentionDays")(RetentionDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomRetentionSettings]
  }
}

