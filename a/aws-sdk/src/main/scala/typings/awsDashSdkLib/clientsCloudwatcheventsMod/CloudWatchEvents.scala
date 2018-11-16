package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchEvents
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudWatchEvents: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ClientConfiguration = js.native
  /**
     * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect.
     */
  def deleteRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect.
     */
  def deleteRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect.
     */
  def deleteRule(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DeleteRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect.
     */
  def deleteRule(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DeleteRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
     */
  def describeEventBus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
     */
  def describeEventBus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
     */
  def describeEventBus(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
     */
  def describeEventBus(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeEventBusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def describeRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def describeRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def describeRule(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def describeRule(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DescribeRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
     */
  def disableRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
     */
  def disableRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
     */
  def disableRule(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DisableRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
     */
  def disableRule(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.DisableRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
     */
  def enableRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
     */
  def enableRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
     */
  def enableRule(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.EnableRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
     */
  def enableRule(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.EnableRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
     */
  def listRuleNamesByTarget(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
     */
  def listRuleNamesByTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
     */
  def listRuleNamesByTarget(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
     */
  def listRuleNamesByTarget(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRuleNamesByTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def listRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def listRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def listRules(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
     */
  def listRules(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets assigned to the specified rule.
     */
  def listTargetsByRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets assigned to the specified rule.
     */
  def listTargetsByRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets assigned to the specified rule.
     */
  def listTargetsByRule(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the targets assigned to the specified rule.
     */
  def listTargetsByRule(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.ListTargetsByRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     */
  def putEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     */
  def putEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     */
  def putEvents(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     */
  def putEvents(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. The permission policy on the default event bus cannot exceed 10 KB in size.
     */
  def putPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. The permission policy on the default event bus cannot exceed 10 KB in size.
     */
  def putPermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. The permission policy on the default event bus cannot exceed 10 KB in size.
     */
  def putPermission(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. The permission policy on the default event bus cannot exceed 10 KB in size.
     */
  def putPermission(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutPermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def putRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def putRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def putRule(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def putRule(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def putTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def putTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def putTargets(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def putTargets(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.PutTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes the permission of another AWS account to be able to put events to your default event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
     */
  def removePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the permission of another AWS account to be able to put events to your default event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
     */
  def removePermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the permission of another AWS account to be able to put events to your default event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
     */
  def removePermission(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the permission of another AWS account to be able to put events to your default event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
     */
  def removePermission(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemovePermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def removeTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def removeTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def removeTargets(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
     */
  def removeTargets(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.RemoveTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def testEventPattern(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def testEventPattern(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def testEventPattern(params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
     */
  def testEventPattern(
    params: awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatcheventsMod.CloudWatchEventsNs.TestEventPatternResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

