package typings.awsDashSdk.clientsPinpointMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pinpoint extends Service {
  @JSName("config")
  var config_Pinpoint: ConfigBase with ClientConfiguration = js.native
  /**
    *  Creates an application.
    */
  def createApp(): Request[CreateAppResponse, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]): Request[CreateAppResponse, AWSError] = js.native
  /**
    *  Creates an application.
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResponse, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]
  ): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
    */
  def createCampaign(): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]): Request[CreateCampaignResponse, AWSError] = js.native
  /**
    * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
    */
  def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(
    params: CreateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]
  ): Request[CreateCampaignResponse, AWSError] = js.native
  /**
    * Creates a new export job for an application.
    */
  def createExportJob(): Request[CreateExportJobResponse, AWSError] = js.native
  def createExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateExportJobResponse, Unit]): Request[CreateExportJobResponse, AWSError] = js.native
  /**
    * Creates a new export job for an application.
    */
  def createExportJob(params: CreateExportJobRequest): Request[CreateExportJobResponse, AWSError] = js.native
  def createExportJob(
    params: CreateExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExportJobResponse, Unit]
  ): Request[CreateExportJobResponse, AWSError] = js.native
  /**
    * Creates a new import job for an application.
    */
  def createImportJob(): Request[CreateImportJobResponse, AWSError] = js.native
  def createImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateImportJobResponse, Unit]): Request[CreateImportJobResponse, AWSError] = js.native
  /**
    * Creates a new import job for an application.
    */
  def createImportJob(params: CreateImportJobRequest): Request[CreateImportJobResponse, AWSError] = js.native
  def createImportJob(
    params: CreateImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImportJobResponse, Unit]
  ): Request[CreateImportJobResponse, AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def createSegment(): Request[CreateSegmentResponse, AWSError] = js.native
  def createSegment(callback: js.Function2[/* err */ AWSError, /* data */ CreateSegmentResponse, Unit]): Request[CreateSegmentResponse, AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def createSegment(params: CreateSegmentRequest): Request[CreateSegmentResponse, AWSError] = js.native
  def createSegment(
    params: CreateSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSegmentResponse, Unit]
  ): Request[CreateSegmentResponse, AWSError] = js.native
  /**
    * Disables the ADM channel for an application and deletes any existing settings for the channel.
    */
  def deleteAdmChannel(): Request[DeleteAdmChannelResponse, AWSError] = js.native
  def deleteAdmChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAdmChannelResponse, Unit]): Request[DeleteAdmChannelResponse, AWSError] = js.native
  /**
    * Disables the ADM channel for an application and deletes any existing settings for the channel.
    */
  def deleteAdmChannel(params: DeleteAdmChannelRequest): Request[DeleteAdmChannelResponse, AWSError] = js.native
  def deleteAdmChannel(
    params: DeleteAdmChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAdmChannelResponse, Unit]
  ): Request[DeleteAdmChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsChannel(): Request[DeleteApnsChannelResponse, AWSError] = js.native
  def deleteApnsChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsChannelResponse, Unit]): Request[DeleteApnsChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsChannel(params: DeleteApnsChannelRequest): Request[DeleteApnsChannelResponse, AWSError] = js.native
  def deleteApnsChannel(
    params: DeleteApnsChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsChannelResponse, Unit]
  ): Request[DeleteApnsChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsSandboxChannel(): Request[DeleteApnsSandboxChannelResponse, AWSError] = js.native
  def deleteApnsSandboxChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsSandboxChannelResponse, Unit]): Request[DeleteApnsSandboxChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsSandboxChannel(params: DeleteApnsSandboxChannelRequest): Request[DeleteApnsSandboxChannelResponse, AWSError] = js.native
  def deleteApnsSandboxChannel(
    params: DeleteApnsSandboxChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsSandboxChannelResponse, Unit]
  ): Request[DeleteApnsSandboxChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipChannel(): Request[DeleteApnsVoipChannelResponse, AWSError] = js.native
  def deleteApnsVoipChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsVoipChannelResponse, Unit]): Request[DeleteApnsVoipChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipChannel(params: DeleteApnsVoipChannelRequest): Request[DeleteApnsVoipChannelResponse, AWSError] = js.native
  def deleteApnsVoipChannel(
    params: DeleteApnsVoipChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsVoipChannelResponse, Unit]
  ): Request[DeleteApnsVoipChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipSandboxChannel(): Request[DeleteApnsVoipSandboxChannelResponse, AWSError] = js.native
  def deleteApnsVoipSandboxChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsVoipSandboxChannelResponse, Unit]): Request[DeleteApnsVoipSandboxChannelResponse, AWSError] = js.native
  /**
    * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipSandboxChannel(params: DeleteApnsVoipSandboxChannelRequest): Request[DeleteApnsVoipSandboxChannelResponse, AWSError] = js.native
  def deleteApnsVoipSandboxChannel(
    params: DeleteApnsVoipSandboxChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApnsVoipSandboxChannelResponse, Unit]
  ): Request[DeleteApnsVoipSandboxChannelResponse, AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApp(): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]): Request[DeleteAppResponse, AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]
  ): Request[DeleteAppResponse, AWSError] = js.native
  /**
    * Disables the Baidu channel for an application and deletes any existing settings for the channel.
    */
  def deleteBaiduChannel(): Request[DeleteBaiduChannelResponse, AWSError] = js.native
  def deleteBaiduChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBaiduChannelResponse, Unit]): Request[DeleteBaiduChannelResponse, AWSError] = js.native
  /**
    * Disables the Baidu channel for an application and deletes any existing settings for the channel.
    */
  def deleteBaiduChannel(params: DeleteBaiduChannelRequest): Request[DeleteBaiduChannelResponse, AWSError] = js.native
  def deleteBaiduChannel(
    params: DeleteBaiduChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBaiduChannelResponse, Unit]
  ): Request[DeleteBaiduChannelResponse, AWSError] = js.native
  /**
    * Deletes a campaign from an application.
    */
  def deleteCampaign(): Request[DeleteCampaignResponse, AWSError] = js.native
  def deleteCampaign(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCampaignResponse, Unit]): Request[DeleteCampaignResponse, AWSError] = js.native
  /**
    * Deletes a campaign from an application.
    */
  def deleteCampaign(params: DeleteCampaignRequest): Request[DeleteCampaignResponse, AWSError] = js.native
  def deleteCampaign(
    params: DeleteCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCampaignResponse, Unit]
  ): Request[DeleteCampaignResponse, AWSError] = js.native
  /**
    * Disables the email channel for an application and deletes any existing settings for the channel.
    */
  def deleteEmailChannel(): Request[DeleteEmailChannelResponse, AWSError] = js.native
  def deleteEmailChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailChannelResponse, Unit]): Request[DeleteEmailChannelResponse, AWSError] = js.native
  /**
    * Disables the email channel for an application and deletes any existing settings for the channel.
    */
  def deleteEmailChannel(params: DeleteEmailChannelRequest): Request[DeleteEmailChannelResponse, AWSError] = js.native
  def deleteEmailChannel(
    params: DeleteEmailChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEmailChannelResponse, Unit]
  ): Request[DeleteEmailChannelResponse, AWSError] = js.native
  /**
    * Deletes an endpoint from an application.
    */
  def deleteEndpoint(): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    * Deletes an endpoint from an application.
    */
  def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]
  ): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    * Deletes the event stream for an application.
    */
  def deleteEventStream(): Request[DeleteEventStreamResponse, AWSError] = js.native
  def deleteEventStream(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventStreamResponse, Unit]): Request[DeleteEventStreamResponse, AWSError] = js.native
  /**
    * Deletes the event stream for an application.
    */
  def deleteEventStream(params: DeleteEventStreamRequest): Request[DeleteEventStreamResponse, AWSError] = js.native
  def deleteEventStream(
    params: DeleteEventStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventStreamResponse, Unit]
  ): Request[DeleteEventStreamResponse, AWSError] = js.native
  /**
    * Disables the GCM channel for an application and deletes any existing settings for the channel.
    */
  def deleteGcmChannel(): Request[DeleteGcmChannelResponse, AWSError] = js.native
  def deleteGcmChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGcmChannelResponse, Unit]): Request[DeleteGcmChannelResponse, AWSError] = js.native
  /**
    * Disables the GCM channel for an application and deletes any existing settings for the channel.
    */
  def deleteGcmChannel(params: DeleteGcmChannelRequest): Request[DeleteGcmChannelResponse, AWSError] = js.native
  def deleteGcmChannel(
    params: DeleteGcmChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGcmChannelResponse, Unit]
  ): Request[DeleteGcmChannelResponse, AWSError] = js.native
  /**
    * Deletes a segment from an application.
    */
  def deleteSegment(): Request[DeleteSegmentResponse, AWSError] = js.native
  def deleteSegment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSegmentResponse, Unit]): Request[DeleteSegmentResponse, AWSError] = js.native
  /**
    * Deletes a segment from an application.
    */
  def deleteSegment(params: DeleteSegmentRequest): Request[DeleteSegmentResponse, AWSError] = js.native
  def deleteSegment(
    params: DeleteSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSegmentResponse, Unit]
  ): Request[DeleteSegmentResponse, AWSError] = js.native
  /**
    * Disables the SMS channel for an application and deletes any existing settings for the channel.
    */
  def deleteSmsChannel(): Request[DeleteSmsChannelResponse, AWSError] = js.native
  def deleteSmsChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSmsChannelResponse, Unit]): Request[DeleteSmsChannelResponse, AWSError] = js.native
  /**
    * Disables the SMS channel for an application and deletes any existing settings for the channel.
    */
  def deleteSmsChannel(params: DeleteSmsChannelRequest): Request[DeleteSmsChannelResponse, AWSError] = js.native
  def deleteSmsChannel(
    params: DeleteSmsChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSmsChannelResponse, Unit]
  ): Request[DeleteSmsChannelResponse, AWSError] = js.native
  /**
    * Deletes all the endpoints that are associated with a specific user ID.
    */
  def deleteUserEndpoints(): Request[DeleteUserEndpointsResponse, AWSError] = js.native
  def deleteUserEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserEndpointsResponse, Unit]): Request[DeleteUserEndpointsResponse, AWSError] = js.native
  /**
    * Deletes all the endpoints that are associated with a specific user ID.
    */
  def deleteUserEndpoints(params: DeleteUserEndpointsRequest): Request[DeleteUserEndpointsResponse, AWSError] = js.native
  def deleteUserEndpoints(
    params: DeleteUserEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserEndpointsResponse, Unit]
  ): Request[DeleteUserEndpointsResponse, AWSError] = js.native
  /**
    * Disables the voice channel for an application and deletes any existing settings for the channel.
    */
  def deleteVoiceChannel(): Request[DeleteVoiceChannelResponse, AWSError] = js.native
  def deleteVoiceChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVoiceChannelResponse, Unit]): Request[DeleteVoiceChannelResponse, AWSError] = js.native
  /**
    * Disables the voice channel for an application and deletes any existing settings for the channel.
    */
  def deleteVoiceChannel(params: DeleteVoiceChannelRequest): Request[DeleteVoiceChannelResponse, AWSError] = js.native
  def deleteVoiceChannel(
    params: DeleteVoiceChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVoiceChannelResponse, Unit]
  ): Request[DeleteVoiceChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the ADM channel for an application.
    */
  def getAdmChannel(): Request[GetAdmChannelResponse, AWSError] = js.native
  def getAdmChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetAdmChannelResponse, Unit]): Request[GetAdmChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the ADM channel for an application.
    */
  def getAdmChannel(params: GetAdmChannelRequest): Request[GetAdmChannelResponse, AWSError] = js.native
  def getAdmChannel(
    params: GetAdmChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAdmChannelResponse, Unit]
  ): Request[GetAdmChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs channel for an application.
    */
  def getApnsChannel(): Request[GetApnsChannelResponse, AWSError] = js.native
  def getApnsChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetApnsChannelResponse, Unit]): Request[GetApnsChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs channel for an application.
    */
  def getApnsChannel(params: GetApnsChannelRequest): Request[GetApnsChannelResponse, AWSError] = js.native
  def getApnsChannel(
    params: GetApnsChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApnsChannelResponse, Unit]
  ): Request[GetApnsChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs sandbox channel for an application.
    */
  def getApnsSandboxChannel(): Request[GetApnsSandboxChannelResponse, AWSError] = js.native
  def getApnsSandboxChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetApnsSandboxChannelResponse, Unit]): Request[GetApnsSandboxChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs sandbox channel for an application.
    */
  def getApnsSandboxChannel(params: GetApnsSandboxChannelRequest): Request[GetApnsSandboxChannelResponse, AWSError] = js.native
  def getApnsSandboxChannel(
    params: GetApnsSandboxChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApnsSandboxChannelResponse, Unit]
  ): Request[GetApnsSandboxChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP channel for an application.
    */
  def getApnsVoipChannel(): Request[GetApnsVoipChannelResponse, AWSError] = js.native
  def getApnsVoipChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetApnsVoipChannelResponse, Unit]): Request[GetApnsVoipChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP channel for an application.
    */
  def getApnsVoipChannel(params: GetApnsVoipChannelRequest): Request[GetApnsVoipChannelResponse, AWSError] = js.native
  def getApnsVoipChannel(
    params: GetApnsVoipChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApnsVoipChannelResponse, Unit]
  ): Request[GetApnsVoipChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
    */
  def getApnsVoipSandboxChannel(): Request[GetApnsVoipSandboxChannelResponse, AWSError] = js.native
  def getApnsVoipSandboxChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetApnsVoipSandboxChannelResponse, Unit]): Request[GetApnsVoipSandboxChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
    */
  def getApnsVoipSandboxChannel(params: GetApnsVoipSandboxChannelRequest): Request[GetApnsVoipSandboxChannelResponse, AWSError] = js.native
  def getApnsVoipSandboxChannel(
    params: GetApnsVoipSandboxChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApnsVoipSandboxChannelResponse, Unit]
  ): Request[GetApnsVoipSandboxChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about an application.
    */
  def getApp(): Request[GetAppResponse, AWSError] = js.native
  def getApp(callback: js.Function2[/* err */ AWSError, /* data */ GetAppResponse, Unit]): Request[GetAppResponse, AWSError] = js.native
  /**
    * Retrieves information about an application.
    */
  def getApp(params: GetAppRequest): Request[GetAppResponse, AWSError] = js.native
  def getApp(params: GetAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetAppResponse, Unit]): Request[GetAppResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.
    */
  def getApplicationDateRangeKpi(): Request[GetApplicationDateRangeKpiResponse, AWSError] = js.native
  def getApplicationDateRangeKpi(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationDateRangeKpiResponse, Unit]): Request[GetApplicationDateRangeKpiResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.
    */
  def getApplicationDateRangeKpi(params: GetApplicationDateRangeKpiRequest): Request[GetApplicationDateRangeKpiResponse, AWSError] = js.native
  def getApplicationDateRangeKpi(
    params: GetApplicationDateRangeKpiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationDateRangeKpiResponse, Unit]
  ): Request[GetApplicationDateRangeKpiResponse, AWSError] = js.native
  /**
    * Retrieves information about the settings for an application.
    */
  def getApplicationSettings(): Request[GetApplicationSettingsResponse, AWSError] = js.native
  def getApplicationSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationSettingsResponse, Unit]): Request[GetApplicationSettingsResponse, AWSError] = js.native
  /**
    * Retrieves information about the settings for an application.
    */
  def getApplicationSettings(params: GetApplicationSettingsRequest): Request[GetApplicationSettingsResponse, AWSError] = js.native
  def getApplicationSettings(
    params: GetApplicationSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationSettingsResponse, Unit]
  ): Request[GetApplicationSettingsResponse, AWSError] = js.native
  /**
    * Retrieves information about all of your applications.
    */
  def getApps(): Request[GetAppsResponse, AWSError] = js.native
  def getApps(callback: js.Function2[/* err */ AWSError, /* data */ GetAppsResponse, Unit]): Request[GetAppsResponse, AWSError] = js.native
  /**
    * Retrieves information about all of your applications.
    */
  def getApps(params: GetAppsRequest): Request[GetAppsResponse, AWSError] = js.native
  def getApps(
    params: GetAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppsResponse, Unit]
  ): Request[GetAppsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.
    */
  def getBaiduChannel(): Request[GetBaiduChannelResponse, AWSError] = js.native
  def getBaiduChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetBaiduChannelResponse, Unit]): Request[GetBaiduChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.
    */
  def getBaiduChannel(params: GetBaiduChannelRequest): Request[GetBaiduChannelResponse, AWSError] = js.native
  def getBaiduChannel(
    params: GetBaiduChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBaiduChannelResponse, Unit]
  ): Request[GetBaiduChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a campaign.
    */
  def getCampaign(): Request[GetCampaignResponse, AWSError] = js.native
  def getCampaign(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignResponse, Unit]): Request[GetCampaignResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a campaign.
    */
  def getCampaign(params: GetCampaignRequest): Request[GetCampaignResponse, AWSError] = js.native
  def getCampaign(
    params: GetCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignResponse, Unit]
  ): Request[GetCampaignResponse, AWSError] = js.native
  /**
    * Retrieves information about the activity performed by a campaign.
    */
  def getCampaignActivities(): Request[GetCampaignActivitiesResponse, AWSError] = js.native
  def getCampaignActivities(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignActivitiesResponse, Unit]): Request[GetCampaignActivitiesResponse, AWSError] = js.native
  /**
    * Retrieves information about the activity performed by a campaign.
    */
  def getCampaignActivities(params: GetCampaignActivitiesRequest): Request[GetCampaignActivitiesResponse, AWSError] = js.native
  def getCampaignActivities(
    params: GetCampaignActivitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignActivitiesResponse, Unit]
  ): Request[GetCampaignActivitiesResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.
    */
  def getCampaignDateRangeKpi(): Request[GetCampaignDateRangeKpiResponse, AWSError] = js.native
  def getCampaignDateRangeKpi(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignDateRangeKpiResponse, Unit]): Request[GetCampaignDateRangeKpiResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.
    */
  def getCampaignDateRangeKpi(params: GetCampaignDateRangeKpiRequest): Request[GetCampaignDateRangeKpiResponse, AWSError] = js.native
  def getCampaignDateRangeKpi(
    params: GetCampaignDateRangeKpiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignDateRangeKpiResponse, Unit]
  ): Request[GetCampaignDateRangeKpiResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
    */
  def getCampaignVersion(): Request[GetCampaignVersionResponse, AWSError] = js.native
  def getCampaignVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignVersionResponse, Unit]): Request[GetCampaignVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
    */
  def getCampaignVersion(params: GetCampaignVersionRequest): Request[GetCampaignVersionResponse, AWSError] = js.native
  def getCampaignVersion(
    params: GetCampaignVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignVersionResponse, Unit]
  ): Request[GetCampaignVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all versions of a specific campaign.
    */
  def getCampaignVersions(): Request[GetCampaignVersionsResponse, AWSError] = js.native
  def getCampaignVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignVersionsResponse, Unit]): Request[GetCampaignVersionsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all versions of a specific campaign.
    */
  def getCampaignVersions(params: GetCampaignVersionsRequest): Request[GetCampaignVersionsResponse, AWSError] = js.native
  def getCampaignVersions(
    params: GetCampaignVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignVersionsResponse, Unit]
  ): Request[GetCampaignVersionsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all the campaigns that are associated with an application.
    */
  def getCampaigns(): Request[GetCampaignsResponse, AWSError] = js.native
  def getCampaigns(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignsResponse, Unit]): Request[GetCampaignsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all the campaigns that are associated with an application.
    */
  def getCampaigns(params: GetCampaignsRequest): Request[GetCampaignsResponse, AWSError] = js.native
  def getCampaigns(
    params: GetCampaignsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignsResponse, Unit]
  ): Request[GetCampaignsResponse, AWSError] = js.native
  /**
    * Retrieves information about the history and status of each channel for an application.
    */
  def getChannels(): Request[GetChannelsResponse, AWSError] = js.native
  def getChannels(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelsResponse, Unit]): Request[GetChannelsResponse, AWSError] = js.native
  /**
    * Retrieves information about the history and status of each channel for an application.
    */
  def getChannels(params: GetChannelsRequest): Request[GetChannelsResponse, AWSError] = js.native
  def getChannels(
    params: GetChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelsResponse, Unit]
  ): Request[GetChannelsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the email channel for an application.
    */
  def getEmailChannel(): Request[GetEmailChannelResponse, AWSError] = js.native
  def getEmailChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetEmailChannelResponse, Unit]): Request[GetEmailChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the email channel for an application.
    */
  def getEmailChannel(params: GetEmailChannelRequest): Request[GetEmailChannelResponse, AWSError] = js.native
  def getEmailChannel(
    params: GetEmailChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEmailChannelResponse, Unit]
  ): Request[GetEmailChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the settings and attributes of a specific endpoint for an application.
    */
  def getEndpoint(): Request[GetEndpointResponse, AWSError] = js.native
  def getEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointResponse, Unit]): Request[GetEndpointResponse, AWSError] = js.native
  /**
    * Retrieves information about the settings and attributes of a specific endpoint for an application.
    */
  def getEndpoint(params: GetEndpointRequest): Request[GetEndpointResponse, AWSError] = js.native
  def getEndpoint(
    params: GetEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointResponse, Unit]
  ): Request[GetEndpointResponse, AWSError] = js.native
  /**
    * Retrieves information about the event stream settings for an application.
    */
  def getEventStream(): Request[GetEventStreamResponse, AWSError] = js.native
  def getEventStream(callback: js.Function2[/* err */ AWSError, /* data */ GetEventStreamResponse, Unit]): Request[GetEventStreamResponse, AWSError] = js.native
  /**
    * Retrieves information about the event stream settings for an application.
    */
  def getEventStream(params: GetEventStreamRequest): Request[GetEventStreamResponse, AWSError] = js.native
  def getEventStream(
    params: GetEventStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventStreamResponse, Unit]
  ): Request[GetEventStreamResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific export job for an application.
    */
  def getExportJob(): Request[GetExportJobResponse, AWSError] = js.native
  def getExportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetExportJobResponse, Unit]): Request[GetExportJobResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific export job for an application.
    */
  def getExportJob(params: GetExportJobRequest): Request[GetExportJobResponse, AWSError] = js.native
  def getExportJob(
    params: GetExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExportJobResponse, Unit]
  ): Request[GetExportJobResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the export jobs for an application.
    */
  def getExportJobs(): Request[GetExportJobsResponse, AWSError] = js.native
  def getExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetExportJobsResponse, Unit]): Request[GetExportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the export jobs for an application.
    */
  def getExportJobs(params: GetExportJobsRequest): Request[GetExportJobsResponse, AWSError] = js.native
  def getExportJobs(
    params: GetExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExportJobsResponse, Unit]
  ): Request[GetExportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the GCM channel for an application.
    */
  def getGcmChannel(): Request[GetGcmChannelResponse, AWSError] = js.native
  def getGcmChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetGcmChannelResponse, Unit]): Request[GetGcmChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the GCM channel for an application.
    */
  def getGcmChannel(params: GetGcmChannelRequest): Request[GetGcmChannelResponse, AWSError] = js.native
  def getGcmChannel(
    params: GetGcmChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGcmChannelResponse, Unit]
  ): Request[GetGcmChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific import job for an application.
    */
  def getImportJob(): Request[GetImportJobResponse, AWSError] = js.native
  def getImportJob(callback: js.Function2[/* err */ AWSError, /* data */ GetImportJobResponse, Unit]): Request[GetImportJobResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific import job for an application.
    */
  def getImportJob(params: GetImportJobRequest): Request[GetImportJobResponse, AWSError] = js.native
  def getImportJob(
    params: GetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImportJobResponse, Unit]
  ): Request[GetImportJobResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the import jobs for an application.
    */
  def getImportJobs(): Request[GetImportJobsResponse, AWSError] = js.native
  def getImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetImportJobsResponse, Unit]): Request[GetImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the import jobs for an application.
    */
  def getImportJobs(params: GetImportJobsRequest): Request[GetImportJobsResponse, AWSError] = js.native
  def getImportJobs(
    params: GetImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImportJobsResponse, Unit]
  ): Request[GetImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific segment that's associated with an application.
    */
  def getSegment(): Request[GetSegmentResponse, AWSError] = js.native
  def getSegment(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentResponse, Unit]): Request[GetSegmentResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific segment that's associated with an application.
    */
  def getSegment(params: GetSegmentRequest): Request[GetSegmentResponse, AWSError] = js.native
  def getSegment(
    params: GetSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentResponse, Unit]
  ): Request[GetSegmentResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the export jobs for a segment.
    */
  def getSegmentExportJobs(): Request[GetSegmentExportJobsResponse, AWSError] = js.native
  def getSegmentExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentExportJobsResponse, Unit]): Request[GetSegmentExportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the export jobs for a segment.
    */
  def getSegmentExportJobs(params: GetSegmentExportJobsRequest): Request[GetSegmentExportJobsResponse, AWSError] = js.native
  def getSegmentExportJobs(
    params: GetSegmentExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentExportJobsResponse, Unit]
  ): Request[GetSegmentExportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the import jobs for a segment.
    */
  def getSegmentImportJobs(): Request[GetSegmentImportJobsResponse, AWSError] = js.native
  def getSegmentImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentImportJobsResponse, Unit]): Request[GetSegmentImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the import jobs for a segment.
    */
  def getSegmentImportJobs(params: GetSegmentImportJobsRequest): Request[GetSegmentImportJobsResponse, AWSError] = js.native
  def getSegmentImportJobs(
    params: GetSegmentImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentImportJobsResponse, Unit]
  ): Request[GetSegmentImportJobsResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment that's associated with an application.
    */
  def getSegmentVersion(): Request[GetSegmentVersionResponse, AWSError] = js.native
  def getSegmentVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentVersionResponse, Unit]): Request[GetSegmentVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment that's associated with an application.
    */
  def getSegmentVersion(params: GetSegmentVersionRequest): Request[GetSegmentVersionResponse, AWSError] = js.native
  def getSegmentVersion(
    params: GetSegmentVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentVersionResponse, Unit]
  ): Request[GetSegmentVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all versions of a specific segment that's associated with an application.
    */
  def getSegmentVersions(): Request[GetSegmentVersionsResponse, AWSError] = js.native
  def getSegmentVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentVersionsResponse, Unit]): Request[GetSegmentVersionsResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all versions of a specific segment that's associated with an application.
    */
  def getSegmentVersions(params: GetSegmentVersionsRequest): Request[GetSegmentVersionsResponse, AWSError] = js.native
  def getSegmentVersions(
    params: GetSegmentVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentVersionsResponse, Unit]
  ): Request[GetSegmentVersionsResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all the segments that are associated with an application.
    */
  def getSegments(): Request[GetSegmentsResponse, AWSError] = js.native
  def getSegments(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentsResponse, Unit]): Request[GetSegmentsResponse, AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all the segments that are associated with an application.
    */
  def getSegments(params: GetSegmentsRequest): Request[GetSegmentsResponse, AWSError] = js.native
  def getSegments(
    params: GetSegmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentsResponse, Unit]
  ): Request[GetSegmentsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the SMS channel for an application.
    */
  def getSmsChannel(): Request[GetSmsChannelResponse, AWSError] = js.native
  def getSmsChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetSmsChannelResponse, Unit]): Request[GetSmsChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the SMS channel for an application.
    */
  def getSmsChannel(params: GetSmsChannelRequest): Request[GetSmsChannelResponse, AWSError] = js.native
  def getSmsChannel(
    params: GetSmsChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSmsChannelResponse, Unit]
  ): Request[GetSmsChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about all the endpoints that are associated with a specific user ID.
    */
  def getUserEndpoints(): Request[GetUserEndpointsResponse, AWSError] = js.native
  def getUserEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ GetUserEndpointsResponse, Unit]): Request[GetUserEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves information about all the endpoints that are associated with a specific user ID.
    */
  def getUserEndpoints(params: GetUserEndpointsRequest): Request[GetUserEndpointsResponse, AWSError] = js.native
  def getUserEndpoints(
    params: GetUserEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserEndpointsResponse, Unit]
  ): Request[GetUserEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the voice channel for an application.
    */
  def getVoiceChannel(): Request[GetVoiceChannelResponse, AWSError] = js.native
  def getVoiceChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceChannelResponse, Unit]): Request[GetVoiceChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the voice channel for an application.
    */
  def getVoiceChannel(params: GetVoiceChannelRequest): Request[GetVoiceChannelResponse, AWSError] = js.native
  def getVoiceChannel(
    params: GetVoiceChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceChannelResponse, Unit]
  ): Request[GetVoiceChannelResponse, AWSError] = js.native
  /**
    * Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves information about a phone number.
    */
  def phoneNumberValidate(): Request[PhoneNumberValidateResponse, AWSError] = js.native
  def phoneNumberValidate(callback: js.Function2[/* err */ AWSError, /* data */ PhoneNumberValidateResponse, Unit]): Request[PhoneNumberValidateResponse, AWSError] = js.native
  /**
    * Retrieves information about a phone number.
    */
  def phoneNumberValidate(params: PhoneNumberValidateRequest): Request[PhoneNumberValidateResponse, AWSError] = js.native
  def phoneNumberValidate(
    params: PhoneNumberValidateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PhoneNumberValidateResponse, Unit]
  ): Request[PhoneNumberValidateResponse, AWSError] = js.native
  /**
    * Creates a new event stream for an application or updates the settings of an existing event stream for an application.
    */
  def putEventStream(): Request[PutEventStreamResponse, AWSError] = js.native
  def putEventStream(callback: js.Function2[/* err */ AWSError, /* data */ PutEventStreamResponse, Unit]): Request[PutEventStreamResponse, AWSError] = js.native
  /**
    * Creates a new event stream for an application or updates the settings of an existing event stream for an application.
    */
  def putEventStream(params: PutEventStreamRequest): Request[PutEventStreamResponse, AWSError] = js.native
  def putEventStream(
    params: PutEventStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventStreamResponse, Unit]
  ): Request[PutEventStreamResponse, AWSError] = js.native
  /**
    * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are associated with.
    */
  def putEvents(): Request[PutEventsResponse, AWSError] = js.native
  def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutEventsResponse, Unit]): Request[PutEventsResponse, AWSError] = js.native
  /**
    * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are associated with.
    */
  def putEvents(params: PutEventsRequest): Request[PutEventsResponse, AWSError] = js.native
  def putEvents(
    params: PutEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventsResponse, Unit]
  ): Request[PutEventsResponse, AWSError] = js.native
  /**
    * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an application.
    */
  def removeAttributes(): Request[RemoveAttributesResponse, AWSError] = js.native
  def removeAttributes(callback: js.Function2[/* err */ AWSError, /* data */ RemoveAttributesResponse, Unit]): Request[RemoveAttributesResponse, AWSError] = js.native
  /**
    * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an application.
    */
  def removeAttributes(params: RemoveAttributesRequest): Request[RemoveAttributesResponse, AWSError] = js.native
  def removeAttributes(
    params: RemoveAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveAttributesResponse, Unit]
  ): Request[RemoveAttributesResponse, AWSError] = js.native
  /**
    * Creates and sends a direct message.
    */
  def sendMessages(): Request[SendMessagesResponse, AWSError] = js.native
  def sendMessages(callback: js.Function2[/* err */ AWSError, /* data */ SendMessagesResponse, Unit]): Request[SendMessagesResponse, AWSError] = js.native
  /**
    * Creates and sends a direct message.
    */
  def sendMessages(params: SendMessagesRequest): Request[SendMessagesResponse, AWSError] = js.native
  def sendMessages(
    params: SendMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendMessagesResponse, Unit]
  ): Request[SendMessagesResponse, AWSError] = js.native
  /**
    * Creates and sends a message to a list of users.
    */
  def sendUsersMessages(): Request[SendUsersMessagesResponse, AWSError] = js.native
  def sendUsersMessages(callback: js.Function2[/* err */ AWSError, /* data */ SendUsersMessagesResponse, Unit]): Request[SendUsersMessagesResponse, AWSError] = js.native
  /**
    * Creates and sends a message to a list of users.
    */
  def sendUsersMessages(params: SendUsersMessagesRequest): Request[SendUsersMessagesResponse, AWSError] = js.native
  def sendUsersMessages(
    params: SendUsersMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendUsersMessagesResponse, Unit]
  ): Request[SendUsersMessagesResponse, AWSError] = js.native
  /**
    * Adds one or more tags (keys and values) to an application, campaign, or segment.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds one or more tags (keys and values) to an application, campaign, or segment.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes one or more tags (keys and values) from an application, campaign, or segment.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes one or more tags (keys and values) from an application, campaign, or segment.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the ADM channel settings for an application.
    */
  def updateAdmChannel(): Request[UpdateAdmChannelResponse, AWSError] = js.native
  def updateAdmChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAdmChannelResponse, Unit]): Request[UpdateAdmChannelResponse, AWSError] = js.native
  /**
    * Updates the ADM channel settings for an application.
    */
  def updateAdmChannel(params: UpdateAdmChannelRequest): Request[UpdateAdmChannelResponse, AWSError] = js.native
  def updateAdmChannel(
    params: UpdateAdmChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAdmChannelResponse, Unit]
  ): Request[UpdateAdmChannelResponse, AWSError] = js.native
  /**
    * Updates the APNs channel settings for an application.
    */
  def updateApnsChannel(): Request[UpdateApnsChannelResponse, AWSError] = js.native
  def updateApnsChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsChannelResponse, Unit]): Request[UpdateApnsChannelResponse, AWSError] = js.native
  /**
    * Updates the APNs channel settings for an application.
    */
  def updateApnsChannel(params: UpdateApnsChannelRequest): Request[UpdateApnsChannelResponse, AWSError] = js.native
  def updateApnsChannel(
    params: UpdateApnsChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsChannelResponse, Unit]
  ): Request[UpdateApnsChannelResponse, AWSError] = js.native
  /**
    * Updates the APNs sandbox channel settings for an application.
    */
  def updateApnsSandboxChannel(): Request[UpdateApnsSandboxChannelResponse, AWSError] = js.native
  def updateApnsSandboxChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsSandboxChannelResponse, Unit]): Request[UpdateApnsSandboxChannelResponse, AWSError] = js.native
  /**
    * Updates the APNs sandbox channel settings for an application.
    */
  def updateApnsSandboxChannel(params: UpdateApnsSandboxChannelRequest): Request[UpdateApnsSandboxChannelResponse, AWSError] = js.native
  def updateApnsSandboxChannel(
    params: UpdateApnsSandboxChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsSandboxChannelResponse, Unit]
  ): Request[UpdateApnsSandboxChannelResponse, AWSError] = js.native
  /**
    * Updates the APNs VoIP channel settings for an application.
    */
  def updateApnsVoipChannel(): Request[UpdateApnsVoipChannelResponse, AWSError] = js.native
  def updateApnsVoipChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsVoipChannelResponse, Unit]): Request[UpdateApnsVoipChannelResponse, AWSError] = js.native
  /**
    * Updates the APNs VoIP channel settings for an application.
    */
  def updateApnsVoipChannel(params: UpdateApnsVoipChannelRequest): Request[UpdateApnsVoipChannelResponse, AWSError] = js.native
  def updateApnsVoipChannel(
    params: UpdateApnsVoipChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsVoipChannelResponse, Unit]
  ): Request[UpdateApnsVoipChannelResponse, AWSError] = js.native
  /**
    * Updates the settings for the APNs VoIP sandbox channel for an application.
    */
  def updateApnsVoipSandboxChannel(): Request[UpdateApnsVoipSandboxChannelResponse, AWSError] = js.native
  def updateApnsVoipSandboxChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsVoipSandboxChannelResponse, Unit]): Request[UpdateApnsVoipSandboxChannelResponse, AWSError] = js.native
  /**
    * Updates the settings for the APNs VoIP sandbox channel for an application.
    */
  def updateApnsVoipSandboxChannel(params: UpdateApnsVoipSandboxChannelRequest): Request[UpdateApnsVoipSandboxChannelResponse, AWSError] = js.native
  def updateApnsVoipSandboxChannel(
    params: UpdateApnsVoipSandboxChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApnsVoipSandboxChannelResponse, Unit]
  ): Request[UpdateApnsVoipSandboxChannelResponse, AWSError] = js.native
  /**
    * Updates the settings for an application.
    */
  def updateApplicationSettings(): Request[UpdateApplicationSettingsResponse, AWSError] = js.native
  def updateApplicationSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationSettingsResponse, Unit]): Request[UpdateApplicationSettingsResponse, AWSError] = js.native
  /**
    * Updates the settings for an application.
    */
  def updateApplicationSettings(params: UpdateApplicationSettingsRequest): Request[UpdateApplicationSettingsResponse, AWSError] = js.native
  def updateApplicationSettings(
    params: UpdateApplicationSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationSettingsResponse, Unit]
  ): Request[UpdateApplicationSettingsResponse, AWSError] = js.native
  /**
    * Updates the settings of the Baidu channel for an application.
    */
  def updateBaiduChannel(): Request[UpdateBaiduChannelResponse, AWSError] = js.native
  def updateBaiduChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBaiduChannelResponse, Unit]): Request[UpdateBaiduChannelResponse, AWSError] = js.native
  /**
    * Updates the settings of the Baidu channel for an application.
    */
  def updateBaiduChannel(params: UpdateBaiduChannelRequest): Request[UpdateBaiduChannelResponse, AWSError] = js.native
  def updateBaiduChannel(
    params: UpdateBaiduChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBaiduChannelResponse, Unit]
  ): Request[UpdateBaiduChannelResponse, AWSError] = js.native
  /**
    * Updates the settings for a campaign.
    */
  def updateCampaign(): Request[UpdateCampaignResponse, AWSError] = js.native
  def updateCampaign(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCampaignResponse, Unit]): Request[UpdateCampaignResponse, AWSError] = js.native
  /**
    * Updates the settings for a campaign.
    */
  def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse, AWSError] = js.native
  def updateCampaign(
    params: UpdateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCampaignResponse, Unit]
  ): Request[UpdateCampaignResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the email channel for an application.
    */
  def updateEmailChannel(): Request[UpdateEmailChannelResponse, AWSError] = js.native
  def updateEmailChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmailChannelResponse, Unit]): Request[UpdateEmailChannelResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the email channel for an application.
    */
  def updateEmailChannel(params: UpdateEmailChannelRequest): Request[UpdateEmailChannelResponse, AWSError] = js.native
  def updateEmailChannel(
    params: UpdateEmailChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmailChannelResponse, Unit]
  ): Request[UpdateEmailChannelResponse, AWSError] = js.native
  /**
    * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for an endpoint.
    */
  def updateEndpoint(): Request[UpdateEndpointResponse, AWSError] = js.native
  def updateEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointResponse, Unit]): Request[UpdateEndpointResponse, AWSError] = js.native
  /**
    * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for an endpoint.
    */
  def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse, AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointResponse, Unit]
  ): Request[UpdateEndpointResponse, AWSError] = js.native
  /**
    *  Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for a batch of endpoints.
    */
  def updateEndpointsBatch(): Request[UpdateEndpointsBatchResponse, AWSError] = js.native
  def updateEndpointsBatch(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointsBatchResponse, Unit]): Request[UpdateEndpointsBatchResponse, AWSError] = js.native
  /**
    *  Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for a batch of endpoints.
    */
  def updateEndpointsBatch(params: UpdateEndpointsBatchRequest): Request[UpdateEndpointsBatchResponse, AWSError] = js.native
  def updateEndpointsBatch(
    params: UpdateEndpointsBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointsBatchResponse, Unit]
  ): Request[UpdateEndpointsBatchResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the GCM channel for an application.
    */
  def updateGcmChannel(): Request[UpdateGcmChannelResponse, AWSError] = js.native
  def updateGcmChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGcmChannelResponse, Unit]): Request[UpdateGcmChannelResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the GCM channel for an application.
    */
  def updateGcmChannel(params: UpdateGcmChannelRequest): Request[UpdateGcmChannelResponse, AWSError] = js.native
  def updateGcmChannel(
    params: UpdateGcmChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGcmChannelResponse, Unit]
  ): Request[UpdateGcmChannelResponse, AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def updateSegment(): Request[UpdateSegmentResponse, AWSError] = js.native
  def updateSegment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSegmentResponse, Unit]): Request[UpdateSegmentResponse, AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def updateSegment(params: UpdateSegmentRequest): Request[UpdateSegmentResponse, AWSError] = js.native
  def updateSegment(
    params: UpdateSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSegmentResponse, Unit]
  ): Request[UpdateSegmentResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the SMS channel for an application.
    */
  def updateSmsChannel(): Request[UpdateSmsChannelResponse, AWSError] = js.native
  def updateSmsChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSmsChannelResponse, Unit]): Request[UpdateSmsChannelResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the SMS channel for an application.
    */
  def updateSmsChannel(params: UpdateSmsChannelRequest): Request[UpdateSmsChannelResponse, AWSError] = js.native
  def updateSmsChannel(
    params: UpdateSmsChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSmsChannelResponse, Unit]
  ): Request[UpdateSmsChannelResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the voice channel for an application.
    */
  def updateVoiceChannel(): Request[UpdateVoiceChannelResponse, AWSError] = js.native
  def updateVoiceChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceChannelResponse, Unit]): Request[UpdateVoiceChannelResponse, AWSError] = js.native
  /**
    * Updates the status and settings of the voice channel for an application.
    */
  def updateVoiceChannel(params: UpdateVoiceChannelRequest): Request[UpdateVoiceChannelResponse, AWSError] = js.native
  def updateVoiceChannel(
    params: UpdateVoiceChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceChannelResponse, Unit]
  ): Request[UpdateVoiceChannelResponse, AWSError] = js.native
}

