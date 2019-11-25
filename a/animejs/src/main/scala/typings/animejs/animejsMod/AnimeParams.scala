package typings.animejs.animejsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.animejs.animejsMod.AnimeCallBack because Already inherited
- typings.animejs.animejsMod.AnimeInstanceParams because var conflicts: begin, change, changeBegin, changeComplete, complete, loopBegin, loopComplete, update. Inlined loop, autoplay, direction */ trait AnimeParams extends AnimeAnimParams {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[DirectionOptions | String] = js.undefined
  var loop: js.UndefOr[Double | Boolean] = js.undefined
}

object AnimeParams {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    begin: /* anim */ AnimeInstance => Unit = null,
    change: /* anim */ AnimeInstance => Unit = null,
    changeBegin: /* anim */ AnimeInstance => Unit = null,
    changeComplete: /* anim */ AnimeInstance => Unit = null,
    complete: /* anim */ AnimeInstance => Unit = null,
    delay: Double | FunctionBasedParameter = null,
    direction: DirectionOptions | String = null,
    duration: Double | FunctionBasedParameter = null,
    easing: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String]) = null,
    elasticity: Double | FunctionBasedParameter = null,
    endDelay: Double | FunctionBasedParameter = null,
    keyframes: js.Array[AnimeAnimParams] = null,
    loop: Double | Boolean = null,
    loopBegin: /* anim */ AnimeInstance => Unit = null,
    loopComplete: /* anim */ AnimeInstance => Unit = null,
    round: Double | Boolean | FunctionBasedParameter = null,
    targets: AnimeTarget | js.Array[AnimeTarget] = null,
    update: /* anim */ AnimeInstance => Unit = null
  ): AnimeParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1(changeBegin))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1(changeComplete))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (elasticity != null) __obj.updateDynamic("elasticity")(elasticity.asInstanceOf[js.Any])
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1(loopBegin))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1(loopComplete))
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnimeParams]
  }
}

