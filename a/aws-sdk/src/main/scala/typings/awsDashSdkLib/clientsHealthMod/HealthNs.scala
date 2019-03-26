package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/health", "Health")
@js.native
object HealthNs extends js.Object {
  trait AffectedEntity extends js.Object {
    /**
      * The 12-digit AWS account number that contains the affected entity.
      */
    var awsAccountId: js.UndefOr[accountId] = js.undefined
    /**
      * The unique identifier for the entity. Format: arn:aws:health:entity-region:aws-account:entity/entity-id . Example: arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K 
      */
    var entityArn: js.UndefOr[entityArn] = js.undefined
    var entityUrl: js.UndefOr[entityUrl] = js.undefined
    /**
      * The ID of the affected entity.
      */
    var entityValue: js.UndefOr[entityValue] = js.undefined
    /**
      * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
      */
    var eventArn: js.UndefOr[eventArn] = js.undefined
    /**
      * The most recent time that the entity was updated.
      */
    var lastUpdatedTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The most recent status of the entity affected by the event. The possible values are IMPAIRED, UNIMPAIRED, and UNKNOWN.
      */
    var statusCode: js.UndefOr[entityStatusCode] = js.undefined
    /**
      * A map of entity tags attached to the affected entity.
      */
    var tags: js.UndefOr[tagSet] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DateTimeRange extends js.Object {
    /**
      * The starting date and time of a time range.
      */
    var from: js.UndefOr[timestamp] = js.undefined
    /**
      * The ending date and time of a time range.
      */
    var to: js.UndefOr[timestamp] = js.undefined
  }
  
