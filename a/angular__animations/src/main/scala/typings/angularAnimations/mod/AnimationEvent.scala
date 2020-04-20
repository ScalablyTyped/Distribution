package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEvent extends js.Object {
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
}

