package typings.animejs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeAnimParams
  extends AnimeCallBack
     with /* AnyAnimatedProperty */ StringDictionary[js.Any] {
  var delay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
  var duration: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
  var easing: js.UndefOr[
    EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
  ] = js.undefined
  var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
  var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
  var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.undefined
  var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.undefined
  var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.undefined
}

object AnimeAnimParams {
  @scala.inline
  def apply(
    StringDictionary: /* AnyAnimatedProperty */ StringDictionary[js.Any] = null,
    begin: /* anim */ AnimeInstance => Unit = null,
    change: /* anim */ AnimeInstance => Unit = null,
    changeBegin: /* anim */ AnimeInstance => Unit = null,
    changeComplete: /* anim */ AnimeInstance => Unit = null,
    complete: /* anim */ AnimeInstance => Unit = null,
    delay: Double | FunctionBasedParameter = null,
    duration: Double | FunctionBasedParameter = null,
    easing: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String]) = null,
    elasticity: Double | FunctionBasedParameter = null,
    endDelay: Double | FunctionBasedParameter = null,
    keyframes: js.Array[AnimeAnimParams] = null,
    loopBegin: /* anim */ AnimeInstance => Unit = null,
    loopComplete: /* anim */ AnimeInstance => Unit = null,
    round: Double | Boolean | FunctionBasedParameter = null,
    targets: AnimeTarget | js.Array[AnimeTarget] = null,
    update: /* anim */ AnimeInstance => Unit = null
  ): AnimeAnimParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1(changeBegin))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1(changeComplete))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (elasticity != null) __obj.updateDynamic("elasticity")(elasticity.asInstanceOf[js.Any])
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1(loopBegin))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1(loopComplete))
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnimeAnimParams]
  }
}

