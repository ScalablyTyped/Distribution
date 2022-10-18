package typings.awsSdk.clientsChimesdkmediapipelinesMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChimeSDKMediaPipelines extends Service {
  
  @JSName("config")
  var config_ChimeSDKMediaPipelines: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a media pipeline.
    */
  def createMediaCapturePipeline(): Request[CreateMediaCapturePipelineResponse, AWSError] = js.native
  def createMediaCapturePipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreateMediaCapturePipelineResponse, Unit]): Request[CreateMediaCapturePipelineResponse, AWSError] = js.native
  /**
    * Creates a media pipeline.
    */
  def createMediaCapturePipeline(params: CreateMediaCapturePipelineRequest): Request[CreateMediaCapturePipelineResponse, AWSError] = js.native
  def createMediaCapturePipeline(
    params: CreateMediaCapturePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMediaCapturePipelineResponse, Unit]
  ): Request[CreateMediaCapturePipelineResponse, AWSError] = js.native
  
  /**
    * Creates a media concatenation pipeline.
    */
  def createMediaConcatenationPipeline(): Request[CreateMediaConcatenationPipelineResponse, AWSError] = js.native
  def createMediaConcatenationPipeline(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMediaConcatenationPipelineResponse, Unit]
  ): Request[CreateMediaConcatenationPipelineResponse, AWSError] = js.native
  /**
    * Creates a media concatenation pipeline.
    */
  def createMediaConcatenationPipeline(params: CreateMediaConcatenationPipelineRequest): Request[CreateMediaConcatenationPipelineResponse, AWSError] = js.native
  def createMediaConcatenationPipeline(
    params: CreateMediaConcatenationPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMediaConcatenationPipelineResponse, Unit]
  ): Request[CreateMediaConcatenationPipelineResponse, AWSError] = js.native
  
  /**
    * Creates a streaming media pipeline in an Amazon Chime SDK meeting.
    */
  def createMediaLiveConnectorPipeline(): Request[CreateMediaLiveConnectorPipelineResponse, AWSError] = js.native
  def createMediaLiveConnectorPipeline(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMediaLiveConnectorPipelineResponse, Unit]
  ): Request[CreateMediaLiveConnectorPipelineResponse, AWSError] = js.native
  /**
    * Creates a streaming media pipeline in an Amazon Chime SDK meeting.
    */
  def createMediaLiveConnectorPipeline(params: CreateMediaLiveConnectorPipelineRequest): Request[CreateMediaLiveConnectorPipelineResponse, AWSError] = js.native
  def createMediaLiveConnectorPipeline(
    params: CreateMediaLiveConnectorPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMediaLiveConnectorPipelineResponse, Unit]
  ): Request[CreateMediaLiveConnectorPipelineResponse, AWSError] = js.native
  
  /**
    * Deletes the media pipeline.
    */
  def deleteMediaCapturePipeline(): Request[js.Object, AWSError] = js.native
  def deleteMediaCapturePipeline(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the media pipeline.
    */
  def deleteMediaCapturePipeline(params: DeleteMediaCapturePipelineRequest): Request[js.Object, AWSError] = js.native
  def deleteMediaCapturePipeline(
    params: DeleteMediaCapturePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the media pipeline.
    */
  def deleteMediaPipeline(): Request[js.Object, AWSError] = js.native
  def deleteMediaPipeline(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the media pipeline.
    */
  def deleteMediaPipeline(params: DeleteMediaPipelineRequest): Request[js.Object, AWSError] = js.native
  def deleteMediaPipeline(
    params: DeleteMediaPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets an existing media pipeline.
    */
  def getMediaCapturePipeline(): Request[GetMediaCapturePipelineResponse, AWSError] = js.native
  def getMediaCapturePipeline(callback: js.Function2[/* err */ AWSError, /* data */ GetMediaCapturePipelineResponse, Unit]): Request[GetMediaCapturePipelineResponse, AWSError] = js.native
  /**
    * Gets an existing media pipeline.
    */
  def getMediaCapturePipeline(params: GetMediaCapturePipelineRequest): Request[GetMediaCapturePipelineResponse, AWSError] = js.native
  def getMediaCapturePipeline(
    params: GetMediaCapturePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMediaCapturePipelineResponse, Unit]
  ): Request[GetMediaCapturePipelineResponse, AWSError] = js.native
  
  /**
    * Gets an existing media pipeline.
    */
  def getMediaPipeline(): Request[GetMediaPipelineResponse, AWSError] = js.native
  def getMediaPipeline(callback: js.Function2[/* err */ AWSError, /* data */ GetMediaPipelineResponse, Unit]): Request[GetMediaPipelineResponse, AWSError] = js.native
  /**
    * Gets an existing media pipeline.
    */
  def getMediaPipeline(params: GetMediaPipelineRequest): Request[GetMediaPipelineResponse, AWSError] = js.native
  def getMediaPipeline(
    params: GetMediaPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMediaPipelineResponse, Unit]
  ): Request[GetMediaPipelineResponse, AWSError] = js.native
  
  /**
    * Returns a list of media pipelines.
    */
  def listMediaCapturePipelines(): Request[ListMediaCapturePipelinesResponse, AWSError] = js.native
  def listMediaCapturePipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListMediaCapturePipelinesResponse, Unit]): Request[ListMediaCapturePipelinesResponse, AWSError] = js.native
  /**
    * Returns a list of media pipelines.
    */
  def listMediaCapturePipelines(params: ListMediaCapturePipelinesRequest): Request[ListMediaCapturePipelinesResponse, AWSError] = js.native
  def listMediaCapturePipelines(
    params: ListMediaCapturePipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMediaCapturePipelinesResponse, Unit]
  ): Request[ListMediaCapturePipelinesResponse, AWSError] = js.native
  
  /**
    * Returns a list of media pipelines.
    */
  def listMediaPipelines(): Request[ListMediaPipelinesResponse, AWSError] = js.native
  def listMediaPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListMediaPipelinesResponse, Unit]): Request[ListMediaPipelinesResponse, AWSError] = js.native
  /**
    * Returns a list of media pipelines.
    */
  def listMediaPipelines(params: ListMediaPipelinesRequest): Request[ListMediaPipelinesResponse, AWSError] = js.native
  def listMediaPipelines(
    params: ListMediaPipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMediaPipelinesResponse, Unit]
  ): Request[ListMediaPipelinesResponse, AWSError] = js.native
  
  /**
    * Lists the tags available for a media pipeline.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags available for a media pipeline.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * The ARN of the media pipeline that you want to tag. Consists of he pipeline's endpoint region, resource ID, and pipeline ID.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * The ARN of the media pipeline that you want to tag. Consists of he pipeline's endpoint region, resource ID, and pipeline ID.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes any tags from a media pipeline.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes any tags from a media pipeline.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
