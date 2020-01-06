package typings.awsDashSdk.clientsCloudtrailMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudTrail extends Service {
  @JSName("config")
  var config_CloudTrail: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds one or more tags to a trail, up to a limit of 50. Overwrites an existing tag's value when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have two keys with the same name but different values. If you specify a key without a value, the tag will be created with the specified key and a value of null. You can tag a trail that applies to all AWS Regions only from the Region in which the trail was created (also known as its home region).
    */
  def addTags(): Request[AddTagsResponse, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsResponse, Unit]): Request[AddTagsResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a trail, up to a limit of 50. Overwrites an existing tag's value when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have two keys with the same name but different values. If you specify a key without a value, the tag will be created with the specified key and a value of null. You can tag a trail that applies to all AWS Regions only from the Region in which the trail was created (also known as its home region).
    */
  def addTags(params: AddTagsRequest): Request[AddTagsResponse, AWSError] = js.native
  def addTags(
    params: AddTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsResponse, Unit]
  ): Request[AddTagsResponse, AWSError] = js.native
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
    * Describes the settings for the event selectors that you configured for your trail. The information returned for your event selectors includes the following:   If your event selector includes read-only events, write-only events, or all events. This applies to both management events and data events.   If your event selector includes management events.   If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging for data events.   For more information, see Logging Data and Management Events for Trails  in the AWS CloudTrail User Guide.
    */
  def getEventSelectors(): Request[GetEventSelectorsResponse, AWSError] = js.native
  def getEventSelectors(callback: js.Function2[/* err */ AWSError, /* data */ GetEventSelectorsResponse, Unit]): Request[GetEventSelectorsResponse, AWSError] = js.native
  /**
    * Describes the settings for the event selectors that you configured for your trail. The information returned for your event selectors includes the following:   If your event selector includes read-only events, write-only events, or all events. This applies to both management events and data events.   If your event selector includes management events.   If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging for data events.   For more information, see Logging Data and Management Events for Trails  in the AWS CloudTrail User Guide.
    */
  def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse, AWSError] = js.native
  def getEventSelectors(
    params: GetEventSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventSelectorsResponse, Unit]
  ): Request[GetEventSelectorsResponse, AWSError] = js.native
  /**
    * Describes the settings for the Insights event selectors that you configured for your trail. GetInsightSelectors shows if CloudTrail Insights event logging is enabled on the trail, and if it is, which insight types are enabled. If you run GetInsightSelectors on a trail that does not have Insights events enabled, the operation throws the exception InsightNotEnabledException  For more information, see Logging CloudTrail Insights Events for Trails  in the AWS CloudTrail User Guide.
    */
  def getInsightSelectors(): Request[GetInsightSelectorsResponse, AWSError] = js.native
  def getInsightSelectors(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightSelectorsResponse, Unit]): Request[GetInsightSelectorsResponse, AWSError] = js.native
  /**
    * Describes the settings for the Insights event selectors that you configured for your trail. GetInsightSelectors shows if CloudTrail Insights event logging is enabled on the trail, and if it is, which insight types are enabled. If you run GetInsightSelectors on a trail that does not have Insights events enabled, the operation throws the exception InsightNotEnabledException  For more information, see Logging CloudTrail Insights Events for Trails  in the AWS CloudTrail User Guide.
    */
  def getInsightSelectors(params: GetInsightSelectorsRequest): Request[GetInsightSelectorsResponse, AWSError] = js.native
  def getInsightSelectors(
    params: GetInsightSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightSelectorsResponse, Unit]
  ): Request[GetInsightSelectorsResponse, AWSError] = js.native
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
    * Returns all public keys whose private keys were used to sign the digest files within the specified time range. The public key is needed to validate digest files that were signed with its corresponding private key.  CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the same region for its corresponding public key. 
    */
  def listPublicKeys(): Request[ListPublicKeysResponse, AWSError] = js.native
  def listPublicKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListPublicKeysResponse, Unit]): Request[ListPublicKeysResponse, AWSError] = js.native
  /**
    * Returns all public keys whose private keys were used to sign the digest files within the specified time range. The public key is needed to validate digest files that were signed with its corresponding private key.  CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the same region for its corresponding public key. 
    */
  def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse, AWSError] = js.native
  def listPublicKeys(
    params: ListPublicKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPublicKeysResponse, Unit]
  ): Request[ListPublicKeysResponse, AWSError] = js.native
  /**
    * Lists the tags for the trail in the current region.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Lists the tags for the trail in the current region.
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
    * Looks up management events or CloudTrail Insights events that are captured by CloudTrail. You can look up events that occurred in a region within the last 90 days. Lookup supports the following attributes for management events:   AWS access key   Event ID   Event name   Event source   Read only   Resource name   Resource type   User name   Lookup supports the following attributes for Insights events:   Event ID   Event name   Event source   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The response includes a token that you can use to get the next page of results.  The rate of lookup requests is limited to two per second per account. If this limit is exceeded, a throttling error occurs. 
    */
  def lookupEvents(): Request[LookupEventsResponse, AWSError] = js.native
  def lookupEvents(callback: js.Function2[/* err */ AWSError, /* data */ LookupEventsResponse, Unit]): Request[LookupEventsResponse, AWSError] = js.native
  /**
    * Looks up management events or CloudTrail Insights events that are captured by CloudTrail. You can look up events that occurred in a region within the last 90 days. Lookup supports the following attributes for management events:   AWS access key   Event ID   Event name   Event source   Read only   Resource name   Resource type   User name   Lookup supports the following attributes for Insights events:   Event ID   Event name   Event source   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The response includes a token that you can use to get the next page of results.  The rate of lookup requests is limited to two per second per account. If this limit is exceeded, a throttling error occurs. 
    */
  def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse, AWSError] = js.native
  def lookupEvents(
    params: LookupEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LookupEventsResponse, Unit]
  ): Request[LookupEventsResponse, AWSError] = js.native
  /**
    * Configures an event selector for your trail. Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events.  When an event occurs in your account, CloudTrail evaluates the event selectors in all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.  Example   You create an event selector for a trail and specify that you want write-only events.   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.   CloudTrail evaluates whether the events match your event selectors.   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.   The GetConsoleOutput is a read-only event but it doesn't match your event selector. The trail doesn't log the event.    The PutEventSelectors operation must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown. You can configure up to five event selectors for each trail. For more information, see Logging Data and Management Events for Trails  and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
    */
  def putEventSelectors(): Request[PutEventSelectorsResponse, AWSError] = js.native
  def putEventSelectors(callback: js.Function2[/* err */ AWSError, /* data */ PutEventSelectorsResponse, Unit]): Request[PutEventSelectorsResponse, AWSError] = js.native
  /**
    * Configures an event selector for your trail. Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events.  When an event occurs in your account, CloudTrail evaluates the event selectors in all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.  Example   You create an event selector for a trail and specify that you want write-only events.   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.   CloudTrail evaluates whether the events match your event selectors.   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.   The GetConsoleOutput is a read-only event but it doesn't match your event selector. The trail doesn't log the event.    The PutEventSelectors operation must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown. You can configure up to five event selectors for each trail. For more information, see Logging Data and Management Events for Trails  and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
    */
  def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse, AWSError] = js.native
  def putEventSelectors(
    params: PutEventSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventSelectorsResponse, Unit]
  ): Request[PutEventSelectorsResponse, AWSError] = js.native
  /**
    * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an existing trail. You also use PutInsightSelectors to turn off Insights event logging, by passing an empty list of insight types. In this release, only ApiCallRateInsight is supported as an Insights selector.
    */
  def putInsightSelectors(): Request[PutInsightSelectorsResponse, AWSError] = js.native
  def putInsightSelectors(callback: js.Function2[/* err */ AWSError, /* data */ PutInsightSelectorsResponse, Unit]): Request[PutInsightSelectorsResponse, AWSError] = js.native
  /**
    * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an existing trail. You also use PutInsightSelectors to turn off Insights event logging, by passing an empty list of insight types. In this release, only ApiCallRateInsight is supported as an Insights selector.
    */
  def putInsightSelectors(params: PutInsightSelectorsRequest): Request[PutInsightSelectorsResponse, AWSError] = js.native
  def putInsightSelectors(
    params: PutInsightSelectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInsightSelectorsResponse, Unit]
  ): Request[PutInsightSelectorsResponse, AWSError] = js.native
  /**
    * Removes the specified tags from a trail.
    */
  def removeTags(): Request[RemoveTagsResponse, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsResponse, Unit]): Request[RemoveTagsResponse, AWSError] = js.native
  /**
    * Removes the specified tags from a trail.
    */
  def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse, AWSError] = js.native
  def removeTags(
    params: RemoveTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsResponse, Unit]
  ): Request[RemoveTagsResponse, AWSError] = js.native
  /**
    * Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all regions, this operation must be called from the region in which the trail was created. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
    */
  def startLogging(): Request[StartLoggingResponse, AWSError] = js.native
  def startLogging(callback: js.Function2[/* err */ AWSError, /* data */ StartLoggingResponse, Unit]): Request[StartLoggingResponse, AWSError] = js.native
  /**
    * Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all regions, this operation must be called from the region in which the trail was created. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
    */
  def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse, AWSError] = js.native
  def startLogging(
    params: StartLoggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartLoggingResponse, Unit]
  ): Request[StartLoggingResponse, AWSError] = js.native
  /**
    * Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances, there is no need to use this action. You can update a trail without stopping it first. This action is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
    */
  def stopLogging(): Request[StopLoggingResponse, AWSError] = js.native
  def stopLogging(callback: js.Function2[/* err */ AWSError, /* data */ StopLoggingResponse, Unit]): Request[StopLoggingResponse, AWSError] = js.native
  /**
    * Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances, there is no need to use this action. You can update a trail without stopping it first. This action is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
    */
  def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse, AWSError] = js.native
  def stopLogging(
    params: StopLoggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopLoggingResponse, Unit]
  ): Request[StopLoggingResponse, AWSError] = js.native
  /**
    * Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown.
    */
  def updateTrail(): Request[UpdateTrailResponse, AWSError] = js.native
  def updateTrail(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrailResponse, Unit]): Request[UpdateTrailResponse, AWSError] = js.native
  /**
    * Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown.
    */
  def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse, AWSError] = js.native
  def updateTrail(
    params: UpdateTrailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrailResponse, Unit]
  ): Request[UpdateTrailResponse, AWSError] = js.native
}

