package typings.aliApp.anon

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
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    timeFunction: TimingFunction = null,
    transformOrigin: String = null
  ): PartialCreateAnimationOpt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (timeFunction != null) __obj.updateDynamic("timeFunction")(timeFunction.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateAnimationOpt]
  }
}

