package typings
package animejsLib.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- animejsLib.animejsMod.AnimeInstanceParams because var conflicts: begin, complete, run, update. Inlined loop, autoplay, direction */ trait AnimeParams extends AnimeAnimParams {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[DirectionOptions | java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
}

object AnimeParams {
  @scala.inline
  def apply(
    targets: AnimeTarget | js.Array[AnimeTarget],
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    begin: AnimeCallbackFunction = null,
    complete: AnimeCallbackFunction = null,
    delay: scala.Double | FunctionBasedParameter = null,
    direction: DirectionOptions | java.lang.String = null,
    duration: scala.Double | FunctionBasedParameter = null,
    easing: EasingOptions | java.lang.String | js.Array[scala.Double] = null,
    elasticity: scala.Double | FunctionBasedParameter = null,
    loop: scala.Double | scala.Boolean = null,
    round: scala.Double | scala.Boolean | FunctionBasedParameter = null,
    run: AnimeCallbackFunction = null,
    update: AnimeCallbackFunction = null
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

