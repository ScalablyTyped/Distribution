package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays.
    */
  var DeleteAfterDays: js.UndefOr[Long_] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long_] = js.native
}

object Lifecycle {
  @scala.inline
  def apply(): Lifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycle]
  }
  @scala.inline
  implicit class LifecycleOps[Self <: Lifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteAfterDays(value: Long_): Self = this.set("DeleteAfterDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAfterDays: Self = this.set("DeleteAfterDays", js.undefined)
    @scala.inline
    def setMoveToColdStorageAfterDays(value: Long_): Self = this.set("MoveToColdStorageAfterDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveToColdStorageAfterDays: Self = this.set("MoveToColdStorageAfterDays", js.undefined)
  }
  
}

