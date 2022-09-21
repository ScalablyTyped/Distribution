package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this class is returned as an event parameter when an animation
  * callback is captured for an animation either during the start or done phase.
  *
  * ```typescript
  * @Component({
  *   host: {
  *     '[@myAnimationTrigger]': 'someExpression',
  *     '(@myAnimationTrigger.start)': 'captureStartEvent($event)',
  *     '(@myAnimationTrigger.done)': 'captureDoneEvent($event)',
  *   },
  *   animations: [
  *     trigger("myAnimationTrigger", [
  *        // ...
  *     ])
  *   ]
  * })
  * class MyComponent {
  *   someExpression: any = false;
  *   captureStartEvent(event: AnimationEvent) {
  *     // the toState, fromState and totalTime data is accessible from the event variable
  *   }
  *
  *   captureDoneEvent(event: AnimationEvent) {
  *     // the toState, fromState and totalTime data is accessible from the event variable
  *   }
  * }
  * ```
  *
  * @publicApi
  */
trait AnimationEvent2 extends StObject {
  
  /**
    * Internal.
    */
  var disabled: Boolean
  
  /**
    * The element to which the animation is attached.
    */
  var element: Any
  
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
object AnimationEvent2 {
  
  inline def apply(
    disabled: Boolean,
    element: Any,
    fromState: String,
    phaseName: String,
    toState: String,
    totalTime: Double,
    triggerName: String
  ): AnimationEvent2 = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromState = fromState.asInstanceOf[js.Any], phaseName = phaseName.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent2]
  }
  
  extension [Self <: AnimationEvent2](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFromState(value: String): Self = StObject.set(x, "fromState", value.asInstanceOf[js.Any])
    
    inline def setPhaseName(value: String): Self = StObject.set(x, "phaseName", value.asInstanceOf[js.Any])
    
    inline def setToState(value: String): Self = StObject.set(x, "toState", value.asInstanceOf[js.Any])
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
