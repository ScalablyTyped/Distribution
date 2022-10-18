package typings.awsSdk.clientsConnectcampaignsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectCampaigns extends Service {
  
  @JSName("config")
  var config_ConnectCampaigns: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a campaign for the specified Amazon Connect account. This API is idempotent.
    */
  def createCampaign(): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]): Request[CreateCampaignResponse, AWSError] = js.native
  /**
    * Creates a campaign for the specified Amazon Connect account. This API is idempotent.
    */
  def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(
    params: CreateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]
  ): Request[CreateCampaignResponse, AWSError] = js.native
  
  /**
    * Deletes a campaign from the specified Amazon Connect account.
    */
  def deleteCampaign(): Request[js.Object, AWSError] = js.native
  def deleteCampaign(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a campaign from the specified Amazon Connect account.
    */
  def deleteCampaign(params: DeleteCampaignRequest): Request[js.Object, AWSError] = js.native
  def deleteCampaign(
    params: DeleteCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a connect instance config from the specified AWS account.
    */
  def deleteConnectInstanceConfig(): Request[js.Object, AWSError] = js.native
  def deleteConnectInstanceConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a connect instance config from the specified AWS account.
    */
  def deleteConnectInstanceConfig(params: DeleteConnectInstanceConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteConnectInstanceConfig(
    params: DeleteConnectInstanceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete the Connect Campaigns onboarding job for the specified Amazon Connect instance.
    */
  def deleteInstanceOnboardingJob(): Request[js.Object, AWSError] = js.native
  def deleteInstanceOnboardingJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete the Connect Campaigns onboarding job for the specified Amazon Connect instance.
    */
  def deleteInstanceOnboardingJob(params: DeleteInstanceOnboardingJobRequest): Request[js.Object, AWSError] = js.native
  def deleteInstanceOnboardingJob(
    params: DeleteInstanceOnboardingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the specific campaign.
    */
  def describeCampaign(): Request[DescribeCampaignResponse, AWSError] = js.native
  def describeCampaign(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCampaignResponse, Unit]): Request[DescribeCampaignResponse, AWSError] = js.native
  /**
    * Describes the specific campaign.
    */
  def describeCampaign(params: DescribeCampaignRequest): Request[DescribeCampaignResponse, AWSError] = js.native
  def describeCampaign(
    params: DescribeCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCampaignResponse, Unit]
  ): Request[DescribeCampaignResponse, AWSError] = js.native
  
  /**
    * Get state of a campaign for the specified Amazon Connect account.
    */
  def getCampaignState(): Request[GetCampaignStateResponse, AWSError] = js.native
  def getCampaignState(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignStateResponse, Unit]): Request[GetCampaignStateResponse, AWSError] = js.native
  /**
    * Get state of a campaign for the specified Amazon Connect account.
    */
  def getCampaignState(params: GetCampaignStateRequest): Request[GetCampaignStateResponse, AWSError] = js.native
  def getCampaignState(
    params: GetCampaignStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignStateResponse, Unit]
  ): Request[GetCampaignStateResponse, AWSError] = js.native
  
  /**
    * Get state of campaigns for the specified Amazon Connect account.
    */
  def getCampaignStateBatch(): Request[GetCampaignStateBatchResponse, AWSError] = js.native
  def getCampaignStateBatch(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignStateBatchResponse, Unit]): Request[GetCampaignStateBatchResponse, AWSError] = js.native
  /**
    * Get state of campaigns for the specified Amazon Connect account.
    */
  def getCampaignStateBatch(params: GetCampaignStateBatchRequest): Request[GetCampaignStateBatchResponse, AWSError] = js.native
  def getCampaignStateBatch(
    params: GetCampaignStateBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignStateBatchResponse, Unit]
  ): Request[GetCampaignStateBatchResponse, AWSError] = js.native
  
  /**
    * Get the specific Connect instance config.
    */
  def getConnectInstanceConfig(): Request[GetConnectInstanceConfigResponse, AWSError] = js.native
  def getConnectInstanceConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectInstanceConfigResponse, Unit]): Request[GetConnectInstanceConfigResponse, AWSError] = js.native
  /**
    * Get the specific Connect instance config.
    */
  def getConnectInstanceConfig(params: GetConnectInstanceConfigRequest): Request[GetConnectInstanceConfigResponse, AWSError] = js.native
  def getConnectInstanceConfig(
    params: GetConnectInstanceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectInstanceConfigResponse, Unit]
  ): Request[GetConnectInstanceConfigResponse, AWSError] = js.native
  
  /**
    * Get the specific instance onboarding job status.
    */
  def getInstanceOnboardingJobStatus(): Request[GetInstanceOnboardingJobStatusResponse, AWSError] = js.native
  def getInstanceOnboardingJobStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceOnboardingJobStatusResponse, Unit]
  ): Request[GetInstanceOnboardingJobStatusResponse, AWSError] = js.native
  /**
    * Get the specific instance onboarding job status.
    */
  def getInstanceOnboardingJobStatus(params: GetInstanceOnboardingJobStatusRequest): Request[GetInstanceOnboardingJobStatusResponse, AWSError] = js.native
  def getInstanceOnboardingJobStatus(
    params: GetInstanceOnboardingJobStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceOnboardingJobStatusResponse, Unit]
  ): Request[GetInstanceOnboardingJobStatusResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the campaigns under the specified Amazon Connect account.
    */
  def listCampaigns(): Request[ListCampaignsResponse, AWSError] = js.native
  def listCampaigns(callback: js.Function2[/* err */ AWSError, /* data */ ListCampaignsResponse, Unit]): Request[ListCampaignsResponse, AWSError] = js.native
  /**
    * Provides summary information about the campaigns under the specified Amazon Connect account.
    */
  def listCampaigns(params: ListCampaignsRequest): Request[ListCampaignsResponse, AWSError] = js.native
  def listCampaigns(
    params: ListCampaignsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCampaignsResponse, Unit]
  ): Request[ListCampaignsResponse, AWSError] = js.native
  
  /**
    * List tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Pauses a campaign for the specified Amazon Connect account.
    */
  def pauseCampaign(): Request[js.Object, AWSError] = js.native
  def pauseCampaign(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Pauses a campaign for the specified Amazon Connect account.
    */
  def pauseCampaign(params: PauseCampaignRequest): Request[js.Object, AWSError] = js.native
  def pauseCampaign(
    params: PauseCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates dials requests for the specified campaign Amazon Connect account. This API is idempotent.
    */
  def putDialRequestBatch(): Request[PutDialRequestBatchResponse, AWSError] = js.native
  def putDialRequestBatch(callback: js.Function2[/* err */ AWSError, /* data */ PutDialRequestBatchResponse, Unit]): Request[PutDialRequestBatchResponse, AWSError] = js.native
  /**
    * Creates dials requests for the specified campaign Amazon Connect account. This API is idempotent.
    */
  def putDialRequestBatch(params: PutDialRequestBatchRequest): Request[PutDialRequestBatchResponse, AWSError] = js.native
  def putDialRequestBatch(
    params: PutDialRequestBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDialRequestBatchResponse, Unit]
  ): Request[PutDialRequestBatchResponse, AWSError] = js.native
  
  /**
    * Stops a campaign for the specified Amazon Connect account.
    */
  def resumeCampaign(): Request[js.Object, AWSError] = js.native
  def resumeCampaign(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a campaign for the specified Amazon Connect account.
    */
  def resumeCampaign(params: ResumeCampaignRequest): Request[js.Object, AWSError] = js.native
  def resumeCampaign(
    params: ResumeCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a campaign for the specified Amazon Connect account.
    */
  def startCampaign(): Request[js.Object, AWSError] = js.native
  def startCampaign(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a campaign for the specified Amazon Connect account.
    */
  def startCampaign(params: StartCampaignRequest): Request[js.Object, AWSError] = js.native
  def startCampaign(
    params: StartCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Onboard the specific Amazon Connect instance to Connect Campaigns.
    */
  def startInstanceOnboardingJob(): Request[StartInstanceOnboardingJobResponse, AWSError] = js.native
  def startInstanceOnboardingJob(callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceOnboardingJobResponse, Unit]): Request[StartInstanceOnboardingJobResponse, AWSError] = js.native
  /**
    * Onboard the specific Amazon Connect instance to Connect Campaigns.
    */
  def startInstanceOnboardingJob(params: StartInstanceOnboardingJobRequest): Request[StartInstanceOnboardingJobResponse, AWSError] = js.native
  def startInstanceOnboardingJob(
    params: StartInstanceOnboardingJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceOnboardingJobResponse, Unit]
  ): Request[StartInstanceOnboardingJobResponse, AWSError] = js.native
  
  /**
    * Stops a campaign for the specified Amazon Connect account.
    */
  def stopCampaign(): Request[js.Object, AWSError] = js.native
  def stopCampaign(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a campaign for the specified Amazon Connect account.
    */
  def stopCampaign(params: StopCampaignRequest): Request[js.Object, AWSError] = js.native
  def stopCampaign(
    params: StopCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Tag a resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Tag a resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Untag a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Untag a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the dialer config of a campaign. This API is idempotent.
    */
  def updateCampaignDialerConfig(): Request[js.Object, AWSError] = js.native
  def updateCampaignDialerConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the dialer config of a campaign. This API is idempotent.
    */
  def updateCampaignDialerConfig(params: UpdateCampaignDialerConfigRequest): Request[js.Object, AWSError] = js.native
  def updateCampaignDialerConfig(
    params: UpdateCampaignDialerConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name of a campaign. This API is idempotent.
    */
  def updateCampaignName(): Request[js.Object, AWSError] = js.native
  def updateCampaignName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name of a campaign. This API is idempotent.
    */
  def updateCampaignName(params: UpdateCampaignNameRequest): Request[js.Object, AWSError] = js.native
  def updateCampaignName(
    params: UpdateCampaignNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the outbound call config of a campaign. This API is idempotent.
    */
  def updateCampaignOutboundCallConfig(): Request[js.Object, AWSError] = js.native
  def updateCampaignOutboundCallConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the outbound call config of a campaign. This API is idempotent.
    */
  def updateCampaignOutboundCallConfig(params: UpdateCampaignOutboundCallConfigRequest): Request[js.Object, AWSError] = js.native
  def updateCampaignOutboundCallConfig(
    params: UpdateCampaignOutboundCallConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
