package typings.awsSdk.clientsCloudtrailMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudTrail extends Service {
  
  /**
    * Adds one or more tags to a trail or event data store, up to a limit of 50. Overwrites an existing tag's value when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have two keys with the same name but different values. If you specify a key without a value, the tag will be created with the specified key and a value of null. You can tag a trail or event data store that applies to all Amazon Web Services Regions only from the Region in which the trail or event data store was created (also known as its home region).
    */
  def addTags(): Request[AddTagsResponse, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsResponse, Unit]): Request[AddTagsResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a trail or event data store, up to a limit of 50. Overwrites an existing tag's value when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have two keys with the same name but different values. If you specify a key without a value, the tag will be created with the specified key and a value of null. You can tag a trail or event data store that applies to all Amazon Web Services Regions only from the Region in which the trail or event data store was created (also known as its home region).
    */
  def addTags(params: AddTagsRequest): Request[AddTagsResponse, AWSError] = js.native
  def addTags(
    params: AddTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsResponse, Unit]
  ): Request[AddTagsResponse, AWSError] = js.native
  
  /**
    * Cancels a query if the query is not in a terminated state, such as CANCELLED, FAILED, TIMED_OUT, or FINISHED. You must specify an ARN value for EventDataStore. The ID of the query that you want to cancel is also required. When you run CancelQuery, the query status might show as CANCELLED even if the operation is not yet finished.
    */
  def cancelQuery(): Request[CancelQueryResponse, AWSError] = js.native
  def cancelQuery(callback: js.Function2[/* err */ AWSError, /* data */ CancelQueryResponse, Unit]): Request[CancelQueryResponse, AWSError] = js.native
  /**
    * Cancels a query if the query is not in a terminated state, such as CANCELLED, FAILED, TIMED_OUT, or FINISHED. You must specify an ARN value for EventDataStore. The ID of the query that you want to cancel is also required. When you run CancelQuery, the query status might show as CANCELLED even if the operation is not yet finished.
    */
  def cancelQuery(params: CancelQueryRequest): Request[CancelQueryResponse, AWSError] = js.native
  def cancelQuery(
    params: CancelQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelQueryResponse, Unit]
  ): Request[CancelQueryResponse, AWSError] = js.native
  
  @JSName("config")
  var config_CloudTrail: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new event data store.
    */
  def createEventDataStore(): Request[CreateEventDataStoreResponse, AWSError] = js.native
  def createEventDataStore(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventDataStoreResponse, Unit]): Request[CreateEventDataStoreResponse, AWSError] = js.native
  /**
    * Creates a new event data store.
    */
  def createEventDataStore(params: CreateEventDataStoreRequest): Request[CreateEventDataStoreResponse, AWSError] = js.native
  def createEventDataStore(
    params: CreateEventDataStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventDataStoreResponse, Unit]
  ): Request[CreateEventDataStoreResponse, AWSError] = js.native
  
  /**
    * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. 
    */
  def createTrail(): Request[CreateTrailResponse, AWSError] = js.native
  def createTrail(callback: js.Function2[/* err */ AWSError, /* data */ CreateTrailResponse, Unit]): Request[CreateTrailResponse, AWSError] = js.native
  /**
    * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. 
    */
  def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse, AWSError] = js.native
  def createTrail(
    params: CreateTrailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrailResponse, Unit]
  ): Request[CreateTrailResponse, AWSError] = js.native
  
  /**
    * Disables the event data store specified by EventDataStore, which accepts an event data store ARN. After you run DeleteEventDataStore, the event data store enters a PENDING_DELETION state, and is automatically deleted after a wait period of seven days. TerminationProtectionEnabled must be set to False on the event data store; this operation cannot work if TerminationProtectionEnabled is True. After you run DeleteEventDataStore on an event data store, you cannot run ListQueries, DescribeQuery, or GetQueryResults on queries that are using an event data store in a PENDING_DELETION state. An event data store in the PENDING_DELETION state does not incur costs.
    */
  def deleteEventDataStore(): Request[DeleteEventDataStoreResponse, AWSError] = js.native
  def deleteEventDataStore(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventDataStoreResponse, Unit]): Request[DeleteEventDataStoreResponse, AWSError] = js.native
  /**
    * Disables the event data store specified by EventDataStore, which accepts an event data store ARN. After you run DeleteEventDataStore, the event data store enters a PENDING_DELETION state, and is automatically deleted after a wait period of seven days. TerminationProtectionEnabled must be set to False on the event data store; this operation cannot work if TerminationProtectionEnabled is True. After you run DeleteEventDataStore on an event data store, you cannot run ListQueries, DescribeQuery, or GetQueryResults on queries that are using an event data store in a PENDING_DELETION state. An event data store in the PENDING_DELETION state does not incur costs.
    */
  def deleteEventDataStore(params: DeleteEventDataStoreRequest): Request[DeleteEventDataStoreResponse, AWSError] = js.native
  def deleteEventDataStore(
    params: DeleteEventDataStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventDataStoreResponse, Unit]
  ): Request[DeleteEventDataStoreResponse, AWSError] = js.native
  
  /**
    * Deletes a trail. This operation must be called from the region in which the trail was created. DeleteTrail cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
    */
  def deleteTrail(): Request[DeleteTrailResponse, AWSError] = js.native
  def deleteTrail(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrailResponse, Unit]): Request[DeleteTrailResponse, AWSError] = js.native
  /**
    * Deletes a trail. This operation must be called from the region in which the trail was created. DeleteTrail cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
    */
  def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse, AWSError] = js.native
  def deleteTrail(
    params: DeleteTrailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrailResponse, Unit]
  ): Request[DeleteTrailResponse, AWSError] = js.native
  
  /**
    * Returns metadata about a query, including query run time in milliseconds, number of events scanned and matched, and query status. You must specify an ARN for EventDataStore, and a value for QueryID.
    */
  def describeQuery(): Request[DescribeQueryResponse, AWSError] = js.native
  def describeQuery(callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueryResponse, Unit]): Request[DescribeQueryResponse, AWSError] = js.native
  /**
    * Returns metadata about a query, including query run time in milliseconds, number of events scanned and matched, and query status. You must specify an ARN for EventDataStore, and a value for QueryID.
    */
  def describeQuery(params: DescribeQueryRequest): Request[DescribeQueryResponse, AWSError] = js.native
  def describeQuery(
    params: DescribeQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueryResponse, Unit]
  ): Request[DescribeQueryResponse, AWSError] = js.native
  
  /**
    * Retrieves settings for one or more trails associated with the current region for your account.
    */
  def describeTrails(): Request[DescribeTrailsResponse, AWSError] = js.native
  def describeTrails(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrailsResponse, Unit]): Request[DescribeTrailsResponse, AWSError] = js.native
  /**
    * Retrieves settings for one or more trails associated with the current region for your account.
    */
  def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse, AWSError] = js.native
  def describeTrails(
    params: DescribeTrailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrailsResponse, Unit]
  ): Request[DescribeTrailsResponse, AWSError] = js.native
  
  /**
    *  Returns the specified CloudTrail service-linked channel. Amazon Web Services services create service-linked channels to view CloudTrail events. 
    */
  def getChannel(): Request[GetChannelResponse, AWSError] = js.native
  def getChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelResponse, Unit]): Request[GetChannelResponse, AWSError] = js.native
  /**
    *  Returns the specified CloudTrail service-linked channel. Amazon Web Services services create service-linked channels to view CloudTrail events. 
    */
  def getChannel(params: GetChannelRequest): Request[GetChannelResponse, AWSError] = js.native
  def getChannel(
    params: GetChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelResponse, Unit]
  ): Request[GetChannelResponse, AWSError] = js.native
  
  /**
    * Returns information about an event data store specified as either an ARN or the ID portion of the ARN.
    */
  def getEventDataStore(): Request[GetEventDataStoreResponse, AWSError] = js.native
  def getEventDataStore(callback: js.Function2[/* err */ AWSError, /* data */ GetEventDataStoreResponse, Unit]): Request[GetEventDataStoreResponse, AWSError] = js.native
  /**
    * Returns information about an event data store specified as either an ARN or the ID portion of the ARN.
    */
  def getEventDataStore(params: GetEventDataStoreRequest): Request[GetEventDataStoreResponse, AWSError] = js.native
  def getEventDataStore(
    params: GetEventDataStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventDataStoreResponse, Unit]
  ): Request[GetEventDataStoreResponse, AWSError] = js.native
  
  /**
    * Describes the settings for the event selectors that you configured for your trail. The information returned for your event selectors includes the following:   If your event selector includes read-only events, write-only events, or all events. This applies to both management events and data events.   If your event selector includes management events.   If your event selector includes data events, the resources on which you are logging data events.   For more information about logging management and data events, see the following topics in the CloudTrail User Guide:    Logging management events for trails      Logging data events for trails    
    */
  def getEventSelectors(): Request[GetEventSelectorsResponse, AWSError] = js.native
  def getEventSelectors(callback: js.Function2[/* err */ AWSError, /* data */ GetEventSelectorsResponse, Unit]): Request[GetEventSelectorsResponse, AWSError] = js.native
  /**
    * Describes the settings for the event selectors that you configured for your trail. The information returned for your event selectors includes the following:   If your event selector includes read-only events, write-only events, or all events. This applies to both management events and data events.   If your event selector includes management events.   If your event selector includes data events, the resources on which you are logging data events.   For more information about logging management and data events, see the following topics in the CloudTrail User Guide:    Logging management events for trails      Logging data events for trails    
    */
  def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse, AWSError] = js.native
  def getEventSelectors(
    params: GetEventSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventSelectorsResponse, Unit]
  ): Request[GetEventSelectorsResponse, AWSError] = js.native
  
  /**
    *  Returns information for the specified import. 
    */
  def getImport(): Request[GetImportResponse, AWSError] = js.native
  def getImport(callback: js.Function2[/* err */ AWSError, /* data */ GetImportResponse, Unit]): Request[GetImportResponse, AWSError] = js.native
  /**
    *  Returns information for the specified import. 
    */
  def getImport(params: GetImportRequest): Request[GetImportResponse, AWSError] = js.native
  def getImport(
    params: GetImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImportResponse, Unit]
  ): Request[GetImportResponse, AWSError] = js.native
  
  /**
    * Describes the settings for the Insights event selectors that you configured for your trail. GetInsightSelectors shows if CloudTrail Insights event logging is enabled on the trail, and if it is, which insight types are enabled. If you run GetInsightSelectors on a trail that does not have Insights events enabled, the operation throws the exception InsightNotEnabledException  For more information, see Logging CloudTrail Insights Events for Trails  in the CloudTrail User Guide.
    */
  def getInsightSelectors(): Request[GetInsightSelectorsResponse, AWSError] = js.native
  def getInsightSelectors(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightSelectorsResponse, Unit]): Request[GetInsightSelectorsResponse, AWSError] = js.native
  /**
    * Describes the settings for the Insights event selectors that you configured for your trail. GetInsightSelectors shows if CloudTrail Insights event logging is enabled on the trail, and if it is, which insight types are enabled. If you run GetInsightSelectors on a trail that does not have Insights events enabled, the operation throws the exception InsightNotEnabledException  For more information, see Logging CloudTrail Insights Events for Trails  in the CloudTrail User Guide.
    */
  def getInsightSelectors(params: GetInsightSelectorsRequest): Request[GetInsightSelectorsResponse, AWSError] = js.native
  def getInsightSelectors(
    params: GetInsightSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightSelectorsResponse, Unit]
  ): Request[GetInsightSelectorsResponse, AWSError] = js.native
  
  /**
    * Gets event data results of a query. You must specify the QueryID value returned by the StartQuery operation, and an ARN for EventDataStore.
    */
  def getQueryResults(): Request[GetQueryResultsResponse, AWSError] = js.native
  def getQueryResults(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsResponse, Unit]): Request[GetQueryResultsResponse, AWSError] = js.native
  /**
    * Gets event data results of a query. You must specify the QueryID value returned by the StartQuery operation, and an ARN for EventDataStore.
    */
  def getQueryResults(params: GetQueryResultsRequest): Request[GetQueryResultsResponse, AWSError] = js.native
  def getQueryResults(
    params: GetQueryResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsResponse, Unit]
  ): Request[GetQueryResultsResponse, AWSError] = js.native
  
  /**
    * Returns settings information for a specified trail.
    */
  def getTrail(): Request[GetTrailResponse, AWSError] = js.native
  def getTrail(callback: js.Function2[/* err */ AWSError, /* data */ GetTrailResponse, Unit]): Request[GetTrailResponse, AWSError] = js.native
  /**
    * Returns settings information for a specified trail.
    */
  def getTrail(params: GetTrailRequest): Request[GetTrailResponse, AWSError] = js.native
  def getTrail(
    params: GetTrailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrailResponse, Unit]
  ): Request[GetTrailResponse, AWSError] = js.native
  
  /**
    * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns trail status from a single region. To return trail status from all regions, you must call the operation on each region.
    */
  def getTrailStatus(): Request[GetTrailStatusResponse, AWSError] = js.native
  def getTrailStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetTrailStatusResponse, Unit]): Request[GetTrailStatusResponse, AWSError] = js.native
  /**
    * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns trail status from a single region. To return trail status from all regions, you must call the operation on each region.
    */
  def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse, AWSError] = js.native
  def getTrailStatus(
    params: GetTrailStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrailStatusResponse, Unit]
  ): Request[GetTrailStatusResponse, AWSError] = js.native
  
  /**
    *  Returns all CloudTrail channels. 
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    *  Returns all CloudTrail channels. 
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  
  /**
    * Returns information about all event data stores in the account, in the current region.
    */
  def listEventDataStores(): Request[ListEventDataStoresResponse, AWSError] = js.native
  def listEventDataStores(callback: js.Function2[/* err */ AWSError, /* data */ ListEventDataStoresResponse, Unit]): Request[ListEventDataStoresResponse, AWSError] = js.native
  /**
    * Returns information about all event data stores in the account, in the current region.
    */
  def listEventDataStores(params: ListEventDataStoresRequest): Request[ListEventDataStoresResponse, AWSError] = js.native
  def listEventDataStores(
    params: ListEventDataStoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventDataStoresResponse, Unit]
  ): Request[ListEventDataStoresResponse, AWSError] = js.native
  
  /**
    *  Returns a list of failures for the specified import. 
    */
  def listImportFailures(): Request[ListImportFailuresResponse, AWSError] = js.native
  def listImportFailures(callback: js.Function2[/* err */ AWSError, /* data */ ListImportFailuresResponse, Unit]): Request[ListImportFailuresResponse, AWSError] = js.native
  /**
    *  Returns a list of failures for the specified import. 
    */
  def listImportFailures(params: ListImportFailuresRequest): Request[ListImportFailuresResponse, AWSError] = js.native
  def listImportFailures(
    params: ListImportFailuresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImportFailuresResponse, Unit]
  ): Request[ListImportFailuresResponse, AWSError] = js.native
  
  /**
    *  Returns information on all imports, or a select set of imports by ImportStatus or Destination. 
    */
  def listImports(): Request[ListImportsResponse, AWSError] = js.native
  def listImports(callback: js.Function2[/* err */ AWSError, /* data */ ListImportsResponse, Unit]): Request[ListImportsResponse, AWSError] = js.native
  /**
    *  Returns information on all imports, or a select set of imports by ImportStatus or Destination. 
    */
  def listImports(params: ListImportsRequest): Request[ListImportsResponse, AWSError] = js.native
  def listImports(
    params: ListImportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImportsResponse, Unit]
  ): Request[ListImportsResponse, AWSError] = js.native
  
  /**
    * Returns all public keys whose private keys were used to sign the digest files within the specified time range. The public key is needed to validate digest files that were signed with its corresponding private key.  CloudTrail uses different private and public key pairs per region. Each digest file is signed with a private key unique to its region. When you validate a digest file from a specific region, you must look in the same region for its corresponding public key. 
    */
  def listPublicKeys(): Request[ListPublicKeysResponse, AWSError] = js.native
  def listPublicKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListPublicKeysResponse, Unit]): Request[ListPublicKeysResponse, AWSError] = js.native
  /**
    * Returns all public keys whose private keys were used to sign the digest files within the specified time range. The public key is needed to validate digest files that were signed with its corresponding private key.  CloudTrail uses different private and public key pairs per region. Each digest file is signed with a private key unique to its region. When you validate a digest file from a specific region, you must look in the same region for its corresponding public key. 
    */
  def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse, AWSError] = js.native
  def listPublicKeys(
    params: ListPublicKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPublicKeysResponse, Unit]
  ): Request[ListPublicKeysResponse, AWSError] = js.native
  
  /**
    * Returns a list of queries and query statuses for the past seven days. You must specify an ARN value for EventDataStore. Optionally, to shorten the list of results, you can specify a time range, formatted as timestamps, by adding StartTime and EndTime parameters, and a QueryStatus value. Valid values for QueryStatus include QUEUED, RUNNING, FINISHED, FAILED, TIMED_OUT, or CANCELLED.
    */
  def listQueries(): Request[ListQueriesResponse, AWSError] = js.native
  def listQueries(callback: js.Function2[/* err */ AWSError, /* data */ ListQueriesResponse, Unit]): Request[ListQueriesResponse, AWSError] = js.native
  /**
    * Returns a list of queries and query statuses for the past seven days. You must specify an ARN value for EventDataStore. Optionally, to shorten the list of results, you can specify a time range, formatted as timestamps, by adding StartTime and EndTime parameters, and a QueryStatus value. Valid values for QueryStatus include QUEUED, RUNNING, FINISHED, FAILED, TIMED_OUT, or CANCELLED.
    */
  def listQueries(params: ListQueriesRequest): Request[ListQueriesResponse, AWSError] = js.native
  def listQueries(
    params: ListQueriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueriesResponse, Unit]
  ): Request[ListQueriesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the trail or event data store in the current region.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Lists the tags for the trail or event data store in the current region.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Lists trails that are in the current account.
    */
  def listTrails(): Request[ListTrailsResponse, AWSError] = js.native
  def listTrails(callback: js.Function2[/* err */ AWSError, /* data */ ListTrailsResponse, Unit]): Request[ListTrailsResponse, AWSError] = js.native
  /**
    * Lists trails that are in the current account.
    */
  def listTrails(params: ListTrailsRequest): Request[ListTrailsResponse, AWSError] = js.native
  def listTrails(
    params: ListTrailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrailsResponse, Unit]
  ): Request[ListTrailsResponse, AWSError] = js.native
  
  /**
    * Looks up management events or CloudTrail Insights events that are captured by CloudTrail. You can look up events that occurred in a region within the last 90 days. Lookup supports the following attributes for management events:   Amazon Web Services access key   Event ID   Event name   Event source   Read only   Resource name   Resource type   User name   Lookup supports the following attributes for Insights events:   Event ID   Event name   Event source   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The response includes a token that you can use to get the next page of results.  The rate of lookup requests is limited to two per second, per account, per region. If this limit is exceeded, a throttling error occurs. 
    */
  def lookupEvents(): Request[LookupEventsResponse, AWSError] = js.native
  def lookupEvents(callback: js.Function2[/* err */ AWSError, /* data */ LookupEventsResponse, Unit]): Request[LookupEventsResponse, AWSError] = js.native
  /**
    * Looks up management events or CloudTrail Insights events that are captured by CloudTrail. You can look up events that occurred in a region within the last 90 days. Lookup supports the following attributes for management events:   Amazon Web Services access key   Event ID   Event name   Event source   Read only   Resource name   Resource type   User name   Lookup supports the following attributes for Insights events:   Event ID   Event name   Event source   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The response includes a token that you can use to get the next page of results.  The rate of lookup requests is limited to two per second, per account, per region. If this limit is exceeded, a throttling error occurs. 
    */
  def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse, AWSError] = js.native
  def lookupEvents(
    params: LookupEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LookupEventsResponse, Unit]
  ): Request[LookupEventsResponse, AWSError] = js.native
  
  /**
    * Configures an event selector or advanced event selectors for your trail. Use event selectors or advanced event selectors to specify management and data event settings for your trail. By default, trails created without specific event selectors are configured to log all read and write management events, and no data events. When an event occurs in your account, CloudTrail evaluates the event selectors or advanced event selectors in all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event. Example   You create an event selector for a trail and specify that you want write-only events.   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.   CloudTrail evaluates whether the events match your event selectors.   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.   The GetConsoleOutput is a read-only event that doesn't match your event selector. The trail doesn't log the event.    The PutEventSelectors operation must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException exception is thrown. You can configure up to five event selectors for each trail. For more information, see Logging management events for trails , Logging data events for trails , and Quotas in CloudTrail in the CloudTrail User Guide. You can add advanced event selectors, and conditions for your advanced event selectors, up to a maximum of 500 values for all conditions and selectors on a trail. You can use either AdvancedEventSelectors or EventSelectors, but not both. If you apply AdvancedEventSelectors to a trail, any existing EventSelectors are overwritten. For more information about advanced event selectors, see Logging data events for trails in the CloudTrail User Guide.
    */
  def putEventSelectors(): Request[PutEventSelectorsResponse, AWSError] = js.native
  def putEventSelectors(callback: js.Function2[/* err */ AWSError, /* data */ PutEventSelectorsResponse, Unit]): Request[PutEventSelectorsResponse, AWSError] = js.native
  /**
    * Configures an event selector or advanced event selectors for your trail. Use event selectors or advanced event selectors to specify management and data event settings for your trail. By default, trails created without specific event selectors are configured to log all read and write management events, and no data events. When an event occurs in your account, CloudTrail evaluates the event selectors or advanced event selectors in all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event. Example   You create an event selector for a trail and specify that you want write-only events.   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.   CloudTrail evaluates whether the events match your event selectors.   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.   The GetConsoleOutput is a read-only event that doesn't match your event selector. The trail doesn't log the event.    The PutEventSelectors operation must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException exception is thrown. You can configure up to five event selectors for each trail. For more information, see Logging management events for trails , Logging data events for trails , and Quotas in CloudTrail in the CloudTrail User Guide. You can add advanced event selectors, and conditions for your advanced event selectors, up to a maximum of 500 values for all conditions and selectors on a trail. You can use either AdvancedEventSelectors or EventSelectors, but not both. If you apply AdvancedEventSelectors to a trail, any existing EventSelectors are overwritten. For more information about advanced event selectors, see Logging data events for trails in the CloudTrail User Guide.
    */
  def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse, AWSError] = js.native
  def putEventSelectors(
    params: PutEventSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventSelectorsResponse, Unit]
  ): Request[PutEventSelectorsResponse, AWSError] = js.native
  
  /**
    * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an existing trail. You also use PutInsightSelectors to turn off Insights event logging, by passing an empty list of insight types. The valid Insights event types in this release are ApiErrorRateInsight and ApiCallRateInsight.
    */
  def putInsightSelectors(): Request[PutInsightSelectorsResponse, AWSError] = js.native
  def putInsightSelectors(callback: js.Function2[/* err */ AWSError, /* data */ PutInsightSelectorsResponse, Unit]): Request[PutInsightSelectorsResponse, AWSError] = js.native
  /**
    * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an existing trail. You also use PutInsightSelectors to turn off Insights event logging, by passing an empty list of insight types. The valid Insights event types in this release are ApiErrorRateInsight and ApiCallRateInsight.
    */
  def putInsightSelectors(params: PutInsightSelectorsRequest): Request[PutInsightSelectorsResponse, AWSError] = js.native
  def putInsightSelectors(
    params: PutInsightSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInsightSelectorsResponse, Unit]
  ): Request[PutInsightSelectorsResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from a trail or event data store.
    */
  def removeTags(): Request[RemoveTagsResponse, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsResponse, Unit]): Request[RemoveTagsResponse, AWSError] = js.native
  /**
    * Removes the specified tags from a trail or event data store.
    */
  def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse, AWSError] = js.native
  def removeTags(
    params: RemoveTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsResponse, Unit]
  ): Request[RemoveTagsResponse, AWSError] = js.native
  
  /**
    * Restores a deleted event data store specified by EventDataStore, which accepts an event data store ARN. You can only restore a deleted event data store within the seven-day wait period after deletion. Restoring an event data store can take several minutes, depending on the size of the event data store.
    */
  def restoreEventDataStore(): Request[RestoreEventDataStoreResponse, AWSError] = js.native
  def restoreEventDataStore(callback: js.Function2[/* err */ AWSError, /* data */ RestoreEventDataStoreResponse, Unit]): Request[RestoreEventDataStoreResponse, AWSError] = js.native
  /**
    * Restores a deleted event data store specified by EventDataStore, which accepts an event data store ARN. You can only restore a deleted event data store within the seven-day wait period after deletion. Restoring an event data store can take several minutes, depending on the size of the event data store.
    */
  def restoreEventDataStore(params: RestoreEventDataStoreRequest): Request[RestoreEventDataStoreResponse, AWSError] = js.native
  def restoreEventDataStore(
    params: RestoreEventDataStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreEventDataStoreResponse, Unit]
  ): Request[RestoreEventDataStoreResponse, AWSError] = js.native
  
  /**
    *  Starts an import of logged trail events from a source S3 bucket to a destination event data store.   When you start a new import, the Destinations and ImportSource parameters are required. Before starting a new import, disable any access control lists (ACLs) attached to the source S3 bucket. For more information about disabling ACLs, see Controlling ownership of objects and disabling ACLs for your bucket.   When you retry an import, the ImportID parameter is required. 
    */
  def startImport(): Request[StartImportResponse, AWSError] = js.native
  def startImport(callback: js.Function2[/* err */ AWSError, /* data */ StartImportResponse, Unit]): Request[StartImportResponse, AWSError] = js.native
  /**
    *  Starts an import of logged trail events from a source S3 bucket to a destination event data store.   When you start a new import, the Destinations and ImportSource parameters are required. Before starting a new import, disable any access control lists (ACLs) attached to the source S3 bucket. For more information about disabling ACLs, see Controlling ownership of objects and disabling ACLs for your bucket.   When you retry an import, the ImportID parameter is required. 
    */
  def startImport(params: StartImportRequest): Request[StartImportResponse, AWSError] = js.native
  def startImport(
    params: StartImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImportResponse, Unit]
  ): Request[StartImportResponse, AWSError] = js.native
  
  /**
    * Starts the recording of Amazon Web Services API calls and log file delivery for a trail. For a trail that is enabled in all regions, this operation must be called from the region in which the trail was created. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
    */
  def startLogging(): Request[StartLoggingResponse, AWSError] = js.native
  def startLogging(callback: js.Function2[/* err */ AWSError, /* data */ StartLoggingResponse, Unit]): Request[StartLoggingResponse, AWSError] = js.native
  /**
    * Starts the recording of Amazon Web Services API calls and log file delivery for a trail. For a trail that is enabled in all regions, this operation must be called from the region in which the trail was created. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
    */
  def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse, AWSError] = js.native
  def startLogging(
    params: StartLoggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartLoggingResponse, Unit]
  ): Request[StartLoggingResponse, AWSError] = js.native
  
  /**
    * Starts a CloudTrail Lake query. The required QueryStatement parameter provides your SQL query, enclosed in single quotation marks.
    */
  def startQuery(): Request[StartQueryResponse, AWSError] = js.native
  def startQuery(callback: js.Function2[/* err */ AWSError, /* data */ StartQueryResponse, Unit]): Request[StartQueryResponse, AWSError] = js.native
  /**
    * Starts a CloudTrail Lake query. The required QueryStatement parameter provides your SQL query, enclosed in single quotation marks.
    */
  def startQuery(params: StartQueryRequest): Request[StartQueryResponse, AWSError] = js.native
  def startQuery(
    params: StartQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartQueryResponse, Unit]
  ): Request[StartQueryResponse, AWSError] = js.native
  
  /**
    *  Stops a specified import. 
    */
  def stopImport(): Request[StopImportResponse, AWSError] = js.native
  def stopImport(callback: js.Function2[/* err */ AWSError, /* data */ StopImportResponse, Unit]): Request[StopImportResponse, AWSError] = js.native
  /**
    *  Stops a specified import. 
    */
  def stopImport(params: StopImportRequest): Request[StopImportResponse, AWSError] = js.native
  def stopImport(
    params: StopImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopImportResponse, Unit]
  ): Request[StopImportResponse, AWSError] = js.native
  
  /**
    * Suspends the recording of Amazon Web Services API calls and log file delivery for the specified trail. Under most circumstances, there is no need to use this action. You can update a trail without stopping it first. This action is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
    */
  def stopLogging(): Request[StopLoggingResponse, AWSError] = js.native
  def stopLogging(callback: js.Function2[/* err */ AWSError, /* data */ StopLoggingResponse, Unit]): Request[StopLoggingResponse, AWSError] = js.native
  /**
    * Suspends the recording of Amazon Web Services API calls and log file delivery for the specified trail. Under most circumstances, there is no need to use this action. You can update a trail without stopping it first. This action is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
    */
  def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse, AWSError] = js.native
  def stopLogging(
    params: StopLoggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopLoggingResponse, Unit]
  ): Request[StopLoggingResponse, AWSError] = js.native
  
  /**
    * Updates an event data store. The required EventDataStore value is an ARN or the ID portion of the ARN. Other parameters are optional, but at least one optional parameter must be specified, or CloudTrail throws an error. RetentionPeriod is in days, and valid values are integers between 90 and 2557. By default, TerminationProtection is enabled. AdvancedEventSelectors includes or excludes management and data events in your event data store; for more information about AdvancedEventSelectors, see PutEventSelectorsRequest$AdvancedEventSelectors.
    */
  def updateEventDataStore(): Request[UpdateEventDataStoreResponse, AWSError] = js.native
  def updateEventDataStore(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventDataStoreResponse, Unit]): Request[UpdateEventDataStoreResponse, AWSError] = js.native
  /**
    * Updates an event data store. The required EventDataStore value is an ARN or the ID portion of the ARN. Other parameters are optional, but at least one optional parameter must be specified, or CloudTrail throws an error. RetentionPeriod is in days, and valid values are integers between 90 and 2557. By default, TerminationProtection is enabled. AdvancedEventSelectors includes or excludes management and data events in your event data store; for more information about AdvancedEventSelectors, see PutEventSelectorsRequest$AdvancedEventSelectors.
    */
  def updateEventDataStore(params: UpdateEventDataStoreRequest): Request[UpdateEventDataStoreResponse, AWSError] = js.native
  def updateEventDataStore(
    params: UpdateEventDataStoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventDataStoreResponse, Unit]
  ): Request[UpdateEventDataStoreResponse, AWSError] = js.native
  
  /**
    * Updates trail settings that control what events you are logging, and how to handle log files. Changes to a trail do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown.
    */
  def updateTrail(): Request[UpdateTrailResponse, AWSError] = js.native
  def updateTrail(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrailResponse, Unit]): Request[UpdateTrailResponse, AWSError] = js.native
  /**
    * Updates trail settings that control what events you are logging, and how to handle log files. Changes to a trail do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown.
    */
  def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse, AWSError] = js.native
  def updateTrail(
    params: UpdateTrailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrailResponse, Unit]
  ): Request[UpdateTrailResponse, AWSError] = js.native
}
