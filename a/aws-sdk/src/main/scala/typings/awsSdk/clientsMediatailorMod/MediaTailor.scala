package typings.awsSdk.clientsMediatailorMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTailor extends Service {
  
  @JSName("config")
  var config_MediaTailor: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Configures Amazon CloudWatch log settings for a playback configuration.
    */
  def configureLogsForPlaybackConfiguration(): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  def configureLogsForPlaybackConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureLogsForPlaybackConfigurationResponse, Unit]
  ): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Configures Amazon CloudWatch log settings for a playback configuration.
    */
  def configureLogsForPlaybackConfiguration(params: ConfigureLogsForPlaybackConfigurationRequest): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  def configureLogsForPlaybackConfiguration(
    params: ConfigureLogsForPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureLogsForPlaybackConfigurationResponse, Unit]
  ): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a channel.
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a channel.
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  
  /**
    * Creates name for a specific live source in a source location.
    */
  def createLiveSource(): Request[CreateLiveSourceResponse, AWSError] = js.native
  def createLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateLiveSourceResponse, Unit]): Request[CreateLiveSourceResponse, AWSError] = js.native
  /**
    * Creates name for a specific live source in a source location.
    */
  def createLiveSource(params: CreateLiveSourceRequest): Request[CreateLiveSourceResponse, AWSError] = js.native
  def createLiveSource(
    params: CreateLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLiveSourceResponse, Unit]
  ): Request[CreateLiveSourceResponse, AWSError] = js.native
  
  /**
    * Creates a new prefetch schedule for the specified playback configuration.
    */
  def createPrefetchSchedule(): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  def createPrefetchSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreatePrefetchScheduleResponse, Unit]): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  /**
    * Creates a new prefetch schedule for the specified playback configuration.
    */
  def createPrefetchSchedule(params: CreatePrefetchScheduleRequest): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  def createPrefetchSchedule(
    params: CreatePrefetchScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePrefetchScheduleResponse, Unit]
  ): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  
  /**
    * Creates a program.
    */
  def createProgram(): Request[CreateProgramResponse, AWSError] = js.native
  def createProgram(callback: js.Function2[/* err */ AWSError, /* data */ CreateProgramResponse, Unit]): Request[CreateProgramResponse, AWSError] = js.native
  /**
    * Creates a program.
    */
  def createProgram(params: CreateProgramRequest): Request[CreateProgramResponse, AWSError] = js.native
  def createProgram(
    params: CreateProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProgramResponse, Unit]
  ): Request[CreateProgramResponse, AWSError] = js.native
  
  /**
    * Creates a source location on a specific channel.
    */
  def createSourceLocation(): Request[CreateSourceLocationResponse, AWSError] = js.native
  def createSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ CreateSourceLocationResponse, Unit]): Request[CreateSourceLocationResponse, AWSError] = js.native
  /**
    * Creates a source location on a specific channel.
    */
  def createSourceLocation(params: CreateSourceLocationRequest): Request[CreateSourceLocationResponse, AWSError] = js.native
  def createSourceLocation(
    params: CreateSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSourceLocationResponse, Unit]
  ): Request[CreateSourceLocationResponse, AWSError] = js.native
  
  /**
    * Creates name for a specific VOD source in a source location.
    */
  def createVodSource(): Request[CreateVodSourceResponse, AWSError] = js.native
  def createVodSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateVodSourceResponse, Unit]): Request[CreateVodSourceResponse, AWSError] = js.native
  /**
    * Creates name for a specific VOD source in a source location.
    */
  def createVodSource(params: CreateVodSourceRequest): Request[CreateVodSourceResponse, AWSError] = js.native
  def createVodSource(
    params: CreateVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVodSourceResponse, Unit]
  ): Request[CreateVodSourceResponse, AWSError] = js.native
  
  /**
    * Deletes a channel. You must stop the channel before it can be deleted.
    */
  def deleteChannel(): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]): Request[DeleteChannelResponse, AWSError] = js.native
  /**
    * Deletes a channel. You must stop the channel before it can be deleted.
    */
  def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]
  ): Request[DeleteChannelResponse, AWSError] = js.native
  
  /**
    * Deletes a channel's IAM policy.
    */
  def deleteChannelPolicy(): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  def deleteChannelPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelPolicyResponse, Unit]): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  /**
    * Deletes a channel's IAM policy.
    */
  def deleteChannelPolicy(params: DeleteChannelPolicyRequest): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  def deleteChannelPolicy(
    params: DeleteChannelPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelPolicyResponse, Unit]
  ): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a specific live source in a specific source location.
    */
  def deleteLiveSource(): Request[DeleteLiveSourceResponse, AWSError] = js.native
  def deleteLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLiveSourceResponse, Unit]): Request[DeleteLiveSourceResponse, AWSError] = js.native
  /**
    * Deletes a specific live source in a specific source location.
    */
  def deleteLiveSource(params: DeleteLiveSourceRequest): Request[DeleteLiveSourceResponse, AWSError] = js.native
  def deleteLiveSource(
    params: DeleteLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLiveSourceResponse, Unit]
  ): Request[DeleteLiveSourceResponse, AWSError] = js.native
  
  /**
    * Deletes the playback configuration for the specified name.  
    */
  def deletePlaybackConfiguration(): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  def deletePlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackConfigurationResponse, Unit]): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the playback configuration for the specified name.  
    */
  def deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  def deletePlaybackConfiguration(
    params: DeletePlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackConfigurationResponse, Unit]
  ): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes a prefetch schedule for a specific playback configuration. If you call DeletePrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
    */
  def deletePrefetchSchedule(): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  def deletePrefetchSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeletePrefetchScheduleResponse, Unit]): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  /**
    * Deletes a prefetch schedule for a specific playback configuration. If you call DeletePrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
    */
  def deletePrefetchSchedule(params: DeletePrefetchScheduleRequest): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  def deletePrefetchSchedule(
    params: DeletePrefetchScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePrefetchScheduleResponse, Unit]
  ): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes a specific program on a specific channel.
    */
  def deleteProgram(): Request[DeleteProgramResponse, AWSError] = js.native
  def deleteProgram(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProgramResponse, Unit]): Request[DeleteProgramResponse, AWSError] = js.native
  /**
    * Deletes a specific program on a specific channel.
    */
  def deleteProgram(params: DeleteProgramRequest): Request[DeleteProgramResponse, AWSError] = js.native
  def deleteProgram(
    params: DeleteProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProgramResponse, Unit]
  ): Request[DeleteProgramResponse, AWSError] = js.native
  
  /**
    * Deletes a source location on a specific channel.
    */
  def deleteSourceLocation(): Request[DeleteSourceLocationResponse, AWSError] = js.native
  def deleteSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceLocationResponse, Unit]): Request[DeleteSourceLocationResponse, AWSError] = js.native
  /**
    * Deletes a source location on a specific channel.
    */
  def deleteSourceLocation(params: DeleteSourceLocationRequest): Request[DeleteSourceLocationResponse, AWSError] = js.native
  def deleteSourceLocation(
    params: DeleteSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceLocationResponse, Unit]
  ): Request[DeleteSourceLocationResponse, AWSError] = js.native
  
  /**
    * Deletes a specific VOD source in a specific source location.
    */
  def deleteVodSource(): Request[DeleteVodSourceResponse, AWSError] = js.native
  def deleteVodSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVodSourceResponse, Unit]): Request[DeleteVodSourceResponse, AWSError] = js.native
  /**
    * Deletes a specific VOD source in a specific source location.
    */
  def deleteVodSource(params: DeleteVodSourceRequest): Request[DeleteVodSourceResponse, AWSError] = js.native
  def deleteVodSource(
    params: DeleteVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVodSourceResponse, Unit]
  ): Request[DeleteVodSourceResponse, AWSError] = js.native
  
  /**
    * Describes the properties of a specific channel.
    */
  def describeChannel(): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Describes the properties of a specific channel.
    */
  def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  
  /**
    * Provides details about a specific live source in a specific source location.
    */
  def describeLiveSource(): Request[DescribeLiveSourceResponse, AWSError] = js.native
  def describeLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLiveSourceResponse, Unit]): Request[DescribeLiveSourceResponse, AWSError] = js.native
  /**
    * Provides details about a specific live source in a specific source location.
    */
  def describeLiveSource(params: DescribeLiveSourceRequest): Request[DescribeLiveSourceResponse, AWSError] = js.native
  def describeLiveSource(
    params: DescribeLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLiveSourceResponse, Unit]
  ): Request[DescribeLiveSourceResponse, AWSError] = js.native
  
  /**
    * Retrieves the properties of the requested program.
    */
  def describeProgram(): Request[DescribeProgramResponse, AWSError] = js.native
  def describeProgram(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProgramResponse, Unit]): Request[DescribeProgramResponse, AWSError] = js.native
  /**
    * Retrieves the properties of the requested program.
    */
  def describeProgram(params: DescribeProgramRequest): Request[DescribeProgramResponse, AWSError] = js.native
  def describeProgram(
    params: DescribeProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProgramResponse, Unit]
  ): Request[DescribeProgramResponse, AWSError] = js.native
  
  /**
    * Retrieves the properties of the requested source location.
    */
  def describeSourceLocation(): Request[DescribeSourceLocationResponse, AWSError] = js.native
  def describeSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceLocationResponse, Unit]): Request[DescribeSourceLocationResponse, AWSError] = js.native
  /**
    * Retrieves the properties of the requested source location.
    */
  def describeSourceLocation(params: DescribeSourceLocationRequest): Request[DescribeSourceLocationResponse, AWSError] = js.native
  def describeSourceLocation(
    params: DescribeSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceLocationResponse, Unit]
  ): Request[DescribeSourceLocationResponse, AWSError] = js.native
  
  /**
    * Provides details about a specific VOD source in a specific source location.
    */
  def describeVodSource(): Request[DescribeVodSourceResponse, AWSError] = js.native
  def describeVodSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVodSourceResponse, Unit]): Request[DescribeVodSourceResponse, AWSError] = js.native
  /**
    * Provides details about a specific VOD source in a specific source location.
    */
  def describeVodSource(params: DescribeVodSourceRequest): Request[DescribeVodSourceResponse, AWSError] = js.native
  def describeVodSource(
    params: DescribeVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVodSourceResponse, Unit]
  ): Request[DescribeVodSourceResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a channel's IAM policy.
    */
  def getChannelPolicy(): Request[GetChannelPolicyResponse, AWSError] = js.native
  def getChannelPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelPolicyResponse, Unit]): Request[GetChannelPolicyResponse, AWSError] = js.native
  /**
    * Retrieves information about a channel's IAM policy.
    */
  def getChannelPolicy(params: GetChannelPolicyRequest): Request[GetChannelPolicyResponse, AWSError] = js.native
  def getChannelPolicy(
    params: GetChannelPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelPolicyResponse, Unit]
  ): Request[GetChannelPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about your channel's schedule.
    */
  def getChannelSchedule(): Request[GetChannelScheduleResponse, AWSError] = js.native
  def getChannelSchedule(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelScheduleResponse, Unit]): Request[GetChannelScheduleResponse, AWSError] = js.native
  /**
    * Retrieves information about your channel's schedule.
    */
  def getChannelSchedule(params: GetChannelScheduleRequest): Request[GetChannelScheduleResponse, AWSError] = js.native
  def getChannelSchedule(
    params: GetChannelScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelScheduleResponse, Unit]
  ): Request[GetChannelScheduleResponse, AWSError] = js.native
  
  /**
    * Returns the playback configuration for the specified name.  
    */
  def getPlaybackConfiguration(): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  def getPlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackConfigurationResponse, Unit]): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Returns the playback configuration for the specified name.  
    */
  def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  def getPlaybackConfiguration(
    params: GetPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackConfigurationResponse, Unit]
  ): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns information about the prefetch schedule for a specific playback configuration. If you call GetPrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
    */
  def getPrefetchSchedule(): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  def getPrefetchSchedule(callback: js.Function2[/* err */ AWSError, /* data */ GetPrefetchScheduleResponse, Unit]): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  /**
    * Returns information about the prefetch schedule for a specific playback configuration. If you call GetPrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
    */
  def getPrefetchSchedule(params: GetPrefetchScheduleRequest): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  def getPrefetchSchedule(
    params: GetPrefetchScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPrefetchScheduleResponse, Unit]
  ): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  
  /**
    * Returns a list of alerts for the given resource.
    */
  def listAlerts(): Request[ListAlertsResponse, AWSError] = js.native
  def listAlerts(callback: js.Function2[/* err */ AWSError, /* data */ ListAlertsResponse, Unit]): Request[ListAlertsResponse, AWSError] = js.native
  /**
    * Returns a list of alerts for the given resource.
    */
  def listAlerts(params: ListAlertsRequest): Request[ListAlertsResponse, AWSError] = js.native
  def listAlerts(
    params: ListAlertsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlertsResponse, Unit]
  ): Request[ListAlertsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of channels that are associated with this account.
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Retrieves a list of channels that are associated with this account.
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  
  /**
    * lists all the live sources in a source location.
    */
  def listLiveSources(): Request[ListLiveSourcesResponse, AWSError] = js.native
  def listLiveSources(callback: js.Function2[/* err */ AWSError, /* data */ ListLiveSourcesResponse, Unit]): Request[ListLiveSourcesResponse, AWSError] = js.native
  /**
    * lists all the live sources in a source location.
    */
  def listLiveSources(params: ListLiveSourcesRequest): Request[ListLiveSourcesResponse, AWSError] = js.native
  def listLiveSources(
    params: ListLiveSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLiveSourcesResponse, Unit]
  ): Request[ListLiveSourcesResponse, AWSError] = js.native
  
  /**
    * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you can use to retrieve the next pageful.  
    */
  def listPlaybackConfigurations(): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  def listPlaybackConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackConfigurationsResponse, Unit]): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you can use to retrieve the next pageful.  
    */
  def listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  def listPlaybackConfigurations(
    params: ListPlaybackConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackConfigurationsResponse, Unit]
  ): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  
  /**
    * Creates a new prefetch schedule.
    */
  def listPrefetchSchedules(): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  def listPrefetchSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListPrefetchSchedulesResponse, Unit]): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  /**
    * Creates a new prefetch schedule.
    */
  def listPrefetchSchedules(params: ListPrefetchSchedulesRequest): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  def listPrefetchSchedules(
    params: ListPrefetchSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrefetchSchedulesResponse, Unit]
  ): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of source locations.
    */
  def listSourceLocations(): Request[ListSourceLocationsResponse, AWSError] = js.native
  def listSourceLocations(callback: js.Function2[/* err */ AWSError, /* data */ ListSourceLocationsResponse, Unit]): Request[ListSourceLocationsResponse, AWSError] = js.native
  /**
    * Retrieves a list of source locations.
    */
  def listSourceLocations(params: ListSourceLocationsRequest): Request[ListSourceLocationsResponse, AWSError] = js.native
  def listSourceLocations(
    params: ListSourceLocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSourceLocationsResponse, Unit]
  ): Request[ListSourceLocationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the tags assigned to the specified playback configuration resource.  
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified playback configuration resource.  
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists all the VOD sources in a source location.
    */
  def listVodSources(): Request[ListVodSourcesResponse, AWSError] = js.native
  def listVodSources(callback: js.Function2[/* err */ AWSError, /* data */ ListVodSourcesResponse, Unit]): Request[ListVodSourcesResponse, AWSError] = js.native
  /**
    * Lists all the VOD sources in a source location.
    */
  def listVodSources(params: ListVodSourcesRequest): Request[ListVodSourcesResponse, AWSError] = js.native
  def listVodSources(
    params: ListVodSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVodSourcesResponse, Unit]
  ): Request[ListVodSourcesResponse, AWSError] = js.native
  
  /**
    * Creates an IAM policy for the channel.
    */
  def putChannelPolicy(): Request[PutChannelPolicyResponse, AWSError] = js.native
  def putChannelPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutChannelPolicyResponse, Unit]): Request[PutChannelPolicyResponse, AWSError] = js.native
  /**
    * Creates an IAM policy for the channel.
    */
  def putChannelPolicy(params: PutChannelPolicyRequest): Request[PutChannelPolicyResponse, AWSError] = js.native
  def putChannelPolicy(
    params: PutChannelPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutChannelPolicyResponse, Unit]
  ): Request[PutChannelPolicyResponse, AWSError] = js.native
  
  /**
    * Adds a new playback configuration to AWS Elemental MediaTailor.  
    */
  def putPlaybackConfiguration(): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  def putPlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutPlaybackConfigurationResponse, Unit]): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Adds a new playback configuration to AWS Elemental MediaTailor.  
    */
  def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  def putPlaybackConfiguration(
    params: PutPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPlaybackConfigurationResponse, Unit]
  ): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Starts a specific channel.
    */
  def startChannel(): Request[StartChannelResponse, AWSError] = js.native
  def startChannel(callback: js.Function2[/* err */ AWSError, /* data */ StartChannelResponse, Unit]): Request[StartChannelResponse, AWSError] = js.native
  /**
    * Starts a specific channel.
    */
  def startChannel(params: StartChannelRequest): Request[StartChannelResponse, AWSError] = js.native
  def startChannel(
    params: StartChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChannelResponse, Unit]
  ): Request[StartChannelResponse, AWSError] = js.native
  
  /**
    * Stops a specific channel.
    */
  def stopChannel(): Request[StopChannelResponse, AWSError] = js.native
  def stopChannel(callback: js.Function2[/* err */ AWSError, /* data */ StopChannelResponse, Unit]): Request[StopChannelResponse, AWSError] = js.native
  /**
    * Stops a specific channel.
    */
  def stopChannel(params: StopChannelRequest): Request[StopChannelResponse, AWSError] = js.native
  def stopChannel(
    params: StopChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopChannelResponse, Unit]
  ): Request[StopChannelResponse, AWSError] = js.native
  
  /**
    * Adds tags to the specified playback configuration resource. You can specify one or more tags to add.  
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to the specified playback configuration resource. You can specify one or more tags to add.  
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.  
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.  
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an existing channel.
    */
  def updateChannel(): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Updates an existing channel.
    */
  def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]
  ): Request[UpdateChannelResponse, AWSError] = js.native
  
  /**
    * Updates a specific live source in a specific source location.
    */
  def updateLiveSource(): Request[UpdateLiveSourceResponse, AWSError] = js.native
  def updateLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLiveSourceResponse, Unit]): Request[UpdateLiveSourceResponse, AWSError] = js.native
  /**
    * Updates a specific live source in a specific source location.
    */
  def updateLiveSource(params: UpdateLiveSourceRequest): Request[UpdateLiveSourceResponse, AWSError] = js.native
  def updateLiveSource(
    params: UpdateLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLiveSourceResponse, Unit]
  ): Request[UpdateLiveSourceResponse, AWSError] = js.native
  
  /**
    * Updates a source location on a specific channel.
    */
  def updateSourceLocation(): Request[UpdateSourceLocationResponse, AWSError] = js.native
  def updateSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSourceLocationResponse, Unit]): Request[UpdateSourceLocationResponse, AWSError] = js.native
  /**
    * Updates a source location on a specific channel.
    */
  def updateSourceLocation(params: UpdateSourceLocationRequest): Request[UpdateSourceLocationResponse, AWSError] = js.native
  def updateSourceLocation(
    params: UpdateSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSourceLocationResponse, Unit]
  ): Request[UpdateSourceLocationResponse, AWSError] = js.native
  
  /**
    * Updates a specific VOD source in a specific source location.
    */
  def updateVodSource(): Request[UpdateVodSourceResponse, AWSError] = js.native
  def updateVodSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVodSourceResponse, Unit]): Request[UpdateVodSourceResponse, AWSError] = js.native
  /**
    * Updates a specific VOD source in a specific source location.
    */
  def updateVodSource(params: UpdateVodSourceRequest): Request[UpdateVodSourceResponse, AWSError] = js.native
  def updateVodSource(
    params: UpdateVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVodSourceResponse, Unit]
  ): Request[UpdateVodSourceResponse, AWSError] = js.native
}
