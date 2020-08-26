package typings.asyncRetryNg.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var factor: js.UndefOr[Double] = js.native
  var maxTimeout: js.UndefOr[Double] = js.native
  var minTimeout: js.UndefOr[Double] = js.native
  var onRetry: js.UndefOr[js.Function1[/* e */ Error, _]] = js.native
  var randomize: js.UndefOr[Boolean] = js.native
  var retries: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setMaxTimeout(value: Double): Self = this.set("maxTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeout: Self = this.set("maxTimeout", js.undefined)
    @scala.inline
    def setMinTimeout(value: Double): Self = this.set("minTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTimeout: Self = this.set("minTimeout", js.undefined)
    @scala.inline
    def setOnRetry(value: /* e */ Error => _): Self = this.set("onRetry", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRetry: Self = this.set("onRetry", js.undefined)
    @scala.inline
    def setRandomize(value: Boolean): Self = this.set("randomize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomize: Self = this.set("randomize", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
  }
  
}

