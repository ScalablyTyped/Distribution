package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/connect", "Connect")
@js.native
object ConnectNs extends js.Object {
  trait Attributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateUserRequest extends js.Object {
    /**
      * The unique identifier for the user account in the directory service directory used for identity management. If Amazon Connect is unable to access the existing directory, you can use the DirectoryUserId to authenticate users. If you include the parameter, it is assumed that Amazon Connect cannot access the directory. If the parameter is not included, the UserIdentityInfo is used to authenticate users from your existing directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an InvalidRequestException is returned.
      */
    var DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined
    /**
      * The unique identifier for the hierarchy group to assign to the user created.
      */
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    /**
      * Information about the user, including email address, first name, and last name.
      */
    var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The password for the user account to create. This is required if you are using Amazon Connect for identity management. If you are using SAML for identity management and include this parameter, an InvalidRequestException is returned.
      */
    var Password: js.UndefOr[Password] = js.undefined
    /**
      * Specifies the phone settings for the user, including AfterContactWorkTimeLimit, AutoAccept, DeskPhoneNumber, and PhoneType.
      */
    var PhoneConfig: UserPhoneConfig
    /**
      * The unique identifier for the routing profile to assign to the user created.
      */
    var RoutingProfileId: RoutingProfileId
    /**
      * The unique identifier of the security profile to assign to the user created.
      */
    var SecurityProfileIds: SecurityProfileIds
    /**
      * The user name in Amazon Connect for the account to create. If you are using SAML for identity management in your Amazon Connect, the value for Username can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
      */
    var Username: AgentUsername
  }
  
