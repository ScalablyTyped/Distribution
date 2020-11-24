package typings.angularAnimations.browserBrowserMod

import typings.angularAnimations.mod.ɵStyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTimelineInstruction extends AnimationEngineInstruction {
  
  var delay: Double = js.native
  
  var duration: Double = js.native
  
  var easing: String | Null = js.native
  
  var element: js.Any = js.native
  
  var keyframes: js.Array[ɵStyleData] = js.native
  
  var postStyleProps: js.Array[String] = js.native
  
  var preStyleProps: js.Array[String] = js.native
  
  var stretchStartingKeyframe: js.UndefOr[Boolean] = js.native
  
  var subTimeline: Boolean = js.native
  
  var totalTime: Double = js.native
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
    `type`: AnimationTransitionInstructionType
  ): AnimationTimelineInstruction = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], postStyleProps = postStyleProps.asInstanceOf[js.Any], preStyleProps = preStyleProps.asInstanceOf[js.Any], subTimeline = subTimeline.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimelineInstruction]
  }
  
  @scala.inline
  implicit class AnimationTimelineInstructionOps[Self <: AnimationTimelineInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframesVarargs(value: ɵStyleData*): Self = this.set("keyframes", js.Array(value :_*))
    
    @scala.inline
    def setKeyframes(value: js.Array[ɵStyleData]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostStylePropsVarargs(value: String*): Self = this.set("postStyleProps", js.Array(value :_*))
    
    @scala.inline
    def setPostStyleProps(value: js.Array[String]): Self = this.set("postStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreStylePropsVarargs(value: String*): Self = this.set("preStyleProps", js.Array(value :_*))
    
    @scala.inline
    def setPreStyleProps(value: js.Array[String]): Self = this.set("preStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTimeline(value: Boolean): Self = this.set("subTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTime(value: Double): Self = this.set("totalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingNull: Self = this.set("easing", null)
    
    @scala.inline
    def setStretchStartingKeyframe(value: Boolean): Self = this.set("stretchStartingKeyframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchStartingKeyframe: Self = this.set("stretchStartingKeyframe", js.undefined)
  }
}
