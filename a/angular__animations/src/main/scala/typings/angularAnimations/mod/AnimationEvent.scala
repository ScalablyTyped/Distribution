package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEvent extends StObject {
  
  /**
    * Internal.
    */
  var disabled: Boolean
  
  /**
    * The element to which the animation is attached.
    */
  var element: js.Any
  
  /**
    * The name of the state from which the animation is triggered.
    */
  var fromState: String
  
  /**
    * The animation phase in which the callback was invoked, one of
    * "start" or "done".
    */
  var phaseName: String
  
  /**
    * The name of the state in which the animation completes.
    */
  var toState: String
  
  /**
    * The time it takes the animation to complete, in milliseconds.
    */
  var totalTime: Double
  
  /**
    * Internal.
    */
  var triggerName: String
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
  implicit class AnimationEventMutableBuilder[Self <: AnimationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromState(value: String): Self = StObject.set(x, "fromState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseName(value: String): Self = StObject.set(x, "phaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToState(value: String): Self = StObject.set(x, "toState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
