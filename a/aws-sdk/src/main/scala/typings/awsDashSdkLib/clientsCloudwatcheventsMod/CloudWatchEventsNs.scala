package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudwatchevents", "CloudWatchEvents")
@js.native
object CloudWatchEventsNs extends js.Object {
  
  trait AwsVpcConfiguration extends js.Object {
    /**
         * Specifies whether the task's elastic network interface receives a public IP address. You can specify ENABLED only when LaunchType in EcsParameters is set to FARGATE.
         */
    var AssignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined
    /**
         * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You can specify as many as five security groups. If you do not specify a security group, the default security group for the VPC is used.
         */
    var SecurityGroups: js.UndefOr[StringList] = js.undefined
    /**
         * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as many as 16 subnets.
         */
    var Subnets: StringList
  }
  
  
  trait BatchArrayProperties extends js.Object {
    /**
         * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
         */
    var Size: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait BatchParameters extends js.Object {
    /**
         * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.
         */
    var ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined
    /**
         * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
         */
    var JobDefinition: String
    /**
         * The name to use for this execution of the job, if the target is an AWS Batch job.
         */
    var JobName: String
    /**
         * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
         */
    var RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
  }
  
  
  trait BatchRetryStrategy extends js.Object {
    /**
         * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
         */
    var Attempts: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Condition extends js.Object {
    /**
         * Specifies the key for the condition. Currently the only supported key is aws:PrincipalOrgID.
         */
    var Key: String
    /**
         * Specifies the type of condition. Currently the only supported value is StringEquals.
         */
    var Type: String
    /**
         * Specifies the value for the key. Currently, this must be the ID of the organization.
         */
    var Value: String
  }
  
  
  trait DeleteRuleRequest extends js.Object {
    /**
         * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to delete the rule. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
         */
    var Force: js.UndefOr[Boolean] = js.undefined
    /**
         * The name of the rule.
         */
    var Name: RuleName
  }
  
  
  trait DescribeEventBusRequest extends js.Object
  
  
  trait DescribeEventBusResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
         */
    var Arn: js.UndefOr[String] = js.undefined
    /**
         * The name of the event bus. Currently, this is always default.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The policy that enables the external account to send events to your account.
         */
    var Policy: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeRuleRequest extends js.Object {
    /**
         * The name of the rule.
         */
    var Name: RuleName
  }
  
  
  trait DescribeRuleResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var Arn: js.UndefOr[RuleArn] = js.undefined
    /**
         * The description of the rule.
         */
    var Description: js.UndefOr[RuleDescription] = js.undefined
    /**
         * The event pattern. For more information, see Events and Event Patterns in the Amazon CloudWatch Events User Guide.
         */
    var EventPattern: js.UndefOr[EventPattern] = js.undefined
    /**
         * If this is a managed rule, created by an AWS service on your behalf, this field displays the principal name of the AWS service that created the rule.
         */
    var ManagedBy: js.UndefOr[ManagedBy] = js.undefined
    /**
         * The name of the rule.
         */
    var Name: js.UndefOr[RuleName] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
         */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
         * Specifies whether the rule is enabled or disabled.
         */
    var State: js.UndefOr[RuleState] = js.undefined
  }
  
  
  trait DisableRuleRequest extends js.Object {
    /**
         * The name of the rule.
         */
    var Name: RuleName
  }
  
  
  trait EcsParameters extends js.Object {
    /**
         * Specifies an ECS task group for the task. The maximum length is 255 characters.
         */
    var Group: js.UndefOr[String] = js.undefined
    /**
         * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. The FARGATE value is supported only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see AWS Fargate on Amazon ECS in the Amazon Elastic Container Service Developer Guide.
         */
    var LaunchType: js.UndefOr[LaunchType] = js.undefined
    /**
         * Use this structure if the ECS task uses the awsvpc network mode. This structure specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. This structure is required if LaunchType is FARGATE because the awsvpc mode is required for Fargate tasks. If you specify NetworkConfiguration when the target ECS task does not use the awsvpc network mode, the task fails.
         */
    var NetworkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
    /**
         * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This structure is used only if LaunchType is FARGATE. For more information about valid platform versions, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
         */
    var PlatformVersion: js.UndefOr[String] = js.undefined
    /**
         * The number of tasks to create based on TaskDefinition. The default is 1.
         */
    var TaskCount: js.UndefOr[LimitMin1] = js.undefined
    /**
         * The ARN of the task definition to use if the event target is an Amazon ECS task. 
         */
    var TaskDefinitionArn: Arn
  }
  
  
  trait EnableRuleRequest extends js.Object {
    /**
         * The name of the rule.
         */
    var Name: RuleName
  }
  
  
  trait InputTransformer extends js.Object {
    /**
         * Map of JSON paths to be extracted from the event. You can then insert these in the template in InputTemplate to produce the output you want to be sent to the target.  InputPathsMap is an array key-value pairs, where each value is a valid JSON path. You can have as many as 10 key-value pairs. You must use JSON dot notation, not bracket notation. The keys cannot start with "AWS." 
         */
    var InputPathsMap: js.UndefOr[TransformerPaths] = js.undefined
    /**
         * Input template where you specify placeholders that will be filled with the values of the keys from InputPathsMap to customize the data sent to the target. Enclose each InputPathsMaps value in brackets: &lt;value&gt; The InputTemplate must be valid JSON. If InputTemplate is a JSON object (surrounded by curly braces), the following restrictions apply:   The placeholder cannot be used as an object key.   Object values cannot include quote marks.   The following example shows the syntax for using InputPathsMap and InputTemplate.   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"   }  To have the InputTemplate include quote marks within a JSON string, escape each quote marks with a slash, as in the following example:   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""   } 
         */
    var InputTemplate: TransformerInput
  }
  
  
  trait KinesisParameters extends js.Object {
    /**
         * The JSON path to be extracted from the event and used as the partition key. For more information, see Amazon Kinesis Streams Key Concepts in the Amazon Kinesis Streams Developer Guide.
         */
    var PartitionKeyPath: TargetPartitionKeyPath
  }
  
  
  trait ListRuleNamesByTargetRequest extends js.Object {
    /**
         * The maximum number of results to return.
         */
    var Limit: js.UndefOr[LimitMax100] = js.undefined
    /**
         * The token returned by a previous call to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the target resource.
         */
    var TargetArn: TargetArn
  }
  
  
  trait ListRuleNamesByTargetResponse extends js.Object {
    /**
         * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The names of the rules that can invoke the given target.
         */
    var RuleNames: js.UndefOr[RuleNameList] = js.undefined
  }
  
  
  trait ListRulesRequest extends js.Object {
    /**
         * The maximum number of results to return.
         */
    var Limit: js.UndefOr[LimitMax100] = js.undefined
    /**
         * The prefix matching the rule name.
         */
    var NamePrefix: js.UndefOr[RuleName] = js.undefined
    /**
         * The token returned by a previous call to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListRulesResponse extends js.Object {
    /**
         * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The rules that match the specified criteria.
         */
    var Rules: js.UndefOr[RuleResponseList] = js.undefined
  }
  
  
  trait ListTargetsByRuleRequest extends js.Object {
    /**
         * The maximum number of results to return.
         */
    var Limit: js.UndefOr[LimitMax100] = js.undefined
    /**
         * The token returned by a previous call to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The name of the rule.
         */
    var Rule: RuleName
  }
  
  
  trait ListTargetsByRuleResponse extends js.Object {
    /**
         * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The targets assigned to the rule.
         */
    var Targets: js.UndefOr[TargetList] = js.undefined
  }
  
  
  trait NetworkConfiguration extends js.Object {
    /**
         * Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the awsvpc network mode.
         */
    var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.undefined
  }
  
  
  trait PutEventsRequest extends js.Object {
    /**
         * The entry that defines an event in your system. You can specify several parameters for the entry such as the source and type of the event, resources associated with the event, and so on.
         */
    var Entries: PutEventsRequestEntryList
  }
  
  
  trait PutEventsRequestEntry extends js.Object {
    /**
         * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
         */
    var Detail: js.UndefOr[String] = js.undefined
    /**
         * Free-form string used to decide what fields to expect in the event detail.
         */
    var DetailType: js.UndefOr[String] = js.undefined
    /**
         * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
         */
    var Resources: js.UndefOr[EventResourceList] = js.undefined
    /**
         * The source of the event. This field is required.
         */
    var Source: js.UndefOr[String] = js.undefined
    /**
         * The time stamp of the event, per RFC3339. If no time stamp is provided, the time stamp of the PutEvents call is used.
         */
    var Time: js.UndefOr[EventTime] = js.undefined
  }
  
  
  trait PutEventsResponse extends js.Object {
    /**
         * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
         */
    var Entries: js.UndefOr[PutEventsResultEntryList] = js.undefined
    /**
         * The number of failed entries.
         */
    var FailedEntryCount: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait PutEventsResultEntry extends js.Object {
    /**
         * The error code that indicates why the event submission failed.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message that explains why the event submission failed.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The ID of the event.
         */
    var EventId: js.UndefOr[EventId] = js.undefined
  }
  
  
  trait PutPermissionRequest extends js.Object {
    /**
         * The action that you are enabling the other account to perform. Currently, this must be events:PutEvents.
         */
    var Action: Action
    /**
         * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a member of a certain AWS organization. For more information about AWS Organizations, see What Is AWS Organizations in the AWS Organizations User Guide. If you specify Condition with an AWS organization ID, and specify "*" as the value for Principal, you grant permission to all the accounts in the named organization. The Condition is a JSON string which must contain Type, Key, and Value fields.
         */
    var Condition: js.UndefOr[Condition] = js.undefined
    /**
         * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to permit any account to put events to your default event bus. If you specify "*" without specifying Condition, avoid creating rules that may match undesirable events. To create more secure rules, make sure that the event pattern for each rule contains an account field with a specific account ID from which to receive events. Rules with an account field do not match any events sent from other accounts.
         */
    var Principal: Principal
    /**
         * An identifier string for the external account that you are granting permissions to. If you later want to revoke the permission for this external account, specify this StatementId when you run RemovePermission.
         */
    var StatementId: StatementId
  }
  
  
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
  }
  
  
  trait PutRuleResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var RuleArn: js.UndefOr[RuleArn] = js.undefined
  }
  
  
  trait PutTargetsRequest extends js.Object {
    /**
         * The name of the rule.
         */
    var Rule: RuleName
    /**
         * The targets to update or add to the rule.
         */
    var Targets: TargetList
  }
  
  
  trait PutTargetsResponse extends js.Object {
    /**
         * The failed target entries.
         */
    var FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.undefined
    /**
         * The number of failed entries.
         */
    var FailedEntryCount: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait PutTargetsResultEntry extends js.Object {
    /**
         * The error code that indicates why the target addition failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message that explains why the target addition failed.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The ID of the target.
         */
    var TargetId: js.UndefOr[TargetId] = js.undefined
  }
  
  
  trait RemovePermissionRequest extends js.Object {
    /**
         * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
         */
    var StatementId: StatementId
  }
  
  
  trait RemoveTargetsRequest extends js.Object {
    /**
         * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to remove targets. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
         */
    var Force: js.UndefOr[Boolean] = js.undefined
    /**
         * The IDs of the targets to remove from the rule.
         */
    var Ids: TargetIdList
    /**
         * The name of the rule.
         */
    var Rule: RuleName
  }
  
  
  trait RemoveTargetsResponse extends js.Object {
    /**
         * The failed target entries.
         */
    var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.undefined
    /**
         * The number of failed entries.
         */
    var FailedEntryCount: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait RemoveTargetsResultEntry extends js.Object {
    /**
         * The error code that indicates why the target removal failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message that explains why the target removal failed.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The ID of the target.
         */
    var TargetId: js.UndefOr[TargetId] = js.undefined
  }
  
  
  trait Rule extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the rule.
         */
    var Arn: js.UndefOr[RuleArn] = js.undefined
    /**
         * The description of the rule.
         */
    var Description: js.UndefOr[RuleDescription] = js.undefined
    /**
         * The event pattern of the rule. For more information, see Events and Event Patterns in the Amazon CloudWatch Events User Guide.
         */
    var EventPattern: js.UndefOr[EventPattern] = js.undefined
    /**
         * If the rule was created on behalf of your account by an AWS service, this field displays the principal name of the service that created the rule.
         */
    var ManagedBy: js.UndefOr[ManagedBy] = js.undefined
    /**
         * The name of the rule.
         */
    var Name: js.UndefOr[RuleName] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the role that is used for target invocation.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
         */
    var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
    /**
         * The state of the rule.
         */
    var State: js.UndefOr[RuleState] = js.undefined
  }
  
  
  trait RunCommandParameters extends js.Object {
    /**
         * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds or a tag.
         */
    var RunCommandTargets: RunCommandTargets
  }
  
  
  trait RunCommandTarget extends js.Object {
    /**
         * Can be either tag: tag-key or InstanceIds.
         */
    var Key: RunCommandTargetKey
    /**
         * If Key is tag: tag-key, Values is a list of tag values. If Key is InstanceIds, Values is a list of Amazon EC2 instance IDs.
         */
    var Values: RunCommandTargetValues
  }
  
  
  trait SqsParameters extends js.Object {
    /**
         * The FIFO message group ID to use as the target.
         */
    var MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined
  }
  
  
  trait Target extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target.
         */
    var Arn: TargetArn
    /**
         * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For more information, see Jobs in the AWS Batch User Guide.
         */
    var BatchParameters: js.UndefOr[BatchParameters] = js.undefined
    /**
         * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see Task Definitions  in the Amazon EC2 Container Service Developer Guide.
         */
    var EcsParameters: js.UndefOr[EcsParameters] = js.undefined
    /**
         * The ID of the target.
         */
    var Id: TargetId
    /**
         * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For more information, see The JavaScript Object Notation (JSON) Data Interchange Format.
         */
    var Input: js.UndefOr[TargetInput] = js.undefined
    /**
         * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see JSONPath.
         */
    var InputPath: js.UndefOr[TargetInputPath] = js.undefined
    /**
         * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or more key-value pairs from the event and then use that data to send customized input to the target.
         */
    var InputTransformer: js.UndefOr[InputTransformer] = js.undefined
    /**
         * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If you do not include this parameter, the default is to use the eventId as the partition key.
         */
    var KinesisParameters: js.UndefOr[KinesisParameters] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule triggers multiple targets, you can use a different IAM role for each target.
         */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
         * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
         */
    var RunCommandParameters: js.UndefOr[RunCommandParameters] = js.undefined
    /**
         * Contains the message group ID to use when the target is a FIFO queue. If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
         */
    var SqsParameters: js.UndefOr[SqsParameters] = js.undefined
  }
  
  
  trait TestEventPatternRequest extends js.Object {
    /**
         * The event, in JSON format, to test against the event pattern.
         */
    var Event: String
    /**
         * The event pattern. For more information, see Events and Event Patterns in the Amazon CloudWatch Events User Guide.
         */
    var EventPattern: EventPattern
  }
  
  
  trait TestEventPatternResponse extends js.Object {
    /**
         * Indicates whether the event matches the event pattern.
         */
    var Result: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait TransformerPaths
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TargetInputPath]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect. Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by those other AWS services to support functionality in those services. You can delete these rules using the Force option, but you should do so only if you are sure the other service is not still using that rule.
       */
    def deleteRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect. Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by those other AWS services to support functionality in those services. You can delete these rules using the Force option, but you should do so only if you are sure the other service is not still using that rule.
       */
    def deleteRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect. Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by those other AWS services to support functionality in those services. You can delete these rules using the Force option, but you should do so only if you are sure the other service is not still using that rule.
       */
    def deleteRule(params: DeleteRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect. Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by those other AWS services to support functionality in those services. You can delete these rules using the Force option, but you should do so only if you are sure the other service is not still using that rule.
       */
    def deleteRule(
      params: DeleteRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
       */
    def describeEventBus(): awsDashSdkLib.libRequestMod.Request[DescribeEventBusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
       */
    def describeEventBus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventBusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventBusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
       */
    def describeEventBus(params: DescribeEventBusRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventBusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Displays the external AWS accounts that are permitted to write events to your account using your account's event bus, and the associated policy. To enable your account to receive events from other accounts, use PutPermission.
       */
    def describeEventBus(
      params: DescribeEventBusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventBusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventBusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def describeRule(): awsDashSdkLib.libRequestMod.Request[DescribeRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def describeRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def describeRule(params: DescribeRuleRequest): awsDashSdkLib.libRequestMod.Request[DescribeRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def describeRule(
      params: DescribeRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def disableRule(params: DisableRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
       */
    def disableRule(
      params: DisableRuleRequest,
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
    def enableRule(params: EnableRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
       */
    def enableRule(
      params: EnableRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
       */
    def listRuleNamesByTarget(): awsDashSdkLib.libRequestMod.Request[ListRuleNamesByTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
       */
    def listRuleNamesByTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRuleNamesByTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRuleNamesByTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
       */
    def listRuleNamesByTarget(params: ListRuleNamesByTargetRequest): awsDashSdkLib.libRequestMod.Request[ListRuleNamesByTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a specific target in your account.
       */
    def listRuleNamesByTarget(
      params: ListRuleNamesByTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRuleNamesByTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRuleNamesByTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def listRules(): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def listRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def listRules(params: ListRulesRequest): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
       */
    def listRules(
      params: ListRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the targets assigned to the specified rule.
       */
    def listTargetsByRule(): awsDashSdkLib.libRequestMod.Request[ListTargetsByRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the targets assigned to the specified rule.
       */
    def listTargetsByRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTargetsByRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTargetsByRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the targets assigned to the specified rule.
       */
    def listTargetsByRule(params: ListTargetsByRuleRequest): awsDashSdkLib.libRequestMod.Request[ListTargetsByRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the targets assigned to the specified rule.
       */
    def listTargetsByRule(
      params: ListTargetsByRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTargetsByRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTargetsByRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
       */
    def putEvents(): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
       */
    def putEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
       */
    def putEvents(params: PutEventsRequest): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
       */
    def putEvents(
      params: PutEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. If you grant permissions using an organization, then accounts in that organization must specify a RoleArn with proper permissions when they use PutTarget to add your account's event bus as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. The permission policy on the default event bus cannot exceed 10 KB in size.
       */
    def putPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. If you grant permissions using an organization, then accounts in that organization must specify a RoleArn with proper permissions when they use PutTarget to add your account's event bus as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. The permission policy on the default event bus cannot exceed 10 KB in size.
       */
    def putPermission(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. If you grant permissions using an organization, then accounts in that organization must specify a RoleArn with proper permissions when they use PutTarget to add your account's event bus as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. The permission policy on the default event bus cannot exceed 10 KB in size.
       */
    def putPermission(params: PutPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Running PutPermission permits the specified AWS account or AWS organization to put events to your account's default event bus. CloudWatch Events rules in your account are triggered by these events arriving to your default event bus.  For another account to send events to your account, that external account must have a CloudWatch Events rule with your account's default event bus as a target. To enable multiple AWS accounts to put events to your default event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. If you grant permissions using an organization, then accounts in that organization must specify a RoleArn with proper permissions when they use PutTarget to add your account's event bus as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. The permission policy on the default event bus cannot exceed 10 KB in size.
       */
    def putPermission(
      params: PutPermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match. In CloudWatch Events, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop. To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your rule could fire only if ACLs are found to be in a bad state, instead of after any change.  An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which alerts you when charges exceed your specified limit. For more information, see Managing Your Costs with Budgets.
       */
    def putRule(): awsDashSdkLib.libRequestMod.Request[PutRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match. In CloudWatch Events, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop. To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your rule could fire only if ACLs are found to be in a bad state, instead of after any change.  An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which alerts you when charges exceed your specified limit. For more information, see Managing Your Costs with Budgets.
       */
    def putRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutRuleResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match. In CloudWatch Events, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop. To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your rule could fire only if ACLs are found to be in a bad state, instead of after any change.  An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which alerts you when charges exceed your specified limit. For more information, see Managing Your Costs with Budgets.
       */
    def putRule(params: PutRuleRequest): awsDashSdkLib.libRequestMod.Request[PutRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match. In CloudWatch Events, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop. To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your rule could fire only if ACLs are found to be in a bad state, instead of after any change.  An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which alerts you when charges exceed your specified limit. For more information, see Managing Your Costs with Budgets.
       */
    def putRule(
      params: PutRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutRuleResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a RoleArn with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def putTargets(): awsDashSdkLib.libRequestMod.Request[PutTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a RoleArn with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def putTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a RoleArn with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def putTargets(params: PutTargetsRequest): awsDashSdkLib.libRequestMod.Request[PutTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for CloudWatch Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon CloudWatch Events User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon CloudWatch Pricing. If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a RoleArn with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon CloudWatch Events User Guide. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def putTargets(
      params: PutTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def removePermission(params: RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Revokes the permission of another AWS account to be able to put events to your default event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
       */
    def removePermission(
      params: RemovePermissionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def removeTargets(): awsDashSdkLib.libRequestMod.Request[RemoveTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def removeTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def removeTargets(params: RemoveTargetsRequest): awsDashSdkLib.libRequestMod.Request[RemoveTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
       */
    def removeTargets(
      params: RemoveTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
       */
    def testEventPattern(): awsDashSdkLib.libRequestMod.Request[TestEventPatternResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
       */
    def testEventPattern(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestEventPatternResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestEventPatternResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
       */
    def testEventPattern(params: TestEventPatternRequest): awsDashSdkLib.libRequestMod.Request[TestEventPatternResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
       */
    def testEventPattern(
      params: TestEventPatternRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestEventPatternResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestEventPatternResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type Action = java.lang.String
  type Arn = java.lang.String
  type AssignPublicIp = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EventId = java.lang.String
  type EventPattern = java.lang.String
  type EventResource = java.lang.String
  type EventResourceList = js.Array[EventResource]
  type EventTime = stdLib.Date
  type InputTransformerPathKey = java.lang.String
  type Integer = scala.Double
  type LaunchType = awsDashSdkLib.awsDashSdkLibStrings.EC2 | awsDashSdkLib.awsDashSdkLibStrings.FARGATE | java.lang.String
  type LimitMax100 = scala.Double
  type LimitMin1 = scala.Double
  type ManagedBy = java.lang.String
  type MessageGroupId = java.lang.String
  type NextToken = java.lang.String
  type Principal = java.lang.String
  type PutEventsRequestEntryList = js.Array[PutEventsRequestEntry]
  type PutEventsResultEntryList = js.Array[PutEventsResultEntry]
  type PutTargetsResultEntryList = js.Array[PutTargetsResultEntry]
  type RemoveTargetsResultEntryList = js.Array[RemoveTargetsResultEntry]
  type RoleArn = java.lang.String
  type RuleArn = java.lang.String
  type RuleDescription = java.lang.String
  type RuleName = java.lang.String
  type RuleNameList = js.Array[RuleName]
  type RuleResponseList = js.Array[Rule]
  type RuleState = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type RunCommandTargetKey = java.lang.String
  type RunCommandTargetValue = java.lang.String
  type RunCommandTargetValues = js.Array[RunCommandTargetValue]
  type RunCommandTargets = js.Array[RunCommandTarget]
  type ScheduleExpression = java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TargetArn = java.lang.String
  type TargetId = java.lang.String
  type TargetIdList = js.Array[TargetId]
  type TargetInput = java.lang.String
  type TargetInputPath = java.lang.String
  type TargetList = js.Array[Target]
  type TargetPartitionKeyPath = java.lang.String
  type TransformerInput = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-02-03` | awsDashSdkLib.awsDashSdkLibStrings.`2015-10-07` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

