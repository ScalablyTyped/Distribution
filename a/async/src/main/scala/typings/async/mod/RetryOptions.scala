package typings.async.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ Error, Boolean]] = js.native
  var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.native
  var times: js.UndefOr[Double] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
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
    def setErrorFilter(value: /* error */ Error => Boolean): Self = this.set("errorFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorFilter: Self = this.set("errorFilter", js.undefined)
    @scala.inline
    def setIntervalFunction1(value: /* retryCount */ Double => Double): Self = this.set("interval", js.Any.fromFunction1(value))
    @scala.inline
    def setInterval(value: Double | (js.Function1[/* retryCount */ Double, Double])): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setTimes(value: Double): Self = this.set("times", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
  }
  
}

