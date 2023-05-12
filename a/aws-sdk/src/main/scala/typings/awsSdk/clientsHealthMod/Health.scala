package typings.awsSdk.clientsHealthMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Health extends Service {
  
  @JSName("config")
  var config_Health: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Returns a list of accounts in the organization from Organizations that are affected by the provided event. For more information about the different types of Health events, see Event.  Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedAccountsForOrganization(): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  def describeAffectedAccountsForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedAccountsForOrganizationResponse, Unit]
  ): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  /**
    * Returns a list of accounts in the organization from Organizations that are affected by the provided event. For more information about the different types of Health events, see Event.  Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedAccountsForOrganization(params: DescribeAffectedAccountsForOrganizationRequest): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  def describeAffectedAccountsForOrganization(
    params: DescribeAffectedAccountsForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedAccountsForOrganizationResponse, Unit]
  ): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the Amazon Web Service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required.    This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   This operation supports resource-level permissions. You can use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide.   
    */
  def describeAffectedEntities(): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  def describeAffectedEntities(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesResponse, Unit]): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the Amazon Web Service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required.    This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   This operation supports resource-level permissions. You can use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide.   
    */
  def describeAffectedEntities(params: DescribeAffectedEntitiesRequest): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  def describeAffectedEntities(
    params: DescribeAffectedEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesResponse, Unit]
  ): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  
  /**
    * Returns a list of entities that have been affected by one or more events for one or more accounts in your organization in Organizations, based on the filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the Amazon Web Service. At least one event Amazon Resource Name (ARN) and account ID are required. Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.    This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide.   
    */
  def describeAffectedEntitiesForOrganization(): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  def describeAffectedEntitiesForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesForOrganizationResponse, Unit]
  ): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  /**
    * Returns a list of entities that have been affected by one or more events for one or more accounts in your organization in Organizations, based on the filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the Amazon Web Service. At least one event Amazon Resource Name (ARN) and account ID are required. Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.    This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide.   
    */
  def describeAffectedEntitiesForOrganization(params: DescribeAffectedEntitiesForOrganizationRequest): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  def describeAffectedEntitiesForOrganization(
    params: DescribeAffectedEntitiesForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesForOrganizationResponse, Unit]
  ): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns the number of entities that are affected by each of the specified events.
    */
  def describeEntityAggregates(): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  def describeEntityAggregates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityAggregatesResponse, Unit]): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of entities that are affected by each of the specified events.
    */
  def describeEntityAggregates(params: DescribeEntityAggregatesRequest): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  def describeEntityAggregates(
    params: DescribeEntityAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityAggregatesResponse, Unit]
  ): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventAggregates(): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  def describeEventAggregates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventAggregatesResponse, Unit]): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventAggregates(params: DescribeEventAggregatesRequest): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  def describeEventAggregates(
    params: DescribeEventAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventAggregatesResponse, Unit]
  ): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (Amazon Web Services Region, service, and so on, as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included. To retrieve the entities, use the DescribeAffectedEntities operation. If a specified event can't be retrieved, an error message is returned for that event.  This operation supports resource-level permissions. You can use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide. 
    */
  def describeEventDetails(): Request[DescribeEventDetailsResponse, AWSError] = js.native
  def describeEventDetails(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsResponse, Unit]): Request[DescribeEventDetailsResponse, AWSError] = js.native
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (Amazon Web Services Region, service, and so on, as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included. To retrieve the entities, use the DescribeAffectedEntities operation. If a specified event can't be retrieved, an error message is returned for that event.  This operation supports resource-level permissions. You can use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide. 
    */
  def describeEventDetails(params: DescribeEventDetailsRequest): Request[DescribeEventDetailsResponse, AWSError] = js.native
  def describeEventDetails(
    params: DescribeEventDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsResponse, Unit]
  ): Request[DescribeEventDetailsResponse, AWSError] = js.native
  
  /**
    * Returns detailed information about one or more specified events for one or more Amazon Web Services accounts in your organization. This information includes standard event data (such as the Amazon Web Services Region and service), an event description, and (depending on the event) possible metadata. This operation doesn't return affected entities, such as the resources related to the event. To return affected entities, use the DescribeAffectedEntitiesForOrganization operation.  Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.  When you call the DescribeEventDetailsForOrganization operation, specify the organizationEventDetailFilters object in the request. Depending on the Health event type, note the following differences:   To return event details for a public event, you must specify a null value for the awsAccountId parameter. If you specify an account ID for a public event, Health returns an error message because public events aren't specific to an account.   To return event details for an event that is specific to an account in your organization, you must specify the awsAccountId parameter in the request. If you don't specify an account ID, Health returns an error message because the event is specific to an account in your organization.    For more information, see Event.  This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide. 
    */
  def describeEventDetailsForOrganization(): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  def describeEventDetailsForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsForOrganizationResponse, Unit]
  ): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  /**
    * Returns detailed information about one or more specified events for one or more Amazon Web Services accounts in your organization. This information includes standard event data (such as the Amazon Web Services Region and service), an event description, and (depending on the event) possible metadata. This operation doesn't return affected entities, such as the resources related to the event. To return affected entities, use the DescribeAffectedEntitiesForOrganization operation.  Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.  When you call the DescribeEventDetailsForOrganization operation, specify the organizationEventDetailFilters object in the request. Depending on the Health event type, note the following differences:   To return event details for a public event, you must specify a null value for the awsAccountId parameter. If you specify an account ID for a public event, Health returns an error message because public events aren't specific to an account.   To return event details for an event that is specific to an account in your organization, you must specify the awsAccountId parameter in the request. If you don't specify an account ID, Health returns an error message because the event is specific to an account in your organization.    For more information, see Event.  This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access to specific Health events. For more information, see Resource- and action-based conditions in the Health User Guide. 
    */
  def describeEventDetailsForOrganization(params: DescribeEventDetailsForOrganizationRequest): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  def describeEventDetailsForOrganization(
    params: DescribeEventDetailsForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsForOrganizationResponse, Unit]
  ): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns the event types that meet the specified filter criteria. You can use this API operation to find information about the Health event, such as the category, Amazon Web Service, and event code. The metadata for each event appears in the EventType object.  If you don't specify a filter criteria, the API operation returns all event types, in no particular order.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventTypes(): Request[DescribeEventTypesResponse, AWSError] = js.native
  def describeEventTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTypesResponse, Unit]): Request[DescribeEventTypesResponse, AWSError] = js.native
  /**
    * Returns the event types that meet the specified filter criteria. You can use this API operation to find information about the Health event, such as the category, Amazon Web Service, and event code. The metadata for each event appears in the EventType object.  If you don't specify a filter criteria, the API operation returns all event types, in no particular order.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventTypes(params: DescribeEventTypesRequest): Request[DescribeEventTypesResponse, AWSError] = js.native
  def describeEventTypes(
    params: DescribeEventTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTypesResponse, Unit]
  ): Request[DescribeEventTypesResponse, AWSError] = js.native
  
  /**
    *  Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent event.    When you call the DescribeEvents operation and specify an entity for the entityValues parameter, Health might return public events that aren't specific to that resource. For example, if you call DescribeEvents and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, Health might return events that aren't specific to that resource or service. To get events that are specific to a service, use the services parameter in the filter object. For more information, see Event.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    *  Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent event.    When you call the DescribeEvents operation and specify an entity for the entityValues parameter, Health might return public events that aren't specific to that resource. For example, if you call DescribeEvents and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, Health might return events that aren't specific to that resource or service. To get events that are specific to a service, use the services parameter in the filter object. For more information, see Event.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   
    */
  def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
  
  /**
    * Returns information about events across your organization in Organizations. You can use thefilters parameter to specify the events that you want to return. Events are returned in a summary form and don't include the affected accounts, detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the following operations:    DescribeAffectedAccountsForOrganization     DescribeEventDetailsForOrganization     DescribeAffectedEntitiesForOrganization    If you don't specify a filter, the DescribeEventsForOrganizations returns all events across your organization. Results are sorted by lastModifiedTime, starting with the most recent event.  For more information about the different types of Health events, see Event. Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventsForOrganization(): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  def describeEventsForOrganization(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsForOrganizationResponse, Unit]): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  /**
    * Returns information about events across your organization in Organizations. You can use thefilters parameter to specify the events that you want to return. Events are returned in a summary form and don't include the affected accounts, detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the following operations:    DescribeAffectedAccountsForOrganization     DescribeEventDetailsForOrganization     DescribeAffectedEntitiesForOrganization    If you don't specify a filter, the DescribeEventsForOrganizations returns all events across your organization. Results are sorted by lastModifiedTime, starting with the most recent event.  For more information about the different types of Health events, see Event. Before you can call this operation, you must first enable Health to work with Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's management account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventsForOrganization(params: DescribeEventsForOrganizationRequest): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  def describeEventsForOrganization(
    params: DescribeEventsForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsForOrganizationResponse, Unit]
  ): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  
  /**
    * This operation provides status information on enabling or disabling Health to work with your organization. To call this operation, you must use the organization's management account.
    */
  def describeHealthServiceStatusForOrganization(): Request[DescribeHealthServiceStatusForOrganizationResponse, AWSError] = js.native
  def describeHealthServiceStatusForOrganization(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeHealthServiceStatusForOrganizationResponse, 
      Unit
    ]
  ): Request[DescribeHealthServiceStatusForOrganizationResponse, AWSError] = js.native
  
  /**
    * Disables Health from working with Organizations. To call this operation, you must sign in to the organization's management account. For more information, see Aggregating Health events in the Health User Guide. This operation doesn't remove the service-linked role from the management account in your organization. You must use the IAM console, API, or Command Line Interface (CLI) to remove the service-linked role. For more information, see Deleting a Service-Linked Role in the IAM User Guide.  You can also disable the organizational feature by using the Organizations DisableAWSServiceAccess API operation. After you call this operation, Health stops aggregating events for all other Amazon Web Services accounts in your organization. If you call the Health API operations for organizational view, Health returns an error. Health continues to aggregate health events for your Amazon Web Services account. 
    */
  def disableHealthServiceAccessForOrganization(): Request[js.Object, AWSError] = js.native
  def disableHealthServiceAccessForOrganization(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables Health to work with Organizations. You can use the organizational view feature to aggregate events from all Amazon Web Services accounts in your organization in a centralized location.  This operation also creates a service-linked role for the management account in the organization.   To call this operation, you must meet the following requirements:   You must have a Business, Enterprise On-Ramp, or Enterprise Support plan from Amazon Web Services Support to use the Health API. If you call the Health API from an Amazon Web Services account that doesn't have a Business, Enterprise On-Ramp, or Enterprise Support plan, you receive a SubscriptionRequiredException error.   You must have permission to call this operation from the organization's management account. For example IAM policies, see Health identity-based policy examples.    If you don't have the required support plan, you can instead use the Health console to enable the organizational view feature. For more information, see Aggregating Health events in the Health User Guide.
    */
  def enableHealthServiceAccessForOrganization(): Request[js.Object, AWSError] = js.native
  def enableHealthServiceAccessForOrganization(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}
