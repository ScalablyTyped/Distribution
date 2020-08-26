package typings.angularPromiseTracker.mod.promisetracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseTrackerOptions extends js.Object {
  var activationDelay: js.UndefOr[Double] = js.native
  var minDuration: js.UndefOr[Double] = js.native
}

object PromiseTrackerOptions {
  @scala.inline
  def apply(): PromiseTrackerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromiseTrackerOptions]
  }
  @scala.inline
  implicit class PromiseTrackerOptionsOps[Self <: PromiseTrackerOptions] (val x: Self) extends AnyVal {
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
    def setActivationDelay(value: Double): Self = this.set("activationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationDelay: Self = this.set("activationDelay", js.undefined)
    @scala.inline
    def setMinDuration(value: Double): Self = this.set("minDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDuration: Self = this.set("minDuration", js.undefined)
  }
  
}

