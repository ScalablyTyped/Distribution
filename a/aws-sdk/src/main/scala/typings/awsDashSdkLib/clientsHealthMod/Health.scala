package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Health
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Health: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsHealthMod.HealthNs.ClientConfiguration = js.native
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.
    */
  def describeAffectedEntities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAffectedEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.
    */
  def describeAffectedEntities(params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAffectedEntities(
    params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeAffectedEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
    */
  def describeEntityAggregates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEntityAggregates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
    */
  def describeEntityAggregates(params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEntityAggregates(
    params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEntityAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.
    */
  def describeEventAggregates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventAggregates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.
    */
  def describeEventAggregates(params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventAggregates(
    params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventAggregatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
    */
  def describeEventDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
    */
  def describeEventDetails(params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventDetails(
    params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.
    */
  def describeEventTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.
    */
  def describeEventTypes(params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventTypes(
    params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent.
    */
  def describeEvents(params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsHealthMod.HealthNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

