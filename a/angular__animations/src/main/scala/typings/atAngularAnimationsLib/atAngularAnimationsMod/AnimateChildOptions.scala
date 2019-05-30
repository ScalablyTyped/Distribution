package typings
package atAngularAnimationsLib.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateChildOptions extends AnimationOptions {
  var duration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object AnimateChildOptions {
  @scala.inline
  def apply(
    delay: scala.Double | java.lang.String = null,
    duration: scala.Double | java.lang.String = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AnimateChildOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[AnimateChildOptions]
  }
}

