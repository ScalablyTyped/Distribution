package typings
package animejsLib.animejsMod.animeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeAnimParams
  extends /* AnyAnimatedProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var begin: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var complete: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var delay: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var duration: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var easing: js.UndefOr[EasingOptions | java.lang.String | js.Array[scala.Double]] = js.undefined
  var elasticity: js.UndefOr[scala.Double | animejsLib.FunctionBasedParameter] = js.undefined
  var round: js.UndefOr[scala.Double | scala.Boolean | animejsLib.FunctionBasedParameter] = js.undefined
  var run: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var targets: animejsLib.AnimeTarget | js.Array[animejsLib.AnimeTarget]
  var update: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
}

object AnimeAnimParams {
  @scala.inline
  def apply(
    targets: animejsLib.AnimeTarget | js.Array[animejsLib.AnimeTarget],
    StringDictionary: /* AnyAnimatedProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    begin: animejsLib.AnimeCallbackFunction = null,
    complete: animejsLib.AnimeCallbackFunction = null,
    delay: scala.Double | animejsLib.FunctionBasedParameter = null,
    duration: scala.Double | animejsLib.FunctionBasedParameter = null,
    easing: EasingOptions | java.lang.String | js.Array[scala.Double] = null,
    elasticity: scala.Double | animejsLib.FunctionBasedParameter = null,
    round: scala.Double | scala.Boolean | animejsLib.FunctionBasedParameter = null,
    run: animejsLib.AnimeCallbackFunction = null,
    update: animejsLib.AnimeCallbackFunction = null
  ): AnimeAnimParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (elasticity != null) __obj.updateDynamic("elasticity")(elasticity.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeAnimParams]
  }
}

