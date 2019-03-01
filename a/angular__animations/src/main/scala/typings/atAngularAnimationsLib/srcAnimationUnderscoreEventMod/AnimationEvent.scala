package typings
package atAngularAnimationsLib.srcAnimationUnderscoreEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEvent extends js.Object {
  /**
    * Internal.
    */
  var disabled: scala.Boolean
  /**
    * The element to which the animation is attached.
    */
  var element: js.Any
  /**
    * The name of the state from which the animation is triggered.
    */
  var fromState: java.lang.String
  /**
    * The animation phase in which the callback was invoked, one of
    * "start" or "done".
    */
  var phaseName: java.lang.String
  /**
    * The name of the state in which the animation completes.
    */
  var toState: java.lang.String
  /**
    * The time it takes the animation to complete, in milliseconds.
    */
  var totalTime: scala.Double
  /**
    * Internal.
    */
  var triggerName: java.lang.String
}

object AnimationEvent {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    element: js.Any,
    fromState: java.lang.String,
    phaseName: java.lang.String,
    toState: java.lang.String,
    totalTime: scala.Double,
    triggerName: java.lang.String
  ): AnimationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("fromState")(fromState)
    __obj.updateDynamic("phaseName")(phaseName)
    __obj.updateDynamic("toState")(toState)
    __obj.updateDynamic("totalTime")(totalTime)
    __obj.updateDynamic("triggerName")(triggerName)
    __obj.asInstanceOf[AnimationEvent]
  }
}

