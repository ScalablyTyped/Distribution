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
    * Creates or updates an app.
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
    * Creates or updates an app.
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
    * Creates or updates a campaign.
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
    * Creates or updates a campaign.
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
    * Creates an export job.
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
    * Creates an export job.
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
    * Creates or updates an import job.
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
    * Creates or updates an import job.
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
    * Used to create or update a segment.
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
    * Used to create or update a segment.
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
    * Delete an ADM channel.
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
    * Delete an ADM channel.
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
    * Deletes the APNs channel for an app.
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
    * Deletes the APNs channel for an app.
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
    * Delete an APNS sandbox channel.
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
    * Delete an APNS sandbox channel.
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
    * Delete an APNS VoIP channel
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
    * Delete an APNS VoIP channel
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
    * Delete an APNS VoIP sandbox channel
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
    * Delete an APNS VoIP sandbox channel
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
    * Deletes an app.
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
    * Deletes an app.
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
    * Delete a BAIDU GCM channel
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
    * Delete a BAIDU GCM channel
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
    * Deletes a campaign.
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
    * Deletes a campaign.
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
    * Delete an email channel.
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
    * Delete an email channel.
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
    * Deletes an endpoint.
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
    * Deletes an endpoint.
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
    * Deletes the event stream for an app.
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
    * Deletes the event stream for an app.
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
    * Deletes the GCM channel for an app.
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
    * Deletes the GCM channel for an app.
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
    * Deletes a segment.
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
    * Deletes a segment.
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
    * Delete an SMS channel.
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
    * Delete an SMS channel.
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
    * Deletes endpoints that are associated with a User ID.
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
    * Deletes endpoints that are associated with a User ID.
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
    * Delete an Voice channel
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
    * Delete an Voice channel
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
    * Get an ADM channel.
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
    * Get an ADM channel.
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
    * Returns information about the APNs channel for an app.
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
    * Returns information about the APNs channel for an app.
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
    * Get an APNS sandbox channel.
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
    * Get an APNS sandbox channel.
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
    * Get an APNS VoIP channel
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
    * Get an APNS VoIP channel
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
    * Get an APNS VoIPSandbox channel
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
    * Get an APNS VoIPSandbox channel
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
    * Returns information about an app.
    */
  def getApp(): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about an app.
    */
  def getApp(params: GetAppRequest): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    params: GetAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used to request the settings for an app.
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
    * Used to request the settings for an app.
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
    * Returns information about your apps.
    */
  def getApps(): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApps(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about your apps.
    */
  def getApps(params: GetAppsRequest): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApps(
    params: GetAppsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a BAIDU GCM channel
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
    * Get a BAIDU GCM channel
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
    * Returns information about a campaign.
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
    * Returns information about a campaign.
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
    * Returns information about the activity performed by a campaign.
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
    * Returns information about the activity performed by a campaign.
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
    * Returns information about a specific version of a campaign.
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
    * Returns information about a specific version of a campaign.
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
    * Returns information about your campaign versions.
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
    * Returns information about your campaign versions.
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
    * Returns information about your campaigns.
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
    * Returns information about your campaigns.
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
    * Get all channels.
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
    * Get all channels.
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
    * Get an email channel.
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
    * Get an email channel.
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
    * Returns information about an endpoint.
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
    * Returns information about an endpoint.
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
    * Returns the event stream for an app.
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
    * Returns the event stream for an app.
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
    * Returns information about an export job.
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
    * Returns information about an export job.
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
    * Returns information about your export jobs.
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
    * Returns information about your export jobs.
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
    * Returns information about the GCM channel for an app.
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
    * Returns information about the GCM channel for an app.
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
    * Returns information about an import job.
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
    * Returns information about an import job.
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
    * Returns information about your import jobs.
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
    * Returns information about your import jobs.
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
    * Returns information about a segment.
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
    * Returns information about a segment.
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
    * Returns a list of export jobs for a specific segment.
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
    * Returns a list of export jobs for a specific segment.
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
    * Returns a list of import jobs for a specific segment.
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
    * Returns a list of import jobs for a specific segment.
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
    * Returns information about a segment version.
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
    * Returns information about a segment version.
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
    * Returns information about your segment versions.
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
    * Returns information about your segment versions.
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
    * Used to get information about your segments.
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
    * Used to get information about your segments.
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
    * Get an SMS channel.
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
    * Get an SMS channel.
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
    * Returns information about the endpoints that are associated with a User ID.
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
    * Returns information about the endpoints that are associated with a User ID.
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
    * Get a Voice Channel
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
    * Get a Voice Channel
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
    * 
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
    * 
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
    * Returns information about the specified phone number.
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
    * Returns information about the specified phone number.
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
    * Use to create or update the event stream for an app.
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
    * Use to create or update the event stream for an app.
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
    * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
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
    * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
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
    * Used to remove the attributes for an app
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
    * Used to remove the attributes for an app
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
    * Used to send a direct message.
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
    * Used to send a direct message.
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
    * Used to send a message to a list of users.
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
    * Used to send a message to a list of users.
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
    * 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an ADM channel.
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
    * Update an ADM channel.
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
    * Use to update the APNs channel for an app.
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
    * Use to update the APNs channel for an app.
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
    * Update an APNS sandbox channel.
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
    * Update an APNS sandbox channel.
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
    * Update an APNS VoIP channel
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
    * Update an APNS VoIP channel
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
    * Update an APNS VoIP sandbox channel
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
    * Update an APNS VoIP sandbox channel
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
    * Used to update the settings for an app.
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
    * Used to update the settings for an app.
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
    * Update a BAIDU GCM channel
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
    * Update a BAIDU GCM channel
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
    * Use to update a campaign.
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
    * Use to update a campaign.
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
    * Update an email channel.
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
    * Update an email channel.
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
    * Creates or updates an endpoint.
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
    * Creates or updates an endpoint.
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
    * Use to update a batch of endpoints.
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
    * Use to update a batch of endpoints.
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
    * Use to update the GCM channel for an app.
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
    * Use to update the GCM channel for an app.
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
    * Used to update a segment.
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
    * Used to update a segment.
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
    * Update an SMS channel.
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
    * Update an SMS channel.
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
    * Update an Voice channel
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
    * Update an Voice channel
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

