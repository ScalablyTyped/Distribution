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
  def apply(activationDelay: Int | Double = null, minDuration: Int | Double = null): PromiseTrackerOptions = {
    val __obj = js.Dynamic.literal()
    if (activationDelay != null) __obj.updateDynamic("activationDelay")(activationDelay.asInstanceOf[js.Any])
    if (minDuration != null) __obj.updateDynamic("minDuration")(minDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTrackerOptions]
  }
}

