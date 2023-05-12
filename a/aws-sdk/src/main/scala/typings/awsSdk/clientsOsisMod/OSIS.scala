package typings.awsSdk.clientsOsisMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSIS extends Service {
  
  @JSName("config")
  var config_OSIS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an OpenSearch Ingestion pipeline. For more information, see Creating Amazon OpenSearch Ingestion pipelines.
    */
  def createPipeline(): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]): Request[CreatePipelineResponse, AWSError] = js.native
  /**
    * Creates an OpenSearch Ingestion pipeline. For more information, see Creating Amazon OpenSearch Ingestion pipelines.
    */
  def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(
    params: CreatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]
  ): Request[CreatePipelineResponse, AWSError] = js.native
  
  /**
    * Deletes an OpenSearch Ingestion pipeline. For more information, see Deleting Amazon OpenSearch Ingestion pipelines.
    */
  def deletePipeline(): Request[DeletePipelineResponse, AWSError] = js.native
  def deletePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DeletePipelineResponse, Unit]): Request[DeletePipelineResponse, AWSError] = js.native
  /**
    * Deletes an OpenSearch Ingestion pipeline. For more information, see Deleting Amazon OpenSearch Ingestion pipelines.
    */
  def deletePipeline(params: DeletePipelineRequest): Request[DeletePipelineResponse, AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePipelineResponse, Unit]
  ): Request[DeletePipelineResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an OpenSearch Ingestion pipeline.
    */
  def getPipeline(): Request[GetPipelineResponse, AWSError] = js.native
  def getPipeline(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineResponse, Unit]): Request[GetPipelineResponse, AWSError] = js.native
  /**
    * Retrieves information about an OpenSearch Ingestion pipeline.
    */
  def getPipeline(params: GetPipelineRequest): Request[GetPipelineResponse, AWSError] = js.native
  def getPipeline(
    params: GetPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineResponse, Unit]
  ): Request[GetPipelineResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a specific blueprint for OpenSearch Ingestion. Blueprints are templates for the configuration needed for a CreatePipeline request. For more information, see Using blueprints to create a pipeline.
    */
  def getPipelineBlueprint(): Request[GetPipelineBlueprintResponse, AWSError] = js.native
  def getPipelineBlueprint(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineBlueprintResponse, Unit]): Request[GetPipelineBlueprintResponse, AWSError] = js.native
  /**
    * Retrieves information about a specific blueprint for OpenSearch Ingestion. Blueprints are templates for the configuration needed for a CreatePipeline request. For more information, see Using blueprints to create a pipeline.
    */
  def getPipelineBlueprint(params: GetPipelineBlueprintRequest): Request[GetPipelineBlueprintResponse, AWSError] = js.native
  def getPipelineBlueprint(
    params: GetPipelineBlueprintRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineBlueprintResponse, Unit]
  ): Request[GetPipelineBlueprintResponse, AWSError] = js.native
  
  /**
    * Returns progress information for the current change happening on an OpenSearch Ingestion pipeline. Currently, this operation only returns information when a pipeline is being created. For more information, see Tracking the status of pipeline creation.
    */
  def getPipelineChangeProgress(): Request[GetPipelineChangeProgressResponse, AWSError] = js.native
  def getPipelineChangeProgress(callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineChangeProgressResponse, Unit]): Request[GetPipelineChangeProgressResponse, AWSError] = js.native
  /**
    * Returns progress information for the current change happening on an OpenSearch Ingestion pipeline. Currently, this operation only returns information when a pipeline is being created. For more information, see Tracking the status of pipeline creation.
    */
  def getPipelineChangeProgress(params: GetPipelineChangeProgressRequest): Request[GetPipelineChangeProgressResponse, AWSError] = js.native
  def getPipelineChangeProgress(
    params: GetPipelineChangeProgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPipelineChangeProgressResponse, Unit]
  ): Request[GetPipelineChangeProgressResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of all available blueprints for Data Prepper. For more information, see Using blueprints to create a pipeline.
    */
  def listPipelineBlueprints(): Request[ListPipelineBlueprintsResponse, AWSError] = js.native
  def listPipelineBlueprints(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineBlueprintsResponse, Unit]): Request[ListPipelineBlueprintsResponse, AWSError] = js.native
  /**
    * Retrieves a list of all available blueprints for Data Prepper. For more information, see Using blueprints to create a pipeline.
    */
  def listPipelineBlueprints(params: ListPipelineBlueprintsRequest): Request[ListPipelineBlueprintsResponse, AWSError] = js.native
  def listPipelineBlueprints(
    params: ListPipelineBlueprintsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelineBlueprintsResponse, Unit]
  ): Request[ListPipelineBlueprintsResponse, AWSError] = js.native
  
  /**
    * Lists all OpenSearch Ingestion pipelines in the current Amazon Web Services account and Region. For more information, see Viewing Amazon OpenSearch Ingestion pipelines.
    */
  def listPipelines(): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]): Request[ListPipelinesResponse, AWSError] = js.native
  /**
    * Lists all OpenSearch Ingestion pipelines in the current Amazon Web Services account and Region. For more information, see Viewing Amazon OpenSearch Ingestion pipelines.
    */
  def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(
    params: ListPipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]
  ): Request[ListPipelinesResponse, AWSError] = js.native
  
  /**
    * Lists all resource tags associated with an OpenSearch Ingestion pipeline. For more information, see Tagging Amazon OpenSearch Ingestion pipelines.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all resource tags associated with an OpenSearch Ingestion pipeline. For more information, see Tagging Amazon OpenSearch Ingestion pipelines.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts an OpenSearch Ingestion pipeline. For more information, see Starting an OpenSearch Ingestion pipeline.
    */
  def startPipeline(): Request[StartPipelineResponse, AWSError] = js.native
  def startPipeline(callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineResponse, Unit]): Request[StartPipelineResponse, AWSError] = js.native
  /**
    * Starts an OpenSearch Ingestion pipeline. For more information, see Starting an OpenSearch Ingestion pipeline.
    */
  def startPipeline(params: StartPipelineRequest): Request[StartPipelineResponse, AWSError] = js.native
  def startPipeline(
    params: StartPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineResponse, Unit]
  ): Request[StartPipelineResponse, AWSError] = js.native
  
  /**
    * Stops an OpenSearch Ingestion pipeline. For more information, see Stopping an OpenSearch Ingestion pipeline.
    */
  def stopPipeline(): Request[StopPipelineResponse, AWSError] = js.native
  def stopPipeline(callback: js.Function2[/* err */ AWSError, /* data */ StopPipelineResponse, Unit]): Request[StopPipelineResponse, AWSError] = js.native
  /**
    * Stops an OpenSearch Ingestion pipeline. For more information, see Stopping an OpenSearch Ingestion pipeline.
    */
  def stopPipeline(params: StopPipelineRequest): Request[StopPipelineResponse, AWSError] = js.native
  def stopPipeline(
    params: StopPipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopPipelineResponse, Unit]
  ): Request[StopPipelineResponse, AWSError] = js.native
  
  /**
    * Tags an OpenSearch Ingestion pipeline. For more information, see Tagging Amazon OpenSearch Ingestion pipelines.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags an OpenSearch Ingestion pipeline. For more information, see Tagging Amazon OpenSearch Ingestion pipelines.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from an OpenSearch Ingestion pipeline. For more information, see Tagging Amazon OpenSearch Ingestion pipelines.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from an OpenSearch Ingestion pipeline. For more information, see Tagging Amazon OpenSearch Ingestion pipelines.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an OpenSearch Ingestion pipeline. For more information, see Updating Amazon OpenSearch Ingestion pipelines.
    */
  def updatePipeline(): Request[UpdatePipelineResponse, AWSError] = js.native
  def updatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineResponse, Unit]): Request[UpdatePipelineResponse, AWSError] = js.native
  /**
    * Updates an OpenSearch Ingestion pipeline. For more information, see Updating Amazon OpenSearch Ingestion pipelines.
    */
  def updatePipeline(params: UpdatePipelineRequest): Request[UpdatePipelineResponse, AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipelineResponse, Unit]
  ): Request[UpdatePipelineResponse, AWSError] = js.native
  
  /**
    * Checks whether an OpenSearch Ingestion pipeline configuration is valid prior to creation. For more information, see Creating Amazon OpenSearch Ingestion pipelines.
    */
  def validatePipeline(): Request[ValidatePipelineResponse, AWSError] = js.native
  def validatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ ValidatePipelineResponse, Unit]): Request[ValidatePipelineResponse, AWSError] = js.native
  /**
    * Checks whether an OpenSearch Ingestion pipeline configuration is valid prior to creation. For more information, see Creating Amazon OpenSearch Ingestion pipelines.
    */
  def validatePipeline(params: ValidatePipelineRequest): Request[ValidatePipelineResponse, AWSError] = js.native
  def validatePipeline(
    params: ValidatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidatePipelineResponse, Unit]
  ): Request[ValidatePipelineResponse, AWSError] = js.native
}
