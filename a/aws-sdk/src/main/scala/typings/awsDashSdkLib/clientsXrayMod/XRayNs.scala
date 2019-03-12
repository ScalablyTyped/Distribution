package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/xray", "XRay")
@js.native
object XRayNs extends js.Object {
  trait Alias extends js.Object {
    /**
      * The canonical name of the alias.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A list of names for the alias, including the canonical name.
      */
    var Names: js.UndefOr[AliasNames] = js.undefined
    /**
      * The type of the alias.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait AnnotationValue extends js.Object {
    /**
      * Value for a Boolean annotation.
      */
    var BooleanValue: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Value for a Number annotation.
      */
    var NumberValue: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Value for a String annotation.
      */
    var StringValue: js.UndefOr[String] = js.undefined
  }
  
  trait Annotations
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ValuesWithServiceIds]
  
  trait AttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait AvailabilityZoneDetail extends js.Object {
    /**
      * The name of a corresponding availability zone.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait BackendConnectionErrors extends js.Object {
    /**
      * 
      */
    var ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var OtherCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var TimeoutCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
  }
  
  trait BatchGetTracesRequest extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Specify the trace IDs of requests for which to retrieve segments.
      */
    var TraceIds: TraceIdList
  }
  
  trait BatchGetTracesResult extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Full traces for the specified requests.
      */
    var Traces: js.UndefOr[TraceList] = js.undefined
    /**
      * Trace IDs of requests that haven't been processed.
      */
    var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateGroupRequest extends js.Object {
    /**
      * The filter expression defining criteria by which to group traces.
      */
    var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
    /**
      * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
      */
    var GroupName: awsDashSdkLib.clientsXrayMod.XRayNs.GroupName
  }
  
  trait CreateGroupResult extends js.Object {
    /**
      * The group that was created. Contains the name of the group that was created, the ARN of the group that was generated based on the group name, and the filter expression that was assigned to the group.
      */
    var Group: js.UndefOr[Group] = js.undefined
  }
  
  trait CreateSamplingRuleRequest extends js.Object {
    /**
      * The rule definition.
      */
    var SamplingRule: awsDashSdkLib.clientsXrayMod.XRayNs.SamplingRule
  }
  
  trait CreateSamplingRuleResult extends js.Object {
    /**
      * The saved rule definition and metadata.
      */
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
  }
  
  trait DeleteGroupRequest extends js.Object {
    /**
      * The ARN of the group that was generated on creation.
      */
    var GroupARN: js.UndefOr[GroupARN] = js.undefined
    /**
      * The case-sensitive name of the group.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
  }
  
  trait DeleteGroupResult extends js.Object
  
  trait DeleteSamplingRuleRequest extends js.Object {
    /**
      * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
      */
    var RuleARN: js.UndefOr[String] = js.undefined
    /**
      * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
      */
    var RuleName: js.UndefOr[String] = js.undefined
  }
  
  trait DeleteSamplingRuleResult extends js.Object {
    /**
      * The deleted rule definition and metadata.
      */
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
  }
  
  trait Edge extends js.Object {
    /**
      * Aliases for the edge.
      */
    var Aliases: js.UndefOr[AliasList] = js.undefined
    /**
      * The end time of the last segment on the edge.
      */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Identifier of the edge. Unique within a service map.
      */
    var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
    /**
      * A histogram that maps the spread of client response times on an edge.
      */
    var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
    /**
      * The start time of the first segment on the edge.
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Response statistics for segments on the edge.
      */
    var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
  }
  
  trait EdgeStatistics extends js.Object {
    /**
      * Information about requests that failed with a 4xx Client Error status code.
      */
    var ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined
    /**
      * Information about requests that failed with a 5xx Server Error status code.
      */
    var FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined
    /**
      * The number of requests that completed with a 2xx Success status code.
      */
    var OkCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The total number of completed requests.
      */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The aggregate response time of completed requests.
      */
    var TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
  }
  
  trait EncryptionConfig extends js.Object {
    /**
      * The ID of the customer master key (CMK) used for encryption, if applicable.
      */
    var KeyId: js.UndefOr[String] = js.undefined
    /**
      * The encryption status. While the status is UPDATING, X-Ray may encrypt data with a combination of the new and old settings.
      */
    var Status: js.UndefOr[EncryptionStatus] = js.undefined
    /**
      * The type of encryption. Set to KMS for encryption with CMKs. Set to NONE for default encryption.
      */
    var Type: js.UndefOr[EncryptionType] = js.undefined
  }
  
  trait ErrorRootCause extends js.Object {
    /**
      * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
      */
    var Services: js.UndefOr[ErrorRootCauseServices] = js.undefined
  }
  
  trait ErrorRootCauseEntity extends js.Object {
    /**
      * The types and messages of the exceptions.
      */
    var Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined
    /**
      * The name of the entity.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A flag that denotes a remote subsegment.
      */
    var Remote: js.UndefOr[NullableBoolean] = js.undefined
  }
  
  trait ErrorRootCauseService extends js.Object {
    /**
      * The account ID associated to the service.
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * The path of root cause entities found on the service. 
      */
    var EntityPath: js.UndefOr[ErrorRootCauseEntityPath] = js.undefined
    /**
      * A Boolean value indicating if the service is inferred from the trace.
      */
    var Inferred: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * The service name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A collection of associated service names.
      */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
      * The type associated to the service.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait ErrorStatistics extends js.Object {
    /**
      * The number of requests that failed with untracked 4xx Client Error status codes.
      */
    var OtherCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The number of requests that failed with a 419 throttling status code.
      */
    var ThrottleCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The total number of requests that failed with a 4xx Client Error status code.
      */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
  }
  
  trait FaultRootCause extends js.Object {
    /**
      * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
      */
    var Services: js.UndefOr[FaultRootCauseServices] = js.undefined
  }
  
  trait FaultRootCauseEntity extends js.Object {
    /**
      * The types and messages of the exceptions.
      */
    var Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined
    /**
      * The name of the entity.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A flag that denotes a remote subsegment.
      */
    var Remote: js.UndefOr[NullableBoolean] = js.undefined
  }
  
  trait FaultRootCauseService extends js.Object {
    /**
      * The account ID associated to the service.
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * The path of root cause entities found on the service. 
      */
    var EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.undefined
    /**
      * A Boolean value indicating if the service is inferred from the trace.
      */
    var Inferred: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * The service name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A collection of associated service names.
      */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
      * The type associated to the service.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait FaultStatistics extends js.Object {
    /**
      * The number of requests that failed with untracked 5xx Server Error status codes.
      */
    var OtherCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The total number of requests that failed with a 5xx Server Error status code.
      */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
  }
  
  trait GetEncryptionConfigRequest extends js.Object
  
  trait GetEncryptionConfigResult extends js.Object {
    /**
      * The encryption configuration document.
      */
    var EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  }
  
  trait GetGroupRequest extends js.Object {
    /**
      * The ARN of the group that was generated on creation.
      */
    var GroupARN: js.UndefOr[GroupARN] = js.undefined
    /**
      * The case-sensitive name of the group.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
  }
  
  trait GetGroupResult extends js.Object {
    /**
      * The group that was requested. Contains the name of the group, the ARN of the group, and the filter expression that assigned to the group.
      */
    var Group: js.UndefOr[Group] = js.undefined
  }
  
  trait GetGroupsRequest extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[GetGroupsNextToken] = js.undefined
  }
  
  trait GetGroupsResult extends js.Object {
    /**
      * The collection of all active groups.
      */
    var Groups: js.UndefOr[GroupSummaryList] = js.undefined
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait GetSamplingRulesRequest extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait GetSamplingRulesResult extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Rule definitions and metadata.
      */
    var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined
  }
  
  trait GetSamplingStatisticSummariesRequest extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait GetSamplingStatisticSummariesResult extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the number of requests instrumented for each sampling rule.
      */
    var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined
  }
  
  trait GetSamplingTargetsRequest extends js.Object {
    /**
      * Information about rules that the service is using to sample requests.
      */
    var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
  }
  
  trait GetSamplingTargetsResult extends js.Object {
    /**
      * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
      */
    var LastRuleModification: js.UndefOr[Timestamp] = js.undefined
    /**
      * Updated rules that the service should use to sample requests.
      */
    var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined
    /**
      * Information about SamplingStatisticsDocument that X-Ray could not process.
      */
    var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined
  }
  
  trait GetServiceGraphRequest extends js.Object {
    /**
      * The end of the timeframe for which to generate a graph.
      */
    var EndTime: Timestamp
    /**
      * The ARN of a group to generate a graph based on.
      */
    var GroupARN: js.UndefOr[GroupARN] = js.undefined
    /**
      * The name of a group to generate a graph based on.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The start of the time frame for which to generate a graph.
      */
    var StartTime: Timestamp
  }
  
  trait GetServiceGraphResult extends js.Object {
    /**
      * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may show traces from an older version of the group's filter expression.
      */
    var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined
    /**
      * The end of the time frame for which the graph was generated.
      */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The services that have processed a traced request during the specified time frame.
      */
    var Services: js.UndefOr[ServiceList] = js.undefined
    /**
      * The start of the time frame for which the graph was generated.
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetTraceGraphRequest extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Trace IDs of requests for which to generate a service graph.
      */
    var TraceIds: TraceIdList
  }
  
  trait GetTraceGraphResult extends js.Object {
    /**
      * Pagination token. Not used.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The services that have processed one of the specified requests.
      */
    var Services: js.UndefOr[ServiceList] = js.undefined
  }
  
  trait GetTraceSummariesRequest extends js.Object {
    /**
      * The end of the time frame for which to retrieve traces.
      */
    var EndTime: Timestamp
    /**
      * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
      */
    var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
    /**
      * Specify the pagination token returned by a previous request to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Set to true to get summaries for only a subset of available traces.
      */
    var Sampling: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * The start of the time frame for which to retrieve traces.
      */
    var StartTime: Timestamp
  }
  
  trait GetTraceSummariesResult extends js.Object {
    /**
      * The start time of this page of results.
      */
    var ApproximateTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Trace IDs and metadata for traces that were found in the specified time frame.
      */
    var TraceSummaries: js.UndefOr[TraceSummaryList] = js.undefined
    /**
      * The total number of traces processed, including traces that did not match the specified filter expression.
      */
    var TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined
  }
  
  trait Group extends js.Object {
    /**
      * The filter expression defining the parameters to include traces.
      */
    var FilterExpression: js.UndefOr[String] = js.undefined
    /**
      * The ARN of the group generated based on the GroupName.
      */
    var GroupARN: js.UndefOr[String] = js.undefined
    /**
      * The unique case-sensitive name of the group.
      */
    var GroupName: js.UndefOr[String] = js.undefined
  }
  
  trait GroupSummary extends js.Object {
    /**
      * The filter expression defining the parameters to include traces.
      */
    var FilterExpression: js.UndefOr[String] = js.undefined
    /**
      * The ARN of the group generated based on the GroupName.
      */
    var GroupARN: js.UndefOr[String] = js.undefined
    /**
      * The unique case-sensitive name of the group.
      */
    var GroupName: js.UndefOr[String] = js.undefined
  }
  
  trait HistogramEntry extends js.Object {
    /**
      * The prevalence of the entry.
      */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
      * The value of the entry.
      */
    var Value: js.UndefOr[Double] = js.undefined
  }
  
  trait Http extends js.Object {
    /**
      * The IP address of the requestor.
      */
    var ClientIp: js.UndefOr[String] = js.undefined
    /**
      * The request method.
      */
    var HttpMethod: js.UndefOr[String] = js.undefined
    /**
      * The response status.
      */
    var HttpStatus: js.UndefOr[NullableInteger] = js.undefined
    /**
      * The request URL.
      */
    var HttpURL: js.UndefOr[String] = js.undefined
    /**
      * The request's user agent string.
      */
    var UserAgent: js.UndefOr[String] = js.undefined
  }
  
  trait InstanceIdDetail extends js.Object {
    /**
      * The ID of a corresponding EC2 instance.
      */
    var Id: js.UndefOr[String] = js.undefined
  }
  
  trait PutEncryptionConfigRequest extends js.Object {
    /**
      * An AWS KMS customer master key (CMK) in one of the following formats:    Alias - The name of the key. For example, alias/MyKey.    Key ID - The KMS key ID of the key. For example, ae4aa6d49-a4d8-9df9-a475-4ff6d7898456.    ARN - The full Amazon Resource Name of the key ID or alias. For example, arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456. Use this format to specify a key in a different account.   Omit this key if you set Type to NONE.
      */
    var KeyId: js.UndefOr[EncryptionKeyId] = js.undefined
    /**
      * The type of encryption. Set to KMS to use your own key for encryption. Set to NONE for default encryption.
      */
    var Type: EncryptionType
  }
  
  trait PutEncryptionConfigResult extends js.Object {
    /**
      * The new encryption configuration.
      */
    var EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  }
  
  trait PutTelemetryRecordsRequest extends js.Object {
    /**
      * 
      */
    var EC2InstanceId: js.UndefOr[EC2InstanceId] = js.undefined
    /**
      * 
      */
    var Hostname: js.UndefOr[Hostname] = js.undefined
    /**
      * 
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * 
      */
    var TelemetryRecords: TelemetryRecordList
  }
  
  trait PutTelemetryRecordsResult extends js.Object
  
  trait PutTraceSegmentsRequest extends js.Object {
    /**
      * A string containing a JSON document defining one or more segments or subsegments.
      */
    var TraceSegmentDocuments: TraceSegmentDocumentList
  }
  
  trait PutTraceSegmentsResult extends js.Object {
    /**
      * Segments that failed processing.
      */
    var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined
  }
  
  trait ResourceARNDetail extends js.Object {
    /**
      * The ARN of a corresponding resource.
      */
    var ARN: js.UndefOr[String] = js.undefined
  }
  
  trait ResponseTimeRootCause extends js.Object {
    /**
      * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and inferred flag.
      */
    var Services: js.UndefOr[ResponseTimeRootCauseServices] = js.undefined
  }
  
  trait ResponseTimeRootCauseEntity extends js.Object {
    /**
      * The types and messages of the exceptions.
      */
    var Coverage: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The name of the entity.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A flag that denotes a remote subsegment.
      */
    var Remote: js.UndefOr[NullableBoolean] = js.undefined
  }
  
  trait ResponseTimeRootCauseService extends js.Object {
    /**
      * The account ID associated to the service.
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * The path of root cause entities found on the service. 
      */
    var EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath] = js.undefined
    /**
      * A Boolean value indicating if the service is inferred from the trace.
      */
    var Inferred: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * The service name.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A collection of associated service names.
      */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
      * The type associated to the service.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait RootCauseException extends js.Object {
    /**
      * The message of the exception.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The name of the exception.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait SamplingRule extends js.Object {
    /**
      * Matches attributes derived from the request.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
      * The percentage of matching requests to instrument, after the reservoir is exhausted.
      */
    var FixedRate: awsDashSdkLib.clientsXrayMod.XRayNs.FixedRate
    /**
      * Matches the HTTP method of a request.
      */
    var HTTPMethod: awsDashSdkLib.clientsXrayMod.XRayNs.HTTPMethod
    /**
      * Matches the hostname from a request URL.
      */
    var Host: awsDashSdkLib.clientsXrayMod.XRayNs.Host
    /**
      * The priority of the sampling rule.
      */
    var Priority: awsDashSdkLib.clientsXrayMod.XRayNs.Priority
    /**
      * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
      */
    var ReservoirSize: awsDashSdkLib.clientsXrayMod.XRayNs.ReservoirSize
    /**
      * Matches the ARN of the AWS resource on which the service runs.
      */
    var ResourceARN: awsDashSdkLib.clientsXrayMod.XRayNs.ResourceARN
    /**
      * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
      */
    var RuleARN: js.UndefOr[String] = js.undefined
    /**
      * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
      */
    var RuleName: js.UndefOr[RuleName] = js.undefined
    /**
      * Matches the name that the service uses to identify itself in segments.
      */
    var ServiceName: awsDashSdkLib.clientsXrayMod.XRayNs.ServiceName
    /**
      * Matches the origin that the service uses to identify its type in segments.
      */
    var ServiceType: awsDashSdkLib.clientsXrayMod.XRayNs.ServiceType
    /**
      * Matches the path from a request URL.
      */
    var URLPath: awsDashSdkLib.clientsXrayMod.XRayNs.URLPath
    /**
      * The version of the sampling rule format (1).
      */
    var Version: awsDashSdkLib.clientsXrayMod.XRayNs.Version
  }
  
  trait SamplingRuleRecord extends js.Object {
    /**
      * When the rule was created.
      */
    var CreatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * When the rule was last modified.
      */
    var ModifiedAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * The sampling rule.
      */
    var SamplingRule: js.UndefOr[SamplingRule] = js.undefined
  }
  
  trait SamplingRuleUpdate extends js.Object {
    /**
      * Matches attributes derived from the request.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
      * The percentage of matching requests to instrument, after the reservoir is exhausted.
      */
    var FixedRate: js.UndefOr[NullableDouble] = js.undefined
    /**
      * Matches the HTTP method of a request.
      */
    var HTTPMethod: js.UndefOr[HTTPMethod] = js.undefined
    /**
      * Matches the hostname from a request URL.
      */
    var Host: js.UndefOr[Host] = js.undefined
    /**
      * The priority of the sampling rule.
      */
    var Priority: js.UndefOr[NullableInteger] = js.undefined
    /**
      * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
      */
    var ReservoirSize: js.UndefOr[NullableInteger] = js.undefined
    /**
      * Matches the ARN of the AWS resource on which the service runs.
      */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
      * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
      */
    var RuleARN: js.UndefOr[String] = js.undefined
    /**
      * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
      */
    var RuleName: js.UndefOr[RuleName] = js.undefined
    /**
      * Matches the name that the service uses to identify itself in segments.
      */
    var ServiceName: js.UndefOr[ServiceName] = js.undefined
    /**
      * Matches the origin that the service uses to identify its type in segments.
      */
    var ServiceType: js.UndefOr[ServiceType] = js.undefined
    /**
      * Matches the path from a request URL.
      */
    var URLPath: js.UndefOr[URLPath] = js.undefined
  }
  
  trait SamplingStatisticSummary extends js.Object {
    /**
      * The number of requests recorded with borrowed reservoir quota.
      */
    var BorrowCount: js.UndefOr[Integer] = js.undefined
    /**
      * The number of requests that matched the rule.
      */
    var RequestCount: js.UndefOr[Integer] = js.undefined
    /**
      * The name of the sampling rule.
      */
    var RuleName: js.UndefOr[String] = js.undefined
    /**
      * The number of requests recorded.
      */
    var SampledCount: js.UndefOr[Integer] = js.undefined
    /**
      * The start time of the reporting window.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait SamplingStatisticsDocument extends js.Object {
    /**
      * The number of requests recorded with borrowed reservoir quota.
      */
    var BorrowCount: js.UndefOr[BorrowCount] = js.undefined
    /**
      * A unique identifier for the service in hexadecimal.
      */
    var ClientID: awsDashSdkLib.clientsXrayMod.XRayNs.ClientID
    /**
      * The number of requests that matched the rule.
      */
    var RequestCount: awsDashSdkLib.clientsXrayMod.XRayNs.RequestCount
    /**
      * The name of the sampling rule.
      */
    var RuleName: awsDashSdkLib.clientsXrayMod.XRayNs.RuleName
    /**
      * The number of requests recorded.
      */
    var SampledCount: awsDashSdkLib.clientsXrayMod.XRayNs.SampledCount
    /**
      * The current time.
      */
    var Timestamp: awsDashSdkLib.clientsXrayMod.XRayNs.Timestamp
  }
  
  trait SamplingTargetDocument extends js.Object {
    /**
      * The percentage of matching requests to instrument, after the reservoir is exhausted.
      */
    var FixedRate: js.UndefOr[Double] = js.undefined
    /**
      * The number of seconds for the service to wait before getting sampling targets again.
      */
    var Interval: js.UndefOr[NullableInteger] = js.undefined
    /**
      * The number of requests per second that X-Ray allocated this service.
      */
    var ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined
    /**
      * When the reservoir quota expires.
      */
    var ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the sampling rule.
      */
    var RuleName: js.UndefOr[String] = js.undefined
  }
  
  trait Segment extends js.Object {
    /**
      * The segment document.
      */
    var Document: js.UndefOr[SegmentDocument] = js.undefined
    /**
      * The segment's ID.
      */
    var Id: js.UndefOr[SegmentId] = js.undefined
  }
  
  trait Service extends js.Object {
    /**
      * Identifier of the AWS account in which the service runs.
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * A histogram that maps the spread of service durations.
      */
    var DurationHistogram: js.UndefOr[Histogram] = js.undefined
    /**
      * Connections to downstream services.
      */
    var Edges: js.UndefOr[EdgeList] = js.undefined
    /**
      * The end time of the last segment that the service generated.
      */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The canonical name of the service.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * A list of names for the service, including the canonical name.
      */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
      * Identifier for the service. Unique within the service map.
      */
    var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
    /**
      * A histogram that maps the spread of service response times.
      */
    var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
    /**
      * Indicates that the service was the first service to process a request.
      */
    var Root: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * The start time of the first segment that the service generated.
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The service's state.
      */
    var State: js.UndefOr[String] = js.undefined
    /**
      * Aggregated statistics for the service.
      */
    var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
    /**
      * The type of service.   AWS Resource - The type of an AWS resource. For example, AWS::EC2::Instance for a application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application used.   AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    client - Represents the clients that sent requests to a root service.    remote - A downstream service of indeterminate type.  
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait ServiceId extends js.Object {
    /**
      * 
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * 
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * 
      */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
      * 
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  
  trait ServiceStatistics extends js.Object {
    /**
      * Information about requests that failed with a 4xx Client Error status code.
      */
    var ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined
    /**
      * Information about requests that failed with a 5xx Server Error status code.
      */
    var FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined
    /**
      * The number of requests that completed with a 2xx Success status code.
      */
    var OkCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The total number of completed requests.
      */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
    /**
      * The aggregate response time of completed requests.
      */
    var TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
  }
  
  trait TelemetryRecord extends js.Object {
    /**
      * 
      */
    var BackendConnectionErrors: js.UndefOr[BackendConnectionErrors] = js.undefined
    /**
      * 
      */
    var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
    /**
      * 
      */
    var Timestamp: awsDashSdkLib.clientsXrayMod.XRayNs.Timestamp
  }
  
  trait Trace extends js.Object {
    /**
      * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
      */
    var Duration: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The unique identifier for the request that generated the trace's segments and subsegments.
      */
    var Id: js.UndefOr[TraceId] = js.undefined
    /**
      * Segment documents for the segments and subsegments that comprise the trace.
      */
    var Segments: js.UndefOr[SegmentList] = js.undefined
  }
  
  trait TraceSummary extends js.Object {
    /**
      * Annotations from the trace's segment documents.
      */
    var Annotations: js.UndefOr[Annotations] = js.undefined
    /**
      * A list of availability zones for any zone corresponding to the trace segments.
      */
    var AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.undefined
    /**
      * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
      */
    var Duration: js.UndefOr[NullableDouble] = js.undefined
    /**
      * The root of a trace.
      */
    var EntryPoint: js.UndefOr[ServiceId] = js.undefined
    /**
      * A collection of ErrorRootCause structures corresponding to the trace segments.
      */
    var ErrorRootCauses: js.UndefOr[ErrorRootCauses] = js.undefined
    /**
      * A collection of FaultRootCause structures corresponding to the the trace segments.
      */
    var FaultRootCauses: js.UndefOr[FaultRootCauses] = js.undefined
    /**
      * One or more of the segment documents has a 400 series error.
      */
    var HasError: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * One or more of the segment documents has a 500 series error.
      */
    var HasFault: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * One or more of the segment documents has a 429 throttling error.
      */
    var HasThrottle: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Information about the HTTP request served by the trace.
      */
    var Http: js.UndefOr[Http] = js.undefined
    /**
      * The unique identifier for the request that generated the trace's segments and subsegments.
      */
    var Id: js.UndefOr[TraceId] = js.undefined
    /**
      * A list of EC2 instance IDs for any instance corresponding to the trace segments.
      */
    var InstanceIds: js.UndefOr[TraceInstanceIds] = js.undefined
    /**
      * One or more of the segment documents is in progress.
      */
    var IsPartial: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * A list of resource ARNs for any resource corresponding to the trace segments.
      */
    var ResourceARNs: js.UndefOr[TraceResourceARNs] = js.undefined
    /**
      * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
      */
    var ResponseTime: js.UndefOr[NullableDouble] = js.undefined
    /**
      * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
      */
    var ResponseTimeRootCauses: js.UndefOr[ResponseTimeRootCauses] = js.undefined
    /**
      * The revision number of a trace.
      */
    var Revision: js.UndefOr[Integer] = js.undefined
    /**
      * Service IDs from the trace's segment documents.
      */
    var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
    /**
      * Users from the trace's segment documents.
      */
    var Users: js.UndefOr[TraceUsers] = js.undefined
  }
  
  trait TraceUser extends js.Object {
    /**
      * Services that the user's request hit.
      */
    var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
    /**
      * The user's name.
      */
    var UserName: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
      */
    def batchGetTraces(): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetTraces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetTracesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
      */
    def batchGetTraces(params: BatchGetTracesRequest): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetTraces(
      params: BatchGetTracesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetTracesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a group resource with a name and a filter expression. 
      */
    def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a group resource with a name and a filter expression. 
      */
    def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGroup(
      params: CreateGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
      */
    def createSamplingRule(): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSamplingRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
      */
    def createSamplingRule(params: CreateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSamplingRule(
      params: CreateSamplingRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a group resource.
      */
    def deleteGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a group resource.
      */
    def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroup(
      params: DeleteGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a sampling rule.
      */
    def deleteSamplingRule(): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSamplingRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a sampling rule.
      */
    def deleteSamplingRule(params: DeleteSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSamplingRule(
      params: DeleteSamplingRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current encryption configuration for X-Ray data.
      */
    def getEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current encryption configuration for X-Ray data.
      */
    def getEncryptionConfig(params: GetEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEncryptionConfig(
      params: GetEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves group resource details.
      */
    def getGroup(): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves group resource details.
      */
    def getGroup(params: GetGroupRequest): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroup(
      params: GetGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all active group details.
      */
    def getGroups(): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroups(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all active group details.
      */
    def getGroups(params: GetGroupsRequest): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroups(
      params: GetGroupsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all sampling rules.
      */
    def getSamplingRules(): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSamplingRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all sampling rules.
      */
    def getSamplingRules(params: GetSamplingRulesRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSamplingRules(
      params: GetSamplingRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about recent sampling results for all sampling rules.
      */
    def getSamplingStatisticSummaries(): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSamplingStatisticSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingStatisticSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about recent sampling results for all sampling rules.
      */
    def getSamplingStatisticSummaries(params: GetSamplingStatisticSummariesRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSamplingStatisticSummaries(
      params: GetSamplingStatisticSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingStatisticSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a sampling quota for rules that the service is using to sample requests. 
      */
    def getSamplingTargets(): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSamplingTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a sampling quota for rules that the service is using to sample requests. 
      */
    def getSamplingTargets(params: GetSamplingTargetsRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSamplingTargets(
      params: GetSamplingTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
      */
    def getServiceGraph(): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServiceGraph(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
      */
    def getServiceGraph(params: GetServiceGraphRequest): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServiceGraph(
      params: GetServiceGraphRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a service graph for one or more specific trace IDs.
      */
    def getTraceGraph(): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTraceGraph(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a service graph for one or more specific trace IDs.
      */
    def getTraceGraph(params: GetTraceGraphRequest): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTraceGraph(
      params: GetTraceGraphRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
      */
    def getTraceSummaries(): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTraceSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
      */
    def getTraceSummaries(params: GetTraceSummariesRequest): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTraceSummaries(
      params: GetTraceSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the encryption configuration for X-Ray data.
      */
    def putEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the encryption configuration for X-Ray data.
      */
    def putEncryptionConfig(params: PutEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEncryptionConfig(
      params: PutEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by the AWS X-Ray daemon to upload telemetry.
      */
    def putTelemetryRecords(): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putTelemetryRecords(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTelemetryRecordsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by the AWS X-Ray daemon to upload telemetry.
      */
    def putTelemetryRecords(params: PutTelemetryRecordsRequest): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putTelemetryRecords(
      params: PutTelemetryRecordsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTelemetryRecordsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
      */
    def putTraceSegments(): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putTraceSegments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTraceSegmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
      */
    def putTraceSegments(params: PutTraceSegmentsRequest): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putTraceSegments(
      params: PutTraceSegmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTraceSegmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a group resource.
      */
    def updateGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a group resource.
      */
    def updateGroup(params: UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGroup(
      params: UpdateGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a sampling rule's configuration.
      */
    def updateSamplingRule(): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSamplingRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a sampling rule's configuration.
      */
    def updateSamplingRule(params: UpdateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSamplingRule(
      params: UpdateSamplingRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UnprocessedStatistics extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[String] = js.undefined
    /**
      * The error message.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The name of the sampling rule.
      */
    var RuleName: js.UndefOr[String] = js.undefined
  }
  
  trait UnprocessedTraceSegment extends js.Object {
    /**
      * The error that caused processing to fail.
      */
    var ErrorCode: js.UndefOr[String] = js.undefined
    /**
      * The segment's ID.
      */
    var Id: js.UndefOr[String] = js.undefined
    /**
      * The error message.
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateGroupRequest extends js.Object {
    /**
      * The updated filter expression defining criteria by which to group traces.
      */
    var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
    /**
      * The ARN that was generated upon creation.
      */
    var GroupARN: js.UndefOr[GroupARN] = js.undefined
    /**
      * The case-sensitive name of the group.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
  }
  
  trait UpdateGroupResult extends js.Object {
    /**
      * The group that was updated. Contains the name of the group that was updated, the ARN of the group that was updated, and the updated filter expression assigned to the group.
      */
    var Group: js.UndefOr[Group] = js.undefined
  }
  
  trait UpdateSamplingRuleRequest extends js.Object {
    /**
      * The rule and fields to change.
      */
    var SamplingRuleUpdate: awsDashSdkLib.clientsXrayMod.XRayNs.SamplingRuleUpdate
  }
  
  trait UpdateSamplingRuleResult extends js.Object {
    /**
      * The updated rule definition and metadata.
      */
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
  }
  
  trait ValueWithServiceIds extends js.Object {
    /**
      * Values of the annotation.
      */
    var AnnotationValue: js.UndefOr[AnnotationValue] = js.undefined
    /**
      * Services to which the annotation applies.
      */
    var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
  }
  
  trait _EncryptionStatus extends js.Object
  
  trait _EncryptionType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AliasList = js.Array[Alias]
  type AliasNames = js.Array[String]
  type AnnotationKey = java.lang.String
  type AttributeKey = java.lang.String
  type AttributeValue = java.lang.String
  type Boolean = scala.Boolean
  type BorrowCount = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientID = java.lang.String
  type Double = scala.Double
  type EC2InstanceId = java.lang.String
  type EdgeList = js.Array[Edge]
  type EncryptionKeyId = java.lang.String
  type EncryptionStatus = _EncryptionStatus | java.lang.String
  type EncryptionType = _EncryptionType | java.lang.String
  type ErrorRootCauseEntityPath = js.Array[ErrorRootCauseEntity]
  type ErrorRootCauseServices = js.Array[ErrorRootCauseService]
  type ErrorRootCauses = js.Array[ErrorRootCause]
  type FaultRootCauseEntityPath = js.Array[FaultRootCauseEntity]
  type FaultRootCauseServices = js.Array[FaultRootCauseService]
  type FaultRootCauses = js.Array[FaultRootCause]
  type FilterExpression = java.lang.String
  type FixedRate = scala.Double
  type GetGroupsNextToken = java.lang.String
  type GroupARN = java.lang.String
  type GroupName = java.lang.String
  type GroupSummaryList = js.Array[GroupSummary]
  type HTTPMethod = java.lang.String
  type Histogram = js.Array[HistogramEntry]
  type Host = java.lang.String
  type Hostname = java.lang.String
  type Integer = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type Priority = scala.Double
  type RequestCount = scala.Double
  type ReservoirSize = scala.Double
  type ResourceARN = java.lang.String
  type ResponseTimeRootCauseEntityPath = js.Array[ResponseTimeRootCauseEntity]
  type ResponseTimeRootCauseServices = js.Array[ResponseTimeRootCauseService]
  type ResponseTimeRootCauses = js.Array[ResponseTimeRootCause]
  type RootCauseExceptions = js.Array[RootCauseException]
  type RuleName = java.lang.String
  type SampledCount = scala.Double
  type SamplingRuleRecordList = js.Array[SamplingRuleRecord]
  type SamplingStatisticSummaryList = js.Array[SamplingStatisticSummary]
  type SamplingStatisticsDocumentList = js.Array[SamplingStatisticsDocument]
  type SamplingTargetDocumentList = js.Array[SamplingTargetDocument]
  type SegmentDocument = java.lang.String
  type SegmentId = java.lang.String
  type SegmentList = js.Array[Segment]
  type ServiceIds = js.Array[ServiceId]
  type ServiceList = js.Array[Service]
  type ServiceName = java.lang.String
  type ServiceNames = js.Array[String]
  type ServiceType = java.lang.String
  type String = java.lang.String
  type TelemetryRecordList = js.Array[TelemetryRecord]
  type Timestamp = stdLib.Date
  type TraceAvailabilityZones = js.Array[AvailabilityZoneDetail]
  type TraceId = java.lang.String
  type TraceIdList = js.Array[TraceId]
  type TraceInstanceIds = js.Array[InstanceIdDetail]
  type TraceList = js.Array[Trace]
  type TraceResourceARNs = js.Array[ResourceARNDetail]
  type TraceSegmentDocument = java.lang.String
  type TraceSegmentDocumentList = js.Array[TraceSegmentDocument]
  type TraceSummaryList = js.Array[TraceSummary]
  type TraceUsers = js.Array[TraceUser]
  type URLPath = java.lang.String
  type UnprocessedStatisticsList = js.Array[UnprocessedStatistics]
  type UnprocessedTraceIdList = js.Array[TraceId]
  type UnprocessedTraceSegmentList = js.Array[UnprocessedTraceSegment]
  type ValuesWithServiceIds = js.Array[ValueWithServiceIds]
  type Version = scala.Double
  type apiVersion = _apiVersion | java.lang.String
}

