package typings.angularPromiseTracker.mod.promisetracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTrackerOptions extends js.Object {
  var activationDelay: js.UndefOr[Double] = js.undefined
  var minDuration: js.UndefOr[Double] = js.undefined
}

object PromiseTrackerOptions {
  @scala.inline
  def apply(activationDelay: js.UndefOr[Double] = js.undefined, minDuration: js.UndefOr[Double] = js.undefined): PromiseTrackerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activationDelay)) __obj.updateDynamic("activationDelay")(activationDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDuration)) __obj.updateDynamic("minDuration")(minDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTrackerOptions]
  }
}

