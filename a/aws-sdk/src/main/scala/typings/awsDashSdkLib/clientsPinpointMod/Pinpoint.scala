package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pinpoint
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Pinpoint: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsPinpointMod.PinpointNs.ClientConfiguration = js.native
  /**
     * Creates or updates an app.
     */
  def createApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an app.
     */
  def createApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an app.
     */
  def createApp(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an app.
     */
  def createApp(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a campaign.
     */
  def createCampaign(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a campaign.
     */
  def createCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a campaign.
     */
  def createCampaign(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a campaign.
     */
  def createCampaign(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export job.
     */
  def createExportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export job.
     */
  def createExportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export job.
     */
  def createExportJob(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export job.
     */
  def createExportJob(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an import job.
     */
  def createImportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an import job.
     */
  def createImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an import job.
     */
  def createImportJob(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an import job.
     */
  def createImportJob(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to create or update a segment.
     */
  def createSegment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to create or update a segment.
     */
  def createSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to create or update a segment.
     */
  def createSegment(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to create or update a segment.
     */
  def createSegment(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.CreateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an ADM channel.
     */
  def deleteAdmChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an ADM channel.
     */
  def deleteAdmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an ADM channel.
     */
  def deleteAdmChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an ADM channel.
     */
  def deleteAdmChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the APNs channel for an app.
     */
  def deleteApnsChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the APNs channel for an app.
     */
  def deleteApnsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the APNs channel for an app.
     */
  def deleteApnsChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the APNs channel for an app.
     */
  def deleteApnsChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS sandbox channel.
     */
  def deleteApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS sandbox channel.
     */
  def deleteApnsSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS sandbox channel.
     */
  def deleteApnsSandboxChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS sandbox channel.
     */
  def deleteApnsSandboxChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP channel
     */
  def deleteApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP channel
     */
  def deleteApnsVoipChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP channel
     */
  def deleteApnsVoipChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP channel
     */
  def deleteApnsVoipChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP sandbox channel
     */
  def deleteApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP sandbox channel
     */
  def deleteApnsVoipSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP sandbox channel
     */
  def deleteApnsVoipSandboxChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an APNS VoIP sandbox channel
     */
  def deleteApnsVoipSandboxChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an app.
     */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an app.
     */
  def deleteApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an app.
     */
  def deleteApp(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an app.
     */
  def deleteApp(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a BAIDU GCM channel
     */
  def deleteBaiduChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a BAIDU GCM channel
     */
  def deleteBaiduChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a BAIDU GCM channel
     */
  def deleteBaiduChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a BAIDU GCM channel
     */
  def deleteBaiduChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a campaign.
     */
  def deleteCampaign(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a campaign.
     */
  def deleteCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a campaign.
     */
  def deleteCampaign(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a campaign.
     */
  def deleteCampaign(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an email channel.
     */
  def deleteEmailChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an email channel.
     */
  def deleteEmailChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an email channel.
     */
  def deleteEmailChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an email channel.
     */
  def deleteEmailChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an endpoint.
     */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an endpoint.
     */
  def deleteEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an endpoint.
     */
  def deleteEndpoint(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an endpoint.
     */
  def deleteEndpoint(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the event stream for an app.
     */
  def deleteEventStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the event stream for an app.
     */
  def deleteEventStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the event stream for an app.
     */
  def deleteEventStream(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the event stream for an app.
     */
  def deleteEventStream(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the GCM channel for an app.
     */
  def deleteGcmChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the GCM channel for an app.
     */
  def deleteGcmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the GCM channel for an app.
     */
  def deleteGcmChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the GCM channel for an app.
     */
  def deleteGcmChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a segment.
     */
  def deleteSegment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a segment.
     */
  def deleteSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a segment.
     */
  def deleteSegment(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a segment.
     */
  def deleteSegment(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an SMS channel.
     */
  def deleteSmsChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an SMS channel.
     */
  def deleteSmsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an SMS channel.
     */
  def deleteSmsChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an SMS channel.
     */
  def deleteSmsChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes endpoints that are associated with a User ID.
     */
  def deleteUserEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes endpoints that are associated with a User ID.
     */
  def deleteUserEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes endpoints that are associated with a User ID.
     */
  def deleteUserEndpoints(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes endpoints that are associated with a User ID.
     */
  def deleteUserEndpoints(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an Voice channel
     */
  def deleteVoiceChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an Voice channel
     */
  def deleteVoiceChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an Voice channel
     */
  def deleteVoiceChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an Voice channel
     */
  def deleteVoiceChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.DeleteVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an ADM channel.
     */
  def getAdmChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an ADM channel.
     */
  def getAdmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an ADM channel.
     */
  def getAdmChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an ADM channel.
     */
  def getAdmChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the APNs channel for an app.
     */
  def getApnsChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the APNs channel for an app.
     */
  def getApnsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the APNs channel for an app.
     */
  def getApnsChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the APNs channel for an app.
     */
  def getApnsChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS sandbox channel.
     */
  def getApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS sandbox channel.
     */
  def getApnsSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS sandbox channel.
     */
  def getApnsSandboxChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS sandbox channel.
     */
  def getApnsSandboxChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIP channel
     */
  def getApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIP channel
     */
  def getApnsVoipChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIP channel
     */
  def getApnsVoipChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIP channel
     */
  def getApnsVoipChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIPSandbox channel
     */
  def getApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIPSandbox channel
     */
  def getApnsVoipSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIPSandbox channel
     */
  def getApnsVoipSandboxChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an APNS VoIPSandbox channel
     */
  def getApnsVoipSandboxChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an app.
     */
  def getApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an app.
     */
  def getApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an app.
     */
  def getApp(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an app.
     */
  def getApp(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to request the settings for an app.
     */
  def getApplicationSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to request the settings for an app.
     */
  def getApplicationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to request the settings for an app.
     */
  def getApplicationSettings(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to request the settings for an app.
     */
  def getApplicationSettings(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your apps.
     */
  def getApps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your apps.
     */
  def getApps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your apps.
     */
  def getApps(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your apps.
     */
  def getApps(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetAppsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a BAIDU GCM channel
     */
  def getBaiduChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a BAIDU GCM channel
     */
  def getBaiduChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a BAIDU GCM channel
     */
  def getBaiduChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a BAIDU GCM channel
     */
  def getBaiduChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a campaign.
     */
  def getCampaign(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a campaign.
     */
  def getCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a campaign.
     */
  def getCampaign(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a campaign.
     */
  def getCampaign(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the activity performed by a campaign.
     */
  def getCampaignActivities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the activity performed by a campaign.
     */
  def getCampaignActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the activity performed by a campaign.
     */
  def getCampaignActivities(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the activity performed by a campaign.
     */
  def getCampaignActivities(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific version of a campaign.
     */
  def getCampaignVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific version of a campaign.
     */
  def getCampaignVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific version of a campaign.
     */
  def getCampaignVersion(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a specific version of a campaign.
     */
  def getCampaignVersion(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaign versions.
     */
  def getCampaignVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaign versions.
     */
  def getCampaignVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaign versions.
     */
  def getCampaignVersions(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaign versions.
     */
  def getCampaignVersions(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaigns.
     */
  def getCampaigns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaigns.
     */
  def getCampaigns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaigns.
     */
  def getCampaigns(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your campaigns.
     */
  def getCampaigns(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetCampaignsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get all channels.
     */
  def getChannels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get all channels.
     */
  def getChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get all channels.
     */
  def getChannels(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get all channels.
     */
  def getChannels(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an email channel.
     */
  def getEmailChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an email channel.
     */
  def getEmailChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an email channel.
     */
  def getEmailChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an email channel.
     */
  def getEmailChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an endpoint.
     */
  def getEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an endpoint.
     */
  def getEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an endpoint.
     */
  def getEndpoint(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an endpoint.
     */
  def getEndpoint(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the event stream for an app.
     */
  def getEventStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the event stream for an app.
     */
  def getEventStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the event stream for an app.
     */
  def getEventStream(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the event stream for an app.
     */
  def getEventStream(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an export job.
     */
  def getExportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an export job.
     */
  def getExportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an export job.
     */
  def getExportJob(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an export job.
     */
  def getExportJob(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your export jobs.
     */
  def getExportJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your export jobs.
     */
  def getExportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your export jobs.
     */
  def getExportJobs(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your export jobs.
     */
  def getExportJobs(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the GCM channel for an app.
     */
  def getGcmChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the GCM channel for an app.
     */
  def getGcmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the GCM channel for an app.
     */
  def getGcmChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the GCM channel for an app.
     */
  def getGcmChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an import job.
     */
  def getImportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an import job.
     */
  def getImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an import job.
     */
  def getImportJob(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an import job.
     */
  def getImportJob(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your import jobs.
     */
  def getImportJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your import jobs.
     */
  def getImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your import jobs.
     */
  def getImportJobs(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your import jobs.
     */
  def getImportJobs(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment.
     */
  def getSegment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment.
     */
  def getSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment.
     */
  def getSegment(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment.
     */
  def getSegment(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of export jobs for a specific segment.
     */
  def getSegmentExportJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of export jobs for a specific segment.
     */
  def getSegmentExportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of export jobs for a specific segment.
     */
  def getSegmentExportJobs(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of export jobs for a specific segment.
     */
  def getSegmentExportJobs(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentExportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of import jobs for a specific segment.
     */
  def getSegmentImportJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of import jobs for a specific segment.
     */
  def getSegmentImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of import jobs for a specific segment.
     */
  def getSegmentImportJobs(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of import jobs for a specific segment.
     */
  def getSegmentImportJobs(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment version.
     */
  def getSegmentVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment version.
     */
  def getSegmentVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment version.
     */
  def getSegmentVersion(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a segment version.
     */
  def getSegmentVersion(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your segment versions.
     */
  def getSegmentVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your segment versions.
     */
  def getSegmentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your segment versions.
     */
  def getSegmentVersions(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about your segment versions.
     */
  def getSegmentVersions(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to get information about your segments.
     */
  def getSegments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to get information about your segments.
     */
  def getSegments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to get information about your segments.
     */
  def getSegments(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to get information about your segments.
     */
  def getSegments(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSegmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an SMS channel.
     */
  def getSmsChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an SMS channel.
     */
  def getSmsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an SMS channel.
     */
  def getSmsChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get an SMS channel.
     */
  def getSmsChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints that are associated with a User ID.
     */
  def getUserEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints that are associated with a User ID.
     */
  def getUserEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints that are associated with a User ID.
     */
  def getUserEndpoints(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the endpoints that are associated with a User ID.
     */
  def getUserEndpoints(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetUserEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a Voice Channel
     */
  def getVoiceChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a Voice Channel
     */
  def getVoiceChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a Voice Channel
     */
  def getVoiceChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a Voice Channel
     */
  def getVoiceChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.GetVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified phone number.
     */
  def phoneNumberValidate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified phone number.
     */
  def phoneNumberValidate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified phone number.
     */
  def phoneNumberValidate(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified phone number.
     */
  def phoneNumberValidate(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PhoneNumberValidateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to create or update the event stream for an app.
     */
  def putEventStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to create or update the event stream for an app.
     */
  def putEventStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to create or update the event stream for an app.
     */
  def putEventStream(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to create or update the event stream for an app.
     */
  def putEventStream(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventStreamResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
     */
  def putEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
     */
  def putEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
     */
  def putEvents(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to record events for endpoints. This method creates events and creates or updates the endpoints that those events are associated with.
     */
  def putEvents(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.PutEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to remove the attributes for an app
     */
  def removeAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to remove the attributes for an app
     */
  def removeAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to remove the attributes for an app
     */
  def removeAttributes(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to remove the attributes for an app
     */
  def removeAttributes(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.RemoveAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a direct message.
     */
  def sendMessages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a direct message.
     */
  def sendMessages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a direct message.
     */
  def sendMessages(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a direct message.
     */
  def sendMessages(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a message to a list of users.
     */
  def sendUsersMessages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a message to a list of users.
     */
  def sendUsersMessages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a message to a list of users.
     */
  def sendUsersMessages(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to send a message to a list of users.
     */
  def sendUsersMessages(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.SendUsersMessagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an ADM channel.
     */
  def updateAdmChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an ADM channel.
     */
  def updateAdmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an ADM channel.
     */
  def updateAdmChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an ADM channel.
     */
  def updateAdmChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateAdmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the APNs channel for an app.
     */
  def updateApnsChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the APNs channel for an app.
     */
  def updateApnsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the APNs channel for an app.
     */
  def updateApnsChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the APNs channel for an app.
     */
  def updateApnsChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS sandbox channel.
     */
  def updateApnsSandboxChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS sandbox channel.
     */
  def updateApnsSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS sandbox channel.
     */
  def updateApnsSandboxChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS sandbox channel.
     */
  def updateApnsSandboxChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP channel
     */
  def updateApnsVoipChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP channel
     */
  def updateApnsVoipChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP channel
     */
  def updateApnsVoipChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP channel
     */
  def updateApnsVoipChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP sandbox channel
     */
  def updateApnsVoipSandboxChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP sandbox channel
     */
  def updateApnsVoipSandboxChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP sandbox channel
     */
  def updateApnsVoipSandboxChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an APNS VoIP sandbox channel
     */
  def updateApnsVoipSandboxChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApnsVoipSandboxChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update the settings for an app.
     */
  def updateApplicationSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update the settings for an app.
     */
  def updateApplicationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update the settings for an app.
     */
  def updateApplicationSettings(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update the settings for an app.
     */
  def updateApplicationSettings(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateApplicationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a BAIDU GCM channel
     */
  def updateBaiduChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a BAIDU GCM channel
     */
  def updateBaiduChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a BAIDU GCM channel
     */
  def updateBaiduChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update a BAIDU GCM channel
     */
  def updateBaiduChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateBaiduChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a campaign.
     */
  def updateCampaign(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a campaign.
     */
  def updateCampaign(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a campaign.
     */
  def updateCampaign(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a campaign.
     */
  def updateCampaign(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateCampaignResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an email channel.
     */
  def updateEmailChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an email channel.
     */
  def updateEmailChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an email channel.
     */
  def updateEmailChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an email channel.
     */
  def updateEmailChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEmailChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an endpoint.
     */
  def updateEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an endpoint.
     */
  def updateEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an endpoint.
     */
  def updateEndpoint(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an endpoint.
     */
  def updateEndpoint(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a batch of endpoints.
     */
  def updateEndpointsBatch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a batch of endpoints.
     */
  def updateEndpointsBatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a batch of endpoints.
     */
  def updateEndpointsBatch(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update a batch of endpoints.
     */
  def updateEndpointsBatch(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateEndpointsBatchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the GCM channel for an app.
     */
  def updateGcmChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the GCM channel for an app.
     */
  def updateGcmChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the GCM channel for an app.
     */
  def updateGcmChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use to update the GCM channel for an app.
     */
  def updateGcmChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateGcmChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update a segment.
     */
  def updateSegment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update a segment.
     */
  def updateSegment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update a segment.
     */
  def updateSegment(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to update a segment.
     */
  def updateSegment(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSegmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an SMS channel.
     */
  def updateSmsChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an SMS channel.
     */
  def updateSmsChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an SMS channel.
     */
  def updateSmsChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an SMS channel.
     */
  def updateSmsChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateSmsChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an Voice channel
     */
  def updateVoiceChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an Voice channel
     */
  def updateVoiceChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an Voice channel
     */
  def updateVoiceChannel(params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an Voice channel
     */
  def updateVoiceChannel(
    params: awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointMod.PinpointNs.UpdateVoiceChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

