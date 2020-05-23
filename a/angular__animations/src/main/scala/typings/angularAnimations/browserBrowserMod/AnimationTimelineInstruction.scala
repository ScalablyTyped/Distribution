package typings.angularAnimations.browserBrowserMod

import typings.angularAnimations.mod.ɵStyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTimelineInstruction extends AnimationEngineInstruction {
  var delay: Double
  var duration: Double
  var easing: String | Null
  var element: js.Any
  var keyframes: js.Array[ɵStyleData]
  var postStyleProps: js.Array[String]
  var preStyleProps: js.Array[String]
  var stretchStartingKeyframe: js.UndefOr[Boolean] = js.undefined
  var subTimeline: Boolean
  var totalTime: Double
}

object AnimationTimelineInstruction {
  @scala.inline
  def apply(
    delay: Double,
    duration: Double,
    element: js.Any,
    keyframes: js.Array[ɵStyleData],
    postStyleProps: js.Array[String],
    preStyleProps: js.Array[String],
    subTimeline: Boolean,
    totalTime: Double,
    `type`: AnimationTransitionInstructionType,
    easing: String = null,
    stretchStartingKeyframe: js.UndefOr[Boolean] = js.undefined
  ): AnimationTimelineInstruction = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], postStyleProps = postStyleProps.asInstanceOf[js.Any], preStyleProps = preStyleProps.asInstanceOf[js.Any], subTimeline = subTimeline.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchStartingKeyframe)) __obj.updateDynamic("stretchStartingKeyframe")(stretchStartingKeyframe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimelineInstruction]
  }
}