  trait DescribeAffectedEntitiesRequest extends js.Object {
    /**
      * Values to narrow the results returned. At least one event ARN is required. 
      */
    var filter: EntityFilter
    /**
      * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
      */
    var locale: js.UndefOr[locale] = js.undefined
    /**
      * The maximum number of items to return in one batch, between 10 and 100, inclusive.
      */
    var maxResults: js.UndefOr[maxResults] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeAffectedEntitiesResponse extends js.Object {
    /**
      * The entities that match the filter criteria.
      */
    var entities: js.UndefOr[EntityList] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeEntityAggregatesRequest extends js.Object {
    /**
      * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
      */
    var eventArns: js.UndefOr[EventArnsList] = js.undefined
  }
  
  trait DescribeEntityAggregatesResponse extends js.Object {
    /**
      * The number of entities that are affected by each of the specified events.
      */
    var entityAggregates: js.UndefOr[EntityAggregateList] = js.undefined
  }
  
  trait DescribeEventAggregatesRequest extends js.Object {
    /**
      * The only currently supported value is eventTypeCategory.
      */
    var aggregateField: eventAggregateField
    /**
      * Values to narrow the results returned.
      */
    var filter: js.UndefOr[EventFilter] = js.undefined
    /**
      * The maximum number of items to return in one batch, between 10 and 100, inclusive.
      */
    var maxResults: js.UndefOr[maxResults] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeEventAggregatesResponse extends js.Object {
    /**
      * The number of events in each category that meet the optional filter criteria.
      */
    var eventAggregates: js.UndefOr[EventAggregateList] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeEventDetailsRequest extends js.Object {
    /**
      * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
      */
    var eventArns: eventArnList
    /**
      * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
      */
    var locale: js.UndefOr[locale] = js.undefined
  }
  
  trait DescribeEventDetailsResponse extends js.Object {
    /**
      * Error messages for any events that could not be retrieved.
      */
    var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.undefined
    /**
      * Information about the events that could be retrieved.
      */
    var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.undefined
  }
  
  trait DescribeEventTypesRequest extends js.Object {
    /**
      * Values to narrow the results returned.
      */
    var filter: js.UndefOr[EventTypeFilter] = js.undefined
    /**
      * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
      */
    var locale: js.UndefOr[locale] = js.undefined
    /**
      * The maximum number of items to return in one batch, between 10 and 100, inclusive.
      */
    var maxResults: js.UndefOr[maxResults] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeEventTypesResponse extends js.Object {
    /**
      * A list of event types that match the filter criteria. Event types have a category (issue, accountNotification, or scheduledChange), a service (for example, EC2, RDS, DATAPIPELINE, BILLING), and a code (in the format AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT).
      */
    var eventTypes: js.UndefOr[EventTypeList] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeEventsRequest extends js.Object {
    /**
      * Values to narrow the results returned.
      */
    var filter: js.UndefOr[EventFilter] = js.undefined
    /**
      * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
      */
    var locale: js.UndefOr[locale] = js.undefined
    /**
      * The maximum number of items to return in one batch, between 10 and 100, inclusive.
      */
    var maxResults: js.UndefOr[maxResults] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait DescribeEventsResponse extends js.Object {
    /**
      * The events that match the specified filter criteria.
      */
    var events: js.UndefOr[EventList] = js.undefined
    /**
      * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
      */
    var nextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  trait EntityAggregate extends js.Object {
    /**
      * The number entities that match the criteria for the specified events.
      */
    var count: js.UndefOr[count] = js.undefined
    /**
      * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
      */
    var eventArn: js.UndefOr[eventArn] = js.undefined
  }
  
  trait EntityFilter extends js.Object {
    /**
      * A list of entity ARNs (unique identifiers).
      */
    var entityArns: js.UndefOr[entityArnList] = js.undefined
    /**
      * A list of IDs for affected entities.
      */
    var entityValues: js.UndefOr[entityValueList] = js.undefined
    /**
      * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
      */
    var eventArns: eventArnList
    /**
      * A list of the most recent dates and times that the entity was updated.
      */
    var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined
    /**
      * A list of entity status codes (IMPAIRED, UNIMPAIRED, or UNKNOWN).
      */
    var statusCodes: js.UndefOr[entityStatusCodeList] = js.undefined
    /**
      * A map of entity tags attached to the affected entity.
      */
    var tags: js.UndefOr[tagFilter] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
      */
    var arn: js.UndefOr[eventArn] = js.undefined
    /**
      * The AWS Availability Zone of the event. For example, us-east-1a.
      */
    var availabilityZone: js.UndefOr[availabilityZone] = js.undefined
    /**
      * The date and time that the event ended.
      */
    var endTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The category of the event. Possible values are issue, scheduledChange, and accountNotification.
      */
    var eventTypeCategory: js.UndefOr[eventTypeCategory] = js.undefined
    /**
      * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
      */
    var eventTypeCode: js.UndefOr[eventTypeCode] = js.undefined
    /**
      * The most recent date and time that the event was updated.
      */
    var lastUpdatedTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The AWS region name of the event.
      */
    var region: js.UndefOr[region] = js.undefined
    /**
      * The AWS service that is affected by the event. For example, EC2, RDS.
      */
    var service: js.UndefOr[service] = js.undefined
    /**
      * The date and time that the event began.
      */
    var startTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The most recent status of the event. Possible values are open, closed, and upcoming.
      */
    var statusCode: js.UndefOr[eventStatusCode] = js.undefined
  }
  
  trait EventAggregate extends js.Object {
    /**
      * The issue type for the associated count.
      */
    var aggregateValue: js.UndefOr[aggregateValue] = js.undefined
    /**
      * The number of events of the associated issue type.
      */
    var count: js.UndefOr[count] = js.undefined
  }
  
  trait EventDescription extends js.Object {
    /**
      * The most recent description of the event.
      */
    var latestDescription: js.UndefOr[eventDescription] = js.undefined
  }
  
  trait EventDetails extends js.Object {
    /**
      * Summary information about the event.
      */
    var event: js.UndefOr[Event] = js.undefined
    /**
      * The most recent description of the event.
      */
    var eventDescription: js.UndefOr[EventDescription] = js.undefined
    /**
      * Additional metadata about the event.
      */
    var eventMetadata: js.UndefOr[eventMetadata] = js.undefined
  }
  
  trait EventDetailsErrorItem extends js.Object {
    /**
      * A message that describes the error.
      */
    var errorMessage: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the error.
      */
    var errorName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
      */
    var eventArn: js.UndefOr[eventArn] = js.undefined
  }
  
  trait EventFilter extends js.Object {
    /**
      * A list of AWS availability zones.
      */
    var availabilityZones: js.UndefOr[availabilityZones] = js.undefined
    /**
      * A list of dates and times that the event ended.
      */
    var endTimes: js.UndefOr[dateTimeRangeList] = js.undefined
    /**
      * A list of entity ARNs (unique identifiers).
      */
    var entityArns: js.UndefOr[entityArnList] = js.undefined
    /**
      * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
      */
    var entityValues: js.UndefOr[entityValueList] = js.undefined
    /**
      * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
      */
    var eventArns: js.UndefOr[eventArnList] = js.undefined
    /**
      * A list of event status codes.
      */
    var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.undefined
    /**
      * A list of event type category codes (issue, scheduledChange, or accountNotification).
      */
    var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.undefined
    /**
      * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED" 
      */
    var eventTypeCodes: js.UndefOr[eventTypeList] = js.undefined
    /**
      * A list of dates and times that the event was last updated.
      */
    var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined
    /**
      * A list of AWS regions.
      */
    var regions: js.UndefOr[regionList] = js.undefined
    /**
      * The AWS services associated with the event. For example, EC2, RDS.
      */
    var services: js.UndefOr[serviceList] = js.undefined
    /**
      * A list of dates and times that the event began.
      */
    var startTimes: js.UndefOr[dateTimeRangeList] = js.undefined
    /**
      * A map of entity tags attached to the affected entity.
      */
    var tags: js.UndefOr[tagFilter] = js.undefined
  }
  
  trait EventType extends js.Object {
    /**
      * A list of event type category codes (issue, scheduledChange, or accountNotification).
      */
    var category: js.UndefOr[eventTypeCategory] = js.undefined
    /**
      * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
      */
    var code: js.UndefOr[eventTypeCode] = js.undefined
    /**
      * The AWS service that is affected by the event. For example, EC2, RDS.
      */
    var service: js.UndefOr[service] = js.undefined
  }
  
  trait EventTypeFilter extends js.Object {
    /**
      * A list of event type category codes (issue, scheduledChange, or accountNotification).
      */
    var eventTypeCategories: js.UndefOr[EventTypeCategoryList] = js.undefined
    /**
      * A list of event type codes.
      */
    var eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.undefined
    /**
      * The AWS services associated with the event. For example, EC2, RDS.
      */
    var services: js.UndefOr[serviceList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.
      */
    def describeAffectedEntities(): awsDashSdkLib.libRequestMod.Request[DescribeAffectedEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAffectedEntities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAffectedEntitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAffectedEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.
      */
    def describeAffectedEntities(params: DescribeAffectedEntitiesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAffectedEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAffectedEntities(
      params: DescribeAffectedEntitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAffectedEntitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAffectedEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
      */
    def describeEntityAggregates(): awsDashSdkLib.libRequestMod.Request[DescribeEntityAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEntityAggregates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEntityAggregatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEntityAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
      */
    def describeEntityAggregates(params: DescribeEntityAggregatesRequest): awsDashSdkLib.libRequestMod.Request[DescribeEntityAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEntityAggregates(
      params: DescribeEntityAggregatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEntityAggregatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEntityAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.
      */
    def describeEventAggregates(): awsDashSdkLib.libRequestMod.Request[DescribeEventAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventAggregates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventAggregatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.
      */
    def describeEventAggregates(params: DescribeEventAggregatesRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventAggregates(
      params: DescribeEventAggregatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventAggregatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventAggregatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about one or more specified events. Information includes standard event data (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
      */
    def describeEventDetails(): awsDashSdkLib.libRequestMod.Request[DescribeEventDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about one or more specified events. Information includes standard event data (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
      */
    def describeEventDetails(params: DescribeEventDetailsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventDetails(
      params: DescribeEventDetailsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.
      */
    def describeEventTypes(): awsDashSdkLib.libRequestMod.Request[DescribeEventTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.
      */
    def describeEventTypes(params: DescribeEventTypesRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventTypes(
      params: DescribeEventTypesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent.
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent.
      */
    def describeEvents(params: DescribeEventsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _apiVersion extends js.Object
  
  trait _entityStatusCode extends js.Object
  
  trait _eventStatusCode extends js.Object
  
  trait _eventTypeCategory extends js.Object
  
  trait eventMetadata
    extends /* key */ org.scalablytyped.runtime.StringDictionary[metadataValue]
  
  trait tagSet
    extends /* key */ org.scalablytyped.runtime.StringDictionary[tagValue]
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DescribeEventDetailsFailedSet = js.Array[EventDetailsErrorItem]
  type DescribeEventDetailsSuccessfulSet = js.Array[EventDetails]
  type EntityAggregateList = js.Array[EntityAggregate]
  type EntityList = js.Array[AffectedEntity]
  type EventAggregateList = js.Array[EventAggregate]
  type EventArnsList = js.Array[eventArn]
  type EventList = js.Array[Event]
  type EventTypeCategoryList = js.Array[eventTypeCategory]
  type EventTypeCodeList = js.Array[eventTypeCode]
  type EventTypeList = js.Array[EventType]
  type accountId = java.lang.String
  type aggregateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-08-04`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type availabilityZone = java.lang.String
  type availabilityZones = js.Array[availabilityZone]
  type count = scala.Double
  type dateTimeRangeList = js.Array[DateTimeRange]
  type entityArn = java.lang.String
  type entityArnList = js.Array[entityArn]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IMPAIRED
    - awsDashSdkLib.awsDashSdkLibStrings.UNIMPAIRED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type entityStatusCode = _entityStatusCode | java.lang.String
  type entityStatusCodeList = js.Array[entityStatusCode]
  type entityUrl = java.lang.String
  type entityValue = java.lang.String
  type entityValueList = js.Array[entityValue]
  type eventAggregateField = awsDashSdkLib.awsDashSdkLibStrings.eventTypeCategory | java.lang.String
  type eventArn = java.lang.String
  type eventArnList = js.Array[eventArn]
  type eventDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - awsDashSdkLib.awsDashSdkLibStrings.upcoming
    - java.lang.String
  */
  type eventStatusCode = _eventStatusCode | java.lang.String
  type eventStatusCodeList = js.Array[eventStatusCode]
  type eventType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.issue
    - awsDashSdkLib.awsDashSdkLibStrings.accountNotification
    - awsDashSdkLib.awsDashSdkLibStrings.scheduledChange
    - java.lang.String
  */
  type eventTypeCategory = _eventTypeCategory | java.lang.String
  type eventTypeCategoryList = js.Array[eventTypeCategory]
  type eventTypeCode = java.lang.String
  type eventTypeList = js.Array[eventType]
  type locale = java.lang.String
  type maxResults = scala.Double
  type metadataKey = java.lang.String
  type metadataValue = java.lang.String
  type nextToken = java.lang.String
  type region = java.lang.String
  type regionList = js.Array[region]
  type service = java.lang.String
  type serviceList = js.Array[service]
  type tagFilter = js.Array[tagSet]
  type tagKey = java.lang.String
  type tagValue = java.lang.String
  type timestamp = stdLib.Date
}

