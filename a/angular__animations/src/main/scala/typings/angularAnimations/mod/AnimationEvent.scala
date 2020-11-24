package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEvent extends js.Object {
  
  /**
    * Internal.
    */
  var disabled: Boolean = js.native
  
  /**
    * The element to which the animation is attached.
    */
  var element: js.Any = js.native
  
  /**
    * The name of the state from which the animation is triggered.
    */
  var fromState: String = js.native
  
  /**
    * The animation phase in which the callback was invoked, one of
    * "start" or "done".
    */
  var phaseName: String = js.native
  
  /**
    * The name of the state in which the animation completes.
    */
  var toState: String = js.native
  
  /**
    * The time it takes the animation to complete, in milliseconds.
    */
  var totalTime: Double = js.native
  
  /**
    * Internal.
    */
  var triggerName: String = js.native
}
object AnimationEvent {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    element: js.Any,
    fromState: String,
    phaseName: String,
    toState: String,
    totalTime: Double,
    triggerName: String
  ): AnimationEvent = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromState = fromState.asInstanceOf[js.Any], phaseName = phaseName.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  
  @scala.inline
  implicit class AnimationEventOps[Self <: AnimationEvent] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromState(value: String): Self = this.set("fromState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseName(value: String): Self = this.set("phaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToState(value: String): Self = this.set("toState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTime(value: Double): Self = this.set("totalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: String): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
}
