package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pinpoint
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Pinpoint: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    *  Creates an application.
    */
  def createApp(): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates an application.
    */
  def createApp(params: CreateAppRequest): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
    */
  def createCampaign(): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
    */
  def createCampaign(params: CreateCampaignRequest): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCampaign(
    params: CreateCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new export job for an application.
    */
  def createExportJob(): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createExportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new export job for an application.
    */
  def createExportJob(params: CreateExportJobRequest): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createExportJob(
    params: CreateExportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new import job for an application.
    */
  def createImportJob(): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new import job for an application.
    */
  def createImportJob(params: CreateImportJobRequest): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createImportJob(
    params: CreateImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def createSegment(): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def createSegment(params: CreateSegmentRequest): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSegment(
    params: CreateSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the ADM channel for an application and deletes any existing settings for the channel.
    */
  def deleteAdmChannel(): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAdmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the ADM channel for an application and deletes any existing settings for the channel.
    */
  def deleteAdmChannel(params: DeleteAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAdmChannel(
    params: DeleteAdmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsChannel(params: DeleteApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsChannel(
    params: DeleteApnsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsSandboxChannel(params: DeleteApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsSandboxChannel(
    params: DeleteApnsSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsVoipChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipChannel(params: DeleteApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsVoipChannel(
    params: DeleteApnsVoipChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsVoipSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
    */
  def deleteApnsVoipSandboxChannel(params: DeleteApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApnsVoipSandboxChannel(
    params: DeleteApnsVoipSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApp(params: DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the Baidu channel for an application and deletes any existing settings for the channel.
    */
  def deleteBaiduChannel(): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBaiduChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the Baidu channel for an application and deletes any existing settings for the channel.
    */
  def deleteBaiduChannel(params: DeleteBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBaiduChannel(
    params: DeleteBaiduChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a campaign from an application.
    */
  def deleteCampaign(): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a campaign from an application.
    */
  def deleteCampaign(params: DeleteCampaignRequest): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCampaign(
    params: DeleteCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the email channel for an application and deletes any existing settings for the channel.
    */
  def deleteEmailChannel(): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEmailChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the email channel for an application and deletes any existing settings for the channel.
    */
  def deleteEmailChannel(params: DeleteEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEmailChannel(
    params: DeleteEmailChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an endpoint from an application.
    */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an endpoint from an application.
    */
  def deleteEndpoint(params: DeleteEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the event stream for an application.
    */
  def deleteEventStream(): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the event stream for an application.
    */
  def deleteEventStream(params: DeleteEventStreamRequest): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventStream(
    params: DeleteEventStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the GCM channel for an application and deletes any existing settings for the channel.
    */
  def deleteGcmChannel(): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGcmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the GCM channel for an application and deletes any existing settings for the channel.
    */
  def deleteGcmChannel(params: DeleteGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGcmChannel(
    params: DeleteGcmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a segment from an application.
    */
  def deleteSegment(): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a segment from an application.
    */
  def deleteSegment(params: DeleteSegmentRequest): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSegment(
    params: DeleteSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the SMS channel for an application and deletes any existing settings for the channel.
    */
  def deleteSmsChannel(): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSmsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the SMS channel for an application and deletes any existing settings for the channel.
    */
  def deleteSmsChannel(params: DeleteSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSmsChannel(
    params: DeleteSmsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all the endpoints that are associated with a specific user ID.
    */
  def deleteUserEndpoints(): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all the endpoints that are associated with a specific user ID.
    */
  def deleteUserEndpoints(params: DeleteUserEndpointsRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserEndpoints(
    params: DeleteUserEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the voice channel for an application and deletes any existing settings for the channel.
    */
  def deleteVoiceChannel(): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the voice channel for an application and deletes any existing settings for the channel.
    */
  def deleteVoiceChannel(params: DeleteVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceChannel(
    params: DeleteVoiceChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the ADM channel for an application.
    */
  def getAdmChannel(): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAdmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the ADM channel for an application.
    */
  def getAdmChannel(params: GetAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAdmChannel(
    params: GetAdmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs channel for an application.
    */
  def getApnsChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs channel for an application.
    */
  def getApnsChannel(params: GetApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsChannel(
    params: GetApnsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs sandbox channel for an application.
    */
  def getApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs sandbox channel for an application.
    */
  def getApnsSandboxChannel(params: GetApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsSandboxChannel(
    params: GetApnsSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP channel for an application.
    */
  def getApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsVoipChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP channel for an application.
    */
  def getApnsVoipChannel(params: GetApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsVoipChannel(
    params: GetApnsVoipChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
    */
  def getApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsVoipSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
    */
  def getApnsVoipSandboxChannel(params: GetApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApnsVoipSandboxChannel(
    params: GetApnsVoipSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about an application.
    */
  def getApp(): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about an application.
    */
  def getApp(params: GetAppRequest): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    params: GetAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the settings for an application.
    */
  def getApplicationSettings(): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplicationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the settings for an application.
    */
  def getApplicationSettings(params: GetApplicationSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplicationSettings(
    params: GetApplicationSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about all of your applications.
    */
  def getApps(): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApps(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about all of your applications.
    */
  def getApps(params: GetAppsRequest): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApps(
    params: GetAppsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.
    */
  def getBaiduChannel(): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBaiduChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.
    */
  def getBaiduChannel(params: GetBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBaiduChannel(
    params: GetBaiduChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a campaign.
    */
  def getCampaign(): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a campaign.
    */
  def getCampaign(params: GetCampaignRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaign(
    params: GetCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the activity performed by a campaign.
    */
  def getCampaignActivities(): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaignActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the activity performed by a campaign.
    */
  def getCampaignActivities(params: GetCampaignActivitiesRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaignActivities(
    params: GetCampaignActivitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
    */
  def getCampaignVersion(): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaignVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
    */
  def getCampaignVersion(params: GetCampaignVersionRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaignVersion(
    params: GetCampaignVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all versions of a specific campaign.
    */
  def getCampaignVersions(): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaignVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all versions of a specific campaign.
    */
  def getCampaignVersions(params: GetCampaignVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaignVersions(
    params: GetCampaignVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all the campaigns that are associated with an application.
    */
  def getCampaigns(): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaigns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status, configuration, and other settings for all the campaigns that are associated with an application.
    */
  def getCampaigns(params: GetCampaignsRequest): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCampaigns(
    params: GetCampaignsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCampaignsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCampaignsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the history and status of each channel for an application.
    */
  def getChannels(): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the history and status of each channel for an application.
    */
  def getChannels(params: GetChannelsRequest): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getChannels(
    params: GetChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the email channel for an application.
    */
  def getEmailChannel(): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEmailChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the email channel for an application.
    */
  def getEmailChannel(params: GetEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEmailChannel(
    params: GetEmailChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the settings and attributes of a specific endpoint for an application.
    */
  def getEndpoint(): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the settings and attributes of a specific endpoint for an application.
    */
  def getEndpoint(params: GetEndpointRequest): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEndpoint(
    params: GetEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the event stream settings for an application.
    */
  def getEventStream(): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEventStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the event stream settings for an application.
    */
  def getEventStream(params: GetEventStreamRequest): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEventStream(
    params: GetEventStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific export job for an application.
    */
  def getExportJob(): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific export job for an application.
    */
  def getExportJob(params: GetExportJobRequest): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExportJob(
    params: GetExportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetExportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the export jobs for an application.
    */
  def getExportJobs(): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the export jobs for an application.
    */
  def getExportJobs(params: GetExportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getExportJobs(
    params: GetExportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the GCM channel for an application.
    */
  def getGcmChannel(): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGcmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the GCM channel for an application.
    */
  def getGcmChannel(params: GetGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGcmChannel(
    params: GetGcmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific import job for an application.
    */
  def getImportJob(): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of a specific import job for an application.
    */
  def getImportJob(params: GetImportJobRequest): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getImportJob(
    params: GetImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the import jobs for an application.
    */
  def getImportJobs(): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of all the import jobs for an application.
    */
  def getImportJobs(params: GetImportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getImportJobs(
    params: GetImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific segment that's associated with an application.
    */
  def getSegment(): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific segment that's associated with an application.
    */
  def getSegment(params: GetSegmentRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegment(
    params: GetSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the export jobs for a segment.
    */
  def getSegmentExportJobs(): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentExportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the export jobs for a segment.
    */
  def getSegmentExportJobs(params: GetSegmentExportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentExportJobs(
    params: GetSegmentExportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentExportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the import jobs for a segment.
    */
  def getSegmentImportJobs(): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the import jobs for a segment.
    */
  def getSegmentImportJobs(params: GetSegmentImportJobsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentImportJobs(
    params: GetSegmentImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment that's associated with an application.
    */
  def getSegmentVersion(): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment that's associated with an application.
    */
  def getSegmentVersion(params: GetSegmentVersionRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentVersion(
    params: GetSegmentVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all versions of a specific segment that's associated with an application.
    */
  def getSegmentVersions(): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all versions of a specific segment that's associated with an application.
    */
  def getSegmentVersions(params: GetSegmentVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegmentVersions(
    params: GetSegmentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all the segments that are associated with an application.
    */
  def getSegments(): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the configuration, dimension, and other settings for all the segments that are associated with an application.
    */
  def getSegments(params: GetSegmentsRequest): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSegments(
    params: GetSegmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSegmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSegmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the SMS channel for an application.
    */
  def getSmsChannel(): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSmsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the SMS channel for an application.
    */
  def getSmsChannel(params: GetSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSmsChannel(
    params: GetSmsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about all the endpoints that are associated with a specific user ID.
    */
  def getUserEndpoints(): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about all the endpoints that are associated with a specific user ID.
    */
  def getUserEndpoints(params: GetUserEndpointsRequest): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserEndpoints(
    params: GetUserEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the voice channel for an application.
    */
  def getVoiceChannel(): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the status and settings of the voice channel for an application.
    */
  def getVoiceChannel(params: GetVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceChannel(
    params: GetVoiceChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a phone number.
    */
  def phoneNumberValidate(): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def phoneNumberValidate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PhoneNumberValidateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a phone number.
    */
  def phoneNumberValidate(params: PhoneNumberValidateRequest): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def phoneNumberValidate(
    params: PhoneNumberValidateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PhoneNumberValidateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PhoneNumberValidateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new event stream for an application or updates the settings of an existing event stream for an application.
    */
  def putEventStream(): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEventStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new event stream for an application or updates the settings of an existing event stream for an application.
    */
  def putEventStream(params: PutEventStreamRequest): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEventStream(
    params: PutEventStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEventStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are associated with.
    */
  def putEvents(): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are associated with.
    */
  def putEvents(params: PutEventsRequest): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEvents(
    params: PutEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an application.
    */
  def removeAttributes(): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an application.
    */
  def removeAttributes(params: RemoveAttributesRequest): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeAttributes(
    params: RemoveAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates and sends a direct message.
    */
  def sendMessages(): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendMessages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates and sends a direct message.
    */
  def sendMessages(params: SendMessagesRequest): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendMessages(
    params: SendMessagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates and sends a message to a list of users.
    */
  def sendUsersMessages(): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendUsersMessages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendUsersMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates and sends a message to a list of users.
    */
  def sendUsersMessages(params: SendUsersMessagesRequest): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendUsersMessages(
    params: SendUsersMessagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendUsersMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendUsersMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags (keys and values) to an application, campaign, or segment.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags (keys and values) to an application, campaign, or segment.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags (keys and values) from an application, campaign, or segment.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags (keys and values) from an application, campaign, or segment.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the ADM channel settings for an application.
    */
  def updateAdmChannel(): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAdmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the ADM channel settings for an application.
    */
  def updateAdmChannel(params: UpdateAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAdmChannel(
    params: UpdateAdmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAdmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the APNs channel settings for an application.
    */
  def updateApnsChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the APNs channel settings for an application.
    */
  def updateApnsChannel(params: UpdateApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsChannel(
    params: UpdateApnsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the APNs sandbox channel settings for an application.
    */
  def updateApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the APNs sandbox channel settings for an application.
    */
  def updateApnsSandboxChannel(params: UpdateApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsSandboxChannel(
    params: UpdateApnsSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the APNs VoIP channel settings for an application.
    */
  def updateApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsVoipChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the APNs VoIP channel settings for an application.
    */
  def updateApnsVoipChannel(params: UpdateApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsVoipChannel(
    params: UpdateApnsVoipChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for the APNs VoIP sandbox channel for an application.
    */
  def updateApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsVoipSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for the APNs VoIP sandbox channel for an application.
    */
  def updateApnsVoipSandboxChannel(params: UpdateApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApnsVoipSandboxChannel(
    params: UpdateApnsVoipSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApnsVoipSandboxChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for an application.
    */
  def updateApplicationSettings(): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApplicationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for an application.
    */
  def updateApplicationSettings(params: UpdateApplicationSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApplicationSettings(
    params: UpdateApplicationSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of the Baidu channel for an application.
    */
  def updateBaiduChannel(): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBaiduChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of the Baidu channel for an application.
    */
  def updateBaiduChannel(params: UpdateBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBaiduChannel(
    params: UpdateBaiduChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBaiduChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for a campaign.
    */
  def updateCampaign(): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for a campaign.
    */
  def updateCampaign(params: UpdateCampaignRequest): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCampaign(
    params: UpdateCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCampaignResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the email channel for an application.
    */
  def updateEmailChannel(): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEmailChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the email channel for an application.
    */
  def updateEmailChannel(params: UpdateEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEmailChannel(
    params: UpdateEmailChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEmailChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for an endpoint.
    */
  def updateEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for an endpoint.
    */
  def updateEndpoint(params: UpdateEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for a batch of endpoints.
    */
  def updateEndpointsBatch(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpointsBatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointsBatchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes properties) for a batch of endpoints.
    */
  def updateEndpointsBatch(params: UpdateEndpointsBatchRequest): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpointsBatch(
    params: UpdateEndpointsBatchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointsBatchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointsBatchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the GCM channel for an application.
    */
  def updateGcmChannel(): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGcmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the GCM channel for an application.
    */
  def updateGcmChannel(params: UpdateGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGcmChannel(
    params: UpdateGcmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGcmChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def updateSegment(): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.
    */
  def updateSegment(params: UpdateSegmentRequest): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSegment(
    params: UpdateSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSegmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the SMS channel for an application.
    */
  def updateSmsChannel(): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSmsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the SMS channel for an application.
    */
  def updateSmsChannel(params: UpdateSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSmsChannel(
    params: UpdateSmsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSmsChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the voice channel for an application.
    */
  def updateVoiceChannel(): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVoiceChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status and settings of the voice channel for an application.
    */
  def updateVoiceChannel(params: UpdateVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVoiceChannel(
    params: UpdateVoiceChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

