package typings
package animejsLib.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeTimelineAnimParams extends AnimeAnimParams {
  var offset: scala.Double | java.lang.String | FunctionBasedParameter
}

object AnimeTimelineAnimParams {
  @scala.inline
  def apply(
    offset: scala.Double | java.lang.String | FunctionBasedParameter,
    targets: AnimeTarget | js.Array[AnimeTarget],
    begin: AnimeCallbackFunction = null,
    complete: AnimeCallbackFunction = null,
    delay: scala.Double | FunctionBasedParameter = null,
    duration: scala.Double | FunctionBasedParameter = null,
    easing: EasingOptions | java.lang.String | js.Array[scala.Double] = null,
    elasticity: scala.Double | FunctionBasedParameter = null,
    round: scala.Double | scala.Boolean | FunctionBasedParameter = null,
    run: AnimeCallbackFunction = null,
    update: AnimeCallbackFunction = null
  ): AnimeTimelineAnimParams = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (elasticity != null) __obj.updateDynamic("elasticity")(elasticity.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeTimelineAnimParams]
  }
}

