package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iot", "Iot")
@js.native
object IotNs extends js.Object {
  trait AbortConfig extends js.Object {
    /**
      * The list of abort criteria to define rules to abort the job.
      */
    var criteriaList: AbortCriteriaList
  }
  
  trait AbortCriteria extends js.Object {
    /**
      * The type of abort action to initiate a job abort.
      */
    var action: AbortAction
    /**
      * The type of job execution failure to define a rule to initiate a job abort.
      */
    var failureType: JobExecutionFailureType
    /**
      * Minimum number of executed things before evaluating an abort rule.
      */
    var minNumberOfExecutedThings: MinimumNumberOfExecutedThings
    /**
      * The threshold as a percentage of the total number of executed things that will initiate a job abort. AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
      */
    var thresholdPercentage: AbortThresholdPercentage
  }
  
  trait AcceptCertificateTransferRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
    /**
      * Specifies whether the certificate is active.
      */
    var setAsActive: js.UndefOr[SetAsActive] = js.undefined
  }
  
  trait Action extends js.Object {
    /**
      * Change the state of a CloudWatch alarm.
      */
    var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.undefined
    /**
      * Capture a CloudWatch metric.
      */
    var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.undefined
    /**
      * Write to a DynamoDB table.
      */
    var dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined
    /**
      * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in an MQTT message payload into a separate DynamoDB column.
      */
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined
    /**
      * Write data to an Amazon Elasticsearch Service domain.
      */
    var elasticsearch: js.UndefOr[ElasticsearchAction] = js.undefined
    /**
      * Write to an Amazon Kinesis Firehose stream.
      */
    var firehose: js.UndefOr[FirehoseAction] = js.undefined
    /**
      * Sends message data to an AWS IoT Analytics channel.
      */
    var iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.undefined
    /**
      * Sends an input to an AWS IoT Events detector.
      */
    var iotEvents: js.UndefOr[IotEventsAction] = js.undefined
    /**
      * Write data to an Amazon Kinesis stream.
      */
    var kinesis: js.UndefOr[KinesisAction] = js.undefined
    /**
      * Invoke a Lambda function.
      */
    var lambda: js.UndefOr[LambdaAction] = js.undefined
    /**
      * Publish to another MQTT topic.
      */
    var republish: js.UndefOr[RepublishAction] = js.undefined
    /**
      * Write to an Amazon S3 bucket.
      */
    var s3: js.UndefOr[S3Action] = js.undefined
    /**
      * Send a message to a Salesforce IoT Cloud Input Stream.
      */
    var salesforce: js.UndefOr[SalesforceAction] = js.undefined
    /**
      * Publish to an Amazon SNS topic.
      */
    var sns: js.UndefOr[SnsAction] = js.undefined
    /**
      * Publish to an Amazon SQS queue.
      */
    var sqs: js.UndefOr[SqsAction] = js.undefined
    /**
      * Starts execution of a Step Functions state machine.
      */
    var stepFunctions: js.UndefOr[StepFunctionsAction] = js.undefined
  }
  
  trait ActiveViolation extends js.Object {
    /**
      * The behavior which is being violated.
      */
    var behavior: js.UndefOr[Behavior] = js.undefined
    /**
      * The time the most recent violation occurred.
      */
    var lastViolationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The value of the metric (the measurement) which caused the most recent violation.
      */
    var lastViolationValue: js.UndefOr[MetricValue] = js.undefined
    /**
      * The security profile whose behavior is in violation.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    /**
      * The name of the thing responsible for the active violation.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
    /**
      * The ID of the active violation.
      */
    var violationId: js.UndefOr[ViolationId] = js.undefined
    /**
      * The time the violation started.
      */
    var violationStartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait AddThingToBillingGroupRequest extends js.Object {
    /**
      * The ARN of the billing group.
      */
    var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
    /**
      * The name of the billing group.
      */
    var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    /**
      * The ARN of the thing to be added to the billing group.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The name of the thing to be added to the billing group.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait AddThingToBillingGroupResponse extends js.Object
  
  trait AddThingToThingGroupRequest extends js.Object {
    /**
      * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
      */
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
    /**
      * The ARN of the thing to add to a group.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The ARN of the group to which you are adding a thing.
      */
    var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
    /**
      * The name of the group to which you are adding a thing.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * The name of the thing to add to a group.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait AddThingToThingGroupResponse extends js.Object
  
  trait AdditionalParameterMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Value]
  
  trait AlertTarget extends js.Object {
    /**
      * The ARN of the notification target to which alerts are sent.
      */
    var alertTargetArn: AlertTargetArn
    /**
      * The ARN of the role that grants permission to send alerts to the notification target.
      */
    var roleArn: RoleArn
  }
  
  trait AlertTargets
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AlertTarget]
  
  trait Allowed extends js.Object {
    /**
      * A list of policies that allowed the authentication.
      */
    var policies: js.UndefOr[Policies] = js.undefined
  }
  
  trait AssociateTargetsWithJobRequest extends js.Object {
    /**
      * An optional comment string describing why the job was associated with the targets.
      */
    var comment: js.UndefOr[Comment] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: JobId
    /**
      * A list of thing group ARNs that define the targets of the job.
      */
    var targets: JobTargets
  }
  
  trait AssociateTargetsWithJobResponse extends js.Object {
    /**
      * A short text description of the job.
      */
    var description: js.UndefOr[JobDescription] = js.undefined
    /**
      * An ARN identifying the job.
      */
    var jobArn: js.UndefOr[JobArn] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait AttachPolicyRequest extends js.Object {
    /**
      * The name of the policy to attach.
      */
    var policyName: PolicyName
    /**
      * The identity to which the policy is attached.
      */
    var target: PolicyTarget
  }
  
  trait AttachPrincipalPolicyRequest extends js.Object {
    /**
      * The policy name.
      */
    var policyName: PolicyName
    /**
      * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
      */
    var principal: Principal
  }
  
  trait AttachSecurityProfileRequest extends js.Object {
    /**
      * The security profile that is attached.
      */
    var securityProfileName: SecurityProfileName
    /**
      * The ARN of the target (thing group) to which the security profile is attached.
      */
    var securityProfileTargetArn: SecurityProfileTargetArn
  }
  
  trait AttachSecurityProfileResponse extends js.Object
  
  trait AttachThingPrincipalRequest extends js.Object {
    /**
      * The principal, such as a certificate or other credential.
      */
    var principal: Principal
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait AttachThingPrincipalResponse extends js.Object
  
  trait AttributePayload extends js.Object {
    /**
      * A JSON string containing up to three key-value pair in JSON format. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * Specifies whether the list of attributes provided in the AttributePayload is merged with the attributes stored in the registry, instead of overwriting them. To remove an attribute, call UpdateThing with an empty attribute value.  The merge attribute is only valid when calling UpdateThing. 
      */
    var merge: js.UndefOr[Flag] = js.undefined
  }
  
  trait Attributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait AttributesMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Value]
  
  trait AuditCheckConfiguration extends js.Object {
    /**
      * True if this audit check is enabled for this account.
      */
    var enabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait AuditCheckConfigurations
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AuditCheckConfiguration]
  
  trait AuditCheckDetails extends js.Object {
    /**
      * True if the check completed and found all resources compliant.
      */
    var checkCompliant: js.UndefOr[CheckCompliant] = js.undefined
    /**
      * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
      */
    var checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.undefined
    /**
      * The code of any error encountered when performing this check during this audit. One of "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
      */
    var errorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * The message associated with any error encountered when performing this check during this audit.
      */
    var message: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * The number of resources that the check found non-compliant.
      */
    var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined
    /**
      * The number of resources on which the check was performed.
      */
    var totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
  }
  
  trait AuditDetails
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AuditCheckDetails]
  
  trait AuditFinding extends js.Object {
    /**
      * The audit check that generated this result.
      */
    var checkName: js.UndefOr[AuditCheckName] = js.undefined
    /**
      * The time the result (finding) was discovered.
      */
    var findingTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The resource that was found to be non-compliant with the audit check.
      */
    var nonCompliantResource: js.UndefOr[NonCompliantResource] = js.undefined
    /**
      * The reason the resource was non-compliant.
      */
    var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.undefined
    /**
      * A code which indicates the reason that the resource was non-compliant.
      */
    var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.undefined
    /**
      * The list of related resources.
      */
    var relatedResources: js.UndefOr[RelatedResources] = js.undefined
    /**
      * The severity of the result (finding).
      */
    var severity: js.UndefOr[AuditFindingSeverity] = js.undefined
    /**
      * The ID of the audit that generated this result (finding)
      */
    var taskId: js.UndefOr[AuditTaskId] = js.undefined
    /**
      * The time the audit started.
      */
    var taskStartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait AuditNotificationTarget extends js.Object {
    /**
      * True if notifications to the target are enabled.
      */
    var enabled: js.UndefOr[Enabled] = js.undefined
    /**
      * The ARN of the role that grants permission to send notifications to the target.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The ARN of the target (SNS topic) to which audit notifications are sent.
      */
    var targetArn: js.UndefOr[TargetArn] = js.undefined
  }
  
  trait AuditNotificationTargetConfigurations
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AuditNotificationTarget]
  
  trait AuditTaskMetadata extends js.Object {
    /**
      * The ID of this audit.
      */
    var taskId: js.UndefOr[AuditTaskId] = js.undefined
    /**
      * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
      */
    var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
    /**
      * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
      */
    var taskType: js.UndefOr[AuditTaskType] = js.undefined
  }
  
  trait AuthInfo extends js.Object {
    /**
      * The type of action for which the principal is being authorized.
      */
    var actionType: js.UndefOr[ActionType] = js.undefined
    /**
      * The resources for which the principal is being authorized to perform the specified action.
      */
    var resources: js.UndefOr[Resources] = js.undefined
  }
  
  trait AuthResult extends js.Object {
    /**
      * The policies and statements that allowed the specified action.
      */
    var allowed: js.UndefOr[Allowed] = js.undefined
    /**
      * The final authorization decision of this scenario. Multiple statements are taken into account when determining the authorization decision. An explicit deny statement can override multiple allow statements.
      */
    var authDecision: js.UndefOr[AuthDecision] = js.undefined
    /**
      * Authorization information.
      */
    var authInfo: js.UndefOr[AuthInfo] = js.undefined
    /**
      * The policies and statements that denied the specified action.
      */
    var denied: js.UndefOr[Denied] = js.undefined
    /**
      * Contains any missing context values found while evaluating policy.
      */
    var missingContextValues: js.UndefOr[MissingContextValues] = js.undefined
  }
  
  trait AuthorizerDescription extends js.Object {
    /**
      * The authorizer ARN.
      */
    var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
    /**
      * The authorizer's Lambda function ARN.
      */
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined
    /**
      * The authorizer name.
      */
    var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    /**
      * The UNIX timestamp of when the authorizer was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The UNIX timestamp of when the authorizer was last updated.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The status of the authorizer.
      */
    var status: js.UndefOr[AuthorizerStatus] = js.undefined
    /**
      * The key used to extract the token from the HTTP headers.
      */
    var tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined
    /**
      * The public keys used to validate the token signature returned by your custom authentication service.
      */
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
  }
  
  trait AuthorizerSummary extends js.Object {
    /**
      * The authorizer ARN.
      */
    var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
    /**
      * The authorizer name.
      */
    var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
  }
  
  trait AwsJobExecutionsRolloutConfig extends js.Object {
    /**
      * The maximum number of OTA update job executions started per minute.
      */
    var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
  }
  
  trait Behavior extends js.Object {
    /**
      * The criteria that determine if a device is behaving normally in regard to the metric.
      */
    var criteria: js.UndefOr[BehaviorCriteria] = js.undefined
    /**
      * What is measured by the behavior.
      */
    var metric: js.UndefOr[BehaviorMetric] = js.undefined
    /**
      * The name you have given to the behavior.
      */
    var name: BehaviorName
  }
  
  trait BehaviorCriteria extends js.Object {
    /**
      * The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
      */
    var comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    /**
      * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
      */
    var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined
    /**
      * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
      */
    var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined
    /**
      * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time dimension (for example, NUM_MESSAGES_SENT). For a statisticalThreshhold metric comparison, measurements from all devices are accumulated over this time duration before being used to calculate percentiles, and later, measurements from an individual device are also accumulated over this time duration before being given a percentile rank.
      */
    var durationSeconds: js.UndefOr[DurationSeconds] = js.undefined
    /**
      * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
      */
    var statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.undefined
    /**
      * The value to be compared with the metric.
      */
    var value: js.UndefOr[MetricValue] = js.undefined
  }
  
  trait BillingGroupMetadata extends js.Object {
    /**
      * The date the billing group was created.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
  }
  
  trait BillingGroupProperties extends js.Object {
    /**
      * The description of the billing group.
      */
    var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.undefined
  }
  
  trait CACertificate extends js.Object {
    /**
      * The ARN of the CA certificate.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The ID of the CA certificate.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The date the CA certificate was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The status of the CA certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
      */
    var status: js.UndefOr[CACertificateStatus] = js.undefined
  }
  
  trait CACertificateDescription extends js.Object {
    /**
      * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and "DISABLE"
      */
    var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined
    /**
      * The CA certificate ARN.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The CA certificate ID.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The CA certificate data, in PEM format.
      */
    var certificatePem: js.UndefOr[CertificatePem] = js.undefined
    /**
      * The date the CA certificate was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The customer version of the CA certificate.
      */
    var customerVersion: js.UndefOr[CustomerVersion] = js.undefined
    /**
      * The generation ID of the CA certificate.
      */
    var generationId: js.UndefOr[GenerationId] = js.undefined
    /**
      * The date the CA certificate was last modified.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The owner of the CA certificate.
      */
    var ownedBy: js.UndefOr[AwsAccountId] = js.undefined
    /**
      * The status of a CA certificate.
      */
    var status: js.UndefOr[CACertificateStatus] = js.undefined
    /**
      * When the CA certificate is valid.
      */
    var validity: js.UndefOr[CertificateValidity] = js.undefined
  }
  
  trait CancelAuditTaskRequest extends js.Object {
    /**
      * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
      */
    var taskId: AuditTaskId
  }
  
  trait CancelAuditTaskResponse extends js.Object
  
  trait CancelCertificateTransferRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
  }
  
  trait CancelJobExecutionRequest extends js.Object {
    /**
      * (Optional) The expected current version of the job execution. Each time you update the job execution, its version is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job execution status data.)
      */
    var expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined
    /**
      * (Optional) If true the job execution will be canceled if it has status IN_PROGRESS or QUEUED, otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job execution that is IN_PROGRESS, and you do not set force to true, then an InvalidStateTransitionException will be thrown. The default is false. Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution status. Use caution and ensure that the device is able to recover to a valid state.
      */
    var force: js.UndefOr[ForceFlag] = js.undefined
    /**
      * The ID of the job to be canceled.
      */
    var jobId: JobId
    /**
      * A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged. You can specify at most 10 name/value pairs.
      */
    var statusDetails: js.UndefOr[DetailsMap] = js.undefined
    /**
      * The name of the thing whose execution of the job will be canceled.
      */
    var thingName: ThingName
  }
  
  trait CancelJobRequest extends js.Object {
    /**
      * An optional comment string describing why the job was canceled.
      */
    var comment: js.UndefOr[Comment] = js.undefined
    /**
      * (Optional) If true job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job executions with status "QUEUED" are canceled. The default is false. Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the job execution status. Use caution and ensure that each device executing a job which is canceled is able to recover to a valid state.
      */
    var force: js.UndefOr[ForceFlag] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: JobId
    /**
      * (Optional)A reason code string that explains why the job was canceled.
      */
    var reasonCode: js.UndefOr[ReasonCode] = js.undefined
  }
  
  trait CancelJobResponse extends js.Object {
    /**
      * A short text description of the job.
      */
    var description: js.UndefOr[JobDescription] = js.undefined
    /**
      * The job ARN.
      */
    var jobArn: js.UndefOr[JobArn] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait Certificate extends js.Object {
    /**
      * The ARN of the certificate.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The date and time the certificate was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The status of the certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
      */
    var status: js.UndefOr[CertificateStatus] = js.undefined
  }
  
  trait CertificateDescription extends js.Object {
    /**
      * The certificate ID of the CA certificate used to sign this certificate.
      */
    var caCertificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The ARN of the certificate.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The ID of the certificate.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The certificate data, in PEM format.
      */
    var certificatePem: js.UndefOr[CertificatePem] = js.undefined
    /**
      * The date and time the certificate was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The customer version of the certificate.
      */
    var customerVersion: js.UndefOr[CustomerVersion] = js.undefined
    /**
      * The generation ID of the certificate.
      */
    var generationId: js.UndefOr[GenerationId] = js.undefined
    /**
      * The date and time the certificate was last modified.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The ID of the AWS account that owns the certificate.
      */
    var ownedBy: js.UndefOr[AwsAccountId] = js.undefined
    /**
      * The ID of the AWS account of the previous owner of the certificate.
      */
    var previousOwnedBy: js.UndefOr[AwsAccountId] = js.undefined
    /**
      * The status of the certificate.
      */
    var status: js.UndefOr[CertificateStatus] = js.undefined
    /**
      * The transfer data.
      */
    var transferData: js.UndefOr[TransferData] = js.undefined
    /**
      * When the certificate is valid.
      */
    var validity: js.UndefOr[CertificateValidity] = js.undefined
  }
  
  trait CertificateValidity extends js.Object {
    /**
      * The certificate is not valid after this date.
      */
    var notAfter: js.UndefOr[DateType] = js.undefined
    /**
      * The certificate is not valid before this date.
      */
    var notBefore: js.UndefOr[DateType] = js.undefined
  }
  
  trait ClearDefaultAuthorizerRequest extends js.Object
  
  trait ClearDefaultAuthorizerResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudwatchAlarmAction extends js.Object {
    /**
      * The CloudWatch alarm name.
      */
    var alarmName: AlarmName
    /**
      * The IAM role that allows access to the CloudWatch alarm.
      */
    var roleArn: AwsArn
    /**
      * The reason for the alarm change.
      */
    var stateReason: StateReason
    /**
      * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
      */
    var stateValue: StateValue
  }
  
  trait CloudwatchMetricAction extends js.Object {
    /**
      * The CloudWatch metric name.
      */
    var metricName: String
    /**
      * The CloudWatch metric namespace name.
      */
    var metricNamespace: String
    /**
      * An optional Unix timestamp.
      */
    var metricTimestamp: js.UndefOr[String] = js.undefined
    /**
      * The metric unit supported by CloudWatch.
      */
    var metricUnit: String
    /**
      * The CloudWatch metric value.
      */
    var metricValue: String
    /**
      * The IAM role that allows access to the CloudWatch metric.
      */
    var roleArn: AwsArn
  }
  
  trait CodeSigning extends js.Object {
    /**
      * The ID of the AWSSignerJob which was created to sign the file.
      */
    var awsSignerJobId: js.UndefOr[SigningJobId] = js.undefined
    /**
      * A custom method for code signing a file.
      */
    var customCodeSigning: js.UndefOr[CustomCodeSigning] = js.undefined
    /**
      * Describes the code-signing job.
      */
    var startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.undefined
  }
  
  trait CodeSigningCertificateChain extends js.Object {
    /**
      * The name of the certificate.
      */
    var certificateName: js.UndefOr[CertificateName] = js.undefined
    /**
      * A base64 encoded binary representation of the code signing certificate chain.
      */
    var inlineDocument: js.UndefOr[InlineDocument] = js.undefined
  }
  
  trait CodeSigningSignature extends js.Object {
    /**
      * A base64 encoded binary representation of the code signing signature.
      */
    var inlineDocument: js.UndefOr[Signature] = js.undefined
  }
  
  trait Configuration extends js.Object {
    /**
      * True to enable the configuration.
      */
    var Enabled: js.UndefOr[Enabled] = js.undefined
  }
  
  trait CreateAuthorizerRequest extends js.Object {
    /**
      * The ARN of the authorizer's Lambda function.
      */
    var authorizerFunctionArn: AuthorizerFunctionArn
    /**
      * The authorizer name.
      */
    var authorizerName: AuthorizerName
    /**
      * The status of the create authorizer request.
      */
    var status: js.UndefOr[AuthorizerStatus] = js.undefined
    /**
      * The name of the token key used to extract the token from the HTTP headers.
      */
    var tokenKeyName: TokenKeyName
    /**
      * The public keys used to verify the digital signature returned by your custom authentication service.
      */
    var tokenSigningPublicKeys: PublicKeyMap
  }
  
  trait CreateAuthorizerResponse extends js.Object {
    /**
      * The authorizer ARN.
      */
    var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
    /**
      * The authorizer's name.
      */
    var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
  }
  
  trait CreateBillingGroupRequest extends js.Object {
    /**
      * The name you wish to give to the billing group.
      */
    var billingGroupName: BillingGroupName
    /**
      * The properties of the billing group.
      */
    var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
    /**
      * Metadata which can be used to manage the billing group.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateBillingGroupResponse extends js.Object {
    /**
      * The ARN of the billing group.
      */
    var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
    /**
      * The ID of the billing group.
      */
    var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
    /**
      * The name you gave to the billing group.
      */
    var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  }
  
  trait CreateCertificateFromCsrRequest extends js.Object {
    /**
      * The certificate signing request (CSR).
      */
    var certificateSigningRequest: CertificateSigningRequest
    /**
      * Specifies whether the certificate is active.
      */
    var setAsActive: js.UndefOr[SetAsActive] = js.undefined
  }
  
  trait CreateCertificateFromCsrResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the certificate. You can use the ARN as a principal for policy operations.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The ID of the certificate. Certificate management operations only take a certificateId.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The certificate data, in PEM format.
      */
    var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  }
  
  trait CreateDynamicThingGroupRequest extends js.Object {
    /**
      * The dynamic thing group index name.  Currently one index is supported: "AWS_Things". 
      */
    var indexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The dynamic thing group search query string. See Query Syntax for information about query string syntax.
      */
    var queryString: QueryString
    /**
      * The dynamic thing group query version.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
      */
    var queryVersion: js.UndefOr[QueryVersion] = js.undefined
    /**
      * Metadata which can be used to manage the dynamic thing group.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * The dynamic thing group name to create.
      */
    var thingGroupName: ThingGroupName
    /**
      * The dynamic thing group properties.
      */
    var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
  }
  
  trait CreateDynamicThingGroupResponse extends js.Object {
    /**
      * The dynamic thing group index name.
      */
    var indexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The dynamic thing group search query string.
      */
    var queryString: js.UndefOr[QueryString] = js.undefined
    /**
      * The dynamic thing group query version.
      */
    var queryVersion: js.UndefOr[QueryVersion] = js.undefined
    /**
      * The dynamic thing group ARN.
      */
    var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
    /**
      * The dynamic thing group ID.
      */
    var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
    /**
      * The dynamic thing group name.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  }
  
  trait CreateJobRequest extends js.Object {
    /**
      * Allows you to create criteria to abort a job.
      */
    var abortConfig: js.UndefOr[AbortConfig] = js.undefined
    /**
      * A short text description of the job.
      */
    var description: js.UndefOr[JobDescription] = js.undefined
    /**
      * The job document.  If the job document resides in an S3 bucket, you must use a placeholder link when specifying the document. The placeholder link is of the following form:  ${aws:iot:s3-presigned-url:https://s3.amazonaws.com/bucket/key}  where bucket is your bucket name and key is the object in the bucket to which you are linking. 
      */
    var document: js.UndefOr[JobDocument] = js.undefined
    /**
      * An S3 link to the job document.
      */
    var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
    /**
      * Allows you to create a staged rollout of the job.
      */
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
    /**
      * A job identifier which must be unique for your AWS account. We recommend using a UUID. Alpha-numeric characters, "-" and "_" are valid for use here.
      */
    var jobId: JobId
    /**
      * Configuration information for pre-signed S3 URLs.
      */
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
    /**
      * Metadata which can be used to manage the job.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
      */
    var targetSelection: js.UndefOr[TargetSelection] = js.undefined
    /**
      * A list of things and thing groups to which the job should be sent.
      */
    var targets: JobTargets
    /**
      * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT.
      */
    var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
  }
  
  trait CreateJobResponse extends js.Object {
    /**
      * The job description.
      */
    var description: js.UndefOr[JobDescription] = js.undefined
    /**
      * The job ARN.
      */
    var jobArn: js.UndefOr[JobArn] = js.undefined
    /**
      * The unique identifier you assigned to this job.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait CreateKeysAndCertificateRequest extends js.Object {
    /**
      * Specifies whether the certificate is active.
      */
    var setAsActive: js.UndefOr[SetAsActive] = js.undefined
  }
  
  trait CreateKeysAndCertificateResponse extends js.Object {
    /**
      * The ARN of the certificate.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT Certificate).
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The certificate data, in PEM format.
      */
    var certificatePem: js.UndefOr[CertificatePem] = js.undefined
    /**
      * The generated key pair.
      */
    var keyPair: js.UndefOr[KeyPair] = js.undefined
  }
  
  trait CreateOTAUpdateRequest extends js.Object {
    /**
      * A list of additional OTA update parameters which are name-value pairs.
      */
    var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined
    /**
      * Configuration for the rollout of OTA updates.
      */
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined
    /**
      * The description of the OTA update.
      */
    var description: js.UndefOr[OTAUpdateDescription] = js.undefined
    /**
      * The files to be streamed by the OTA update.
      */
    var files: OTAUpdateFiles
    /**
      * The ID of the OTA update to be created.
      */
    var otaUpdateId: OTAUpdateId
    /**
      * The IAM role that allows access to the AWS IoT Jobs service.
      */
    var roleArn: RoleArn
    /**
      * Metadata which can be used to manage updates.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing when a change is detected in a target. For example, an update will run on a thing when the thing is added to a target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS | SNAPSHOT.
      */
    var targetSelection: js.UndefOr[TargetSelection] = js.undefined
    /**
      * The targeted devices to receive OTA updates.
      */
    var targets: Targets
  }
  
  trait CreateOTAUpdateResponse extends js.Object {
    /**
      * The AWS IoT job ARN associated with the OTA update.
      */
    var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined
    /**
      * The AWS IoT job ID associated with the OTA update.
      */
    var awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined
    /**
      * The OTA update ARN.
      */
    var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
    /**
      * The OTA update ID.
      */
    var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
    /**
      * The OTA update status.
      */
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
  }
  
  trait CreatePolicyRequest extends js.Object {
    /**
      * The JSON document that describes the policy. policyDocument must have a minimum length of 1, with a maximum length of 2048, excluding whitespace.
      */
    var policyDocument: PolicyDocument
    /**
      * The policy name.
      */
    var policyName: PolicyName
  }
  
  trait CreatePolicyResponse extends js.Object {
    /**
      * The policy ARN.
      */
    var policyArn: js.UndefOr[PolicyArn] = js.undefined
    /**
      * The JSON document that describes the policy.
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * The policy name.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
    /**
      * The policy version ID.
      */
    var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
  }
  
  trait CreatePolicyVersionRequest extends js.Object {
    /**
      * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
      */
    var policyDocument: PolicyDocument
    /**
      * The policy name.
      */
    var policyName: PolicyName
    /**
      * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version becomes the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
      */
    var setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
  }
  
  trait CreatePolicyVersionResponse extends js.Object {
    /**
      * Specifies whether the policy version is the default.
      */
    var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
    /**
      * The policy ARN.
      */
    var policyArn: js.UndefOr[PolicyArn] = js.undefined
    /**
      * The JSON document that describes the policy.
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * The policy version ID.
      */
    var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
  }
  
  trait CreateRoleAliasRequest extends js.Object {
    /**
      * How long (in seconds) the credentials will be valid.
      */
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
    /**
      * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
      */
    var roleAlias: RoleAlias
    /**
      * The role ARN.
      */
    var roleArn: RoleArn
  }
  
  trait CreateRoleAliasResponse extends js.Object {
    /**
      * The role alias.
      */
    var roleAlias: js.UndefOr[RoleAlias] = js.undefined
    /**
      * The role alias ARN.
      */
    var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
  }
  
  trait CreateScheduledAuditRequest extends js.Object {
    /**
      * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
      */
    var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
    /**
      * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
      */
    var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    /**
      * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is determined by the system.
      */
    var frequency: AuditFrequency
    /**
      * The name you want to give to the scheduled audit. (Max. 128 chars)
      */
    var scheduledAuditName: ScheduledAuditName
    /**
      * Metadata which can be used to manage the scheduled audit.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.)
      */
    var targetCheckNames: TargetAuditCheckNames
  }
  
  trait CreateScheduledAuditResponse extends js.Object {
    /**
      * The ARN of the scheduled audit.
      */
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
  }
  
  trait CreateSecurityProfileRequest extends js.Object {
    /**
      * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors but it is also retained for any metric specified here.
      */
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
    /**
      * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a behavior.
      */
    var alertTargets: js.UndefOr[AlertTargets] = js.undefined
    /**
      * Specifies the behaviors that, when violated by a device (thing), cause an alert.
      */
    var behaviors: js.UndefOr[Behaviors] = js.undefined
    /**
      * A description of the security profile.
      */
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
    /**
      * The name you are giving to the security profile.
      */
    var securityProfileName: SecurityProfileName
    /**
      * Metadata which can be used to manage the security profile.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateSecurityProfileResponse extends js.Object {
    /**
      * The ARN of the security profile.
      */
    var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
    /**
      * The name you gave to the security profile.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  }
  
  trait CreateStreamRequest extends js.Object {
    /**
      * A description of the stream.
      */
    var description: js.UndefOr[StreamDescription] = js.undefined
    /**
      * The files to stream.
      */
    var files: StreamFiles
    /**
      * An IAM role that allows the IoT service principal assumes to access your S3 files.
      */
    var roleArn: RoleArn
    /**
      * The stream ID.
      */
    var streamId: StreamId
    /**
      * Metadata which can be used to manage streams.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateStreamResponse extends js.Object {
    /**
      * A description of the stream.
      */
    var description: js.UndefOr[StreamDescription] = js.undefined
    /**
      * The stream ARN.
      */
    var streamArn: js.UndefOr[StreamArn] = js.undefined
    /**
      * The stream ID.
      */
    var streamId: js.UndefOr[StreamId] = js.undefined
    /**
      * The version of the stream.
      */
    var streamVersion: js.UndefOr[StreamVersion] = js.undefined
  }
  
  trait CreateThingGroupRequest extends js.Object {
    /**
      * The name of the parent thing group.
      */
    var parentGroupName: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * Metadata which can be used to manage the thing group.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * The thing group name to create.
      */
    var thingGroupName: ThingGroupName
    /**
      * The thing group properties.
      */
    var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
  }
  
  trait CreateThingGroupResponse extends js.Object {
    /**
      * The thing group ARN.
      */
    var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
    /**
      * The thing group ID.
      */
    var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
    /**
      * The thing group name.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  }
  
  trait CreateThingRequest extends js.Object {
    /**
      * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
      */
    var attributePayload: js.UndefOr[AttributePayload] = js.undefined
    /**
      * The name of the billing group the thing will be added to.
      */
    var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    /**
      * The name of the thing to create.
      */
    var thingName: ThingName
    /**
      * The name of the thing type associated with the new thing.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  }
  
  trait CreateThingResponse extends js.Object {
    /**
      * The ARN of the new thing.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The thing ID.
      */
    var thingId: js.UndefOr[ThingId] = js.undefined
    /**
      * The name of the new thing.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait CreateThingTypeRequest extends js.Object {
    /**
      * Metadata which can be used to manage the thing type.
      */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
      * The name of the thing type.
      */
    var thingTypeName: ThingTypeName
    /**
      * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including a description, and a list of searchable thing attribute names.
      */
    var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
  }
  
  trait CreateThingTypeResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the thing type.
      */
    var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
    /**
      * The thing type ID.
      */
    var thingTypeId: js.UndefOr[ThingTypeId] = js.undefined
    /**
      * The name of the thing type.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  }
  
  trait CreateTopicRuleRequest extends js.Object {
    /**
      * The name of the rule.
      */
    var ruleName: RuleName
    /**
      * Metadata which can be used to manage the topic rule.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
      */
    var tags: js.UndefOr[String] = js.undefined
    /**
      * The rule payload.
      */
    var topicRulePayload: TopicRulePayload
  }
  
  trait CustomCodeSigning extends js.Object {
    /**
      * The certificate chain.
      */
    var certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.undefined
    /**
      * The hash algorithm used to code sign the file.
      */
    var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
    /**
      * The signature for the file.
      */
    var signature: js.UndefOr[CodeSigningSignature] = js.undefined
    /**
      * The signature algorithm used to code sign the file.
      */
    var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined
  }
  
  trait DeleteAccountAuditConfigurationRequest extends js.Object {
    /**
      * If true, all scheduled audits are deleted.
      */
    var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined
  }
  
  trait DeleteAccountAuditConfigurationResponse extends js.Object
  
  trait DeleteAuthorizerRequest extends js.Object {
    /**
      * The name of the authorizer to delete.
      */
    var authorizerName: AuthorizerName
  }
  
  trait DeleteAuthorizerResponse extends js.Object
  
  trait DeleteBillingGroupRequest extends js.Object {
    /**
      * The name of the billing group.
      */
    var billingGroupName: BillingGroupName
    /**
      * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the DeleteBillingGroup request is rejected with a VersionConflictException.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  }
  
  trait DeleteBillingGroupResponse extends js.Object
  
  trait DeleteCACertificateRequest extends js.Object {
    /**
      * The ID of the certificate to delete. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
  }
  
  trait DeleteCACertificateResponse extends js.Object
  
  trait DeleteCertificateRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
    /**
      * Forces a certificate request to be deleted.
      */
    var forceDelete: js.UndefOr[ForceDelete] = js.undefined
  }
  
  trait DeleteDynamicThingGroupRequest extends js.Object {
    /**
      * The expected version of the dynamic thing group to delete.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * The name of the dynamic thing group to delete.
      */
    var thingGroupName: ThingGroupName
  }
  
  trait DeleteDynamicThingGroupResponse extends js.Object
  
  trait DeleteJobExecutionRequest extends js.Object {
    /**
      * The ID of the job execution to be deleted. The executionNumber refers to the execution of a particular job on a particular device. Note that once a job execution is deleted, the executionNumber may be reused by IoT, so be sure you get and use the correct value here.
      */
    var executionNumber: ExecutionNumber
    /**
      * (Optional) When true, you can delete a job execution which is "IN_PROGRESS". Otherwise, you can only delete a job execution which is in a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or "CANCELED") or an exception will occur. The default is false.  Deleting a job execution which is "IN_PROGRESS", will cause the device to be unable to access job information or update the job execution status. Use caution and ensure that the device is able to recover to a valid state. 
      */
    var force: js.UndefOr[ForceFlag] = js.undefined
    /**
      * The ID of the job whose execution on a particular device will be deleted.
      */
    var jobId: JobId
    /**
      * The name of the thing whose job execution will be deleted.
      */
    var thingName: ThingName
  }
  
  trait DeleteJobRequest extends js.Object {
    /**
      * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.  Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job information or update the job execution status. Use caution and ensure that each device executing a job which is deleted is able to recover to a valid state. 
      */
    var force: js.UndefOr[ForceFlag] = js.undefined
    /**
      * The ID of the job to be deleted. After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is not recommended, and you must ensure that your devices are not using the jobId to refer to the deleted job.
      */
    var jobId: JobId
  }
  
  trait DeleteOTAUpdateRequest extends js.Object {
    /**
      * Specifies if the stream associated with an OTA update should be deleted when the OTA update is deleted.
      */
    var deleteStream: js.UndefOr[DeleteStream] = js.undefined
    /**
      * Specifies if the AWS Job associated with the OTA update should be deleted with the OTA update is deleted.
      */
    var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
    /**
      * The OTA update ID to delete.
      */
    var otaUpdateId: OTAUpdateId
  }
  
  trait DeleteOTAUpdateResponse extends js.Object
  
  trait DeletePolicyRequest extends js.Object {
    /**
      * The name of the policy to delete.
      */
    var policyName: PolicyName
  }
  
  trait DeletePolicyVersionRequest extends js.Object {
    /**
      * The name of the policy.
      */
    var policyName: PolicyName
    /**
      * The policy version ID.
      */
    var policyVersionId: PolicyVersionId
  }
  
  trait DeleteRegistrationCodeRequest extends js.Object
  
  trait DeleteRegistrationCodeResponse extends js.Object
  
  trait DeleteRoleAliasRequest extends js.Object {
    /**
      * The role alias to delete.
      */
    var roleAlias: RoleAlias
  }
  
  trait DeleteRoleAliasResponse extends js.Object
  
  trait DeleteScheduledAuditRequest extends js.Object {
    /**
      * The name of the scheduled audit you want to delete.
      */
    var scheduledAuditName: ScheduledAuditName
  }
  
  trait DeleteScheduledAuditResponse extends js.Object
  
  trait DeleteSecurityProfileRequest extends js.Object {
    /**
      * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different than the actual version, a VersionConflictException is thrown.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * The name of the security profile to be deleted.
      */
    var securityProfileName: SecurityProfileName
  }
  
  trait DeleteSecurityProfileResponse extends js.Object
  
  trait DeleteStreamRequest extends js.Object {
    /**
      * The stream ID.
      */
    var streamId: StreamId
  }
  
  trait DeleteStreamResponse extends js.Object
  
  trait DeleteThingGroupRequest extends js.Object {
    /**
      * The expected version of the thing group to delete.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * The name of the thing group to delete.
      */
    var thingGroupName: ThingGroupName
  }
  
  trait DeleteThingGroupResponse extends js.Object
  
  trait DeleteThingRequest extends js.Object {
    /**
      * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the DeleteThing request is rejected with a VersionConflictException.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * The name of the thing to delete.
      */
    var thingName: ThingName
  }
  
  trait DeleteThingResponse extends js.Object
  
  trait DeleteThingTypeRequest extends js.Object {
    /**
      * The name of the thing type.
      */
    var thingTypeName: ThingTypeName
  }
  
  trait DeleteThingTypeResponse extends js.Object
  
  trait DeleteTopicRuleRequest extends js.Object {
    /**
      * The name of the rule.
      */
    var ruleName: RuleName
  }
  
  trait DeleteV2LoggingLevelRequest extends js.Object {
    /**
      * The name of the resource for which you are configuring logging.
      */
    var targetName: LogTargetName
    /**
      * The type of resource for which you are configuring logging. Must be THING_Group.
      */
    var targetType: LogTargetType
  }
  
  trait Denied extends js.Object {
    /**
      * Information that explicitly denies the authorization. 
      */
    var explicitDeny: js.UndefOr[ExplicitDeny] = js.undefined
    /**
      * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
      */
    var implicitDeny: js.UndefOr[ImplicitDeny] = js.undefined
  }
  
  trait DeprecateThingTypeRequest extends js.Object {
    /**
      * The name of the thing type to deprecate.
      */
    var thingTypeName: ThingTypeName
    /**
      * Whether to undeprecate a deprecated thing type. If true, the thing type will not be deprecated anymore and you can associate it with things.
      */
    var undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined
  }
  
  trait DeprecateThingTypeResponse extends js.Object
  
  trait DescribeAccountAuditConfigurationRequest extends js.Object
  
  trait DescribeAccountAuditConfigurationResponse extends js.Object {
    /**
      * Which audit checks are enabled and disabled for this account.
      */
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined
    /**
      * Information about the targets to which audit notifications are sent for this account.
      */
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined
    /**
      * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as necessary when performing an audit. On the first call to UpdateAccountAuditConfiguration this parameter is required.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait DescribeAuditTaskRequest extends js.Object {
    /**
      * The ID of the audit whose information you want to get.
      */
    var taskId: AuditTaskId
  }
  
  trait DescribeAuditTaskResponse extends js.Object {
    /**
      * Detailed information about each check performed during this audit.
      */
    var auditDetails: js.UndefOr[AuditDetails] = js.undefined
    /**
      * The name of the scheduled audit (only if the audit was a scheduled audit).
      */
    var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
    /**
      * The time the audit started.
      */
    var taskStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Statistical information about the audit.
      */
    var taskStatistics: js.UndefOr[TaskStatistics] = js.undefined
    /**
      * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
      */
    var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
    /**
      * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
      */
    var taskType: js.UndefOr[AuditTaskType] = js.undefined
  }
  
  trait DescribeAuthorizerRequest extends js.Object {
    /**
      * The name of the authorizer to describe.
      */
    var authorizerName: AuthorizerName
  }
  
  trait DescribeAuthorizerResponse extends js.Object {
    /**
      * The authorizer description.
      */
    var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
  }
  
  trait DescribeBillingGroupRequest extends js.Object {
    /**
      * The name of the billing group.
      */
    var billingGroupName: BillingGroupName
  }
  
  trait DescribeBillingGroupResponse extends js.Object {
    /**
      * The ARN of the billing group.
      */
    var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
    /**
      * The ID of the billing group.
      */
    var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
    /**
      * Additional information about the billing group.
      */
    var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined
    /**
      * The name of the billing group.
      */
    var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    /**
      * The properties of the billing group.
      */
    var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
    /**
      * The version of the billing group.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeCACertificateRequest extends js.Object {
    /**
      * The CA certificate identifier.
      */
    var certificateId: CertificateId
  }
  
  trait DescribeCACertificateResponse extends js.Object {
    /**
      * The CA certificate description.
      */
    var certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined
    /**
      * Information about the registration configuration.
      */
    var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
  }
  
  trait DescribeCertificateRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
  }
  
  trait DescribeCertificateResponse extends js.Object {
    /**
      * The description of the certificate.
      */
    var certificateDescription: js.UndefOr[CertificateDescription] = js.undefined
  }
  
  trait DescribeDefaultAuthorizerRequest extends js.Object
  
  trait DescribeDefaultAuthorizerResponse extends js.Object {
    /**
      * The default authorizer's description.
      */
    var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
  }
  
  trait DescribeEndpointRequest extends js.Object {
    /**
      * The endpoint type. Valid endpoint types include:    iot:Data - Returns a VeriSign signed data endpoint.      iot:Data-ATS - Returns an ATS signed data endpoint.      iot:CredentialProvider - Returns an AWS IoT credentials provider API endpoint.      iot:Jobs - Returns an AWS IoT device management Jobs API endpoint.  
      */
    var endpointType: js.UndefOr[EndpointType] = js.undefined
  }
  
  trait DescribeEndpointResponse extends js.Object {
    /**
      * The endpoint. The format of the endpoint is as follows: identifier.iot.region.amazonaws.com.
      */
    var endpointAddress: js.UndefOr[EndpointAddress] = js.undefined
  }
  
  trait DescribeEventConfigurationsRequest extends js.Object
  
  trait DescribeEventConfigurationsResponse extends js.Object {
    /**
      * The creation date of the event configuration.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * The event configurations.
      */
    var eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
    /**
      * The date the event configurations were last modified.
      */
    var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
  }
  
  trait DescribeIndexRequest extends js.Object {
    /**
      * The index name.
      */
    var indexName: IndexName
  }
  
  trait DescribeIndexResponse extends js.Object {
    /**
      * The index name.
      */
    var indexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The index status.
      */
    var indexStatus: js.UndefOr[IndexStatus] = js.undefined
    /**
      * Contains a value that specifies the type of indexing performed. Valid values are:   REGISTRY – Your thing index will contain only registry data.   REGISTRY_AND_SHADOW - Your thing index will contain registry data and shadow data.   REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index will contain registry data and thing connectivity status data.   REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index will contain registry data, shadow data, and thing connectivity status data.  
      */
    var schema: js.UndefOr[IndexSchema] = js.undefined
  }
  
  trait DescribeJobExecutionRequest extends js.Object {
    /**
      * A string (consisting of the digits "0" through "9" which is used to specify a particular job execution on a particular device.
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: JobId
    /**
      * The name of the thing on which the job execution is running.
      */
    var thingName: ThingName
  }
  
  trait DescribeJobExecutionResponse extends js.Object {
    /**
      * Information about the job execution.
      */
    var execution: js.UndefOr[JobExecution] = js.undefined
  }
  
  trait DescribeJobRequest extends js.Object {
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: JobId
  }
  
  trait DescribeJobResponse extends js.Object {
    /**
      * An S3 link to the job document.
      */
    var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
    /**
      * Information about the job.
      */
    var job: js.UndefOr[Job] = js.undefined
  }
  
  trait DescribeRoleAliasRequest extends js.Object {
    /**
      * The role alias to describe.
      */
    var roleAlias: RoleAlias
  }
  
  trait DescribeRoleAliasResponse extends js.Object {
    /**
      * The role alias description.
      */
    var roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.undefined
  }
  
  trait DescribeScheduledAuditRequest extends js.Object {
    /**
      * The name of the scheduled audit whose information you want to get.
      */
    var scheduledAuditName: ScheduledAuditName
  }
  
  trait DescribeScheduledAuditResponse extends js.Object {
    /**
      * The day of the month on which the scheduled audit takes place. Will be "1" through "31" or "LAST". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
      */
    var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
    /**
      * The day of the week on which the scheduled audit takes place. One of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT".
      */
    var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    /**
      * How often the scheduled audit takes place. One of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is determined by the system.
      */
    var frequency: js.UndefOr[AuditFrequency] = js.undefined
    /**
      * The ARN of the scheduled audit.
      */
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
    /**
      * The name of the scheduled audit.
      */
    var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
    /**
      * Which checks are performed during the scheduled audit. (Note that checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.)
      */
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
  }
  
  trait DescribeSecurityProfileRequest extends js.Object {
    /**
      * The name of the security profile whose information you want to get.
      */
    var securityProfileName: SecurityProfileName
  }
  
  trait DescribeSecurityProfileResponse extends js.Object {
    /**
      * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors but it is also retained for any metric specified here.
      */
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
    /**
      * Where the alerts are sent. (Alerts are always sent to the console.)
      */
    var alertTargets: js.UndefOr[AlertTargets] = js.undefined
    /**
      * Specifies the behaviors that, when violated by a device (thing), cause an alert.
      */
    var behaviors: js.UndefOr[Behaviors] = js.undefined
    /**
      * The time the security profile was created.
      */
    var creationDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time the security profile was last modified.
      */
    var lastModifiedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The ARN of the security profile.
      */
    var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
    /**
      * A description of the security profile (associated with the security profile when it was created or updated).
      */
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
    /**
      * The name of the security profile.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    /**
      * The version of the security profile. A new version is generated whenever the security profile is updated.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeStreamRequest extends js.Object {
    /**
      * The stream ID.
      */
    var streamId: StreamId
  }
  
  trait DescribeStreamResponse extends js.Object {
    /**
      * Information about the stream.
      */
    var streamInfo: js.UndefOr[StreamInfo] = js.undefined
  }
  
  trait DescribeThingGroupRequest extends js.Object {
    /**
      * The name of the thing group.
      */
    var thingGroupName: ThingGroupName
  }
  
  trait DescribeThingGroupResponse extends js.Object {
    /**
      * The dynamic thing group index name.
      */
    var indexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The dynamic thing group search query string.
      */
    var queryString: js.UndefOr[QueryString] = js.undefined
    /**
      * The dynamic thing group query version.
      */
    var queryVersion: js.UndefOr[QueryVersion] = js.undefined
    /**
      * The dynamic thing group status.
      */
    var status: js.UndefOr[DynamicGroupStatus] = js.undefined
    /**
      * The thing group ARN.
      */
    var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
    /**
      * The thing group ID.
      */
    var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
    /**
      * Thing group metadata.
      */
    var thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.undefined
    /**
      * The name of the thing group.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * The thing group properties.
      */
    var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
    /**
      * The version of the thing group.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeThingRegistrationTaskRequest extends js.Object {
    /**
      * The task ID.
      */
    var taskId: TaskId
  }
  
  trait DescribeThingRegistrationTaskResponse extends js.Object {
    /**
      * The task creation date.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * The number of things that failed to be provisioned.
      */
    var failureCount: js.UndefOr[Count] = js.undefined
    /**
      * The S3 bucket that contains the input file.
      */
    var inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.undefined
    /**
      * The input file key.
      */
    var inputFileKey: js.UndefOr[RegistryS3KeyName] = js.undefined
    /**
      * The date when the task was last modified.
      */
    var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
    /**
      * The message.
      */
    var message: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * The progress of the bulk provisioning task expressed as a percentage.
      */
    var percentageProgress: js.UndefOr[Percentage] = js.undefined
    /**
      * The role ARN that grants access to the input file bucket.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The status of the bulk thing provisioning task.
      */
    var status: js.UndefOr[Status] = js.undefined
    /**
      * The number of things successfully provisioned.
      */
    var successCount: js.UndefOr[Count] = js.undefined
    /**
      * The task ID.
      */
    var taskId: js.UndefOr[TaskId] = js.undefined
    /**
      * The task's template.
      */
    var templateBody: js.UndefOr[TemplateBody] = js.undefined
  }
  
  trait DescribeThingRequest extends js.Object {
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait DescribeThingResponse extends js.Object {
    /**
      * The thing attributes.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The name of the billing group the thing belongs to.
      */
    var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    /**
      * The default client ID.
      */
    var defaultClientId: js.UndefOr[ClientId] = js.undefined
    /**
      * The ARN of the thing to describe.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The ID of the thing to describe.
      */
    var thingId: js.UndefOr[ThingId] = js.undefined
    /**
      * The name of the thing.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
    /**
      * The thing type name.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    /**
      * The current version of the thing record in the registry.  To avoid unintentional changes to the information in the registry, you can pass the version information in the expectedVersion parameter of the UpdateThing and DeleteThing calls. 
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeThingTypeRequest extends js.Object {
    /**
      * The name of the thing type.
      */
    var thingTypeName: ThingTypeName
  }
  
  trait DescribeThingTypeResponse extends js.Object {
    /**
      * The thing type ARN.
      */
    var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
    /**
      * The thing type ID.
      */
    var thingTypeId: js.UndefOr[ThingTypeId] = js.undefined
    /**
      * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
      */
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined
    /**
      * The name of the thing type.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    /**
      * The ThingTypeProperties contains information about the thing type including description, and a list of searchable thing attribute names.
      */
    var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
  }
  
  trait Destination extends js.Object {
    /**
      * Describes the location in S3 of the updated firmware.
      */
    var s3Destination: js.UndefOr[S3Destination] = js.undefined
  }
  
  trait DetachPolicyRequest extends js.Object {
    /**
      * The policy to detach.
      */
    var policyName: PolicyName
    /**
      * The target from which the policy will be detached.
      */
    var target: PolicyTarget
  }
  
  trait DetachPrincipalPolicyRequest extends js.Object {
    /**
      * The name of the policy to detach.
      */
    var policyName: PolicyName
    /**
      * The principal. If the principal is a certificate, specify the certificate ARN. If the principal is an Amazon Cognito identity, specify the identity ID.
      */
    var principal: Principal
  }
  
  trait DetachSecurityProfileRequest extends js.Object {
    /**
      * The security profile that is detached.
      */
    var securityProfileName: SecurityProfileName
    /**
      * The ARN of the thing group from which the security profile is detached.
      */
    var securityProfileTargetArn: SecurityProfileTargetArn
  }
  
  trait DetachSecurityProfileResponse extends js.Object
  
  trait DetachThingPrincipalRequest extends js.Object {
    /**
      * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
      */
    var principal: Principal
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait DetachThingPrincipalResponse extends js.Object
  
  trait DetailsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DetailsValue]
  
  trait DisableTopicRuleRequest extends js.Object {
    /**
      * The name of the rule to disable.
      */
    var ruleName: RuleName
  }
  
  trait DynamoDBAction extends js.Object {
    /**
      * The hash key name.
      */
    var hashKeyField: HashKeyField
    /**
      * The hash key type. Valid values are "STRING" or "NUMBER"
      */
    var hashKeyType: js.UndefOr[DynamoKeyType] = js.undefined
    /**
      * The hash key value.
      */
    var hashKeyValue: HashKeyValue
    /**
      * The type of operation to be performed. This follows the substitution template, so it can be ${operation}, but the substitution must result in one of the following: INSERT, UPDATE, or DELETE.
      */
    var operation: js.UndefOr[DynamoOperation] = js.undefined
    /**
      * The action payload. This name can be customized.
      */
    var payloadField: js.UndefOr[PayloadField] = js.undefined
    /**
      * The range key name.
      */
    var rangeKeyField: js.UndefOr[RangeKeyField] = js.undefined
    /**
      * The range key type. Valid values are "STRING" or "NUMBER"
      */
    var rangeKeyType: js.UndefOr[DynamoKeyType] = js.undefined
    /**
      * The range key value.
      */
    var rangeKeyValue: js.UndefOr[RangeKeyValue] = js.undefined
    /**
      * The ARN of the IAM role that grants access to the DynamoDB table.
      */
    var roleArn: AwsArn
    /**
      * The name of the DynamoDB table.
      */
    var tableName: TableName
  }
  
  trait DynamoDBv2Action extends js.Object {
    /**
      * Specifies the DynamoDB table to which the message data will be written. For example:  { "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }  Each attribute in the message payload will be written to a separate column in the DynamoDB database.
      */
    var putItem: PutItemInput
    /**
      * The ARN of the IAM role that grants access to the DynamoDB table.
      */
    var roleArn: AwsArn
  }
  
  trait EffectivePolicy extends js.Object {
    /**
      * The policy ARN.
      */
    var policyArn: js.UndefOr[PolicyArn] = js.undefined
    /**
      * The IAM policy document.
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * The policy name.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait ElasticsearchAction extends js.Object {
    /**
      * The endpoint of your Elasticsearch domain.
      */
    var endpoint: ElasticsearchEndpoint
    /**
      * The unique identifier for the document you are storing.
      */
    var id: ElasticsearchId
    /**
      * The Elasticsearch index where you want to store your data.
      */
    var index: ElasticsearchIndex
    /**
      * The IAM role ARN that has access to Elasticsearch.
      */
    var roleArn: AwsArn
    /**
      * The type of document you are storing.
      */
    var `type`: ElasticsearchType
  }
  
  trait EnableTopicRuleRequest extends js.Object {
    /**
      * The name of the topic rule to enable.
      */
    var ruleName: RuleName
  }
  
  trait ErrorInfo extends js.Object {
    /**
      * The error code.
      */
    var code: js.UndefOr[Code] = js.undefined
    /**
      * The error message.
      */
    var message: js.UndefOr[OTAUpdateErrorMessage] = js.undefined
  }
  
  trait EventConfigurations
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Configuration]
  
  trait ExplicitDeny extends js.Object {
    /**
      * The policies that denied the authorization.
      */
    var policies: js.UndefOr[Policies] = js.undefined
  }
  
  trait ExponentialRolloutRate extends js.Object {
    /**
      * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
      */
    var baseRatePerMinute: RolloutRatePerMinute
    /**
      * The exponential factor to increase the rate of rollout for a job.
      */
    var incrementFactor: IncrementFactor
    /**
      * The criteria to initiate the increase in rate of rollout for a job. AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
      */
    var rateIncreaseCriteria: RateIncreaseCriteria
  }
  
  trait FileLocation extends js.Object {
    /**
      * The location of the updated firmware in S3.
      */
    var s3Location: js.UndefOr[S3Location] = js.undefined
    /**
      * The stream that contains the OTA update.
      */
    var stream: js.UndefOr[Stream] = js.undefined
  }
  
  trait FirehoseAction extends js.Object {
    /**
      * The delivery stream name.
      */
    var deliveryStreamName: DeliveryStreamName
    /**
      * The IAM role that grants access to the Amazon Kinesis Firehose stream.
      */
    var roleArn: AwsArn
    /**
      * A character separator that will be used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
      */
    var separator: js.UndefOr[FirehoseSeparator] = js.undefined
  }
  
  trait GetEffectivePoliciesRequest extends js.Object {
    /**
      * The Cognito identity pool ID.
      */
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
    /**
      * The principal.
      */
    var principal: js.UndefOr[Principal] = js.undefined
    /**
      * The thing name.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait GetEffectivePoliciesResponse extends js.Object {
    /**
      * The effective policies.
      */
    var effectivePolicies: js.UndefOr[EffectivePolicies] = js.undefined
  }
  
  trait GetIndexingConfigurationRequest extends js.Object
  
  trait GetIndexingConfigurationResponse extends js.Object {
    /**
      * The index configuration.
      */
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined
    /**
      * Thing indexing configuration.
      */
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
  }
  
  trait GetJobDocumentRequest extends js.Object {
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: JobId
  }
  
  trait GetJobDocumentResponse extends js.Object {
    /**
      * The job document content.
      */
    var document: js.UndefOr[JobDocument] = js.undefined
  }
  
  trait GetLoggingOptionsRequest extends js.Object
  
  trait GetLoggingOptionsResponse extends js.Object {
    /**
      * The logging level.
      */
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The ARN of the IAM role that grants access.
      */
    var roleArn: js.UndefOr[AwsArn] = js.undefined
  }
  
  trait GetOTAUpdateRequest extends js.Object {
    /**
      * The OTA update ID.
      */
    var otaUpdateId: OTAUpdateId
  }
  
  trait GetOTAUpdateResponse extends js.Object {
    /**
      * The OTA update info.
      */
    var otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.undefined
  }
  
  trait GetPolicyRequest extends js.Object {
    /**
      * The name of the policy.
      */
    var policyName: PolicyName
  }
  
  trait GetPolicyResponse extends js.Object {
    /**
      * The date the policy was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The default policy version ID.
      */
    var defaultVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    /**
      * The generation ID of the policy.
      */
    var generationId: js.UndefOr[GenerationId] = js.undefined
    /**
      * The date the policy was last modified.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The policy ARN.
      */
    var policyArn: js.UndefOr[PolicyArn] = js.undefined
    /**
      * The JSON document that describes the policy.
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * The policy name.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait GetPolicyVersionRequest extends js.Object {
    /**
      * The name of the policy.
      */
    var policyName: PolicyName
    /**
      * The policy version ID.
      */
    var policyVersionId: PolicyVersionId
  }
  
  trait GetPolicyVersionResponse extends js.Object {
    /**
      * The date the policy version was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The generation ID of the policy version.
      */
    var generationId: js.UndefOr[GenerationId] = js.undefined
    /**
      * Specifies whether the policy version is the default.
      */
    var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
    /**
      * The date the policy version was last modified.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The policy ARN.
      */
    var policyArn: js.UndefOr[PolicyArn] = js.undefined
    /**
      * The JSON document that describes the policy.
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * The policy name.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
    /**
      * The policy version ID.
      */
    var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
  }
  
  trait GetRegistrationCodeRequest extends js.Object
  
  trait GetRegistrationCodeResponse extends js.Object {
    /**
      * The CA certificate registration code.
      */
    var registrationCode: js.UndefOr[RegistrationCode] = js.undefined
  }
  
  trait GetTopicRuleRequest extends js.Object {
    /**
      * The name of the rule.
      */
    var ruleName: RuleName
  }
  
  trait GetTopicRuleResponse extends js.Object {
    /**
      * The rule.
      */
    var rule: js.UndefOr[TopicRule] = js.undefined
    /**
      * The rule ARN.
      */
    var ruleArn: js.UndefOr[RuleArn] = js.undefined
  }
  
  trait GetV2LoggingOptionsRequest extends js.Object
  
  trait GetV2LoggingOptionsResponse extends js.Object {
    /**
      * The default log level.
      */
    var defaultLogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * Disables all logs.
      */
    var disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined
    /**
      * The IAM role ARN AWS IoT uses to write to your CloudWatch logs.
      */
    var roleArn: js.UndefOr[AwsArn] = js.undefined
  }
  
  trait GroupNameAndArn extends js.Object {
    /**
      * The group ARN.
      */
    var groupArn: js.UndefOr[ThingGroupArn] = js.undefined
    /**
      * The group name.
      */
    var groupName: js.UndefOr[ThingGroupName] = js.undefined
  }
  
  trait ImplicitDeny extends js.Object {
    /**
      * Policies that don't contain a matching allow or deny statement for the specified action on the specified resource. 
      */
    var policies: js.UndefOr[Policies] = js.undefined
  }
  
  trait IotAnalyticsAction extends js.Object {
    /**
      * (deprecated) The ARN of the IoT Analytics channel to which message data will be sent.
      */
    var channelArn: js.UndefOr[AwsArn] = js.undefined
    /**
      * The name of the IoT Analytics channel to which message data will be sent.
      */
    var channelName: js.UndefOr[ChannelName] = js.undefined
    /**
      * The ARN of the role which has a policy that grants IoT Analytics permission to send message data via IoT Analytics (iotanalytics:BatchPutMessage).
      */
    var roleArn: js.UndefOr[AwsArn] = js.undefined
  }
  
  trait IotEventsAction extends js.Object {
    /**
      * The name of the AWS IoT Events input.
      */
    var inputName: InputName
    /**
      * [Optional] Use this to ensure that only one input (message) with a given messageId will be processed by an AWS IoT Events detector.
      */
    var messageId: js.UndefOr[MessageId] = js.undefined
    /**
      * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector. ("Action":"iotevents:BatchPutMessage").
      */
    var roleArn: AwsArn
  }
  
  trait Job extends js.Object {
    /**
      * Configuration for criteria to abort the job.
      */
    var abortConfig: js.UndefOr[AbortConfig] = js.undefined
    /**
      * If the job was updated, describes the reason for the update.
      */
    var comment: js.UndefOr[Comment] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job was completed.
      */
    var completedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job was created.
      */
    var createdAt: js.UndefOr[DateType] = js.undefined
    /**
      * A short text description of the job.
      */
    var description: js.UndefOr[JobDescription] = js.undefined
    /**
      * Will be true if the job was canceled with the optional force parameter set to true.
      */
    var forceCanceled: js.UndefOr[Forced] = js.undefined
    /**
      * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
      */
    var jobArn: js.UndefOr[JobArn] = js.undefined
    /**
      * Allows you to create a staged rollout of a job.
      */
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
      * Details about the job process.
      */
    var jobProcessDetails: js.UndefOr[JobProcessDetails] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job was last updated.
      */
    var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
    /**
      * Configuration for pre-signed S3 URLs.
      */
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
    /**
      * If the job was updated, provides the reason code for the update.
      */
    var reasonCode: js.UndefOr[ReasonCode] = js.undefined
    /**
      * The status of the job, one of IN_PROGRESS, CANCELED, DELETION_IN_PROGRESS or COMPLETED. 
      */
    var status: js.UndefOr[JobStatus] = js.undefined
    /**
      * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a device when the thing representing the device is added to a target group, even after the job was completed by all things originally in the group. 
      */
    var targetSelection: js.UndefOr[TargetSelection] = js.undefined
    /**
      * A list of IoT things and thing groups to which the job should be sent.
      */
    var targets: js.UndefOr[JobTargets] = js.undefined
    /**
      * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
      */
    var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
  }
  
  trait JobExecution extends js.Object {
    /**
      * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The actual job execution timeout can occur up to 60 seconds later than the estimated duration. This value will not be included if the job execution has reached a terminal status.
      */
    var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined
    /**
      * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used in commands which return or update job execution information. 
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * Will be true if the job execution was canceled with the optional force parameter set to true.
      */
    var forceCanceled: js.UndefOr[Forced] = js.undefined
    /**
      * The unique identifier you assigned to the job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job execution was last updated.
      */
    var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job execution was queued.
      */
    var queuedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job execution started.
      */
    var startedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
      */
    var status: js.UndefOr[JobExecutionStatus] = js.undefined
    /**
      * A collection of name/value pairs that describe the status of the job execution.
      */
    var statusDetails: js.UndefOr[JobExecutionStatusDetails] = js.undefined
    /**
      * The ARN of the thing on which the job execution is running.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
      */
    var versionNumber: js.UndefOr[VersionNumber] = js.undefined
  }
  
  trait JobExecutionStatusDetails extends js.Object {
    /**
      * The job execution status.
      */
    var detailsMap: js.UndefOr[DetailsMap] = js.undefined
  }
  
  trait JobExecutionSummary extends js.Object {
    /**
      * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used later in commands which return or update job execution information.
      */
    var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job execution was last updated.
      */
    var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job execution was queued.
      */
    var queuedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job execution started.
      */
    var startedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The status of the job execution.
      */
    var status: js.UndefOr[JobExecutionStatus] = js.undefined
  }
  
  trait JobExecutionSummaryForJob extends js.Object {
    /**
      * Contains a subset of information about a job execution.
      */
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined
    /**
      * The ARN of the thing on which the job execution is running.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
  }
  
  trait JobExecutionSummaryForThing extends js.Object {
    /**
      * Contains a subset of information about a job execution.
      */
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait JobExecutionsRolloutConfig extends js.Object {
    /**
      * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
      */
    var exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.undefined
    /**
      * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
      */
    var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined
  }
  
  trait JobProcessDetails extends js.Object {
    /**
      * The number of things that cancelled the job.
      */
    var numberOfCanceledThings: js.UndefOr[CanceledThings] = js.undefined
    /**
      * The number of things that failed executing the job.
      */
    var numberOfFailedThings: js.UndefOr[FailedThings] = js.undefined
    /**
      * The number of things currently executing the job.
      */
    var numberOfInProgressThings: js.UndefOr[InProgressThings] = js.undefined
    /**
      * The number of things that are awaiting execution of the job.
      */
    var numberOfQueuedThings: js.UndefOr[QueuedThings] = js.undefined
    /**
      * The number of things that rejected the job.
      */
    var numberOfRejectedThings: js.UndefOr[RejectedThings] = js.undefined
    /**
      * The number of things that are no longer scheduled to execute the job because they have been deleted or have been removed from the group that was a target of the job.
      */
    var numberOfRemovedThings: js.UndefOr[RemovedThings] = js.undefined
    /**
      * The number of things which successfully completed the job.
      */
    var numberOfSucceededThings: js.UndefOr[SucceededThings] = js.undefined
    /**
      * The number of things whose job execution status is TIMED_OUT.
      */
    var numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.undefined
    /**
      * The target devices to which the job execution is being rolled out. This value will be null after the job execution has finished rolling out to all the target devices.
      */
    var processingTargets: js.UndefOr[ProcessingTargetNameList] = js.undefined
  }
  
  trait JobSummary extends js.Object {
    /**
      * The time, in seconds since the epoch, when the job completed.
      */
    var completedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job was created.
      */
    var createdAt: js.UndefOr[DateType] = js.undefined
    /**
      * The job ARN.
      */
    var jobArn: js.UndefOr[JobArn] = js.undefined
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
      * The time, in seconds since the epoch, when the job was last updated.
      */
    var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
    /**
      * The job summary status.
      */
    var status: js.UndefOr[JobStatus] = js.undefined
    /**
      * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
      */
    var targetSelection: js.UndefOr[TargetSelection] = js.undefined
    /**
      * The ID of the thing group.
      */
    var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  }
  
  trait KeyPair extends js.Object {
    /**
      * The private key.
      */
    var PrivateKey: js.UndefOr[PrivateKey] = js.undefined
    /**
      * The public key.
      */
    var PublicKey: js.UndefOr[PublicKey] = js.undefined
  }
  
  trait KinesisAction extends js.Object {
    /**
      * The partition key.
      */
    var partitionKey: js.UndefOr[PartitionKey] = js.undefined
    /**
      * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
      */
    var roleArn: AwsArn
    /**
      * The name of the Amazon Kinesis stream.
      */
    var streamName: StreamName
  }
  
  trait LambdaAction extends js.Object {
    /**
      * The ARN of the Lambda function.
      */
    var functionArn: FunctionArn
  }
  
  trait ListActiveViolationsRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the Device Defender security profile for which violations are listed.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    /**
      * The name of the thing whose active violations are listed.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait ListActiveViolationsResponse extends js.Object {
    /**
      * The list of active violations.
      */
    var activeViolations: js.UndefOr[ActiveViolations] = js.undefined
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListAttachedPoliciesRequest extends js.Object {
    /**
      * The token to retrieve the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The maximum number of results to be returned per request.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
    /**
      * When true, recursively list attached policies.
      */
    var recursive: js.UndefOr[Recursive] = js.undefined
    /**
      * The group for which the policies will be listed.
      */
    var target: PolicyTarget
  }
  
  trait ListAttachedPoliciesResponse extends js.Object {
    /**
      * The token to retrieve the next set of results, or ``null`` if there are no more results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The policies.
      */
    var policies: js.UndefOr[Policies] = js.undefined
  }
  
  trait ListAuditFindingsRequest extends js.Object {
    /**
      * A filter to limit results to the findings for the specified audit check.
      */
    var checkName: js.UndefOr[AuditCheckName] = js.undefined
    /**
      * A filter to limit results to those found before the specified time. You must specify either the startTime and endTime or the taskId, but not both.
      */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The maximum number of results to return at one time. The default is 25.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information identifying the non-compliant resource.
      */
    var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
    /**
      * A filter to limit results to those found after the specified time. You must specify either the startTime and endTime or the taskId, but not both.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * A filter to limit results to the audit with the specified ID. You must specify either the taskId or the startTime and endTime, but not both.
      */
    var taskId: js.UndefOr[AuditTaskId] = js.undefined
  }
  
  trait ListAuditFindingsResponse extends js.Object {
    /**
      * The findings (results) of the audit.
      */
    var findings: js.UndefOr[AuditFindings] = js.undefined
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListAuditTasksRequest extends js.Object {
    /**
      * The end of the time period.
      */
    var endTime: Timestamp
    /**
      * The maximum number of results to return at one time. The default is 25.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The beginning of the time period. Note that audit information is retained for a limited time (180 days). Requesting a start time prior to what is retained results in an "InvalidRequestException".
      */
    var startTime: Timestamp
    /**
      * A filter to limit the output to audits with the specified completion status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
      */
    var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
    /**
      * A filter to limit the output to the specified type of audit: can be one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
      */
    var taskType: js.UndefOr[AuditTaskType] = js.undefined
  }
  
  trait ListAuditTasksResponse extends js.Object {
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The audits that were performed during the specified time period.
      */
    var tasks: js.UndefOr[AuditTaskMetadataList] = js.undefined
  }
  
  trait ListAuthorizersRequest extends js.Object {
    /**
      * Return the list of authorizers in ascending alphabetical order.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * A marker used to get the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The maximum number of results to return at one time.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
    /**
      * The status of the list authorizers request.
      */
    var status: js.UndefOr[AuthorizerStatus] = js.undefined
  }
  
  trait ListAuthorizersResponse extends js.Object {
    /**
      * The authorizers.
      */
    var authorizers: js.UndefOr[Authorizers] = js.undefined
    /**
      * A marker used to get the next set of results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListBillingGroupsRequest extends js.Object {
    /**
      * The maximum number of results to return per request.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * Limit the results to billing groups whose names have the given prefix.
      */
    var namePrefixFilter: js.UndefOr[BillingGroupName] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListBillingGroupsResponse extends js.Object {
    /**
      * The list of billing groups.
      */
    var billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.undefined
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListCACertificatesRequest extends js.Object {
    /**
      * Determines the order of the results.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait ListCACertificatesResponse extends js.Object {
    /**
      * The CA certificates registered in your AWS account.
      */
    var certificates: js.UndefOr[CACertificates] = js.undefined
    /**
      * The current position within the list of CA certificates.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListCertificatesByCARequest extends js.Object {
    /**
      * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The ID of the CA certificate. This operation will list all registered device certificate that were signed by this CA certificate.
      */
    var caCertificateId: CertificateId
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait ListCertificatesByCAResponse extends js.Object {
    /**
      * The device certificates signed by the specified CA certificate.
      */
    var certificates: js.UndefOr[Certificates] = js.undefined
    /**
      * The marker for the next set of results, or null if there are no additional results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListCertificatesRequest extends js.Object {
    /**
      * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait ListCertificatesResponse extends js.Object {
    /**
      * The descriptions of the certificates.
      */
    var certificates: js.UndefOr[Certificates] = js.undefined
    /**
      * The marker for the next set of results, or null if there are no additional results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
  }
  
  trait ListIndicesRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[QueryMaxResults] = js.undefined
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListIndicesResponse extends js.Object {
    /**
      * The index names.
      */
    var indexNames: js.UndefOr[IndexNamesList] = js.undefined
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListJobExecutionsForJobRequest extends js.Object {
    /**
      * The unique identifier you assigned to this job when it was created.
      */
    var jobId: JobId
    /**
      * The maximum number of results to be returned per request.
      */
    var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The status of the job.
      */
    var status: js.UndefOr[JobExecutionStatus] = js.undefined
  }
  
  trait ListJobExecutionsForJobResponse extends js.Object {
    /**
      * A list of job execution summaries.
      */
    var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList] = js.undefined
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListJobExecutionsForThingRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An optional filter that lets you search for jobs that have the specified status.
      */
    var status: js.UndefOr[JobExecutionStatus] = js.undefined
    /**
      * The thing name.
      */
    var thingName: ThingName
  }
  
  trait ListJobExecutionsForThingResponse extends js.Object {
    /**
      * A list of job execution summaries.
      */
    var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.undefined
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListJobsRequest extends js.Object {
    /**
      * The maximum number of results to return per request.
      */
    var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An optional filter that lets you search for jobs that have the specified status.
      */
    var status: js.UndefOr[JobStatus] = js.undefined
    /**
      * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group. 
      */
    var targetSelection: js.UndefOr[TargetSelection] = js.undefined
    /**
      * A filter that limits the returned jobs to those for the specified group.
      */
    var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
    /**
      * A filter that limits the returned jobs to those for the specified group.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  }
  
  trait ListJobsResponse extends js.Object {
    /**
      * A list of jobs.
      */
    var jobs: js.UndefOr[JobSummaryList] = js.undefined
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListOTAUpdatesRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token used to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The OTA update job status.
      */
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
  }
  
  trait ListOTAUpdatesResponse extends js.Object {
    /**
      * A token to use to get the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of OTA update jobs.
      */
    var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.undefined
  }
  
  trait ListOutgoingCertificatesRequest extends js.Object {
    /**
      * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait ListOutgoingCertificatesResponse extends js.Object {
    /**
      * The marker for the next set of results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The certificates that are being transferred but not yet accepted.
      */
    var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.undefined
  }
  
  trait ListPoliciesRequest extends js.Object {
    /**
      * Specifies the order for results. If true, the results are returned in ascending creation order.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait ListPoliciesResponse extends js.Object {
    /**
      * The marker for the next set of results, or null if there are no additional results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The descriptions of the policies.
      */
    var policies: js.UndefOr[Policies] = js.undefined
  }
  
  trait ListPolicyPrincipalsRequest extends js.Object {
    /**
      * Specifies the order for results. If true, the results are returned in ascending creation order.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
    /**
      * The policy name.
      */
    var policyName: PolicyName
  }
  
  trait ListPolicyPrincipalsResponse extends js.Object {
    /**
      * The marker for the next set of results, or null if there are no additional results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The descriptions of the principals.
      */
    var principals: js.UndefOr[Principals] = js.undefined
  }
  
  trait ListPolicyVersionsRequest extends js.Object {
    /**
      * The policy name.
      */
    var policyName: PolicyName
  }
  
  trait ListPolicyVersionsResponse extends js.Object {
    /**
      * The policy versions.
      */
    var policyVersions: js.UndefOr[PolicyVersions] = js.undefined
  }
  
  trait ListPrincipalPoliciesRequest extends js.Object {
    /**
      * Specifies the order for results. If true, results are returned in ascending creation order.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The marker for the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
    /**
      * The principal.
      */
    var principal: Principal
  }
  
  trait ListPrincipalPoliciesResponse extends js.Object {
    /**
      * The marker for the next set of results, or null if there are no additional results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The policies.
      */
    var policies: js.UndefOr[Policies] = js.undefined
  }
  
  trait ListPrincipalThingsRequest extends js.Object {
    /**
      * The maximum number of results to return in this operation.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The principal.
      */
    var principal: Principal
  }
  
  trait ListPrincipalThingsResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The things.
      */
    var things: js.UndefOr[ThingNameList] = js.undefined
  }
  
  trait ListRoleAliasesRequest extends js.Object {
    /**
      * Return the list of role aliases in ascending alphabetical order.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * A marker used to get the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The maximum number of results to return at one time.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
  }
  
  trait ListRoleAliasesResponse extends js.Object {
    /**
      * A marker used to get the next set of results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The role aliases.
      */
    var roleAliases: js.UndefOr[RoleAliases] = js.undefined
  }
  
  trait ListScheduledAuditsRequest extends js.Object {
    /**
      * The maximum number of results to return at one time. The default is 25.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListScheduledAuditsResponse extends js.Object {
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of scheduled audits.
      */
    var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.undefined
  }
  
  trait ListSecurityProfilesForTargetRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * If true, return child groups as well.
      */
    var recursive: js.UndefOr[Recursive] = js.undefined
    /**
      * The ARN of the target (thing group) whose attached security profiles you want to get.
      */
    var securityProfileTargetArn: SecurityProfileTargetArn
  }
  
  trait ListSecurityProfilesForTargetResponse extends js.Object {
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of security profiles and their associated targets.
      */
    var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.undefined
  }
  
  trait ListSecurityProfilesRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSecurityProfilesResponse extends js.Object {
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of security profile identifiers (names and ARNs).
      */
    var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.undefined
  }
  
  trait ListStreamsRequest extends js.Object {
    /**
      * Set to true to return the list of streams in ascending order.
      */
    var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
    /**
      * The maximum number of results to return at a time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A token used to get the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListStreamsResponse extends js.Object {
    /**
      * A token used to get the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of streams.
      */
    var streams: js.UndefOr[StreamsSummary] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ARN of the resource.
      */
    var resourceArn: ResourceArn
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of tags assigned to the resource.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ListTargetsForPolicyRequest extends js.Object {
    /**
      * A marker used to get the next set of results.
      */
    var marker: js.UndefOr[Marker] = js.undefined
    /**
      * The maximum number of results to return at one time.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
    /**
      * The policy name.
      */
    var policyName: PolicyName
  }
  
  trait ListTargetsForPolicyResponse extends js.Object {
    /**
      * A marker used to get the next set of results.
      */
    var nextMarker: js.UndefOr[Marker] = js.undefined
    /**
      * The policy targets.
      */
    var targets: js.UndefOr[PolicyTargets] = js.undefined
  }
  
  trait ListTargetsForSecurityProfileRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The security profile.
      */
    var securityProfileName: SecurityProfileName
  }
  
  trait ListTargetsForSecurityProfileResponse extends js.Object {
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The thing groups to which the security profile is attached.
      */
    var securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.undefined
  }
  
  trait ListThingGroupsForThingRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The thing name.
      */
    var thingName: ThingName
  }
  
  trait ListThingGroupsForThingResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The thing groups.
      */
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
  }
  
  trait ListThingGroupsRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * A filter that limits the results to those with the specified name prefix.
      */
    var namePrefixFilter: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A filter that limits the results to those with the specified parent group.
      */
    var parentGroup: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * If true, return child groups as well.
      */
    var recursive: js.UndefOr[RecursiveWithoutDefault] = js.undefined
  }
  
  trait ListThingGroupsResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The thing groups.
      */
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
  }
  
  trait ListThingPrincipalsRequest extends js.Object {
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait ListThingPrincipalsResponse extends js.Object {
    /**
      * The principals associated with the thing.
      */
    var principals: js.UndefOr[Principals] = js.undefined
  }
  
  trait ListThingRegistrationTaskReportsRequest extends js.Object {
    /**
      * The maximum number of results to return per request.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The type of task report.
      */
    var reportType: ReportType
    /**
      * The id of the task.
      */
    var taskId: TaskId
  }
  
  trait ListThingRegistrationTaskReportsResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The type of task report.
      */
    var reportType: js.UndefOr[ReportType] = js.undefined
    /**
      * Links to the task resources.
      */
    var resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined
  }
  
  trait ListThingRegistrationTasksRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The status of the bulk thing provisioning task.
      */
    var status: js.UndefOr[Status] = js.undefined
  }
  
  trait ListThingRegistrationTasksResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of bulk thing provisioning task IDs.
      */
    var taskIds: js.UndefOr[TaskIdList] = js.undefined
  }
  
  trait ListThingTypesRequest extends js.Object {
    /**
      * The maximum number of results to return in this operation.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the thing type.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  }
  
  trait ListThingTypesResponse extends js.Object {
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The thing types.
      */
    var thingTypes: js.UndefOr[ThingTypeList] = js.undefined
  }
  
  trait ListThingsInBillingGroupRequest extends js.Object {
    /**
      * The name of the billing group.
      */
    var billingGroupName: BillingGroupName
    /**
      * The maximum number of results to return per request.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListThingsInBillingGroupResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of things in the billing group.
      */
    var things: js.UndefOr[ThingNameList] = js.undefined
  }
  
  trait ListThingsInThingGroupRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * When true, list things in this thing group and in all child groups as well.
      */
    var recursive: js.UndefOr[Recursive] = js.undefined
    /**
      * The thing group name.
      */
    var thingGroupName: ThingGroupName
  }
  
  trait ListThingsInThingGroupResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The things in the specified thing group.
      */
    var things: js.UndefOr[ThingNameList] = js.undefined
  }
  
  trait ListThingsRequest extends js.Object {
    /**
      * The attribute name used to search for things.
      */
    var attributeName: js.UndefOr[AttributeName] = js.undefined
    /**
      * The attribute value used to search for things.
      */
    var attributeValue: js.UndefOr[AttributeValue] = js.undefined
    /**
      * The maximum number of results to return in this operation.
      */
    var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the thing type used to search for things.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  }
  
  trait ListThingsResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The things.
      */
    var things: js.UndefOr[ThingAttributeList] = js.undefined
  }
  
  trait ListTopicRulesRequest extends js.Object {
    /**
      * The maximum number of results to return.
      */
    var maxResults: js.UndefOr[GEMaxResults] = js.undefined
    /**
      * A token used to retrieve the next value.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Specifies whether the rule is disabled.
      */
    var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
    /**
      * The topic.
      */
    var topic: js.UndefOr[Topic] = js.undefined
  }
  
  trait ListTopicRulesResponse extends js.Object {
    /**
      * A token used to retrieve the next value.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The rules.
      */
    var rules: js.UndefOr[TopicRuleList] = js.undefined
  }
  
  trait ListV2LoggingLevelsRequest extends js.Object {
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The type of resource for which you are configuring logging. Must be THING_Group.
      */
    var targetType: js.UndefOr[LogTargetType] = js.undefined
  }
  
  trait ListV2LoggingLevelsResponse extends js.Object {
    /**
      * The logging configuration for a target.
      */
    var logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.undefined
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListViolationEventsRequest extends js.Object {
    /**
      * The end time for the alerts to be listed.
      */
    var endTime: Timestamp
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A filter to limit results to those alerts generated by the specified security profile.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    /**
      * The start time for the alerts to be listed.
      */
    var startTime: Timestamp
    /**
      * A filter to limit results to those alerts caused by the specified thing.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait ListViolationEventsResponse extends js.Object {
    /**
      * A token that can be used to retrieve the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The security profile violation alerts issued for this account during the given time frame, potentially filtered by security profile, behavior violated, or thing (device) violating.
      */
    var violationEvents: js.UndefOr[ViolationEvents] = js.undefined
  }
  
  trait LogTarget extends js.Object {
    /**
      * The target name.
      */
    var targetName: js.UndefOr[LogTargetName] = js.undefined
    /**
      * The target type.
      */
    var targetType: LogTargetType
  }
  
  trait LogTargetConfiguration extends js.Object {
    /**
      * The logging level.
      */
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * A log target
      */
    var logTarget: js.UndefOr[LogTarget] = js.undefined
  }
  
  trait LoggingOptionsPayload extends js.Object {
    /**
      * The log level.
      */
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The ARN of the IAM role that grants access.
      */
    var roleArn: AwsArn
  }
  
  trait MetricValue extends js.Object {
    /**
      * If the comparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
      */
    var cidrs: js.UndefOr[Cidrs] = js.undefined
    /**
      * If the comparisonOperator calls for a numeric value, use this to specify that numeric value to be compared with the metric.
      */
    var count: js.UndefOr[UnsignedLong] = js.undefined
    /**
      * If the comparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
      */
    var ports: js.UndefOr[Ports] = js.undefined
  }
  
  trait NonCompliantResource extends js.Object {
    /**
      * Additional information about the non-compliant resource.
      */
    var additionalInfo: js.UndefOr[StringMap] = js.undefined
    /**
      * Information identifying the non-compliant resource.
      */
    var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
    /**
      * The type of the non-compliant resource.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait OTAUpdateFile extends js.Object {
    /**
      * A list of name/attribute pairs.
      */
    var attributes: js.UndefOr[AttributesMap] = js.undefined
    /**
      * The code signing method of the file.
      */
    var codeSigning: js.UndefOr[CodeSigning] = js.undefined
    /**
      * The location of the updated firmware.
      */
    var fileLocation: js.UndefOr[FileLocation] = js.undefined
    /**
      * The name of the file.
      */
    var fileName: js.UndefOr[FileName] = js.undefined
    /**
      * The file version.
      */
    var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined
  }
  
  trait OTAUpdateInfo extends js.Object {
    /**
      * A collection of name/value pairs
      */
    var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined
    /**
      * The AWS IoT job ARN associated with the OTA update.
      */
    var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined
    /**
      * The AWS IoT job ID associated with the OTA update.
      */
    var awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined
    /**
      * Configuration for the rollout of OTA updates.
      */
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined
    /**
      * The date when the OTA update was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A description of the OTA update.
      */
    var description: js.UndefOr[OTAUpdateDescription] = js.undefined
    /**
      * Error information associated with the OTA update.
      */
    var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
    /**
      * The date when the OTA update was last updated.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The OTA update ARN.
      */
    var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
    /**
      * A list of files associated with the OTA update.
      */
    var otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.undefined
    /**
      * The OTA update ID.
      */
    var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
    /**
      * The status of the OTA update.
      */
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
    /**
      * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is added to a target group, even after the OTA update was completed by all things originally in the group. 
      */
    var targetSelection: js.UndefOr[TargetSelection] = js.undefined
    /**
      * The targets of the OTA update.
      */
    var targets: js.UndefOr[Targets] = js.undefined
  }
  
  trait OTAUpdateSummary extends js.Object {
    /**
      * The date when the OTA update was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The OTA update ARN.
      */
    var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
    /**
      * The OTA update ID.
      */
    var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
  }
  
  trait OutgoingCertificate extends js.Object {
    /**
      * The certificate ARN.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The certificate ID.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The certificate creation date.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The date the transfer was initiated.
      */
    var transferDate: js.UndefOr[DateType] = js.undefined
    /**
      * The transfer message.
      */
    var transferMessage: js.UndefOr[Message] = js.undefined
    /**
      * The AWS account to which the transfer was made.
      */
    var transferredTo: js.UndefOr[AwsAccountId] = js.undefined
  }
  
  trait Parameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Value]
  
  trait Policy extends js.Object {
    /**
      * The policy ARN.
      */
    var policyArn: js.UndefOr[PolicyArn] = js.undefined
    /**
      * The policy name.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait PolicyVersion extends js.Object {
    /**
      * The date and time the policy was created.
      */
    var createDate: js.UndefOr[DateType] = js.undefined
    /**
      * Specifies whether the policy version is the default.
      */
    var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
    /**
      * The policy version ID.
      */
    var versionId: js.UndefOr[PolicyVersionId] = js.undefined
  }
  
  trait PolicyVersionIdentifier extends js.Object {
    /**
      * The name of the policy.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
    /**
      * The ID of the version of the policy associated with the resource.
      */
    var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
  }
  
  trait PresignedUrlConfig extends js.Object {
    /**
      * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
      */
    var expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined
    /**
      * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job data/updates are stored. The role must also grant permission for IoT to download the files.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait PublicKeyMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[KeyValue]
  
  trait PutItemInput extends js.Object {
    /**
      * The table where the message data will be written
      */
    var tableName: TableName
  }
  
  trait RateIncreaseCriteria extends js.Object {
    /**
      * The threshold for number of notified things that will initiate the increase in rate of rollout.
      */
    var numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.undefined
    /**
      * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
      */
    var numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.undefined
  }
  
  trait RegisterCACertificateRequest extends js.Object {
    /**
      * Allows this CA certificate to be used for auto registration of device certificates.
      */
    var allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined
    /**
      * The CA certificate.
      */
    var caCertificate: CertificatePem
    /**
      * Information about the registration configuration.
      */
    var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
    /**
      * A boolean value that specifies if the CA certificate is set to active.
      */
    var setAsActive: js.UndefOr[SetAsActive] = js.undefined
    /**
      * The private key verification certificate.
      */
    var verificationCertificate: CertificatePem
  }
  
  trait RegisterCACertificateResponse extends js.Object {
    /**
      * The CA certificate ARN.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The CA certificate identifier.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
  }
  
  trait RegisterCertificateRequest extends js.Object {
    /**
      * The CA certificate used to sign the device certificate being registered.
      */
    var caCertificatePem: js.UndefOr[CertificatePem] = js.undefined
    /**
      * The certificate data, in PEM format.
      */
    var certificatePem: CertificatePem
    /**
      * A boolean value that specifies if the CA certificate is set to active.
      */
    var setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined
    /**
      * The status of the register certificate request.
      */
    var status: js.UndefOr[CertificateStatus] = js.undefined
  }
  
  trait RegisterCertificateResponse extends js.Object {
    /**
      * The certificate ARN.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The certificate identifier.
      */
    var certificateId: js.UndefOr[CertificateId] = js.undefined
  }
  
  trait RegisterThingRequest extends js.Object {
    /**
      * The parameters for provisioning a thing. See Programmatic Provisioning for more information.
      */
    var parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The provisioning template. See Programmatic Provisioning for more information.
      */
    var templateBody: TemplateBody
  }
  
  trait RegisterThingResponse extends js.Object {
    /**
      * .
      */
    var certificatePem: js.UndefOr[CertificatePem] = js.undefined
    /**
      * ARNs for the generated resources.
      */
    var resourceArns: js.UndefOr[ResourceArns] = js.undefined
  }
  
  trait RegistrationConfig extends js.Object {
    /**
      * The ARN of the role.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The template body.
      */
    var templateBody: js.UndefOr[TemplateBody] = js.undefined
  }
  
  trait RejectCertificateTransferRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
    /**
      * The reason the certificate transfer was rejected.
      */
    var rejectReason: js.UndefOr[Message] = js.undefined
  }
  
  trait RelatedResource extends js.Object {
    /**
      * Additional information about the resource.
      */
    var additionalInfo: js.UndefOr[StringMap] = js.undefined
    /**
      * Information identifying the resource.
      */
    var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
    /**
      * The type of resource.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait RemoveThingFromBillingGroupRequest extends js.Object {
    /**
      * The ARN of the billing group.
      */
    var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
    /**
      * The name of the billing group.
      */
    var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    /**
      * The ARN of the thing to be removed from the billing group.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The name of the thing to be removed from the billing group.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait RemoveThingFromBillingGroupResponse extends js.Object
  
  trait RemoveThingFromThingGroupRequest extends js.Object {
    /**
      * The ARN of the thing to remove from the group.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The group ARN.
      */
    var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
    /**
      * The group name.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * The name of the thing to remove from the group.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait RemoveThingFromThingGroupResponse extends js.Object
  
  trait ReplaceTopicRuleRequest extends js.Object {
    /**
      * The name of the rule.
      */
    var ruleName: RuleName
    /**
      * The rule payload.
      */
    var topicRulePayload: TopicRulePayload
  }
  
  trait RepublishAction extends js.Object {
    /**
      * The ARN of the IAM role that grants access.
      */
    var roleArn: AwsArn
    /**
      * The name of the MQTT topic.
      */
    var topic: TopicPattern
  }
  
  trait ResourceArns
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ResourceArn]
  
  trait ResourceIdentifier extends js.Object {
    /**
      * The account with which the resource is associated.
      */
    var account: js.UndefOr[AwsAccountId] = js.undefined
    /**
      * The ID of the CA certificate used to authorize the certificate.
      */
    var caCertificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The client ID.
      */
    var clientId: js.UndefOr[ClientId] = js.undefined
    /**
      * The ID of the Cognito Identity Pool.
      */
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
    /**
      * The ID of the certificate attached to the resource.
      */
    var deviceCertificateId: js.UndefOr[CertificateId] = js.undefined
    /**
      * The version of the policy associated with the resource.
      */
    var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined
  }
  
  trait RoleAliasDescription extends js.Object {
    /**
      * The UNIX timestamp of when the role alias was created.
      */
    var creationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The number of seconds for which the credential is valid.
      */
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
    /**
      * The UNIX timestamp of when the role alias was last modified.
      */
    var lastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The role alias owner.
      */
    var owner: js.UndefOr[AwsAccountId] = js.undefined
    /**
      * The role alias.
      */
    var roleAlias: js.UndefOr[RoleAlias] = js.undefined
    /**
      * The ARN of the role alias.
      */
    var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
    /**
      * The role ARN.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait S3Action extends js.Object {
    /**
      * The Amazon S3 bucket.
      */
    var bucketName: BucketName
    /**
      * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information, see S3 canned ACLs.
      */
    var cannedAcl: js.UndefOr[CannedAccessControlList] = js.undefined
    /**
      * The object key.
      */
    var key: Key
    /**
      * The ARN of the IAM role that grants access.
      */
    var roleArn: AwsArn
  }
  
  trait S3Destination extends js.Object {
    /**
      * The S3 bucket that contains the updated firmware.
      */
    var bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The S3 prefix.
      */
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  trait S3Location extends js.Object {
    /**
      * The S3 bucket.
      */
    var bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The S3 key.
      */
    var key: js.UndefOr[S3Key] = js.undefined
    /**
      * The S3 bucket version.
      */
    var version: js.UndefOr[S3Version] = js.undefined
  }
  
  trait SalesforceAction extends js.Object {
    /**
      * The token used to authenticate access to the Salesforce IoT Cloud Input Stream. The token is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
      */
    var token: SalesforceToken
    /**
      * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
      */
    var url: SalesforceEndpoint
  }
  
  trait ScheduledAuditMetadata extends js.Object {
    /**
      * The day of the month on which the scheduled audit is run (if the frequency is "MONTHLY"). If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
      */
    var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
    /**
      * The day of the week on which the scheduled audit is run (if the frequency is "WEEKLY" or "BIWEEKLY").
      */
    var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    /**
      * How often the scheduled audit takes place.
      */
    var frequency: js.UndefOr[AuditFrequency] = js.undefined
    /**
      * The ARN of the scheduled audit.
      */
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
    /**
      * The name of the scheduled audit.
      */
    var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
  }
  
  trait SearchIndexRequest extends js.Object {
    /**
      * The search index name.
      */
    var indexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The maximum number of results to return at one time.
      */
    var maxResults: js.UndefOr[QueryMaxResults] = js.undefined
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The search query string.
      */
    var queryString: QueryString
    /**
      * The query version.
      */
    var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  }
  
  trait SearchIndexResponse extends js.Object {
    /**
      * The token used to get the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The thing groups that match the search query.
      */
    var thingGroups: js.UndefOr[ThingGroupDocumentList] = js.undefined
    /**
      * The things that match the search query.
      */
    var things: js.UndefOr[ThingDocumentList] = js.undefined
  }
  
  trait SecurityProfileIdentifier extends js.Object {
    /**
      * The ARN of the security profile.
      */
    var arn: SecurityProfileArn
    /**
      * The name you have given to the security profile.
      */
    var name: SecurityProfileName
  }
  
  trait SecurityProfileTarget extends js.Object {
    /**
      * The ARN of the security profile.
      */
    var arn: SecurityProfileTargetArn
  }
  
  trait SecurityProfileTargetMapping extends js.Object {
    /**
      * Information that identifies the security profile.
      */
    var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined
    /**
      * Information about the target (thing group) associated with the security profile.
      */
    var target: js.UndefOr[SecurityProfileTarget] = js.undefined
  }
  
  trait SetDefaultAuthorizerRequest extends js.Object {
    /**
      * The authorizer name.
      */
    var authorizerName: AuthorizerName
  }
  
  trait SetDefaultAuthorizerResponse extends js.Object {
    /**
      * The authorizer ARN.
      */
    var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
    /**
      * The authorizer name.
      */
    var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
  }
  
  trait SetDefaultPolicyVersionRequest extends js.Object {
    /**
      * The policy name.
      */
    var policyName: PolicyName
    /**
      * The policy version ID.
      */
    var policyVersionId: PolicyVersionId
  }
  
  trait SetLoggingOptionsRequest extends js.Object {
    /**
      * The logging options payload.
      */
    var loggingOptionsPayload: LoggingOptionsPayload
  }
  
  trait SetV2LoggingLevelRequest extends js.Object {
    /**
      * The log level.
      */
    var logLevel: LogLevel
    /**
      * The log target.
      */
    var logTarget: LogTarget
  }
  
  trait SetV2LoggingOptionsRequest extends js.Object {
    /**
      * The default logging level.
      */
    var defaultLogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * If true all logs are disabled. The default is false.
      */
    var disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined
    /**
      * The ARN of the role that allows IoT to write to Cloudwatch logs.
      */
    var roleArn: js.UndefOr[AwsArn] = js.undefined
  }
  
  trait SigningProfileParameter extends js.Object {
    /**
      * Certificate ARN.
      */
    var certificateArn: js.UndefOr[CertificateArn] = js.undefined
    /**
      * The location of the code-signing certificate on your device.
      */
    var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.undefined
    /**
      * The hardware platform of your device.
      */
    var platform: js.UndefOr[Platform] = js.undefined
  }
  
  trait SnsAction extends js.Object {
    /**
      * (Optional) The message format of the message to publish. Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant platform-specific bits of the payload should be extracted. To read more about SNS message formats, see https://docs.aws.amazon.com/sns/latest/dg/json-formats.html refer to their official documentation.
      */
    var messageFormat: js.UndefOr[MessageFormat] = js.undefined
    /**
      * The ARN of the IAM role that grants access.
      */
    var roleArn: AwsArn
    /**
      * The ARN of the SNS topic.
      */
    var targetArn: AwsArn
  }
  
  trait SqsAction extends js.Object {
    /**
      * The URL of the Amazon SQS queue.
      */
    var queueUrl: QueueUrl
    /**
      * The ARN of the IAM role that grants access.
      */
    var roleArn: AwsArn
    /**
      * Specifies whether to use Base64 encoding.
      */
    var useBase64: js.UndefOr[UseBase64] = js.undefined
  }
  
  trait StartOnDemandAuditTaskRequest extends js.Object {
    /**
      * Which checks are performed during the audit. The checks you specify must be enabled for your account or an exception occurs. Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.
      */
    var targetCheckNames: TargetAuditCheckNames
  }
  
  trait StartOnDemandAuditTaskResponse extends js.Object {
    /**
      * The ID of the on-demand audit you started.
      */
    var taskId: js.UndefOr[AuditTaskId] = js.undefined
  }
  
  trait StartSigningJobParameter extends js.Object {
    /**
      * The location to write the code-signed file.
      */
    var destination: js.UndefOr[Destination] = js.undefined
    /**
      * The code-signing profile name.
      */
    var signingProfileName: js.UndefOr[SigningProfileName] = js.undefined
    /**
      * Describes the code-signing profile.
      */
    var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.undefined
  }
  
  trait StartThingRegistrationTaskRequest extends js.Object {
    /**
      * The S3 bucket that contains the input file.
      */
    var inputFileBucket: RegistryS3BucketName
    /**
      * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains the parameter values to provision one device (thing).
      */
    var inputFileKey: RegistryS3KeyName
    /**
      * The IAM role ARN that grants permission the input file.
      */
    var roleArn: RoleArn
    /**
      * The provisioning template.
      */
    var templateBody: TemplateBody
  }
  
  trait StartThingRegistrationTaskResponse extends js.Object {
    /**
      * The bulk thing provisioning task ID.
      */
    var taskId: js.UndefOr[TaskId] = js.undefined
  }
  
  trait StatisticalThreshold extends js.Object {
    /**
      * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are collected over the specified period (durationSeconds) from all reporting devices in your account and statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the accumulated measurements from the device fall above or below (comparisonOperator) the value associated with the percentile specified, then the device is considered to be in compliance with the behavior, otherwise a violation occurs.
      */
    var statistic: js.UndefOr[EvaluationStatistic] = js.undefined
  }
  
  trait StepFunctionsAction extends js.Object {
    /**
      * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step Functions automatically creates a unique name for each state machine execution if one is not provided.
      */
    var executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.undefined
    /**
      * The ARN of the role that grants IoT permission to start execution of a state machine ("Action":"states:StartExecution").
      */
    var roleArn: AwsArn
    /**
      * The name of the Step Functions state machine whose execution will be started.
      */
    var stateMachineName: StateMachineName
  }
  
  trait StopThingRegistrationTaskRequest extends js.Object {
    /**
      * The bulk thing provisioning task ID.
      */
    var taskId: TaskId
  }
  
  trait StopThingRegistrationTaskResponse extends js.Object
  
  trait Stream extends js.Object {
    /**
      * The ID of a file associated with a stream.
      */
    var fileId: js.UndefOr[FileId] = js.undefined
    /**
      * The stream ID.
      */
    var streamId: js.UndefOr[StreamId] = js.undefined
  }
  
  trait StreamFile extends js.Object {
    /**
      * The file ID.
      */
    var fileId: js.UndefOr[FileId] = js.undefined
    /**
      * The location of the file in S3.
      */
    var s3Location: js.UndefOr[S3Location] = js.undefined
  }
  
  trait StreamInfo extends js.Object {
    /**
      * The date when the stream was created.
      */
    var createdAt: js.UndefOr[DateType] = js.undefined
    /**
      * The description of the stream.
      */
    var description: js.UndefOr[StreamDescription] = js.undefined
    /**
      * The files to stream.
      */
    var files: js.UndefOr[StreamFiles] = js.undefined
    /**
      * The date when the stream was last updated.
      */
    var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
    /**
      * An IAM role AWS IoT assumes to access your S3 files.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The stream ARN.
      */
    var streamArn: js.UndefOr[StreamArn] = js.undefined
    /**
      * The stream ID.
      */
    var streamId: js.UndefOr[StreamId] = js.undefined
    /**
      * The stream version.
      */
    var streamVersion: js.UndefOr[StreamVersion] = js.undefined
  }
  
  trait StreamSummary extends js.Object {
    /**
      * A description of the stream.
      */
    var description: js.UndefOr[StreamDescription] = js.undefined
    /**
      * The stream ARN.
      */
    var streamArn: js.UndefOr[StreamArn] = js.undefined
    /**
      * The stream ID.
      */
    var streamId: js.UndefOr[StreamId] = js.undefined
    /**
      * The stream version.
      */
    var streamVersion: js.UndefOr[StreamVersion] = js.undefined
  }
  
  trait StringMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait Tag extends js.Object {
    /**
      * The tag's key.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * The tag's value.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The ARN of the resource.
      */
    var resourceArn: ResourceArn
    /**
      * The new or modified tags for the resource.
      */
    var tags: TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  trait TaskStatistics extends js.Object {
    /**
      * The number of checks that did not run because the audit was canceled.
      */
    var canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined
    /**
      * The number of checks that found compliant resources.
      */
    var compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined
    /**
      * The number of checks 
      */
    var failedChecks: js.UndefOr[FailedChecksCount] = js.undefined
    /**
      * The number of checks in progress.
      */
    var inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined
    /**
      * The number of checks that found non-compliant resources.
      */
    var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined
    /**
      * The number of checks in this audit.
      */
    var totalChecks: js.UndefOr[TotalChecksCount] = js.undefined
    /**
      * The number of checks waiting for data collection.
      */
    var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined
  }
  
  trait TestAuthorizationRequest extends js.Object {
    /**
      * A list of authorization info objects. Simulating authorization will create a response for each authInfo object in the list.
      */
    var authInfos: AuthInfos
    /**
      * The MQTT client ID.
      */
    var clientId: js.UndefOr[ClientId] = js.undefined
    /**
      * The Cognito identity pool ID.
      */
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
    /**
      * When testing custom authorization, the policies specified here are treated as if they are attached to the principal being authorized.
      */
    var policyNamesToAdd: js.UndefOr[PolicyNames] = js.undefined
    /**
      * When testing custom authorization, the policies specified here are treated as if they are not attached to the principal being authorized.
      */
    var policyNamesToSkip: js.UndefOr[PolicyNames] = js.undefined
    /**
      * The principal.
      */
    var principal: js.UndefOr[Principal] = js.undefined
  }
  
  trait TestAuthorizationResponse extends js.Object {
    /**
      * The authentication results.
      */
    var authResults: js.UndefOr[AuthResults] = js.undefined
  }
  
  trait TestInvokeAuthorizerRequest extends js.Object {
    /**
      * The custom authorizer name.
      */
    var authorizerName: AuthorizerName
    /**
      * The token returned by your custom authentication service.
      */
    var token: Token
    /**
      * The signature made with the token and your custom authentication service's private key.
      */
    var tokenSignature: TokenSignature
  }
  
  trait TestInvokeAuthorizerResponse extends js.Object {
    /**
      * The number of seconds after which the connection is terminated.
      */
    var disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined
    /**
      * True if the token is authenticated, otherwise false.
      */
    var isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined
    /**
      * IAM policy documents.
      */
    var policyDocuments: js.UndefOr[PolicyDocuments] = js.undefined
    /**
      * The principal ID.
      */
    var principalId: js.UndefOr[PrincipalId] = js.undefined
    /**
      * The number of seconds after which the temporary credentials are refreshed.
      */
    var refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined
  }
  
  trait ThingAttribute extends js.Object {
    /**
      * A list of thing attributes which are name-value pairs.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The thing ARN.
      */
    var thingArn: js.UndefOr[ThingArn] = js.undefined
    /**
      * The name of the thing.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
    /**
      * The name of the thing type, if the thing has been associated with a type.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    /**
      * The version of the thing record in the registry.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait ThingConnectivity extends js.Object {
    /**
      * True if the thing is connected to the AWS IoT service, false if it is not connected.
      */
    var connected: js.UndefOr[Boolean] = js.undefined
    /**
      * The epoch time (in milliseconds) when the thing last connected or disconnected. Note that if the thing has been disconnected for more than a few weeks, the time value can be missing.
      */
    var timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined
  }
  
  trait ThingDocument extends js.Object {
    /**
      * The attributes.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * Indicates whether or not the thing is connected to the AWS IoT service.
      */
    var connectivity: js.UndefOr[ThingConnectivity] = js.undefined
    /**
      * The shadow.
      */
    var shadow: js.UndefOr[JsonDocument] = js.undefined
    /**
      * Thing group names.
      */
    var thingGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined
    /**
      * The thing ID.
      */
    var thingId: js.UndefOr[ThingId] = js.undefined
    /**
      * The thing name.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
    /**
      * The thing type name.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  }
  
  trait ThingGroupDocument extends js.Object {
    /**
      * The thing group attributes.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * Parent group names.
      */
    var parentGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined
    /**
      * The thing group description.
      */
    var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
    /**
      * The thing group ID.
      */
    var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
    /**
      * The thing group name.
      */
    var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  }
  
  trait ThingGroupIndexingConfiguration extends js.Object {
    /**
      * Thing group indexing mode.
      */
    var thingGroupIndexingMode: ThingGroupIndexingMode
  }
  
  trait ThingGroupMetadata extends js.Object {
    /**
      * The UNIX timestamp of when the thing group was created.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * The parent thing group name.
      */
    var parentGroupName: js.UndefOr[ThingGroupName] = js.undefined
    /**
      * The root parent thing group.
      */
    var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
  }
  
  trait ThingGroupProperties extends js.Object {
    /**
      * The thing group attributes in JSON format.
      */
    var attributePayload: js.UndefOr[AttributePayload] = js.undefined
    /**
      * The thing group description.
      */
    var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
  }
  
  trait ThingIndexingConfiguration extends js.Object {
    /**
      * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index will contain connectivity status. In order to enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
      */
    var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
    /**
      * Thing indexing mode. Valid values are:   REGISTRY – Your thing index will contain only registry data.   REGISTRY_AND_SHADOW - Your thing index will contain registry and shadow data.   OFF - Thing indexing is disabled.  
      */
    var thingIndexingMode: ThingIndexingMode
  }
  
  trait ThingTypeDefinition extends js.Object {
    /**
      * The thing type ARN.
      */
    var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
    /**
      * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
      */
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined
    /**
      * The name of the thing type.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    /**
      * The ThingTypeProperties for the thing type.
      */
    var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
  }
  
  trait ThingTypeMetadata extends js.Object {
    /**
      * The date and time when the thing type was created.
      */
    var creationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * Whether the thing type is deprecated. If true, no new things could be associated with this type.
      */
    var deprecated: js.UndefOr[Boolean] = js.undefined
    /**
      * The date and time when the thing type was deprecated.
      */
    var deprecationDate: js.UndefOr[DeprecationDate] = js.undefined
  }
  
  trait ThingTypeProperties extends js.Object {
    /**
      * A list of searchable thing attribute names.
      */
    var searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined
    /**
      * The description of the thing type.
      */
    var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined
  }
  
  trait TimeoutConfig extends js.Object {
    /**
      * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal TIMED_OUT status.
      */
    var inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes] = js.undefined
  }
  
  trait TopicRule extends js.Object {
    /**
      * The actions associated with the rule.
      */
    var actions: js.UndefOr[ActionList] = js.undefined
    /**
      * The version of the SQL rules engine to use when evaluating the rule.
      */
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined
    /**
      * The date and time the rule was created.
      */
    var createdAt: js.UndefOr[CreatedAtDate] = js.undefined
    /**
      * The description of the rule.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The action to perform when an error occurs.
      */
    var errorAction: js.UndefOr[Action] = js.undefined
    /**
      * Specifies whether the rule is disabled.
      */
    var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
    /**
      * The name of the rule.
      */
    var ruleName: js.UndefOr[RuleName] = js.undefined
    /**
      * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the newline characters.
      */
    var sql: js.UndefOr[SQL] = js.undefined
  }
  
  trait TopicRuleListItem extends js.Object {
    /**
      * The date and time the rule was created.
      */
    var createdAt: js.UndefOr[CreatedAtDate] = js.undefined
    /**
      * The rule ARN.
      */
    var ruleArn: js.UndefOr[RuleArn] = js.undefined
    /**
      * Specifies whether the rule is disabled.
      */
    var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
    /**
      * The name of the rule.
      */
    var ruleName: js.UndefOr[RuleName] = js.undefined
    /**
      * The pattern for the topic names that apply.
      */
    var topicPattern: js.UndefOr[TopicPattern] = js.undefined
  }
  
  trait TopicRulePayload extends js.Object {
    /**
      * The actions associated with the rule.
      */
    var actions: ActionList
    /**
      * The version of the SQL rules engine to use when evaluating the rule.
      */
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined
    /**
      * The description of the rule.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The action to take when an error occurs.
      */
    var errorAction: js.UndefOr[Action] = js.undefined
    /**
      * Specifies whether the rule is disabled.
      */
    var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
    /**
      * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference in the AWS IoT Developer Guide.
      */
    var sql: SQL
  }
  
  trait TransferCertificateRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
    /**
      * The AWS account.
      */
    var targetAwsAccount: AwsAccountId
    /**
      * The transfer message.
      */
    var transferMessage: js.UndefOr[Message] = js.undefined
  }
  
  trait TransferCertificateResponse extends js.Object {
    /**
      * The ARN of the certificate.
      */
    var transferredCertificateArn: js.UndefOr[CertificateArn] = js.undefined
  }
  
  trait TransferData extends js.Object {
    /**
      * The date the transfer was accepted.
      */
    var acceptDate: js.UndefOr[DateType] = js.undefined
    /**
      * The date the transfer was rejected.
      */
    var rejectDate: js.UndefOr[DateType] = js.undefined
    /**
      * The reason why the transfer was rejected.
      */
    var rejectReason: js.UndefOr[Message] = js.undefined
    /**
      * The date the transfer took place.
      */
    var transferDate: js.UndefOr[DateType] = js.undefined
    /**
      * The transfer message.
      */
    var transferMessage: js.UndefOr[Message] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
      */
    def acceptCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptCertificateTransfer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Accepts a pending certificate transfer. The default state of the certificate is INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates.
      */
    def acceptCertificateTransfer(params: AcceptCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptCertificateTransfer(
      params: AcceptCertificateTransferRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a thing to a billing group.
      */
    def addThingToBillingGroup(): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addThingToBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddThingToBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a thing to a billing group.
      */
    def addThingToBillingGroup(params: AddThingToBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addThingToBillingGroup(
      params: AddThingToBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddThingToBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddThingToBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a thing to a thing group.
      */
    def addThingToThingGroup(): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addThingToThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddThingToThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a thing to a thing group.
      */
    def addThingToThingGroup(params: AddThingToThingGroupRequest): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addThingToThingGroup(
      params: AddThingToThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddThingToThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddThingToThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
      */
    def associateTargetsWithJob(): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateTargetsWithJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateTargetsWithJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a group with a continuous job. The following criteria must be met:    The job must have been created with the targetSelection field set to "CONTINUOUS".   The job status must currently be "IN_PROGRESS".   The total number of targets associated with a job must not exceed 100.  
      */
    def associateTargetsWithJob(params: AssociateTargetsWithJobRequest): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateTargetsWithJob(
      params: AssociateTargetsWithJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateTargetsWithJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateTargetsWithJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches a policy to the specified target.
      */
    def attachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches a policy to the specified target.
      */
    def attachPolicy(params: AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachPolicy(
      params: AttachPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
      */
    def attachPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachPrincipalPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified policy to the specified principal (certificate or other credential).  Note: This API is deprecated. Please use AttachPolicy instead.
      */
    def attachPrincipalPolicy(params: AttachPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachPrincipalPolicy(
      params: AttachPrincipalPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
      */
    def attachSecurityProfile(): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a Device Defender security profile with a thing group or with this account. Each thing group or account can have up to five security profiles associated with it.
      */
    def attachSecurityProfile(params: AttachSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachSecurityProfile(
      params: AttachSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
      */
    def attachThingPrincipal(): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachThingPrincipal(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachThingPrincipalResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
      */
    def attachThingPrincipal(params: AttachThingPrincipalRequest): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachThingPrincipal(
      params: AttachThingPrincipalRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachThingPrincipalResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
      */
    def cancelAuditTask(): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelAuditTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelAuditTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in progress, an "InvalidRequestException" occurs.
      */
    def cancelAuditTask(params: CancelAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelAuditTask(
      params: CancelAuditTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelAuditTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
      */
    def cancelCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelCertificateTransfer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a pending transfer for the specified certificate.  Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be cancelled. After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to INACTIVE.
      */
    def cancelCertificateTransfer(params: CancelCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelCertificateTransfer(
      params: CancelCertificateTransferRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a job.
      */
    def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a job.
      */
    def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJob(
      params: CancelJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the execution of a job for a given thing.
      */
    def cancelJobExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJobExecution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the execution of a job for a given thing.
      */
    def cancelJobExecution(params: CancelJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelJobExecution(
      params: CancelJobExecutionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Clears the default authorizer.
      */
    def clearDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def clearDefaultAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClearDefaultAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Clears the default authorizer.
      */
    def clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def clearDefaultAuthorizer(
      params: ClearDefaultAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClearDefaultAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClearDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an authorizer.
      */
    def createAuthorizer(): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an authorizer.
      */
    def createAuthorizer(params: CreateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAuthorizer(
      params: CreateAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a billing group.
      */
    def createBillingGroup(): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a billing group.
      */
    def createBillingGroup(params: CreateBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBillingGroup(
      params: CreateBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
      */
    def createCertificateFromCsr(): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCertificateFromCsr(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCertificateFromCsrResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an X.509 certificate using the specified certificate signing request.  Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate. You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that directory, and then specifying that directory on the command line. The following commands show how to create a batch of certificates given a batch of CSRs. Assuming a set of CSRs are located inside of the directory my-csr-directory: On Linux and OS X, the command is: $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR. The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the certificate creation process: $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/{} On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is: &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request file://my-csr-directory/$_} On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is: &gt; forfiles /p my-csr-directory /c "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
      */
    def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCertificateFromCsr(
      params: CreateCertificateFromCsrRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCertificateFromCsrResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCertificateFromCsrResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a dynamic thing group.
      */
    def createDynamicThingGroup(): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDynamicThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDynamicThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a dynamic thing group.
      */
    def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDynamicThingGroup(
      params: CreateDynamicThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDynamicThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a job.
      */
    def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a job.
      */
    def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createJob(
      params: CreateJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
      */
    def createKeysAndCertificate(): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createKeysAndCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateKeysAndCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.  Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep it in a secure location.
      */
    def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createKeysAndCertificate(
      params: CreateKeysAndCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateKeysAndCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateKeysAndCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS IoT OTAUpdate on a target group of things or groups.
      */
    def createOTAUpdate(): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createOTAUpdate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOTAUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS IoT OTAUpdate on a target group of things or groups.
      */
    def createOTAUpdate(params: CreateOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createOTAUpdate(
      params: CreateOTAUpdateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOTAUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
      */
    def createPolicy(): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS IoT policy. The created policy is the default version for the policy. This operation creates a policy version with a version identifier of 1 and sets 1 as the policy's default version.
      */
    def createPolicy(params: CreatePolicyRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicy(
      params: CreatePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
      */
    def createPolicyVersion(): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicyVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to delete an existing version before you create a new one. Optionally, you can set the new version as the policy's default version. The default version is the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
      */
    def createPolicyVersion(params: CreatePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicyVersion(
      params: CreatePolicyVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a role alias.
      */
    def createRoleAlias(): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRoleAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a role alias.
      */
    def createRoleAlias(params: CreateRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRoleAlias(
      params: CreateRoleAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a scheduled audit that is run at a specified time interval.
      */
    def createScheduledAudit(): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createScheduledAudit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a scheduled audit that is run at a specified time interval.
      */
    def createScheduledAudit(params: CreateScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createScheduledAudit(
      params: CreateScheduledAuditRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Device Defender security profile.
      */
    def createSecurityProfile(): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Device Defender security profile.
      */
    def createSecurityProfile(params: CreateSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSecurityProfile(
      params: CreateSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
      */
    def createStream(): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted within last 90 days, we will resurrect that old stream by incrementing the version by 1.
      */
    def createStream(params: CreateStreamRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStream(
      params: CreateStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a thing record in the registry.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
      */
    def createThing(): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a thing record in the registry.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
      */
    def createThing(params: CreateThingRequest): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThing(
      params: CreateThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
      */
    def createThingGroup(): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a thing group.  This is a control plane operation. See Authorization for information about authorizing control plane actions. 
      */
    def createThingGroup(params: CreateThingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThingGroup(
      params: CreateThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new thing type.
      */
    def createThingType(): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThingType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new thing type.
      */
    def createThingType(params: CreateThingTypeRequest): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThingType(
      params: CreateThingTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
      */
    def createTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTopicRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
      */
    def createTopicRule(params: CreateTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTopicRule(
      params: CreateTopicRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
      */
    def deleteAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccountAuditConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAccountAuditConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores the default settings for Device Defender audits for this account. Any configuration data you entered is deleted and all audit checks are reset to disabled. 
      */
    def deleteAccountAuditConfiguration(params: DeleteAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccountAuditConfiguration(
      params: DeleteAccountAuditConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAccountAuditConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an authorizer.
      */
    def deleteAuthorizer(): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an authorizer.
      */
    def deleteAuthorizer(params: DeleteAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAuthorizer(
      params: DeleteAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the billing group.
      */
    def deleteBillingGroup(): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the billing group.
      */
    def deleteBillingGroup(params: DeleteBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBillingGroup(
      params: DeleteBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a registered CA certificate.
      */
    def deleteCACertificate(): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCACertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCACertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a registered CA certificate.
      */
    def deleteCACertificate(params: DeleteCACertificateRequest): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCACertificate(
      params: DeleteCACertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCACertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
      */
    def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified certificate. A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the UpdateCertificate API to set the certificate to the INACTIVE status.
      */
    def deleteCertificate(params: DeleteCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificate(
      params: DeleteCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a dynamic thing group.
      */
    def deleteDynamicThingGroup(): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDynamicThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDynamicThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a dynamic thing group.
      */
    def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDynamicThingGroup(
      params: DeleteDynamicThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDynamicThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
      */
    def deleteJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a job and its related job executions. Deleting a job may take time, depending on the number of job executions created for the job and various other factors. While the job is being deleted, the status of the job will be shown as "DELETION_IN_PROGRESS". Attempting to delete or cancel a job whose status is already "DELETION_IN_PROGRESS" will result in an error. Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a LimitExceededException will occur.
      */
    def deleteJob(params: DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteJob(
      params: DeleteJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a job execution.
      */
    def deleteJobExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteJobExecution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a job execution.
      */
    def deleteJobExecution(params: DeleteJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteJobExecution(
      params: DeleteJobExecutionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an OTA update.
      */
    def deleteOTAUpdate(): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteOTAUpdate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteOTAUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an OTA update.
      */
    def deleteOTAUpdate(params: DeleteOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteOTAUpdate(
      params: DeleteOTAUpdateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteOTAUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
      */
    def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified policy. A policy cannot be deleted if it has non-default versions or it is attached to any certificate. To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete the policy. When a policy is deleted using DeletePolicy, its default version is deleted with it.
      */
    def deletePolicy(params: DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicy(
      params: DeletePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
      */
    def deletePolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicyVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version of the specified policy. You cannot delete the default version of a policy using this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions.
      */
    def deletePolicyVersion(params: DeletePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicyVersion(
      params: DeletePolicyVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a CA certificate registration code.
      */
    def deleteRegistrationCode(): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRegistrationCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRegistrationCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a CA certificate registration code.
      */
    def deleteRegistrationCode(params: DeleteRegistrationCodeRequest): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRegistrationCode(
      params: DeleteRegistrationCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRegistrationCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a role alias
      */
    def deleteRoleAlias(): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRoleAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a role alias
      */
    def deleteRoleAlias(params: DeleteRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRoleAlias(
      params: DeleteRoleAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a scheduled audit.
      */
    def deleteScheduledAudit(): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteScheduledAudit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a scheduled audit.
      */
    def deleteScheduledAudit(params: DeleteScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteScheduledAudit(
      params: DeleteScheduledAuditRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Device Defender security profile.
      */
    def deleteSecurityProfile(): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Device Defender security profile.
      */
    def deleteSecurityProfile(params: DeleteSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSecurityProfile(
      params: DeleteSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a stream.
      */
    def deleteStream(): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a stream.
      */
    def deleteStream(params: DeleteStreamRequest): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStream(
      params: DeleteStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a thing that doesn't exist.
      */
    def deleteThing(): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a thing that doesn't exist.
      */
    def deleteThing(params: DeleteThingRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThing(
      params: DeleteThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a thing group.
      */
    def deleteThingGroup(): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a thing group.
      */
    def deleteThingGroup(params: DeleteThingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThingGroup(
      params: DeleteThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
      */
    def deleteThingType(): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThingType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things by calling UpdateThing to change the thing type on any associated thing, and finally use DeleteThingType to delete the thing type.
      */
    def deleteThingType(params: DeleteThingTypeRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThingType(
      params: DeleteThingTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the rule.
      */
    def deleteTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTopicRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the rule.
      */
    def deleteTopicRule(params: DeleteTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTopicRule(
      params: DeleteTopicRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a logging level.
      */
    def deleteV2LoggingLevel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteV2LoggingLevel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a logging level.
      */
    def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteV2LoggingLevel(
      params: DeleteV2LoggingLevelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecates a thing type. You can not associate new things with deprecated thing type.
      */
    def deprecateThingType(): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deprecateThingType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeprecateThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecates a thing type. You can not associate new things with deprecated thing type.
      */
    def deprecateThingType(params: DeprecateThingTypeRequest): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deprecateThingType(
      params: DeprecateThingTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeprecateThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeprecateThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
      */
    def describeAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAuditConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAuditConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
      */
    def describeAccountAuditConfiguration(params: DescribeAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAuditConfiguration(
      params: DescribeAccountAuditConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAuditConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a Device Defender audit.
      */
    def describeAuditTask(): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAuditTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAuditTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a Device Defender audit.
      */
    def describeAuditTask(params: DescribeAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAuditTask(
      params: DescribeAuditTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAuditTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an authorizer.
      */
    def describeAuthorizer(): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an authorizer.
      */
    def describeAuthorizer(params: DescribeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAuthorizer(
      params: DescribeAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a billing group.
      */
    def describeBillingGroup(): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a billing group.
      */
    def describeBillingGroup(params: DescribeBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBillingGroup(
      params: DescribeBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a registered CA certificate.
      */
    def describeCACertificate(): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCACertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCACertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a registered CA certificate.
      */
    def describeCACertificate(params: DescribeCACertificateRequest): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCACertificate(
      params: DescribeCACertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCACertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified certificate.
      */
    def describeCertificate(): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified certificate.
      */
    def describeCertificate(params: DescribeCertificateRequest): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificate(
      params: DescribeCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the default authorizer.
      */
    def describeDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDefaultAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDefaultAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the default authorizer.
      */
    def describeDefaultAuthorizer(params: DescribeDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDefaultAuthorizer(
      params: DescribeDefaultAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDefaultAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a unique endpoint specific to the AWS account making the call.
      */
    def describeEndpoint(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a unique endpoint specific to the AWS account making the call.
      */
    def describeEndpoint(params: DescribeEndpointRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpoint(
      params: DescribeEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes event configurations.
      */
    def describeEventConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes event configurations.
      */
    def describeEventConfigurations(params: DescribeEventConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventConfigurations(
      params: DescribeEventConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a search index.
      */
    def describeIndex(): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIndex(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a search index.
      */
    def describeIndex(params: DescribeIndexRequest): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIndex(
      params: DescribeIndexRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a job.
      */
    def describeJob(): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a job.
      */
    def describeJob(params: DescribeJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJob(
      params: DescribeJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a job execution.
      */
    def describeJobExecution(): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a job execution.
      */
    def describeJobExecution(params: DescribeJobExecutionRequest): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJobExecution(
      params: DescribeJobExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a role alias.
      */
    def describeRoleAlias(): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRoleAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a role alias.
      */
    def describeRoleAlias(params: DescribeRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRoleAlias(
      params: DescribeRoleAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a scheduled audit.
      */
    def describeScheduledAudit(): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScheduledAudit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a scheduled audit.
      */
    def describeScheduledAudit(params: DescribeScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScheduledAudit(
      params: DescribeScheduledAuditRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a Device Defender security profile.
      */
    def describeSecurityProfile(): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a Device Defender security profile.
      */
    def describeSecurityProfile(params: DescribeSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSecurityProfile(
      params: DescribeSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a stream.
      */
    def describeStream(): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a stream.
      */
    def describeStream(params: DescribeStreamRequest): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStream(
      params: DescribeStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified thing.
      */
    def describeThing(): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified thing.
      */
    def describeThing(params: DescribeThingRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThing(
      params: DescribeThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe a thing group.
      */
    def describeThingGroup(): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe a thing group.
      */
    def describeThingGroup(params: DescribeThingGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThingGroup(
      params: DescribeThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a bulk thing provisioning task.
      */
    def describeThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThingRegistrationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingRegistrationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a bulk thing provisioning task.
      */
    def describeThingRegistrationTask(params: DescribeThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThingRegistrationTask(
      params: DescribeThingRegistrationTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingRegistrationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified thing type.
      */
    def describeThingType(): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThingType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified thing type.
      */
    def describeThingType(params: DescribeThingTypeRequest): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeThingType(
      params: DescribeThingTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeThingTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeThingTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detaches a policy from the specified target.
      */
    def detachPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detaches a policy from the specified target.
      */
    def detachPolicy(params: DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachPolicy(
      params: DetachPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
      */
    def detachPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachPrincipalPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified policy from the specified certificate.  Note: This API is deprecated. Please use DetachPolicy instead.
      */
    def detachPrincipalPolicy(params: DetachPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachPrincipalPolicy(
      params: DetachPrincipalPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a Device Defender security profile from a thing group or from this account.
      */
    def detachSecurityProfile(): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a Device Defender security profile from a thing group or from this account.
      */
    def detachSecurityProfile(params: DetachSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachSecurityProfile(
      params: DetachSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
      */
    def detachThingPrincipal(): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachThingPrincipal(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachThingPrincipalResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
      */
    def detachThingPrincipal(params: DetachThingPrincipalRequest): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachThingPrincipal(
      params: DetachThingPrincipalRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachThingPrincipalResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachThingPrincipalResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables the rule.
      */
    def disableTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableTopicRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables the rule.
      */
    def disableTopicRule(params: DisableTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableTopicRule(
      params: DisableTopicRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables the rule.
      */
    def enableTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableTopicRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables the rule.
      */
    def enableTopicRule(params: EnableTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableTopicRule(
      params: EnableTopicRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
      */
    def getEffectivePolicies(): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEffectivePolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEffectivePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of the policies that have an effect on the authorization behavior of the specified device when it connects to the AWS IoT device gateway.
      */
    def getEffectivePolicies(params: GetEffectivePoliciesRequest): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEffectivePolicies(
      params: GetEffectivePoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEffectivePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEffectivePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the search configuration.
      */
    def getIndexingConfiguration(): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIndexingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIndexingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the search configuration.
      */
    def getIndexingConfiguration(params: GetIndexingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIndexingConfiguration(
      params: GetIndexingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIndexingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a job document.
      */
    def getJobDocument(): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getJobDocument(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobDocumentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a job document.
      */
    def getJobDocument(params: GetJobDocumentRequest): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getJobDocument(
      params: GetJobDocumentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobDocumentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
      */
    def getLoggingOptions(): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLoggingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLoggingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the logging options. NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.
      */
    def getLoggingOptions(params: GetLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLoggingOptions(
      params: GetLoggingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLoggingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an OTA update.
      */
    def getOTAUpdate(): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOTAUpdate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOTAUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an OTA update.
      */
    def getOTAUpdate(params: GetOTAUpdateRequest): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOTAUpdate(
      params: GetOTAUpdateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOTAUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOTAUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified policy with the policy document of the default version.
      */
    def getPolicy(): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified policy with the policy document of the default version.
      */
    def getPolicy(params: GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      params: GetPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified policy version.
      */
    def getPolicyVersion(): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicyVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the specified policy version.
      */
    def getPolicyVersion(params: GetPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicyVersion(
      params: GetPolicyVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a registration code used to register a CA certificate with AWS IoT.
      */
    def getRegistrationCode(): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRegistrationCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRegistrationCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a registration code used to register a CA certificate with AWS IoT.
      */
    def getRegistrationCode(params: GetRegistrationCodeRequest): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRegistrationCode(
      params: GetRegistrationCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRegistrationCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRegistrationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the rule.
      */
    def getTopicRule(): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTopicRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTopicRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about the rule.
      */
    def getTopicRule(params: GetTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTopicRule(
      params: GetTopicRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTopicRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTopicRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the fine grained logging options.
      */
    def getV2LoggingOptions(): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getV2LoggingOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetV2LoggingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the fine grained logging options.
      */
    def getV2LoggingOptions(params: GetV2LoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getV2LoggingOptions(
      params: GetV2LoggingOptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetV2LoggingOptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetV2LoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the active violations for a given Device Defender security profile.
      */
    def listActiveViolations(): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActiveViolations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActiveViolationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the active violations for a given Device Defender security profile.
      */
    def listActiveViolations(params: ListActiveViolationsRequest): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActiveViolations(
      params: ListActiveViolationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActiveViolationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActiveViolationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the policies attached to the specified thing group.
      */
    def listAttachedPolicies(): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the policies attached to the specified thing group.
      */
    def listAttachedPolicies(params: ListAttachedPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedPolicies(
      params: ListAttachedPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
      */
    def listAuditFindings(): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAuditFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAuditFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time period. (Findings are retained for 180 days.)
      */
    def listAuditFindings(params: ListAuditFindingsRequest): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAuditFindings(
      params: ListAuditFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAuditFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAuditFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender audits that have been performed during a given time period.
      */
    def listAuditTasks(): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAuditTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAuditTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender audits that have been performed during a given time period.
      */
    def listAuditTasks(params: ListAuditTasksRequest): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAuditTasks(
      params: ListAuditTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAuditTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAuditTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the authorizers registered in your account.
      */
    def listAuthorizers(): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAuthorizers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAuthorizersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the authorizers registered in your account.
      */
    def listAuthorizers(params: ListAuthorizersRequest): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAuthorizers(
      params: ListAuthorizersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAuthorizersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAuthorizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the billing groups you have created.
      */
    def listBillingGroups(): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBillingGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBillingGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the billing groups you have created.
      */
    def listBillingGroups(params: ListBillingGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBillingGroups(
      params: ListBillingGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBillingGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBillingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
      */
    def listCACertificates(): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCACertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCACertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the CA certificates registered for your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
      */
    def listCACertificates(params: ListCACertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCACertificates(
      params: ListCACertificatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCACertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCACertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
      */
    def listCertificates(): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the certificates registered in your AWS account. The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional results.
      */
    def listCertificates(params: ListCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificates(
      params: ListCertificatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the device certificates signed by the specified CA certificate.
      */
    def listCertificatesByCA(): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificatesByCA(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificatesByCAResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the device certificates signed by the specified CA certificate.
      */
    def listCertificatesByCA(params: ListCertificatesByCARequest): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCertificatesByCA(
      params: ListCertificatesByCARequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCertificatesByCAResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCertificatesByCAResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the search indices.
      */
    def listIndices(): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIndices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIndicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the search indices.
      */
    def listIndices(params: ListIndicesRequest): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIndices(
      params: ListIndicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIndicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the job executions for a job.
      */
    def listJobExecutionsForJob(): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobExecutionsForJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobExecutionsForJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the job executions for a job.
      */
    def listJobExecutionsForJob(params: ListJobExecutionsForJobRequest): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobExecutionsForJob(
      params: ListJobExecutionsForJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobExecutionsForJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the job executions for the specified thing.
      */
    def listJobExecutionsForThing(): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobExecutionsForThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobExecutionsForThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the job executions for the specified thing.
      */
    def listJobExecutionsForThing(params: ListJobExecutionsForThingRequest): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobExecutionsForThing(
      params: ListJobExecutionsForThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobExecutionsForThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobExecutionsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists jobs.
      */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists jobs.
      */
    def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      params: ListJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists OTA updates.
      */
    def listOTAUpdates(): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOTAUpdates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOTAUpdatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists OTA updates.
      */
    def listOTAUpdates(params: ListOTAUpdatesRequest): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOTAUpdates(
      params: ListOTAUpdatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOTAUpdatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOTAUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists certificates that are being transferred but not yet accepted.
      */
    def listOutgoingCertificates(): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOutgoingCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOutgoingCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists certificates that are being transferred but not yet accepted.
      */
    def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOutgoingCertificates(
      params: ListOutgoingCertificatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOutgoingCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOutgoingCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your policies.
      */
    def listPolicies(): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your policies.
      */
    def listPolicies(params: ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicies(
      params: ListPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
      */
    def listPolicyPrincipals(): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicyPrincipals(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyPrincipalsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the principals associated with the specified policy.  Note: This API is deprecated. Please use ListTargetsForPolicy instead.
      */
    def listPolicyPrincipals(params: ListPolicyPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicyPrincipals(
      params: ListPolicyPrincipalsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyPrincipalsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the versions of the specified policy and identifies the default version.
      */
    def listPolicyVersions(): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicyVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the versions of the specified policy and identifies the default version.
      */
    def listPolicyVersions(params: ListPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicyVersions(
      params: ListPolicyVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
      */
    def listPrincipalPolicies(): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPrincipalPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPrincipalPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the policies attached to the specified principal. If you use an Cognito identity, the ID must be in AmazonCognito Identity format.  Note: This API is deprecated. Please use ListAttachedPolicies instead.
      */
    def listPrincipalPolicies(params: ListPrincipalPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPrincipalPolicies(
      params: ListPrincipalPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPrincipalPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPrincipalPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. 
      */
    def listPrincipalThings(): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPrincipalThings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPrincipalThingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities. 
      */
    def listPrincipalThings(params: ListPrincipalThingsRequest): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPrincipalThings(
      params: ListPrincipalThingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPrincipalThingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPrincipalThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the role aliases registered in your account.
      */
    def listRoleAliases(): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoleAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoleAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the role aliases registered in your account.
      */
    def listRoleAliases(params: ListRoleAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoleAliases(
      params: ListRoleAliasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoleAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoleAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of your scheduled audits.
      */
    def listScheduledAudits(): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listScheduledAudits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListScheduledAuditsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of your scheduled audits.
      */
    def listScheduledAudits(params: ListScheduledAuditsRequest): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listScheduledAudits(
      params: ListScheduledAuditsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListScheduledAuditsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListScheduledAuditsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
      */
    def listSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSecurityProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSecurityProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender security profiles you have created. You can use filters to list only those security profiles associated with a thing group or only those associated with your account.
      */
    def listSecurityProfiles(params: ListSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSecurityProfiles(
      params: ListSecurityProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSecurityProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender security profiles attached to a target (thing group).
      */
    def listSecurityProfilesForTarget(): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSecurityProfilesForTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSecurityProfilesForTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender security profiles attached to a target (thing group).
      */
    def listSecurityProfilesForTarget(params: ListSecurityProfilesForTargetRequest): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSecurityProfilesForTarget(
      params: ListSecurityProfilesForTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSecurityProfilesForTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesForTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the streams in your AWS account.
      */
    def listStreams(): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreams(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the streams in your AWS account.
      */
    def listStreams(params: ListStreamsRequest): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreams(
      params: ListStreamsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags (metadata) you have assigned to the resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags (metadata) you have assigned to the resource.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List targets for the specified policy.
      */
    def listTargetsForPolicy(): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTargetsForPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTargetsForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List targets for the specified policy.
      */
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTargetsForPolicy(
      params: ListTargetsForPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTargetsForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTargetsForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the targets (thing groups) associated with a given Device Defender security profile.
      */
    def listTargetsForSecurityProfile(): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTargetsForSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTargetsForSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the targets (thing groups) associated with a given Device Defender security profile.
      */
    def listTargetsForSecurityProfile(params: ListTargetsForSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTargetsForSecurityProfile(
      params: ListTargetsForSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTargetsForSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTargetsForSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the thing groups in your account.
      */
    def listThingGroups(): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the thing groups in your account.
      */
    def listThingGroups(params: ListThingGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingGroups(
      params: ListThingGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the thing groups to which the specified thing belongs.
      */
    def listThingGroupsForThing(): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingGroupsForThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingGroupsForThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the thing groups to which the specified thing belongs.
      */
    def listThingGroupsForThing(params: ListThingGroupsForThingRequest): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingGroupsForThing(
      params: ListThingGroupsForThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingGroupsForThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
      */
    def listThingPrincipals(): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingPrincipals(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingPrincipalsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities or federated identities.
      */
    def listThingPrincipals(params: ListThingPrincipalsRequest): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingPrincipals(
      params: ListThingPrincipalsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingPrincipalsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingPrincipalsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Information about the thing registration tasks.
      */
    def listThingRegistrationTaskReports(): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingRegistrationTaskReports(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingRegistrationTaskReportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Information about the thing registration tasks.
      */
    def listThingRegistrationTaskReports(params: ListThingRegistrationTaskReportsRequest): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingRegistrationTaskReports(
      params: ListThingRegistrationTaskReportsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingRegistrationTaskReportsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTaskReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List bulk thing provisioning tasks.
      */
    def listThingRegistrationTasks(): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingRegistrationTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingRegistrationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List bulk thing provisioning tasks.
      */
    def listThingRegistrationTasks(params: ListThingRegistrationTasksRequest): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingRegistrationTasks(
      params: ListThingRegistrationTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingRegistrationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingRegistrationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing thing types.
      */
    def listThingTypes(): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing thing types.
      */
    def listThingTypes(params: ListThingTypesRequest): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingTypes(
      params: ListThingTypesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
      */
    def listThings(): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your things. Use the attributeName and attributeValue parameters to filter your things. For example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in the registry that contain an attribute Color with the value Red. 
      */
    def listThings(params: ListThingsRequest): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThings(
      params: ListThingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the things you have added to the given billing group.
      */
    def listThingsInBillingGroup(): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingsInBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingsInBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the things you have added to the given billing group.
      */
    def listThingsInBillingGroup(params: ListThingsInBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingsInBillingGroup(
      params: ListThingsInBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingsInBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingsInBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the things in the specified group.
      */
    def listThingsInThingGroup(): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingsInThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingsInThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the things in the specified group.
      */
    def listThingsInThingGroup(params: ListThingsInThingGroupRequest): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThingsInThingGroup(
      params: ListThingsInThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThingsInThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThingsInThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the rules for the specific topic.
      */
    def listTopicRules(): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTopicRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTopicRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the rules for the specific topic.
      */
    def listTopicRules(params: ListTopicRulesRequest): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTopicRules(
      params: ListTopicRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTopicRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTopicRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists logging levels.
      */
    def listV2LoggingLevels(): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listV2LoggingLevels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListV2LoggingLevelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists logging levels.
      */
    def listV2LoggingLevels(params: ListV2LoggingLevelsRequest): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listV2LoggingLevels(
      params: ListV2LoggingLevelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListV2LoggingLevelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListV2LoggingLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
      */
    def listViolationEvents(): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listViolationEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListViolationEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Device Defender security profile violations discovered during the given time period. You can use filters to limit the results to those alerts issued for a particular security profile, behavior or thing (device).
      */
    def listViolationEvents(params: ListViolationEventsRequest): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listViolationEvents(
      params: ListViolationEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListViolationEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListViolationEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
      */
    def registerCACertificate(): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerCACertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterCACertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you have more than one CA certificate registered, make sure you pass the CA certificate when you register your device certificates with the RegisterCertificate API.
      */
    def registerCACertificate(params: RegisterCACertificateRequest): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerCACertificate(
      params: RegisterCACertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterCACertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterCACertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
      */
    def registerCertificate(): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject field, you must specify the CA certificate that was used to sign the device certificate being registered.
      */
    def registerCertificate(params: RegisterCertificateRequest): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerCertificate(
      params: RegisterCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provisions a thing.
      */
    def registerThing(): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provisions a thing.
      */
    def registerThing(params: RegisterThingRequest): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerThing(
      params: RegisterThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
      */
    def rejectCertificateTransfer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectCertificateTransfer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status changes from PENDING_TRANSFER to INACTIVE. To check for pending certificate transfers, call ListCertificates to enumerate your certificates. This operation can only be called by the transfer destination. After it is called, the certificate will be returned to the source's account in the INACTIVE state.
      */
    def rejectCertificateTransfer(params: RejectCertificateTransferRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectCertificateTransfer(
      params: RejectCertificateTransferRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the given thing from the billing group.
      */
    def removeThingFromBillingGroup(): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeThingFromBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveThingFromBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the given thing from the billing group.
      */
    def removeThingFromBillingGroup(params: RemoveThingFromBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeThingFromBillingGroup(
      params: RemoveThingFromBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveThingFromBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove the specified thing from the specified group.
      */
    def removeThingFromThingGroup(): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeThingFromThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveThingFromThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove the specified thing from the specified group.
      */
    def removeThingFromThingGroup(params: RemoveThingFromThingGroupRequest): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeThingFromThingGroup(
      params: RemoveThingFromThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveThingFromThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveThingFromThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
      */
    def replaceTopicRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def replaceTopicRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level action. Any user who has permission to create rules will be able to access data processed by the rule.
      */
    def replaceTopicRule(params: ReplaceTopicRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def replaceTopicRule(
      params: ReplaceTopicRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The query search index.
      */
    def searchIndex(): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchIndex(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The query search index.
      */
    def searchIndex(params: SearchIndexRequest): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchIndex(
      params: SearchIndexRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
      */
    def setDefaultAuthorizer(): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDefaultAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetDefaultAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the default authorizer. This will be used if a websocket connection is made without specifying an authorizer.
      */
    def setDefaultAuthorizer(params: SetDefaultAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDefaultAuthorizer(
      params: SetDefaultAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetDefaultAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetDefaultAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
      */
    def setDefaultPolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDefaultPolicyVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the specified version of the specified policy as the policy's default (operative) version. This action affects all certificates to which the policy is attached. To list the principals the policy is attached to, use the ListPrincipalPolicy API.
      */
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDefaultPolicyVersion(
      params: SetDefaultPolicyVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
      */
    def setLoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoggingOptions(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the logging options. NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.
      */
    def setLoggingOptions(params: SetLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setLoggingOptions(
      params: SetLoggingOptionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the logging level.
      */
    def setV2LoggingLevel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setV2LoggingLevel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the logging level.
      */
    def setV2LoggingLevel(params: SetV2LoggingLevelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setV2LoggingLevel(
      params: SetV2LoggingLevelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the logging options for the V2 logging service.
      */
    def setV2LoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setV2LoggingOptions(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the logging options for the V2 logging service.
      */
    def setV2LoggingOptions(params: SetV2LoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setV2LoggingOptions(
      params: SetV2LoggingOptionsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts an on-demand Device Defender audit.
      */
    def startOnDemandAuditTask(): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startOnDemandAuditTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartOnDemandAuditTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts an on-demand Device Defender audit.
      */
    def startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startOnDemandAuditTask(
      params: StartOnDemandAuditTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartOnDemandAuditTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartOnDemandAuditTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a bulk thing provisioning task.
      */
    def startThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startThingRegistrationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartThingRegistrationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a bulk thing provisioning task.
      */
    def startThingRegistrationTask(params: StartThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startThingRegistrationTask(
      params: StartThingRegistrationTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartThingRegistrationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a bulk thing provisioning task.
      */
    def stopThingRegistrationTask(): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopThingRegistrationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopThingRegistrationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a bulk thing provisioning task.
      */
    def stopThingRegistrationTask(params: StopThingRegistrationTaskRequest): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopThingRegistrationTask(
      params: StopThingRegistrationTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopThingRegistrationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopThingRegistrationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
      */
    def testAuthorization(): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.
      */
    def testAuthorization(params: TestAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testAuthorization(
      params: TestAuthorizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
      */
    def testInvokeAuthorizer(): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testInvokeAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestInvokeAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the custom authorization behavior of devices that connect to the AWS IoT device gateway.
      */
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testInvokeAuthorizer(
      params: TestInvokeAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestInvokeAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestInvokeAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
      */
    def transferCertificate(): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transferCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransferCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Transfers the specified certificate to the specified AWS account. You can cancel the transfer until it is acknowledged by the recipient. No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer target. The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to deactivate it. The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach them.
      */
    def transferCertificate(params: TransferCertificateRequest): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def transferCertificate(
      params: TransferCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TransferCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TransferCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the given tags (metadata) from the resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the given tags (metadata) from the resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
      */
    def updateAccountAuditConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountAuditConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAccountAuditConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit notifications are sent and which audit checks are enabled or disabled.
      */
    def updateAccountAuditConfiguration(params: UpdateAccountAuditConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountAuditConfiguration(
      params: UpdateAccountAuditConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAccountAuditConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAccountAuditConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an authorizer.
      */
    def updateAuthorizer(): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAuthorizer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an authorizer.
      */
    def updateAuthorizer(params: UpdateAuthorizerRequest): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAuthorizer(
      params: UpdateAuthorizerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAuthorizerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAuthorizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates information about the billing group.
      */
    def updateBillingGroup(): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBillingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates information about the billing group.
      */
    def updateBillingGroup(params: UpdateBillingGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBillingGroup(
      params: UpdateBillingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBillingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBillingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a registered CA certificate.
      */
    def updateCACertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCACertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a registered CA certificate.
      */
    def updateCACertificate(params: UpdateCACertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCACertificate(
      params: UpdateCACertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
      */
    def updateCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the status of the specified certificate. This operation is idempotent. Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices, but these devices will be unable to reconnect. The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.
      */
    def updateCertificate(params: UpdateCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCertificate(
      params: UpdateCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a dynamic thing group.
      */
    def updateDynamicThingGroup(): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDynamicThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDynamicThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a dynamic thing group.
      */
    def updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDynamicThingGroup(
      params: UpdateDynamicThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDynamicThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDynamicThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the event configurations.
      */
    def updateEventConfigurations(): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEventConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEventConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the event configurations.
      */
    def updateEventConfigurations(params: UpdateEventConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEventConfigurations(
      params: UpdateEventConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEventConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEventConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the search configuration.
      */
    def updateIndexingConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateIndexingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIndexingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the search configuration.
      */
    def updateIndexingConfiguration(params: UpdateIndexingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateIndexingConfiguration(
      params: UpdateIndexingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIndexingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIndexingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates supported fields of the specified job.
      */
    def updateJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates supported fields of the specified job.
      */
    def updateJob(params: UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateJob(
      params: UpdateJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a role alias.
      */
    def updateRoleAlias(): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRoleAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a role alias.
      */
    def updateRoleAlias(params: UpdateRoleAliasRequest): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRoleAlias(
      params: UpdateRoleAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoleAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoleAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
      */
    def updateScheduledAudit(): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateScheduledAudit(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a scheduled audit, including what checks are performed and how often the audit takes place.
      */
    def updateScheduledAudit(params: UpdateScheduledAuditRequest): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateScheduledAudit(
      params: UpdateScheduledAuditRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateScheduledAuditResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateScheduledAuditResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Device Defender security profile.
      */
    def updateSecurityProfile(): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSecurityProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a Device Defender security profile.
      */
    def updateSecurityProfile(params: UpdateSecurityProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSecurityProfile(
      params: UpdateSecurityProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSecurityProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSecurityProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing stream. The stream version will be incremented by one.
      */
    def updateStream(): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing stream. The stream version will be incremented by one.
      */
    def updateStream(params: UpdateStreamRequest): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStream(
      params: UpdateStreamRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStreamResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the data for a thing.
      */
    def updateThing(): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the data for a thing.
      */
    def updateThing(params: UpdateThingRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThing(
      params: UpdateThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a thing group.
      */
    def updateThingGroup(): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThingGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a thing group.
      */
    def updateThingGroup(params: UpdateThingGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThingGroup(
      params: UpdateThingGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the groups to which the thing belongs.
      */
    def updateThingGroupsForThing(): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThingGroupsForThing(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingGroupsForThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the groups to which the thing belongs.
      */
    def updateThingGroupsForThing(params: UpdateThingGroupsForThingRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThingGroupsForThing(
      params: UpdateThingGroupsForThingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingGroupsForThingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingGroupsForThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates a Device Defender security profile behaviors specification.
      */
    def validateSecurityProfileBehaviors(): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateSecurityProfileBehaviors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidateSecurityProfileBehaviorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates a Device Defender security profile behaviors specification.
      */
    def validateSecurityProfileBehaviors(params: ValidateSecurityProfileBehaviorsRequest): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateSecurityProfileBehaviors(
      params: ValidateSecurityProfileBehaviorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidateSecurityProfileBehaviorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidateSecurityProfileBehaviorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The ARN of the resource.
      */
    var resourceArn: ResourceArn
    /**
      * A list of the keys of the tags to be removed from the resource.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateAccountAuditConfigurationRequest extends js.Object {
    /**
      * Specifies which audit checks are enabled and disabled for this account. Use DescribeAccountAuditConfiguration to see the list of all checks including those that are currently enabled. Note that some data collection may begin immediately when certain checks are enabled. When a check is disabled, any data collected so far in relation to the check is deleted. You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the scheduled audit or delete the scheduled audit itself. On the first call to UpdateAccountAuditConfiguration this parameter is required and must specify at least one enabled check.
      */
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined
    /**
      * Information about the targets to which audit notifications are sent.
      */
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined
    /**
      * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as necessary when performing an audit.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait UpdateAccountAuditConfigurationResponse extends js.Object
  
  trait UpdateAuthorizerRequest extends js.Object {
    /**
      * The ARN of the authorizer's Lambda function.
      */
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined
    /**
      * The authorizer name.
      */
    var authorizerName: AuthorizerName
    /**
      * The status of the update authorizer request.
      */
    var status: js.UndefOr[AuthorizerStatus] = js.undefined
    /**
      * The key used to extract the token from the HTTP headers. 
      */
    var tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined
    /**
      * The public keys used to verify the token signature.
      */
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
  }
  
  trait UpdateAuthorizerResponse extends js.Object {
    /**
      * The authorizer ARN.
      */
    var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
    /**
      * The authorizer name.
      */
    var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
  }
  
  trait UpdateBillingGroupRequest extends js.Object {
    /**
      * The name of the billing group.
      */
    var billingGroupName: BillingGroupName
    /**
      * The properties of the billing group.
      */
    var billingGroupProperties: BillingGroupProperties
    /**
      * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the UpdateBillingGroup request is rejected with a VersionConflictException.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  }
  
  trait UpdateBillingGroupResponse extends js.Object {
    /**
      * The latest version of the billing group.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait UpdateCACertificateRequest extends js.Object {
    /**
      * The CA certificate identifier.
      */
    var certificateId: CertificateId
    /**
      * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
      */
    var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined
    /**
      * The updated status of the CA certificate.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
      */
    var newStatus: js.UndefOr[CACertificateStatus] = js.undefined
    /**
      * Information about the registration configuration.
      */
    var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
    /**
      * If true, remove auto registration.
      */
    var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
  }
  
  trait UpdateCertificateRequest extends js.Object {
    /**
      * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
      */
    var certificateId: CertificateId
    /**
      * The new status.  Note: Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
      */
    var newStatus: CertificateStatus
  }
  
  trait UpdateDynamicThingGroupRequest extends js.Object {
    /**
      * The expected version of the dynamic thing group to update.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * The dynamic thing group index to update.  Currently one index is supported: 'AWS_Things'. 
      */
    var indexName: js.UndefOr[IndexName] = js.undefined
    /**
      * The dynamic thing group search query string to update.
      */
    var queryString: js.UndefOr[QueryString] = js.undefined
    /**
      * The dynamic thing group query version to update.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
      */
    var queryVersion: js.UndefOr[QueryVersion] = js.undefined
    /**
      * The name of the dynamic thing group to update.
      */
    var thingGroupName: ThingGroupName
    /**
      * The dynamic thing group properties to update.
      */
    var thingGroupProperties: ThingGroupProperties
  }
  
  trait UpdateDynamicThingGroupResponse extends js.Object {
    /**
      * The dynamic thing group version.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait UpdateEventConfigurationsRequest extends js.Object {
    /**
      * The new event configuration values.
      */
    var eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
  }
  
  trait UpdateEventConfigurationsResponse extends js.Object
  
  trait UpdateIndexingConfigurationRequest extends js.Object {
    /**
      * Thing group indexing configuration.
      */
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined
    /**
      * Thing indexing configuration.
      */
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
  }
  
  trait UpdateIndexingConfigurationResponse extends js.Object
  
  trait UpdateJobRequest extends js.Object {
    /**
      * Allows you to create criteria to abort a job.
      */
    var abortConfig: js.UndefOr[AbortConfig] = js.undefined
    /**
      * A short text description of the job.
      */
    var description: js.UndefOr[JobDescription] = js.undefined
    /**
      * Allows you to create a staged rollout of the job.
      */
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
    /**
      * The ID of the job to be updated.
      */
    var jobId: JobId
    /**
      * Configuration information for pre-signed S3 URLs.
      */
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
    /**
      * Specifies the amount of time each device has to finish its execution of the job. The timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the time expires, it will be automatically set to TIMED_OUT. 
      */
    var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
  }
  
  trait UpdateRoleAliasRequest extends js.Object {
    /**
      * The number of seconds the credential will be valid.
      */
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
    /**
      * The role alias to update.
      */
    var roleAlias: RoleAlias
    /**
      * The role ARN.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait UpdateRoleAliasResponse extends js.Object {
    /**
      * The role alias.
      */
    var roleAlias: js.UndefOr[RoleAlias] = js.undefined
    /**
      * The role alias ARN.
      */
    var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
  }
  
  trait UpdateScheduledAuditRequest extends js.Object {
    /**
      * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
      */
    var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
    /**
      * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
      */
    var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    /**
      * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is determined by the system.
      */
    var frequency: js.UndefOr[AuditFrequency] = js.undefined
    /**
      * The name of the scheduled audit. (Max. 128 chars)
      */
    var scheduledAuditName: ScheduledAuditName
    /**
      * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.)
      */
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
  }
  
  trait UpdateScheduledAuditResponse extends js.Object {
    /**
      * The ARN of the scheduled audit.
      */
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
  }
  
  trait UpdateSecurityProfileRequest extends js.Object {
    /**
      * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors but it is also retained for any metric specified here.
      */
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
    /**
      * Where the alerts are sent. (Alerts are always sent to the console.)
      */
    var alertTargets: js.UndefOr[AlertTargets] = js.undefined
    /**
      * Specifies the behaviors that, when violated by a device (thing), cause an alert.
      */
    var behaviors: js.UndefOr[Behaviors] = js.undefined
    /**
      * If true, delete all additionalMetricsToRetain defined for this security profile. If any additionalMetricsToRetain are defined in the current invocation an exception occurs.
      */
    var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain] = js.undefined
    /**
      * If true, delete all alertTargets defined for this security profile. If any alertTargets are defined in the current invocation an exception occurs.
      */
    var deleteAlertTargets: js.UndefOr[DeleteAlertTargets] = js.undefined
    /**
      * If true, delete all behaviors defined for this security profile. If any behaviors are defined in the current invocation an exception occurs.
      */
    var deleteBehaviors: js.UndefOr[DeleteBehaviors] = js.undefined
    /**
      * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different than the actual version, a VersionConflictException is thrown.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * A description of the security profile.
      */
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
    /**
      * The name of the security profile you want to update.
      */
    var securityProfileName: SecurityProfileName
  }
  
  trait UpdateSecurityProfileResponse extends js.Object {
    /**
      * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the security profile's behaviors but it is also retained for any metric specified here.
      */
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
    /**
      * Where the alerts are sent. (Alerts are always sent to the console.)
      */
    var alertTargets: js.UndefOr[AlertTargets] = js.undefined
    /**
      * Specifies the behaviors that, when violated by a device (thing), cause an alert.
      */
    var behaviors: js.UndefOr[Behaviors] = js.undefined
    /**
      * The time the security profile was created.
      */
    var creationDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time the security profile was last modified.
      */
    var lastModifiedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The ARN of the security profile that was updated.
      */
    var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
    /**
      * The description of the security profile.
      */
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
    /**
      * The name of the security profile that was updated.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    /**
      * The updated version of the security profile.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait UpdateStreamRequest extends js.Object {
    /**
      * The description of the stream.
      */
    var description: js.UndefOr[StreamDescription] = js.undefined
    /**
      * The files associated with the stream.
      */
    var files: js.UndefOr[StreamFiles] = js.undefined
    /**
      * An IAM role that allows the IoT service principal assumes to access your S3 files.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The stream ID.
      */
    var streamId: StreamId
  }
  
  trait UpdateStreamResponse extends js.Object {
    /**
      * A description of the stream.
      */
    var description: js.UndefOr[StreamDescription] = js.undefined
    /**
      * The stream ARN.
      */
    var streamArn: js.UndefOr[StreamArn] = js.undefined
    /**
      * The stream ID.
      */
    var streamId: js.UndefOr[StreamId] = js.undefined
    /**
      * The stream version.
      */
    var streamVersion: js.UndefOr[StreamVersion] = js.undefined
  }
  
  trait UpdateThingGroupRequest extends js.Object {
    /**
      * The expected version of the thing group. If this does not match the version of the thing group being updated, the update will fail.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * The thing group to update.
      */
    var thingGroupName: ThingGroupName
    /**
      * The thing group properties.
      */
    var thingGroupProperties: ThingGroupProperties
  }
  
  trait UpdateThingGroupResponse extends js.Object {
    /**
      * The version of the updated thing group.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait UpdateThingGroupsForThingRequest extends js.Object {
    /**
      * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
      */
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
    /**
      * The groups to which the thing will be added.
      */
    var thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.undefined
    /**
      * The groups from which the thing will be removed.
      */
    var thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.undefined
    /**
      * The thing whose group memberships will be updated.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
  }
  
  trait UpdateThingGroupsForThingResponse extends js.Object
  
  trait UpdateThingRequest extends js.Object {
    /**
      * A list of thing attributes, a JSON string containing name-value pairs. For example:  {\"attributes\":{\"name1\":\"value2\"}}  This data is used to add new attributes or update existing attributes.
      */
    var attributePayload: js.UndefOr[AttributePayload] = js.undefined
    /**
      * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the UpdateThing request is rejected with a VersionConflictException.
      */
    var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    /**
      * Remove a thing type association. If true, the association is removed.
      */
    var removeThingType: js.UndefOr[RemoveThingType] = js.undefined
    /**
      * The name of the thing to update.
      */
    var thingName: ThingName
    /**
      * The name of the thing type.
      */
    var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  }
  
  trait UpdateThingResponse extends js.Object
  
  trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
    /**
      * Specifies the behaviors that, when violated by a device (thing), cause an alert.
      */
    var behaviors: Behaviors
  }
  
  trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
    /**
      * True if the behaviors were valid.
      */
    var valid: js.UndefOr[Valid] = js.undefined
    /**
      * The list of any errors found in the behaviors.
      */
    var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
  }
  
  trait ValidationError extends js.Object {
    /**
      * The description of an error found in the behaviors.
      */
    var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  }
  
  trait ViolationEvent extends js.Object {
    /**
      * The behavior which was violated.
      */
    var behavior: js.UndefOr[Behavior] = js.undefined
    /**
      * The value of the metric (the measurement).
      */
    var metricValue: js.UndefOr[MetricValue] = js.undefined
    /**
      * The name of the security profile whose behavior was violated.
      */
    var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    /**
      * The name of the thing responsible for the violation event.
      */
    var thingName: js.UndefOr[ThingName] = js.undefined
    /**
      * The time the violation event occurred.
      */
    var violationEventTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The type of violation event.
      */
    var violationEventType: js.UndefOr[ViolationEventType] = js.undefined
    /**
      * The ID of the violation event.
      */
    var violationId: js.UndefOr[ViolationId] = js.undefined
  }
  
  trait _ActionType extends js.Object
  
  trait _AuditCheckRunStatus extends js.Object
  
  trait _AuditFindingSeverity extends js.Object
  
  trait _AuditFrequency extends js.Object
  
  trait _AuditTaskStatus extends js.Object
  
  trait _AuditTaskType extends js.Object
  
  trait _AuthDecision extends js.Object
  
  trait _AuthorizerStatus extends js.Object
  
  trait _AutoRegistrationStatus extends js.Object
  
  trait _CACertificateStatus extends js.Object
  
  trait _CannedAccessControlList extends js.Object
  
  trait _CertificateStatus extends js.Object
  
  trait _ComparisonOperator extends js.Object
  
  trait _DayOfWeek extends js.Object
  
  trait _DynamicGroupStatus extends js.Object
  
  trait _DynamoKeyType extends js.Object
  
  trait _EventType extends js.Object
  
  trait _IndexStatus extends js.Object
  
  trait _JobExecutionFailureType extends js.Object
  
  trait _JobExecutionStatus extends js.Object
  
  trait _JobStatus extends js.Object
  
  trait _LogLevel extends js.Object
  
  trait _LogTargetType extends js.Object
  
  trait _MessageFormat extends js.Object
  
  trait _OTAUpdateStatus extends js.Object
  
  trait _ReportType extends js.Object
  
  trait _ResourceType extends js.Object
  
  trait _Status extends js.Object
  
  trait _TargetSelection extends js.Object
  
  trait _ThingConnectivityIndexingMode extends js.Object
  
  trait _ThingGroupIndexingMode extends js.Object
  
  trait _ThingIndexingMode extends js.Object
  
  trait _ViolationEventType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AbortAction = awsDashSdkLib.awsDashSdkLibStrings.CANCEL | java.lang.String
  type AbortCriteriaList = js.Array[AbortCriteria]
  type AbortThresholdPercentage = scala.Double
  type ActionList = js.Array[Action]
  type ActionType = _ActionType | java.lang.String
  type ActiveViolations = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList = js.Array[BehaviorMetric]
  type AlarmName = java.lang.String
  type AlertTargetArn = java.lang.String
  type AlertTargetType = awsDashSdkLib.awsDashSdkLibStrings.SNS | java.lang.String
  type AllowAutoRegistration = scala.Boolean
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type AscendingOrder = scala.Boolean
  type AttributeKey = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type AuditCheckName = java.lang.String
  type AuditCheckRunStatus = _AuditCheckRunStatus | java.lang.String
  type AuditFindingSeverity = _AuditFindingSeverity | java.lang.String
  type AuditFindings = js.Array[AuditFinding]
  type AuditFrequency = _AuditFrequency | java.lang.String
  type AuditNotificationType = awsDashSdkLib.awsDashSdkLibStrings.SNS | java.lang.String
  type AuditTaskId = java.lang.String
  type AuditTaskMetadataList = js.Array[AuditTaskMetadata]
  type AuditTaskStatus = _AuditTaskStatus | java.lang.String
  type AuditTaskType = _AuditTaskType | java.lang.String
  type AuthDecision = _AuthDecision | java.lang.String
  type AuthInfos = js.Array[AuthInfo]
  type AuthResults = js.Array[AuthResult]
  type AuthorizerArn = java.lang.String
  type AuthorizerFunctionArn = java.lang.String
  type AuthorizerName = java.lang.String
  type AuthorizerStatus = _AuthorizerStatus | java.lang.String
  type Authorizers = js.Array[AuthorizerSummary]
  type AutoRegistrationStatus = _AutoRegistrationStatus | java.lang.String
  type AwsAccountId = java.lang.String
  type AwsArn = java.lang.String
  type AwsIotJobArn = java.lang.String
  type AwsIotJobId = java.lang.String
  type AwsIotSqlVersion = java.lang.String
  type BehaviorMetric = java.lang.String
  type BehaviorName = java.lang.String
  type Behaviors = js.Array[Behavior]
  type BillingGroupArn = java.lang.String
  type BillingGroupDescription = java.lang.String
  type BillingGroupId = java.lang.String
  type BillingGroupName = java.lang.String
  type BillingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type Boolean = scala.Boolean
  type BucketName = java.lang.String
  type CACertificateStatus = _CACertificateStatus | java.lang.String
  type CACertificates = js.Array[CACertificate]
  type CanceledChecksCount = scala.Double
  type CanceledThings = scala.Double
  type CannedAccessControlList = _CannedAccessControlList | java.lang.String
  type CertificateArn = java.lang.String
  type CertificateId = java.lang.String
  type CertificateName = java.lang.String
  type CertificatePathOnDevice = java.lang.String
  type CertificatePem = java.lang.String
  type CertificateSigningRequest = java.lang.String
  type CertificateStatus = _CertificateStatus | java.lang.String
  type Certificates = js.Array[Certificate]
  type ChannelName = java.lang.String
  type CheckCompliant = scala.Boolean
  type Cidr = java.lang.String
  type Cidrs = js.Array[Cidr]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type Code = java.lang.String
  type CognitoIdentityPoolId = java.lang.String
  type Comment = java.lang.String
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type CompliantChecksCount = scala.Double
  type ConnectivityTimestamp = scala.Double
  type ConsecutiveDatapointsToAlarm = scala.Double
  type ConsecutiveDatapointsToClear = scala.Double
  type Count = scala.Double
  type CreatedAtDate = stdLib.Date
  type CreationDate = stdLib.Date
  type CredentialDurationSeconds = scala.Double
  type CustomerVersion = scala.Double
  type DateType = stdLib.Date
  type DayOfMonth = java.lang.String
  type DayOfWeek = _DayOfWeek | java.lang.String
  type DeleteAdditionalMetricsToRetain = scala.Boolean
  type DeleteAlertTargets = scala.Boolean
  type DeleteBehaviors = scala.Boolean
  type DeleteScheduledAudits = scala.Boolean
  type DeleteStream = scala.Boolean
  type DeliveryStreamName = java.lang.String
  type DeprecationDate = stdLib.Date
  type Description = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsValue = java.lang.String
  type DisableAllLogs = scala.Boolean
  type DurationSeconds = scala.Double
  type DynamicGroupStatus = _DynamicGroupStatus | java.lang.String
  type DynamoKeyType = _DynamoKeyType | java.lang.String
  type DynamoOperation = java.lang.String
  type EffectivePolicies = js.Array[EffectivePolicy]
  type ElasticsearchEndpoint = java.lang.String
  type ElasticsearchId = java.lang.String
  type ElasticsearchIndex = java.lang.String
  type ElasticsearchType = java.lang.String
  type Enabled = scala.Boolean
  type EndpointAddress = java.lang.String
  type EndpointType = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EvaluationStatistic = java.lang.String
  type EventType = _EventType | java.lang.String
  type ExecutionNamePrefix = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type ExpiresInSec = scala.Double
  type FailedChecksCount = scala.Double
  type FailedThings = scala.Double
  type FileId = scala.Double
  type FileName = java.lang.String
  type FirehoseSeparator = java.lang.String
  type Flag = scala.Boolean
  type ForceDelete = scala.Boolean
  type ForceDeleteAWSJob = scala.Boolean
  type ForceFlag = scala.Boolean
  type Forced = scala.Boolean
  type FunctionArn = java.lang.String
  type GEMaxResults = scala.Double
  type GenerationId = java.lang.String
  type HashAlgorithm = java.lang.String
  type HashKeyField = java.lang.String
  type HashKeyValue = java.lang.String
  type InProgressChecksCount = scala.Double
  type InProgressThings = scala.Double
  type InProgressTimeoutInMinutes = scala.Double
  type IncrementFactor = scala.Double
  type IndexName = java.lang.String
  type IndexNamesList = js.Array[IndexName]
  type IndexSchema = java.lang.String
  type IndexStatus = _IndexStatus | java.lang.String
  type InlineDocument = java.lang.String
  type InputName = java.lang.String
  type IsAuthenticated = scala.Boolean
  type IsDefaultVersion = scala.Boolean
  type IsDisabled = scala.Boolean
  type JobArn = java.lang.String
  type JobDescription = java.lang.String
  type JobDocument = java.lang.String
  type JobDocumentSource = java.lang.String
  type JobExecutionFailureType = _JobExecutionFailureType | java.lang.String
  type JobExecutionStatus = _JobExecutionStatus | java.lang.String
  type JobExecutionSummaryForJobList = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[JobExecutionSummaryForThing]
  type JobId = java.lang.String
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaryList = js.Array[JobSummary]
  type JobTargets = js.Array[TargetArn]
  type JsonDocument = java.lang.String
  type Key = java.lang.String
  type KeyName = java.lang.String
  type KeyValue = java.lang.String
  type LaserMaxResults = scala.Double
  type LastModifiedDate = stdLib.Date
  type LogLevel = _LogLevel | java.lang.String
  type LogTargetConfigurations = js.Array[LogTargetConfiguration]
  type LogTargetName = java.lang.String
  type LogTargetType = _LogTargetType | java.lang.String
  type Marker = java.lang.String
  type MaxJobExecutionsPerMin = scala.Double
  type MaxResults = scala.Double
  type MaximumPerMinute = scala.Double
  type Message = java.lang.String
  type MessageFormat = _MessageFormat | java.lang.String
  type MessageId = java.lang.String
  type MinimumNumberOfExecutedThings = scala.Double
  type MissingContextValue = java.lang.String
  type MissingContextValues = js.Array[MissingContextValue]
  type NextToken = java.lang.String
  type NonCompliantChecksCount = scala.Double
  type NonCompliantResourcesCount = scala.Double
  type NumberOfThings = scala.Double
  type OTAUpdateArn = java.lang.String
  type OTAUpdateDescription = java.lang.String
  type OTAUpdateErrorMessage = java.lang.String
  type OTAUpdateFileVersion = java.lang.String
  type OTAUpdateFiles = js.Array[OTAUpdateFile]
  type OTAUpdateId = java.lang.String
  type OTAUpdateStatus = _OTAUpdateStatus | java.lang.String
  type OTAUpdatesSummary = js.Array[OTAUpdateSummary]
  type OptionalVersion = scala.Double
  type OutgoingCertificates = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups = scala.Boolean
  type PageSize = scala.Double
  type Parameter = java.lang.String
  type PartitionKey = java.lang.String
  type PayloadField = java.lang.String
  type Percentage = scala.Double
  type Platform = java.lang.String
  type Policies = js.Array[Policy]
  type PolicyArn = java.lang.String
  type PolicyDocument = java.lang.String
  type PolicyDocuments = js.Array[PolicyDocument]
  type PolicyName = java.lang.String
  type PolicyNames = js.Array[PolicyName]
  type PolicyTarget = java.lang.String
  type PolicyTargets = js.Array[PolicyTarget]
  type PolicyVersionId = java.lang.String
  type PolicyVersions = js.Array[PolicyVersion]
  type Port = scala.Double
  type Ports = js.Array[Port]
  type Prefix = java.lang.String
  type Principal = java.lang.String
  type PrincipalArn = java.lang.String
  type PrincipalId = java.lang.String
  type Principals = js.Array[PrincipalArn]
  type PrivateKey = java.lang.String
  type ProcessingTargetName = java.lang.String
  type ProcessingTargetNameList = js.Array[ProcessingTargetName]
  type PublicKey = java.lang.String
  type QueryMaxResults = scala.Double
  type QueryString = java.lang.String
  type QueryVersion = java.lang.String
  type QueueUrl = java.lang.String
  type QueuedThings = scala.Double
  type RangeKeyField = java.lang.String
  type RangeKeyValue = java.lang.String
  type ReasonCode = java.lang.String
  type ReasonForNonCompliance = java.lang.String
  type ReasonForNonComplianceCode = java.lang.String
  type Recursive = scala.Boolean
  type RecursiveWithoutDefault = scala.Boolean
  type RegistrationCode = java.lang.String
  type RegistryMaxResults = scala.Double
  type RegistryS3BucketName = java.lang.String
  type RegistryS3KeyName = java.lang.String
  type RejectedThings = scala.Double
  type RelatedResources = js.Array[RelatedResource]
  type RemoveAutoRegistration = scala.Boolean
  type RemoveThingType = scala.Boolean
  type RemovedThings = scala.Double
  type ReportType = _ReportType | java.lang.String
  type Resource = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceLogicalId = java.lang.String
  type ResourceType = _ResourceType | java.lang.String
  type Resources = js.Array[Resource]
  type RoleAlias = java.lang.String
  type RoleAliasArn = java.lang.String
  type RoleAliases = js.Array[RoleAlias]
  type RoleArn = java.lang.String
  type RolloutRatePerMinute = scala.Double
  type RuleArn = java.lang.String
  type RuleName = java.lang.String
  type S3Bucket = java.lang.String
  type S3FileUrl = java.lang.String
  type S3FileUrlList = js.Array[S3FileUrl]
  type S3Key = java.lang.String
  type S3Version = java.lang.String
  type SQL = java.lang.String
  type SalesforceEndpoint = java.lang.String
  type SalesforceToken = java.lang.String
  type ScheduledAuditArn = java.lang.String
  type ScheduledAuditMetadataList = js.Array[ScheduledAuditMetadata]
  type ScheduledAuditName = java.lang.String
  type SearchableAttributes = js.Array[AttributeName]
  type Seconds = scala.Double
  type SecurityProfileArn = java.lang.String
  type SecurityProfileDescription = java.lang.String
  type SecurityProfileIdentifiers = js.Array[SecurityProfileIdentifier]
  type SecurityProfileName = java.lang.String
  type SecurityProfileTargetArn = java.lang.String
  type SecurityProfileTargetMappings = js.Array[SecurityProfileTargetMapping]
  type SecurityProfileTargets = js.Array[SecurityProfileTarget]
  type SetAsActive = scala.Boolean
  type SetAsActiveFlag = scala.Boolean
  type SetAsDefault = scala.Boolean
  type Signature = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsIotMod.Blob | java.lang.String
  type SignatureAlgorithm = java.lang.String
  type SigningJobId = java.lang.String
  type SigningProfileName = java.lang.String
  type SkyfallMaxResults = scala.Double
  type StateMachineName = java.lang.String
  type StateReason = java.lang.String
  type StateValue = java.lang.String
  type Status = _Status | java.lang.String
  type StreamArn = java.lang.String
  type StreamDescription = java.lang.String
  type StreamFiles = js.Array[StreamFile]
  type StreamId = java.lang.String
  type StreamName = java.lang.String
  type StreamVersion = scala.Double
  type StreamsSummary = js.Array[StreamSummary]
  type String = java.lang.String
  type SucceededThings = scala.Double
  type TableName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TargetArn = java.lang.String
  type TargetAuditCheckNames = js.Array[AuditCheckName]
  type TargetSelection = _TargetSelection | java.lang.String
  type Targets = js.Array[Target]
  type TaskId = java.lang.String
  type TaskIdList = js.Array[TaskId]
  type TemplateBody = java.lang.String
  type ThingArn = java.lang.String
  type ThingAttributeList = js.Array[ThingAttribute]
  type ThingConnectivityIndexingMode = _ThingConnectivityIndexingMode | java.lang.String
  type ThingDocumentList = js.Array[ThingDocument]
  type ThingGroupArn = java.lang.String
  type ThingGroupDescription = java.lang.String
  type ThingGroupDocumentList = js.Array[ThingGroupDocument]
  type ThingGroupId = java.lang.String
  type ThingGroupIndexingMode = _ThingGroupIndexingMode | java.lang.String
  type ThingGroupList = js.Array[ThingGroupName]
  type ThingGroupName = java.lang.String
  type ThingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type ThingGroupNameList = js.Array[ThingGroupName]
  type ThingId = java.lang.String
  type ThingIndexingMode = _ThingIndexingMode | java.lang.String
  type ThingName = java.lang.String
  type ThingNameList = js.Array[ThingName]
  type ThingTypeArn = java.lang.String
  type ThingTypeDescription = java.lang.String
  type ThingTypeId = java.lang.String
  type ThingTypeList = js.Array[ThingTypeDefinition]
  type ThingTypeName = java.lang.String
  type TimedOutThings = scala.Double
  type Timestamp = stdLib.Date
  type Token = java.lang.String
  type TokenKeyName = java.lang.String
  type TokenSignature = java.lang.String
  type Topic = java.lang.String
  type TopicPattern = java.lang.String
  type TopicRuleList = js.Array[TopicRuleListItem]
  type TotalChecksCount = scala.Double
  type TotalResourcesCount = scala.Double
  type UndoDeprecate = scala.Boolean
  type UnsignedLong = scala.Double
  type UseBase64 = scala.Boolean
  type Valid = scala.Boolean
  type ValidationErrors = js.Array[ValidationError]
  type Value = java.lang.String
  type Version = scala.Double
  type VersionNumber = scala.Double
  type ViolationEventType = _ViolationEventType | java.lang.String
  type ViolationEvents = js.Array[ViolationEvent]
  type ViolationId = java.lang.String
  type WaitingForDataCollectionChecksCount = scala.Double
  type apiVersion = _apiVersion | java.lang.String
}

