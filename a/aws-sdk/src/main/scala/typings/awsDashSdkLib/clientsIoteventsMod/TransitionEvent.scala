package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEvent extends js.Object {
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.undefined
  /**
    * [Required] A Boolean expression that when TRUE causes the actions to be performed and the nextState to be entered.
    */
  var condition: Condition
  /**
    * The name of the transition event.
    */
  var eventName: EventName
  /**
    * The next state to enter.
    */
  var nextState: StateName
}

object TransitionEvent {
  @scala.inline
  def apply(condition: Condition, eventName: EventName, nextState: StateName, actions: Actions = null): TransitionEvent = {
    val __obj = js.Dynamic.literal(condition = condition, eventName = eventName, nextState = nextState)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    __obj.asInstanceOf[TransitionEvent]
  }
}

