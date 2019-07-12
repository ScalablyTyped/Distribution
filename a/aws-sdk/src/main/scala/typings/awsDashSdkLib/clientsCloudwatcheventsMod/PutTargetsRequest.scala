package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTargetsRequest extends js.Object {
  /**
    * The name of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusName] = js.undefined
  /**
    * The name of the rule.
    */
  var Rule: RuleName
  /**
    * The targets to update or add to the rule.
    */
  var Targets: TargetList
}

object PutTargetsRequest {
  @scala.inline
  def apply(Rule: RuleName, Targets: TargetList, EventBusName: EventBusName = null): PutTargetsRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule, Targets = Targets)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    __obj.asInstanceOf[PutTargetsRequest]
  }
}

