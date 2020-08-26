package typings.arbiter.ArbiterDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  /**
    * A subscriber can be set to execute asynchronously, even if the message wasn't published as async.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * If your subscriber is not interested in any past messages that may have been
    * persisted, you can force them to be ignored.
    */
  var persist: js.UndefOr[Boolean] = js.native
  /**
    * By default, all subscribers have a priority of 0. Higher values get higher
    * priority and are executed first. Negative values are allowed.
    */
  var priority: js.UndefOr[Double] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

