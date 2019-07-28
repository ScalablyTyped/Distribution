package typings.awsDashSdk.clientsHealthMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Health extends Service {
  @JSName("config")
  var config_Health: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.
    */
  def describeAffectedEntities(): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  def describeAffectedEntities(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesResponse, Unit]): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.
    */
  def describeAffectedEntities(params: DescribeAffectedEntitiesRequest): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  def describeAffectedEntities(
    params: DescribeAffectedEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesResponse, Unit]
  ): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  /**
    * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
    */
  def describeEntityAggregates(): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  def describeEntityAggregates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityAggregatesResponse, Unit]): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
    */
  def describeEntityAggregates(params: DescribeEntityAggregatesRequest): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  def describeEntityAggregates(
    params: DescribeEntityAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityAggregatesResponse, Unit]
  ): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.
    */
  def describeEventAggregates(): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  def describeEventAggregates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventAggregatesResponse, Unit]): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.
    */
  def describeEventAggregates(params: DescribeEventAggregatesRequest): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  def describeEventAggregates(
    params: DescribeEventAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventAggregatesResponse, Unit]
  ): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
    */
  def describeEventDetails(): Request[DescribeEventDetailsResponse, AWSError] = js.native
  def describeEventDetails(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsResponse, Unit]): Request[DescribeEventDetailsResponse, AWSError] = js.native
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
    */
  def describeEventDetails(params: DescribeEventDetailsRequest): Request[DescribeEventDetailsResponse, AWSError] = js.native
  def describeEventDetails(
    params: DescribeEventDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsResponse, Unit]
  ): Request[DescribeEventDetailsResponse, AWSError] = js.native
  /**
    * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.
    */
  def describeEventTypes(): Request[DescribeEventTypesResponse, AWSError] = js.native
  def describeEventTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTypesResponse, Unit]): Request[DescribeEventTypesResponse, AWSError] = js.native
  /**
    * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.
    */
  def describeEventTypes(params: DescribeEventTypesRequest): Request[DescribeEventTypesResponse, AWSError] = js.native
  def describeEventTypes(
    params: DescribeEventTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTypesResponse, Unit]
  ): Request[DescribeEventTypesResponse, AWSError] = js.native
  /**
    * Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent.
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    * Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent.
    */
  def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
}

