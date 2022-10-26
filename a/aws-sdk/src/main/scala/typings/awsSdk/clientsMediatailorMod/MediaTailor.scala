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
    * Amazon CloudWatch log settings for a playback configuration.
    */
  def configureLogsForPlaybackConfiguration(): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  def configureLogsForPlaybackConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureLogsForPlaybackConfigurationResponse, Unit]
  ): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Amazon CloudWatch log settings for a playback configuration.
    */
  def configureLogsForPlaybackConfiguration(params: ConfigureLogsForPlaybackConfigurationRequest): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  def configureLogsForPlaybackConfiguration(
    params: ConfigureLogsForPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureLogsForPlaybackConfigurationResponse, Unit]
  ): Request[ConfigureLogsForPlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  
  /**
    * The live source configuration.
    */
  def createLiveSource(): Request[CreateLiveSourceResponse, AWSError] = js.native
  def createLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateLiveSourceResponse, Unit]): Request[CreateLiveSourceResponse, AWSError] = js.native
  /**
    * The live source configuration.
    */
  def createLiveSource(params: CreateLiveSourceRequest): Request[CreateLiveSourceResponse, AWSError] = js.native
  def createLiveSource(
    params: CreateLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLiveSourceResponse, Unit]
  ): Request[CreateLiveSourceResponse, AWSError] = js.native
  
  /**
    * Creates a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see Using ad prefetching in the MediaTailor User Guide.
    */
  def createPrefetchSchedule(): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  def createPrefetchSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreatePrefetchScheduleResponse, Unit]): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  /**
    * Creates a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see Using ad prefetching in the MediaTailor User Guide.
    */
  def createPrefetchSchedule(params: CreatePrefetchScheduleRequest): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  def createPrefetchSchedule(
    params: CreatePrefetchScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePrefetchScheduleResponse, Unit]
  ): Request[CreatePrefetchScheduleResponse, AWSError] = js.native
  
  /**
    * Creates a program within a channel. For information about programs, see Working with programs in the MediaTailor User Guide.
    */
  def createProgram(): Request[CreateProgramResponse, AWSError] = js.native
  def createProgram(callback: js.Function2[/* err */ AWSError, /* data */ CreateProgramResponse, Unit]): Request[CreateProgramResponse, AWSError] = js.native
  /**
    * Creates a program within a channel. For information about programs, see Working with programs in the MediaTailor User Guide.
    */
  def createProgram(params: CreateProgramRequest): Request[CreateProgramResponse, AWSError] = js.native
  def createProgram(
    params: CreateProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProgramResponse, Unit]
  ): Request[CreateProgramResponse, AWSError] = js.native
  
  /**
    * Creates a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def createSourceLocation(): Request[CreateSourceLocationResponse, AWSError] = js.native
  def createSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ CreateSourceLocationResponse, Unit]): Request[CreateSourceLocationResponse, AWSError] = js.native
  /**
    * Creates a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def createSourceLocation(params: CreateSourceLocationRequest): Request[CreateSourceLocationResponse, AWSError] = js.native
  def createSourceLocation(
    params: CreateSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSourceLocationResponse, Unit]
  ): Request[CreateSourceLocationResponse, AWSError] = js.native
  
  /**
    * The VOD source configuration parameters.
    */
  def createVodSource(): Request[CreateVodSourceResponse, AWSError] = js.native
  def createVodSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateVodSourceResponse, Unit]): Request[CreateVodSourceResponse, AWSError] = js.native
  /**
    * The VOD source configuration parameters.
    */
  def createVodSource(params: CreateVodSourceRequest): Request[CreateVodSourceResponse, AWSError] = js.native
  def createVodSource(
    params: CreateVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVodSourceResponse, Unit]
  ): Request[CreateVodSourceResponse, AWSError] = js.native
  
  /**
    * Deletes a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def deleteChannel(): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]): Request[DeleteChannelResponse, AWSError] = js.native
  /**
    * Deletes a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]
  ): Request[DeleteChannelResponse, AWSError] = js.native
  
  /**
    * The channel policy to delete.
    */
  def deleteChannelPolicy(): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  def deleteChannelPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelPolicyResponse, Unit]): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  /**
    * The channel policy to delete.
    */
  def deleteChannelPolicy(params: DeleteChannelPolicyRequest): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  def deleteChannelPolicy(
    params: DeleteChannelPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelPolicyResponse, Unit]
  ): Request[DeleteChannelPolicyResponse, AWSError] = js.native
  
  /**
    * The live source to delete.
    */
  def deleteLiveSource(): Request[DeleteLiveSourceResponse, AWSError] = js.native
  def deleteLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLiveSourceResponse, Unit]): Request[DeleteLiveSourceResponse, AWSError] = js.native
  /**
    * The live source to delete.
    */
  def deleteLiveSource(params: DeleteLiveSourceRequest): Request[DeleteLiveSourceResponse, AWSError] = js.native
  def deleteLiveSource(
    params: DeleteLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLiveSourceResponse, Unit]
  ): Request[DeleteLiveSourceResponse, AWSError] = js.native
  
  /**
    * Deletes a playback configuration. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  def deletePlaybackConfiguration(): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  def deletePlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackConfigurationResponse, Unit]): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Deletes a playback configuration. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  def deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  def deletePlaybackConfiguration(
    params: DeletePlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackConfigurationResponse, Unit]
  ): Request[DeletePlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes a prefetch schedule for a specific playback configuration. If you call DeletePrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code. For more information about ad prefetching, see Using ad prefetching in the MediaTailor User Guide.
    */
  def deletePrefetchSchedule(): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  def deletePrefetchSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeletePrefetchScheduleResponse, Unit]): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  /**
    * Deletes a prefetch schedule for a specific playback configuration. If you call DeletePrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code. For more information about ad prefetching, see Using ad prefetching in the MediaTailor User Guide.
    */
  def deletePrefetchSchedule(params: DeletePrefetchScheduleRequest): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  def deletePrefetchSchedule(
    params: DeletePrefetchScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePrefetchScheduleResponse, Unit]
  ): Request[DeletePrefetchScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes a program within a channel. For information about programs, see Working with programs in the MediaTailor User Guide.
    */
  def deleteProgram(): Request[DeleteProgramResponse, AWSError] = js.native
  def deleteProgram(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProgramResponse, Unit]): Request[DeleteProgramResponse, AWSError] = js.native
  /**
    * Deletes a program within a channel. For information about programs, see Working with programs in the MediaTailor User Guide.
    */
  def deleteProgram(params: DeleteProgramRequest): Request[DeleteProgramResponse, AWSError] = js.native
  def deleteProgram(
    params: DeleteProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProgramResponse, Unit]
  ): Request[DeleteProgramResponse, AWSError] = js.native
  
  /**
    * Deletes a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def deleteSourceLocation(): Request[DeleteSourceLocationResponse, AWSError] = js.native
  def deleteSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceLocationResponse, Unit]): Request[DeleteSourceLocationResponse, AWSError] = js.native
  /**
    * Deletes a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def deleteSourceLocation(params: DeleteSourceLocationRequest): Request[DeleteSourceLocationResponse, AWSError] = js.native
  def deleteSourceLocation(
    params: DeleteSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceLocationResponse, Unit]
  ): Request[DeleteSourceLocationResponse, AWSError] = js.native
  
  /**
    * The video on demand (VOD) source to delete.
    */
  def deleteVodSource(): Request[DeleteVodSourceResponse, AWSError] = js.native
  def deleteVodSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVodSourceResponse, Unit]): Request[DeleteVodSourceResponse, AWSError] = js.native
  /**
    * The video on demand (VOD) source to delete.
    */
  def deleteVodSource(params: DeleteVodSourceRequest): Request[DeleteVodSourceResponse, AWSError] = js.native
  def deleteVodSource(
    params: DeleteVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVodSourceResponse, Unit]
  ): Request[DeleteVodSourceResponse, AWSError] = js.native
  
  /**
    * Describes a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def describeChannel(): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Describes a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  
  /**
    * The live source to describe.
    */
  def describeLiveSource(): Request[DescribeLiveSourceResponse, AWSError] = js.native
  def describeLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLiveSourceResponse, Unit]): Request[DescribeLiveSourceResponse, AWSError] = js.native
  /**
    * The live source to describe.
    */
  def describeLiveSource(params: DescribeLiveSourceRequest): Request[DescribeLiveSourceResponse, AWSError] = js.native
  def describeLiveSource(
    params: DescribeLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLiveSourceResponse, Unit]
  ): Request[DescribeLiveSourceResponse, AWSError] = js.native
  
  /**
    * Describes a program within a channel. For information about programs, see Working with programs in the MediaTailor User Guide.
    */
  def describeProgram(): Request[DescribeProgramResponse, AWSError] = js.native
  def describeProgram(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProgramResponse, Unit]): Request[DescribeProgramResponse, AWSError] = js.native
  /**
    * Describes a program within a channel. For information about programs, see Working with programs in the MediaTailor User Guide.
    */
  def describeProgram(params: DescribeProgramRequest): Request[DescribeProgramResponse, AWSError] = js.native
  def describeProgram(
    params: DescribeProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProgramResponse, Unit]
  ): Request[DescribeProgramResponse, AWSError] = js.native
  
  /**
    * Describes a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def describeSourceLocation(): Request[DescribeSourceLocationResponse, AWSError] = js.native
  def describeSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceLocationResponse, Unit]): Request[DescribeSourceLocationResponse, AWSError] = js.native
  /**
    * Describes a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def describeSourceLocation(params: DescribeSourceLocationRequest): Request[DescribeSourceLocationResponse, AWSError] = js.native
  def describeSourceLocation(
    params: DescribeSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceLocationResponse, Unit]
  ): Request[DescribeSourceLocationResponse, AWSError] = js.native
  
  /**
    * Provides details about a specific video on demand (VOD) source in a specific source location.
    */
  def describeVodSource(): Request[DescribeVodSourceResponse, AWSError] = js.native
  def describeVodSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVodSourceResponse, Unit]): Request[DescribeVodSourceResponse, AWSError] = js.native
  /**
    * Provides details about a specific video on demand (VOD) source in a specific source location.
    */
  def describeVodSource(params: DescribeVodSourceRequest): Request[DescribeVodSourceResponse, AWSError] = js.native
  def describeVodSource(
    params: DescribeVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVodSourceResponse, Unit]
  ): Request[DescribeVodSourceResponse, AWSError] = js.native
  
  /**
    * Returns the channel's IAM policy. IAM policies are used to control access to your channel.
    */
  def getChannelPolicy(): Request[GetChannelPolicyResponse, AWSError] = js.native
  def getChannelPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelPolicyResponse, Unit]): Request[GetChannelPolicyResponse, AWSError] = js.native
  /**
    * Returns the channel's IAM policy. IAM policies are used to control access to your channel.
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
    * Retrieves a playback configuration. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  def getPlaybackConfiguration(): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  def getPlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackConfigurationResponse, Unit]): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves a playback configuration. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  def getPlaybackConfiguration(
    params: GetPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackConfigurationResponse, Unit]
  ): Request[GetPlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see Using ad prefetching in the MediaTailor User Guide.
    */
  def getPrefetchSchedule(): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  def getPrefetchSchedule(callback: js.Function2[/* err */ AWSError, /* data */ GetPrefetchScheduleResponse, Unit]): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  /**
    * Retrieves a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see Using ad prefetching in the MediaTailor User Guide.
    */
  def getPrefetchSchedule(params: GetPrefetchScheduleRequest): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  def getPrefetchSchedule(
    params: GetPrefetchScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPrefetchScheduleResponse, Unit]
  ): Request[GetPrefetchScheduleResponse, AWSError] = js.native
  
  /**
    * Lists the alerts that are associated with a MediaTailor channel assembly resource.
    */
  def listAlerts(): Request[ListAlertsResponse, AWSError] = js.native
  def listAlerts(callback: js.Function2[/* err */ AWSError, /* data */ ListAlertsResponse, Unit]): Request[ListAlertsResponse, AWSError] = js.native
  /**
    * Lists the alerts that are associated with a MediaTailor channel assembly resource.
    */
  def listAlerts(params: ListAlertsRequest): Request[ListAlertsResponse, AWSError] = js.native
  def listAlerts(
    params: ListAlertsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlertsResponse, Unit]
  ): Request[ListAlertsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the channels that are associated with the current AWS account.
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Retrieves information about the channels that are associated with the current AWS account.
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  
  /**
    * Lists the live sources contained in a source location. A source represents a piece of content.
    */
  def listLiveSources(): Request[ListLiveSourcesResponse, AWSError] = js.native
  def listLiveSources(callback: js.Function2[/* err */ AWSError, /* data */ ListLiveSourcesResponse, Unit]): Request[ListLiveSourcesResponse, AWSError] = js.native
  /**
    * Lists the live sources contained in a source location. A source represents a piece of content.
    */
  def listLiveSources(params: ListLiveSourcesRequest): Request[ListLiveSourcesResponse, AWSError] = js.native
  def listLiveSources(
    params: ListLiveSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLiveSourcesResponse, Unit]
  ): Request[ListLiveSourcesResponse, AWSError] = js.native
  
  /**
    * Retrieves existing playback configurations. For information about MediaTailor configurations, see Working with Configurations in AWS Elemental MediaTailor.
    */
  def listPlaybackConfigurations(): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  def listPlaybackConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackConfigurationsResponse, Unit]): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves existing playback configurations. For information about MediaTailor configurations, see Working with Configurations in AWS Elemental MediaTailor.
    */
  def listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  def listPlaybackConfigurations(
    params: ListPlaybackConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackConfigurationsResponse, Unit]
  ): Request[ListPlaybackConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists the prefetch schedules for a playback configuration.
    */
  def listPrefetchSchedules(): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  def listPrefetchSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListPrefetchSchedulesResponse, Unit]): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  /**
    * Lists the prefetch schedules for a playback configuration.
    */
  def listPrefetchSchedules(params: ListPrefetchSchedulesRequest): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  def listPrefetchSchedules(
    params: ListPrefetchSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPrefetchSchedulesResponse, Unit]
  ): Request[ListPrefetchSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists the source locations for a channel. A source location defines the host server URL, and contains a list of sources.
    */
  def listSourceLocations(): Request[ListSourceLocationsResponse, AWSError] = js.native
  def listSourceLocations(callback: js.Function2[/* err */ AWSError, /* data */ ListSourceLocationsResponse, Unit]): Request[ListSourceLocationsResponse, AWSError] = js.native
  /**
    * Lists the source locations for a channel. A source location defines the host server URL, and contains a list of sources.
    */
  def listSourceLocations(params: ListSourceLocationsRequest): Request[ListSourceLocationsResponse, AWSError] = js.native
  def listSourceLocations(
    params: ListSourceLocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSourceLocationsResponse, Unit]
  ): Request[ListSourceLocationsResponse, AWSError] = js.native
  
  /**
    * A list of tags that are associated with this resource. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * A list of tags that are associated with this resource. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the VOD sources contained in a source location. A source represents a piece of content.
    */
  def listVodSources(): Request[ListVodSourcesResponse, AWSError] = js.native
  def listVodSources(callback: js.Function2[/* err */ AWSError, /* data */ ListVodSourcesResponse, Unit]): Request[ListVodSourcesResponse, AWSError] = js.native
  /**
    * Lists the VOD sources contained in a source location. A source represents a piece of content.
    */
  def listVodSources(params: ListVodSourcesRequest): Request[ListVodSourcesResponse, AWSError] = js.native
  def listVodSources(
    params: ListVodSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVodSourcesResponse, Unit]
  ): Request[ListVodSourcesResponse, AWSError] = js.native
  
  /**
    * Creates an IAM policy for the channel. IAM policies are used to control access to your channel.
    */
  def putChannelPolicy(): Request[PutChannelPolicyResponse, AWSError] = js.native
  def putChannelPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutChannelPolicyResponse, Unit]): Request[PutChannelPolicyResponse, AWSError] = js.native
  /**
    * Creates an IAM policy for the channel. IAM policies are used to control access to your channel.
    */
  def putChannelPolicy(params: PutChannelPolicyRequest): Request[PutChannelPolicyResponse, AWSError] = js.native
  def putChannelPolicy(
    params: PutChannelPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutChannelPolicyResponse, Unit]
  ): Request[PutChannelPolicyResponse, AWSError] = js.native
  
  /**
    * Creates a playback configuration. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  def putPlaybackConfiguration(): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  def putPlaybackConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutPlaybackConfigurationResponse, Unit]): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  /**
    * Creates a playback configuration. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  def putPlaybackConfiguration(
    params: PutPlaybackConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPlaybackConfigurationResponse, Unit]
  ): Request[PutPlaybackConfigurationResponse, AWSError] = js.native
  
  /**
    * Starts a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def startChannel(): Request[StartChannelResponse, AWSError] = js.native
  def startChannel(callback: js.Function2[/* err */ AWSError, /* data */ StartChannelResponse, Unit]): Request[StartChannelResponse, AWSError] = js.native
  /**
    * Starts a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def startChannel(params: StartChannelRequest): Request[StartChannelResponse, AWSError] = js.native
  def startChannel(
    params: StartChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChannelResponse, Unit]
  ): Request[StartChannelResponse, AWSError] = js.native
  
  /**
    * Stops a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def stopChannel(): Request[StopChannelResponse, AWSError] = js.native
  def stopChannel(callback: js.Function2[/* err */ AWSError, /* data */ StopChannelResponse, Unit]): Request[StopChannelResponse, AWSError] = js.native
  /**
    * Stops a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def stopChannel(params: StopChannelRequest): Request[StopChannelResponse, AWSError] = js.native
  def stopChannel(
    params: StopChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopChannelResponse, Unit]
  ): Request[StopChannelResponse, AWSError] = js.native
  
  /**
    * The resource to tag. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * The resource to tag. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * The resource to untag.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * The resource to untag.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def updateChannel(): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Updates a channel. For information about MediaTailor channels, see Working with channels in the MediaTailor User Guide.
    */
  def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]
  ): Request[UpdateChannelResponse, AWSError] = js.native
  
  /**
    * Updates a live source's configuration.
    */
  def updateLiveSource(): Request[UpdateLiveSourceResponse, AWSError] = js.native
  def updateLiveSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLiveSourceResponse, Unit]): Request[UpdateLiveSourceResponse, AWSError] = js.native
  /**
    * Updates a live source's configuration.
    */
  def updateLiveSource(params: UpdateLiveSourceRequest): Request[UpdateLiveSourceResponse, AWSError] = js.native
  def updateLiveSource(
    params: UpdateLiveSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLiveSourceResponse, Unit]
  ): Request[UpdateLiveSourceResponse, AWSError] = js.native
  
  /**
    * Updates a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def updateSourceLocation(): Request[UpdateSourceLocationResponse, AWSError] = js.native
  def updateSourceLocation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSourceLocationResponse, Unit]): Request[UpdateSourceLocationResponse, AWSError] = js.native
  /**
    * Updates a source location. A source location is a container for sources. For more information about source locations, see Working with source locations in the MediaTailor User Guide.
    */
  def updateSourceLocation(params: UpdateSourceLocationRequest): Request[UpdateSourceLocationResponse, AWSError] = js.native
  def updateSourceLocation(
    params: UpdateSourceLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSourceLocationResponse, Unit]
  ): Request[UpdateSourceLocationResponse, AWSError] = js.native
  
  /**
    * Updates a VOD source's configuration.
    */
  def updateVodSource(): Request[UpdateVodSourceResponse, AWSError] = js.native
  def updateVodSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVodSourceResponse, Unit]): Request[UpdateVodSourceResponse, AWSError] = js.native
  /**
    * Updates a VOD source's configuration.
    */
  def updateVodSource(params: UpdateVodSourceRequest): Request[UpdateVodSourceResponse, AWSError] = js.native
  def updateVodSource(
    params: UpdateVodSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVodSourceResponse, Unit]
  ): Request[UpdateVodSourceResponse, AWSError] = js.native
}
