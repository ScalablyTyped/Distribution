package typings.animejs.animejsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeTimelineAnimParams extends AnimeAnimParams {
  var timelineOffset: Double | String | FunctionBasedParameter
}

object AnimeTimelineAnimParams {
  @scala.inline
  def apply(
    timelineOffset: Double | String | FunctionBasedParameter,
    begin: AnimeCallbackFunction = null,
    change: AnimeCallbackFunction = null,
    changeBegin: AnimeCallbackFunction = null,
    changeComplete: AnimeCallbackFunction = null,
    complete: AnimeCallbackFunction = null,
    delay: Double | FunctionBasedParameter = null,
    duration: Double | FunctionBasedParameter = null,
    easing: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String]) = null,
    elasticity: Double | FunctionBasedParameter = null,
    endDelay: Double | FunctionBasedParameter = null,
    keyframes: js.Array[AnimeAnimParams] = null,
    loopBegin: AnimeCallbackFunction = null,
    loopComplete: AnimeCallbackFunction = null,
    round: Double | Boolean | FunctionBasedParameter = null,
    targets: AnimeTarget | js.Array[AnimeTarget] = null,
    update: AnimeCallbackFunction = null
  ): AnimeTimelineAnimParams = {
    val __obj = js.Dynamic.literal(timelineOffset = timelineOffset.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (change != null) __obj.updateDynamic("change")(change)
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(changeBegin)
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(changeComplete)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (elasticity != null) __obj.updateDynamic("elasticity")(elasticity.asInstanceOf[js.Any])
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes)
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(loopBegin)
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(loopComplete)
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeTimelineAnimParams]
  }
}

