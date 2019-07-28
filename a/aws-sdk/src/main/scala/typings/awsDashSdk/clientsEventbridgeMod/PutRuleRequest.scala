package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRuleRequest extends js.Object {
  /**
    * A description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.undefined
  /**
    * The event bus to associate with this rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.EventBusName] = js.undefined
  /**
    * The event pattern. For more information, see Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.EventPattern] = js.undefined
  /**
    * The name of the rule that you're creating or updating.
    */
  var Name: RuleName
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.RoleArn] = js.undefined
  /**
    * The scheduling expression: for example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.ScheduleExpression] = js.undefined
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
    EventBusName: EventBusName = null,
    EventPattern: EventPattern = null,
    RoleArn: RoleArn = null,
    ScheduleExpression: ScheduleExpression = null,
    State: RuleState = null,
    Tags: TagList = null
  ): PutRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    if (EventPattern != null) __obj.updateDynamic("EventPattern")(EventPattern)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PutRuleRequest]
  }
}

