package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateChildOptions extends AnimationOptions {
  var duration: js.UndefOr[Double | String] = js.undefined
}

object AnimateChildOptions {
  @scala.inline
  def apply(
    delay: Double | String = null,
    duration: Double | String = null,
    params: StringDictionary[js.Any] = null
  ): AnimateChildOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateChildOptions]
  }
}

