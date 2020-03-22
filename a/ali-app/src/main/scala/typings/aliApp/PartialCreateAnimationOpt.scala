package typings.aliApp

import typings.aliApp.my.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.CreateAnimationOptions> */
trait PartialCreateAnimationOpt extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var timeFunction: js.UndefOr[TimingFunction] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object PartialCreateAnimationOpt {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    timeFunction: TimingFunction = null,
    transformOrigin: String = null
  ): PartialCreateAnimationOpt = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timeFunction != null) __obj.updateDynamic("timeFunction")(timeFunction.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateAnimationOpt]
  }
}