  trait CreateUserResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user account created.
      */
    var UserArn: js.UndefOr[ARN] = js.undefined
    /**
      * The unique identifier for the user account in Amazon Connect
      */
    var UserId: js.UndefOr[UserId] = js.undefined
  }
  
  trait Credentials extends js.Object {
    /**
      * An access token generated for a federated user to access Amazon Connect
      */
    var AccessToken: js.UndefOr[SecurityToken] = js.undefined
    /**
      * A token generated with an expiration time for the session a user is logged in to Amazon Connect
      */
    var AccessTokenExpiration: js.UndefOr[timestamp] = js.undefined
    /**
      * Renews a token generated for a user to access the Amazon Connect instance.
      */
    var RefreshToken: js.UndefOr[SecurityToken] = js.undefined
    /**
      * Renews the expiration timer for a generated token.
      */
    var RefreshTokenExpiration: js.UndefOr[timestamp] = js.undefined
  }
  
  trait CurrentMetric extends js.Object {
    /**
      * The name of the metric.
      */
    var Name: js.UndefOr[CurrentMetricName] = js.undefined
    /**
      * The unit for the metric.
      */
    var Unit: js.UndefOr[Unit] = js.undefined
  }
  
  trait CurrentMetricData extends js.Object {
    /**
      * The metric in a CurrentMetricData object.
      */
    var Metric: js.UndefOr[CurrentMetric] = js.undefined
    /**
      * The value of the metric in the CurrentMetricData object.
      */
    var Value: js.UndefOr[Value] = js.undefined
  }
  
  trait CurrentMetricResult extends js.Object {
    /**
      * The Collections for the CurrentMetricResult object.
      */
    var Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined
    /**
      * The Dimensions for the CurrentMetricResult object.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
  }
  
  trait DeleteUserRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The unique identifier of the user to delete.
      */
    var UserId: UserId
  }
  
  trait DescribeUserHierarchyGroupRequest extends js.Object {
    /**
      * The identifier for the hierarchy group to return.
      */
    var HierarchyGroupId: HierarchyGroupId
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
  }
  
  trait DescribeUserHierarchyGroupResponse extends js.Object {
    /**
      * Returns a HierarchyGroup object.
      */
    var HierarchyGroup: js.UndefOr[HierarchyGroup] = js.undefined
  }
  
  trait DescribeUserHierarchyStructureRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
  }
  
  trait DescribeUserHierarchyStructureResponse extends js.Object {
    /**
      * A HierarchyStructure object.
      */
    var HierarchyStructure: js.UndefOr[HierarchyStructure] = js.undefined
  }
  
  trait DescribeUserRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * Unique identifier for the user account to return.
      */
    var UserId: UserId
  }
  
  trait DescribeUserResponse extends js.Object {
    /**
      * A User object that contains information about the user account and configuration settings.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait Dimensions extends js.Object {
    /**
      * The channel used for grouping and filters. Only VOICE is supported.
      */
    var Channel: js.UndefOr[Channel] = js.undefined
    /**
      * A QueueReference object used as one part of dimension for the metrics results.
      */
    var Queue: js.UndefOr[QueueReference] = js.undefined
  }
  
  trait Filters extends js.Object {
    /**
      * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
      */
    var Channels: js.UndefOr[Channels] = js.undefined
    /**
      * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and ARNs in a request.
      */
    var Queues: js.UndefOr[Queues] = js.undefined
  }
  
  trait GetContactAttributesRequest extends js.Object {
    /**
      * The ID for the initial contact in Amazon Connect associated with the attributes to update.
      */
    var InitialContactId: ContactId
    /**
      * The instance ID for the instance from which to retrieve contact attributes.
      */
    var InstanceId: InstanceId
  }
  
  trait GetContactAttributesResponse extends js.Object {
    /**
      * The attributes to update.
      */
    var Attributes: js.UndefOr[Attributes] = js.undefined
  }
  
  trait GetCurrentMetricDataRequest extends js.Object {
    /**
      * A list of CurrentMetric objects for the metrics to retrieve. Each CurrentMetric includes a name of a metric to retrieve and the unit to use for it. You must list each metric to retrieve data for in the request. The following metrics are available:  AGENTS_AVAILABLE  Unit: COUNT  AGENTS_ONLINE  Unit: COUNT  AGENTS_ON_CALL  Unit: COUNT  AGENTS_STAFFED  Unit: COUNT  AGENTS_AFTER_CONTACT_WORK  Unit: COUNT  AGENTS_NON_PRODUCTIVE  Unit: COUNT  AGENTS_ERROR  Unit: COUNT  CONTACTS_IN_QUEUE  Unit: COUNT  OLDEST_CONTACT_AGE  Unit: SECONDS  CONTACTS_SCHEDULED  Unit: COUNT  
      */
    var CurrentMetrics: CurrentMetrics
    /**
      * A Filters object that contains a list of queue IDs or queue ARNs, up to 100, or list of Channels to use to filter the metrics returned in the response. Metric data is retrieved only for the resources associated with the queue IDs, ARNs, or Channels included in the filter. You can include both IDs and ARNs in the same request. To retrieve metrics for all queues, add the queue ID or ARN for each queue in your instance. Only VOICE is supported for Channels. To find the ARN for a queue, open the queue you want to use in the Amazon Connect Queue editor. The ARN for the queue is displayed in the address bar as part of the URL. For example, the queue ARN is the set of characters at the end of the URL, after 'id=' such as arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61. The queue ID is also included in the URL, and is the string after 'queue/'.
      */
    var Filters: Filters
    /**
      * The grouping applied to the metrics returned. For example, when grouped by QUEUE, the metrics returned apply to each queue rather than aggregated for all queues. If you group by CHANNEL, you should include a Channels filter. The only supported channel is VOICE. If no Grouping is included in the request, a summary of CurrentMetrics is returned.
      */
    var Groupings: js.UndefOr[Groupings] = js.undefined
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      *  MaxResults indicates the maximum number of results to return per page in the response, between 1 and 100.
      */
    var MaxResults: js.UndefOr[MaxResult100] = js.undefined
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must use the same request parameters as the request that generated the token.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetCurrentMetricDataResponse extends js.Object {
    /**
      * The time at which CurrentMetricData was retrieved and cached for pagination.
      */
    var DataSnapshotTime: js.UndefOr[timestamp] = js.undefined
    /**
      * A list of CurrentMetricResult objects organized by Dimensions combining with CurrentMetricDataCollections.  Dimensions is the resourceId specified in the Filters of the request.   Collections is a list of CurrentMetricData objects with corresponding values to the CurrentMetrics specified in the request. If no Grouping is specified in the request, Collections is a summary for the CurrentMetric returned.
      */
    var MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined
    /**
      * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must use the same request parameters as the request that generated the token. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetFederationTokenRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
  }
  
  trait GetFederationTokenResponse extends js.Object {
    /**
      * The credentials to use for federation.
      */
    var Credentials: js.UndefOr[Credentials] = js.undefined
  }
  
  trait GetMetricDataRequest extends js.Object {
    /**
      * The timestamp, in UNIX Epoch time format, at which to end the reporting interval for the retrieval of historical metrics data. The time must be specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10, and must be later than the StartTime timestamp. The time range between StartTime and EndTime must be less than 24 hours.
      */
    var EndTime: timestamp
    /**
      * A Filters object that contains a list of queue IDs or queue ARNs, up to 100, or a list of Channels to use to filter the metrics returned in the response. Metric data is retrieved only for the resources associated with the IDs, ARNs, or Channels included in the filter. You can use both IDs and ARNs together in a request. Only VOICE is supported for Channel. To find the ARN for a queue, open the queue you want to use in the Amazon Connect Queue editor. The ARN for the queue is displayed in the address bar as part of the URL. For example, the queue ARN is the set of characters at the end of the URL, after 'id=' such as arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61. The queue ID is also included in the URL, and is the string after 'queue/'.
      */
    var Filters: Filters
    /**
      * The grouping applied to the metrics returned. For example, when results are grouped by queueId, the metrics returned are grouped by queue. The values returned apply to the metrics for each queue rather than aggregated for all queues. The current version supports grouping by Queue If no Grouping is included in the request, a summary of HistoricalMetrics for all queues is returned.
      */
    var Groupings: js.UndefOr[Groupings] = js.undefined
    /**
      * A list of HistoricalMetric objects that contain the metrics to retrieve with the request. A HistoricalMetric object contains: HistoricalMetricName, Statistic, Threshold, and Unit. You must list each metric to retrieve data for in the request. For each historical metric you include in the request, you must include a Unit and a Statistic.  The following historical metrics are available:  CONTACTS_QUEUED  Unit: COUNT Statistic: SUM  CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  CONTACTS_ABANDONED  Unit: COUNT Statistics: SUM  CONTACTS_CONSULTED  Unit: COUNT Statistics: SUM  CONTACTS_AGENT_HUNG_UP_FIRST  Unit: COUNT Statistics: SUM  CONTACTS_HANDLED_INCOMING  Unit: COUNT Statistics: SUM  CONTACTS_HANDLED_OUTBOUND  Unit: COUNT Statistics: SUM  CONTACTS_HOLD_ABANDONS  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_IN  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_OUT  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_IN_FROM_QUEUE  Unit: COUNT Statistics: SUM  CONTACTS_TRANSFERRED_OUT_FROM_QUEUE  Unit: COUNT Statistics: SUM  CALLBACK_CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  CALLBACK_CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  API_CONTACTS_HANDLED  Unit: COUNT Statistics: SUM  CONTACTS_MISSED  Unit: COUNT Statistics: SUM  OCCUPANCY  Unit: PERCENT Statistics: AVG  HANDLE_TIME  Unit: SECONDS Statistics: AVG  AFTER_CONTACT_WORK_TIME  Unit: SECONDS Statistics: AVG  QUEUED_TIME  Unit: SECONDS Statistics: MAX  ABANDON_TIME  Unit: COUNT Statistics: SUM  QUEUE_ANSWER_TIME  Unit: SECONDS Statistics: AVG  HOLD_TIME  Unit: SECONDS Statistics: AVG  INTERACTION_TIME  Unit: SECONDS Statistics: AVG  INTERACTION_AND_HOLD_TIME  Unit: SECONDS Statistics: AVG  SERVICE_LEVEL  Unit: PERCENT Statistics: AVG Threshold: Only "Less than" comparisons are supported, with the following service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300, 600  
      */
    var HistoricalMetrics: HistoricalMetrics
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * Indicates the maximum number of results to return per page in the response, between 1-100.
      */
    var MaxResults: js.UndefOr[MaxResult100] = js.undefined
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The timestamp, in UNIX Epoch time format, at which to start the reporting interval for the retrieval of historical metrics data. The time must be specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15.  StartTime cannot be earlier than 24 hours before the time of the request. Historical metrics are available in Amazon Connect only for 24 hours.
      */
    var StartTime: timestamp
  }
  
  trait GetMetricDataResponse extends js.Object {
    /**
      * A list of HistoricalMetricResult objects, organized by Dimensions, which is the ID of the resource specified in the Filters used for the request. The metrics are combined with the metrics included in Collections, which is a list of HisotricalMetricData objects. If no Grouping is specified in the request, Collections includes summary data for the HistoricalMetrics.
      */
    var MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined
    /**
      * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must use the same request parameters as the request that generated the token. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait HierarchyGroup extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the hierarchy group.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * A HierarchyPath object that contains information about the levels in the hierarchy group.
      */
    var HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined
    /**
      * The identifier for the hierarchy group.
      */
    var Id: js.UndefOr[HierarchyGroupId] = js.undefined
    /**
      * The identifier for the level in the hierarchy group.
      */
    var LevelId: js.UndefOr[HierarchyLevelId] = js.undefined
    /**
      * The name of the hierarchy group in your instance.
      */
    var Name: js.UndefOr[HierarchyGroupName] = js.undefined
  }
  
  trait HierarchyGroupSummary extends js.Object {
    /**
      * The ARN for the hierarchy group.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The identifier of the hierarchy group.
      */
    var Id: js.UndefOr[HierarchyGroupId] = js.undefined
    /**
      * The name of the hierarchy group.
      */
    var Name: js.UndefOr[HierarchyGroupName] = js.undefined
  }
  
  trait HierarchyLevel extends js.Object {
    /**
      * The ARN for the hierarchy group level.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The identifier for the hierarchy group level.
      */
    var Id: js.UndefOr[HierarchyLevelId] = js.undefined
    /**
      * The name of the hierarchy group level.
      */
    var Name: js.UndefOr[HierarchyLevelName] = js.undefined
  }
  
  trait HierarchyPath extends js.Object {
    /**
      * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
      */
    var LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined
    /**
      * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
      */
    var LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined
    /**
      * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
      */
    var LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined
    /**
      * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
      */
    var LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined
    /**
      * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
      */
    var LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined
  }
  
  trait HierarchyStructure extends js.Object {
    /**
      * A HierarchyLevel object that contains information about the hierarchy group level.
      */
    var LevelFive: js.UndefOr[HierarchyLevel] = js.undefined
    /**
      * A HierarchyLevel object that contains information about the hierarchy group level.
      */
    var LevelFour: js.UndefOr[HierarchyLevel] = js.undefined
    /**
      * A HierarchyLevel object that contains information about the hierarchy group level.
      */
    var LevelOne: js.UndefOr[HierarchyLevel] = js.undefined
    /**
      * A HierarchyLevel object that contains information about the hierarchy group level.
      */
    var LevelThree: js.UndefOr[HierarchyLevel] = js.undefined
    /**
      * A HierarchyLevel object that contains information about the hierarchy group level.
      */
    var LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined
  }
  
  trait HistoricalMetric extends js.Object {
    /**
      * The name of the historical metric.
      */
    var Name: js.UndefOr[HistoricalMetricName] = js.undefined
    /**
      * The statistic for the metric.
      */
    var Statistic: js.UndefOr[Statistic] = js.undefined
    /**
      * The threshold for the metric, used with service level metrics.
      */
    var Threshold: js.UndefOr[Threshold] = js.undefined
    /**
      * The unit for the metric.
      */
    var Unit: js.UndefOr[Unit] = js.undefined
  }
  
  trait HistoricalMetricData extends js.Object {
    /**
      * A HistoricalMetric object.
      */
    var Metric: js.UndefOr[HistoricalMetric] = js.undefined
    /**
      * The Value of the metric.
      */
    var Value: js.UndefOr[Value] = js.undefined
  }
  
  trait HistoricalMetricResult extends js.Object {
    /**
      * A list of HistoricalMetricData objects.
      */
    var Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined
    /**
      * The Dimensions for the metrics.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
  }
  
  trait ListRoutingProfilesRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of routing profiles to return in the response.
      */
    var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListRoutingProfilesResponse extends js.Object {
    /**
      * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of RoutingProfileSummary objects that include the ARN, Id, and Name of the routing profile.
      */
    var RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList] = js.undefined
  }
  
  trait ListSecurityProfilesRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of security profiles to return.
      */
    var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSecurityProfilesResponse extends js.Object {
    /**
      * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of SecurityProfileSummary objects.
      */
    var SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList] = js.undefined
  }
  
  trait ListUserHierarchyGroupsRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of hierarchy groups to return.
      */
    var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListUserHierarchyGroupsResponse extends js.Object {
    /**
      * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of HierarchyGroupSummary objects.
      */
    var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The maximum number of results to return in the response.
      */
    var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of UserSummary objects that contain information about the users in your instance.
      */
    var UserSummaryList: js.UndefOr[UserSummaryList] = js.undefined
  }
  
  trait QueueReference extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of queue.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The ID of the queue associated with the metrics returned.
      */
    var Id: js.UndefOr[QueueId] = js.undefined
  }
  
  trait RoutingProfileSummary extends js.Object {
    /**
      * The ARN of the routing profile.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The identifier of the routing profile.
      */
    var Id: js.UndefOr[RoutingProfileId] = js.undefined
    /**
      * The name of the routing profile.
      */
    var Name: js.UndefOr[RoutingProfileName] = js.undefined
  }
  
  trait SecurityProfileSummary extends js.Object {
    /**
      * The ARN of the security profile.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The identifier of the security profile.
      */
    var Id: js.UndefOr[SecurityProfileId] = js.undefined
    /**
      * The name of the security profile.
      */
    var Name: js.UndefOr[SecurityProfileName] = js.undefined
  }
  
  trait StartOutboundVoiceContactRequest extends js.Object {
    /**
      * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters. For example, if you want play a greeting when the customer answers the call, you can pass the customer name in attributes similar to the following:
      */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is disconnected, a new contact is started.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * The identifier for the contact flow to connect the outbound call to. To find the ContactFlowId, open the contact flow you want to use in the Amazon Connect contact flow editor. The ID for the contact flow is displayed in the address bar as part of the URL. For example, the contact flow ID is the set of characters at the end of the URL, after 'contact-flow/' such as 78ea8fd5-2659-4f2b-b528-699760ccfc1b.
      */
    var ContactFlowId: ContactFlowId
    /**
      * The phone number of the customer in E.164 format.
      */
    var DestinationPhoneNumber: PhoneNumber
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The queue to add the call to. If you specify a queue, the phone displayed for caller ID is the phone number specified in the queue. If you do not specify a queue, the queue used will be the queue defined in the contact flow. To find the QueueId, open the queue you want to use in the Amazon Connect Queue editor. The ID for the queue is displayed in the address bar as part of the URL. For example, the queue ID is the set of characters at the end of the URL, after 'queue/' such as queue/aeg40574-2d01-51c3-73d6-bf8624d2168c.
      */
    var QueueId: js.UndefOr[QueueId] = js.undefined
    /**
      * The phone number, in E.164 format, associated with your Amazon Connect instance to use for the outbound call.
      */
    var SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  }
  
  trait StartOutboundVoiceContactResponse extends js.Object {
    /**
      * The unique identifier of this contact within your Amazon Connect instance.
      */
    var ContactId: js.UndefOr[ContactId] = js.undefined
  }
  
  trait StopContactRequest extends js.Object {
    /**
      * The unique identifier of the contact to end.
      */
    var ContactId: ContactId
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
  }
  
  trait StopContactResponse extends js.Object
  
  trait Threshold extends js.Object {
    /**
      * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
      */
    var Comparison: js.UndefOr[Comparison] = js.undefined
    /**
      * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
      */
    var ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a new user account in your Amazon Connect instance.
      */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new user account in your Amazon Connect instance.
      */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user account from Amazon Connect.
      */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user account from Amazon Connect.
      */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a User object that contains information about the user account specified by the UserId.
      */
    def describeUser(): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a User object that contains information about the user account specified by the UserId.
      */
    def describeUser(params: DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUser(
      params: DescribeUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
      */
    def describeUserHierarchyGroup(): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserHierarchyGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserHierarchyGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
      */
    def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserHierarchyGroup(
      params: DescribeUserHierarchyGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserHierarchyGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
      */
    def describeUserHierarchyStructure(): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserHierarchyStructure(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserHierarchyStructureResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
      */
    def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserHierarchyStructure(
      params: DescribeUserHierarchyStructureRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserHierarchyStructureResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the contact attributes associated with a contact.
      */
    def getContactAttributes(): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContactAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContactAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the contact attributes associated with a contact.
      */
    def getContactAttributes(params: GetContactAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContactAttributes(
      params: GetContactAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContactAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
      */
    def getCurrentMetricData(): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCurrentMetricData(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCurrentMetricDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
      */
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCurrentMetricData(
      params: GetCurrentMetricDataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCurrentMetricDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a token for federation.
      */
    def getFederationToken(): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFederationToken(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFederationTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a token for federation.
      */
    def getFederationToken(params: GetFederationTokenRequest): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFederationToken(
      params: GetFederationTokenRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFederationTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
      */
    def getMetricData(): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricData(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
      */
    def getMetricData(params: GetMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricData(
      params: GetMetricDataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
      */
    def listRoutingProfiles(): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoutingProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoutingProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
      */
    def listRoutingProfiles(params: ListRoutingProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoutingProfiles(
      params: ListRoutingProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoutingProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
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
      * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
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
      * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
      */
    def listUserHierarchyGroups(): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserHierarchyGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserHierarchyGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
      */
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserHierarchyGroups(
      params: ListUserHierarchyGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserHierarchyGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a UserSummaryList, which is an array of UserSummary objects.
      */
    def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a UserSummaryList, which is an array of UserSummary objects.
      */
    def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      params: ListUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call fails.
      */
    def startOutboundVoiceContact(): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startOutboundVoiceContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartOutboundVoiceContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call fails.
      */
    def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startOutboundVoiceContact(
      params: StartOutboundVoiceContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartOutboundVoiceContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
      */
    def stopContact(): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
      */
    def stopContact(params: StopContactRequest): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopContact(
      params: StopContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
      */
    def updateContactAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateContactAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateContactAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
      */
    def updateContactAttributes(params: UpdateContactAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateContactAttributes(
      params: UpdateContactAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateContactAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the specified hierarchy group to the user.
      */
    def updateUserHierarchy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserHierarchy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the specified hierarchy group to the user.
      */
    def updateUserHierarchy(params: UpdateUserHierarchyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserHierarchy(
      params: UpdateUserHierarchyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
      */
    def updateUserIdentityInfo(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserIdentityInfo(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
      */
    def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserIdentityInfo(
      params: UpdateUserIdentityInfoRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
      */
    def updateUserPhoneConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserPhoneConfig(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
      */
    def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserPhoneConfig(
      params: UpdateUserPhoneConfigRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the specified routing profile to a user.
      */
    def updateUserRoutingProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserRoutingProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the specified routing profile to a user.
      */
    def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserRoutingProfile(
      params: UpdateUserRoutingProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the security profiles assigned to the user.
      */
    def updateUserSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserSecurityProfiles(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the security profiles assigned to the user.
      */
    def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserSecurityProfiles(
      params: UpdateUserSecurityProfilesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateContactAttributesRequest extends js.Object {
    /**
      * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
      */
    var Attributes: Attributes
    /**
      * The unique identifier of the contact for which to update attributes. This is the identifier for the contact associated with the first interaction with the contact center.
      */
    var InitialContactId: ContactId
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
  }
  
  trait UpdateContactAttributesResponse extends js.Object
  
  trait UpdateUserHierarchyRequest extends js.Object {
    /**
      * The identifier for the hierarchy group to assign to the user.
      */
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The identifier of the user account to assign the hierarchy group to.
      */
    var UserId: UserId
  }
  
  trait UpdateUserIdentityInfoRequest extends js.Object {
    /**
      * A UserIdentityInfo object.
      */
    var IdentityInfo: UserIdentityInfo
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The identifier for the user account to update identity information for.
      */
    var UserId: UserId
  }
  
  trait UpdateUserPhoneConfigRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * A UserPhoneConfig object that contains settings for AfterContactWorkTimeLimit, AutoAccept, DeskPhoneNumber, and PhoneType to assign to the user.
      */
    var PhoneConfig: UserPhoneConfig
    /**
      * The identifier for the user account to change phone settings for.
      */
    var UserId: UserId
  }
  
  trait UpdateUserRoutingProfileRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The identifier of the routing profile to assign to the user.
      */
    var RoutingProfileId: RoutingProfileId
    /**
      * The identifier for the user account to assign the routing profile to.
      */
    var UserId: UserId
  }
  
  trait UpdateUserSecurityProfilesRequest extends js.Object {
    /**
      * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
      */
    var InstanceId: InstanceId
    /**
      * The identifiers for the security profiles to assign to the user.
      */
    var SecurityProfileIds: SecurityProfileIds
    /**
      * The identifier of the user account to assign the security profiles.
      */
    var UserId: UserId
  }
  
  trait User extends js.Object {
    /**
      * The ARN of the user account.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The directory Id for the user account in the existing directory used for identity management.
      */
    var DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined
    /**
      * The identifier for the hierarchy group assigned to the user.
      */
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    /**
      * The identifier of the user account.
      */
    var Id: js.UndefOr[UserId] = js.undefined
    /**
      * A UserIdentityInfo object.
      */
    var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined
    /**
      * A UserPhoneConfig object.
      */
    var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined
    /**
      * The identifier of the routing profile assigned to the user.
      */
    var RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined
    /**
      * The identifier(s) for the security profile assigned to the user.
      */
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined
    /**
      * The user name assigned to the user account.
      */
    var Username: js.UndefOr[AgentUsername] = js.undefined
  }
  
  trait UserIdentityInfo extends js.Object {
    /**
      * The email address added to the user account. If you are using SAML for identity management and include this parameter, an InvalidRequestException is returned.
      */
    var Email: js.UndefOr[Email] = js.undefined
    /**
      * The first name used in the user account. This is required if you are using Amazon Connect or SAML for identity management.
      */
    var FirstName: js.UndefOr[AgentFirstName] = js.undefined
    /**
      * The last name used in the user account. This is required if you are using Amazon Connect or SAML for identity management.
      */
    var LastName: js.UndefOr[AgentLastName] = js.undefined
  }
  
  trait UserPhoneConfig extends js.Object {
    /**
      * The After Call Work (ACW) timeout setting, in seconds, for the user.
      */
    var AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined
    /**
      * The Auto accept setting for the user, Yes or No.
      */
    var AutoAccept: js.UndefOr[AutoAccept] = js.undefined
    /**
      * The phone number for the user's desk phone.
      */
    var DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    /**
      * The phone type selected for the user, either Soft phone or Desk phone.
      */
    var PhoneType: PhoneType
  }
  
  trait UserSummary extends js.Object {
    /**
      * The ARN for the user account.
      */
    var Arn: js.UndefOr[ARN] = js.undefined
    /**
      * The identifier for the user account.
      */
    var Id: js.UndefOr[UserId] = js.undefined
    /**
      * The Amazon Connect user name for the user account.
      */
    var Username: js.UndefOr[AgentUsername] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ARN = java.lang.String
  type AfterContactWorkTimeLimit = scala.Double
  type AgentFirstName = java.lang.String
  type AgentLastName = java.lang.String
  type AgentUsername = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type AutoAccept = scala.Boolean
  type Channel = awsDashSdkLib.awsDashSdkLibStrings.VOICE | java.lang.String
  type Channels = js.Array[Channel]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type Comparison = awsDashSdkLib.awsDashSdkLibStrings.LT | java.lang.String
  type ContactFlowId = java.lang.String
  type ContactId = java.lang.String
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  type CurrentMetricName = awsDashSdkLib.awsDashSdkLibStrings.AGENTS_ONLINE | awsDashSdkLib.awsDashSdkLibStrings.AGENTS_AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.AGENTS_ON_CALL | awsDashSdkLib.awsDashSdkLibStrings.AGENTS_NON_PRODUCTIVE | awsDashSdkLib.awsDashSdkLibStrings.AGENTS_AFTER_CONTACT_WORK | awsDashSdkLib.awsDashSdkLibStrings.AGENTS_ERROR | awsDashSdkLib.awsDashSdkLibStrings.AGENTS_STAFFED | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_IN_QUEUE | awsDashSdkLib.awsDashSdkLibStrings.OLDEST_CONTACT_AGE | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_SCHEDULED | java.lang.String
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type DirectoryUserId = java.lang.String
  type Email = java.lang.String
  type Grouping = awsDashSdkLib.awsDashSdkLibStrings.QUEUE | awsDashSdkLib.awsDashSdkLibStrings.CHANNEL | java.lang.String
  type Groupings = js.Array[Grouping]
  type HierarchyGroupId = java.lang.String
  type HierarchyGroupName = java.lang.String
  type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId = java.lang.String
  type HierarchyLevelName = java.lang.String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  type HistoricalMetricName = awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_QUEUED | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HANDLED | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_ABANDONED | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_CONSULTED | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_AGENT_HUNG_UP_FIRST | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HANDLED_INCOMING | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HANDLED_OUTBOUND | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HOLD_ABANDONS | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_IN | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_OUT | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE | awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_MISSED | awsDashSdkLib.awsDashSdkLibStrings.CALLBACK_CONTACTS_HANDLED | awsDashSdkLib.awsDashSdkLibStrings.API_CONTACTS_HANDLED | awsDashSdkLib.awsDashSdkLibStrings.OCCUPANCY | awsDashSdkLib.awsDashSdkLibStrings.HANDLE_TIME | awsDashSdkLib.awsDashSdkLibStrings.AFTER_CONTACT_WORK_TIME | awsDashSdkLib.awsDashSdkLibStrings.QUEUED_TIME | awsDashSdkLib.awsDashSdkLibStrings.ABANDON_TIME | awsDashSdkLib.awsDashSdkLibStrings.QUEUE_ANSWER_TIME | awsDashSdkLib.awsDashSdkLibStrings.HOLD_TIME | awsDashSdkLib.awsDashSdkLibStrings.INTERACTION_TIME | awsDashSdkLib.awsDashSdkLibStrings.INTERACTION_AND_HOLD_TIME | awsDashSdkLib.awsDashSdkLibStrings.SERVICE_LEVEL | java.lang.String
  type HistoricalMetricResults = js.Array[HistoricalMetricResult]
  type HistoricalMetrics = js.Array[HistoricalMetric]
  type InstanceId = java.lang.String
  type MaxResult100 = scala.Double
  type MaxResult1000 = scala.Double
  type NextToken = java.lang.String
  type Password = java.lang.String
  type PhoneNumber = java.lang.String
  type PhoneType = awsDashSdkLib.awsDashSdkLibStrings.SOFT_PHONE | awsDashSdkLib.awsDashSdkLibStrings.DESK_PHONE | java.lang.String
  type QueueId = java.lang.String
  type Queues = js.Array[QueueId]
  type RoutingProfileId = java.lang.String
  type RoutingProfileName = java.lang.String
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type SecurityProfileId = java.lang.String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = java.lang.String
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityToken = java.lang.String
  type Statistic = awsDashSdkLib.awsDashSdkLibStrings.SUM | awsDashSdkLib.awsDashSdkLibStrings.MAX | awsDashSdkLib.awsDashSdkLibStrings.AVG | java.lang.String
  type ThresholdValue = scala.Double
  type Unit = awsDashSdkLib.awsDashSdkLibStrings.SECONDS | awsDashSdkLib.awsDashSdkLibStrings.COUNT | awsDashSdkLib.awsDashSdkLibStrings.PERCENT | java.lang.String
  type UserId = java.lang.String
  type UserSummaryList = js.Array[UserSummary]
  type Value = scala.Double
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-08-08` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type timestamp = stdLib.Date
}

