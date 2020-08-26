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
  def apply(): RoomRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomRetentionSettings]
  }
  @scala.inline
  implicit class RoomRetentionSettingsOps[Self <: RoomRetentionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = this.set("RetentionDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionDays: Self = this.set("RetentionDays", js.undefined)
  }
  
}

