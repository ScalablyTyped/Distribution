package typings
package animejsLib.animejsMod.animeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- animejsLib.animejsMod.animeNs.AnimeAnimParams because var conflicts: begin, complete, run, update. Inlined targets, duration, delay, elasticity, round, easing */ trait AnimeParams extends AnimeInstanceParams {
  var delay: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var duration: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var easing: js.UndefOr[EasingOptions | java.lang.String | js.Array[scala.Double]] = js.undefined
  var elasticity: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var round: js.UndefOr[scala.Double | scala.Boolean | animejsLib.FunctionBasedParameter] = js.undefined
  var targets: animejsLib.AnimeTarget | js.Array[animejsLib.AnimeTarget]
}

object AnimeParams {
  @scala.inline
  def apply(
    targets: animejsLib.AnimeTarget | js.Array[animejsLib.AnimeTarget],
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    begin: animejsLib.AnimeCallbackFunction = null,
    complete: animejsLib.AnimeCallbackFunction = null,
    delay: scala.Double | animejsLib.FunctionBasedParameter = null,
    direction: DirectionOptions | java.lang.String = null,
    duration: scala.Double | animejsLib.FunctionBasedParameter = null,
    easing: EasingOptions | java.lang.String | js.Array[scala.Double] = null,
    elasticity: scala.Double | animejsLib.FunctionBasedParameter = null,
    loop: scala.Double | scala.Boolean = null,
    round: scala.Double | scala.Boolean | animejsLib.FunctionBasedParameter = null,
    run: animejsLib.AnimeCallbackFunction = null,
    update: animejsLib.AnimeCallbackFunction = null
  ): AnimeParams = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (elasticity != null) __obj.updateDynamic("elasticity")(elasticity.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeParams]
  }
}

