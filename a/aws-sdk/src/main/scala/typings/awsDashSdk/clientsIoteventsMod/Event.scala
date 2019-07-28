package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.undefined
  /**
    * [Optional] The Boolean expression that when TRUE causes the "actions" to be performed. If not present, the actions are performed (=TRUE); if the expression result is not a Boolean value, the actions are NOT performed (=FALSE).
    */
  var condition: js.UndefOr[Condition] = js.undefined
  /**
    * The name of the event.
    */
  var eventName: EventName
}

object Event {
  @scala.inline
  def apply(eventName: EventName, actions: Actions = null, condition: Condition = null): Event = {
    val __obj = js.Dynamic.literal(eventName = eventName)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    __obj.asInstanceOf[Event]
  }
}

