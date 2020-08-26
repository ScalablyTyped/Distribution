package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsRequestCount extends js.Object {
  var failed: Double = js.native
  var refused: Double = js.native
  var succeeded: Double = js.native
}

object StatsRequestCount {
  @scala.inline
  def apply(failed: Double, refused: Double, succeeded: Double): StatsRequestCount = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], refused = refused.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsRequestCount]
  }
  @scala.inline
  implicit class StatsRequestCountOps[Self <: StatsRequestCount] (val x: Self) extends AnyVal {
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
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefused(value: Double): Self = this.set("refused", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}

