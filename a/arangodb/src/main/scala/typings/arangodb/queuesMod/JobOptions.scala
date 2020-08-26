package typings.arangodb.queuesMod

import typings.arangodb.anon.DocumentJob
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOptions extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.native
  var delayUntil: js.UndefOr[Double | Date] = js.native
  var failure: js.UndefOr[JobCallback] = js.native
  var maxFailures: js.UndefOr[Double] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var repeatTimes: js.UndefOr[Double] = js.native
  var repeatUntil: js.UndefOr[Double | Date] = js.native
  var success: js.UndefOr[JobCallback] = js.native
}

object JobOptions {
  @scala.inline
  def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  @scala.inline
  implicit class JobOptionsOps[Self <: JobOptions] (val x: Self) extends AnyVal {
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
    def setBackOffFunction1(value: /* failureCount */ Double => Double): Self = this.set("backOff", js.Any.fromFunction1(value))
    @scala.inline
    def setBackOff(value: (js.Function1[/* failureCount */ Double, Double]) | Double): Self = this.set("backOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackOff: Self = this.set("backOff", js.undefined)
    @scala.inline
    def setDelayUntil(value: Double | Date): Self = this.set("delayUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayUntil: Self = this.set("delayUntil", js.undefined)
    @scala.inline
    def setFailure(value: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit): Self = this.set("failure", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    @scala.inline
    def setMaxFailures(value: Double): Self = this.set("maxFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFailures: Self = this.set("maxFailures", js.undefined)
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    @scala.inline
    def setRepeatTimes(value: Double): Self = this.set("repeatTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatTimes: Self = this.set("repeatTimes", js.undefined)
    @scala.inline
    def setRepeatUntil(value: Double | Date): Self = this.set("repeatUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatUntil: Self = this.set("repeatUntil", js.undefined)
    @scala.inline
    def setSuccess(value: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

