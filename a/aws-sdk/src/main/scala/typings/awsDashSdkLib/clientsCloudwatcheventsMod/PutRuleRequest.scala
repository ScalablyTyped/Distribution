package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRuleRequest extends js.Object {
  /**
    * A description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.undefined
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon CloudWatch Events User Guide.
    */
  var EventPattern: js.UndefOr[EventPattern] = js.undefined
  /**
    * The name of the rule that you are creating or updating.
    */
  var Name: RuleName
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
  /**
    * Indicates whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.undefined
  /**
    * The list of key-value pairs to associate with the rule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object PutRuleRequest {
  @scala.inline
  def apply(
    Name: RuleName,
    Description: RuleDescription = null,
    EventPattern: EventPattern = null,
    RoleArn: RoleArn = null,
    ScheduleExpression: ScheduleExpression = null,
    State: RuleState = null,
    Tags: TagList = null
  ): PutRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EventPattern != null) __obj.updateDynamic("EventPattern")(EventPattern)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PutRuleRequest]
  }
}

