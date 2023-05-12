package typings.awsSdk.clientsPipesMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipes extends Service {
  
  @JSName("config")
  var config_Pipes: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create a pipe. Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized knowledge and integration code.
    */
  def createPipe(): Request[CreatePipeResponse, AWSError] = js.native
  def createPipe(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipeResponse, Unit]): Request[CreatePipeResponse, AWSError] = js.native
  /**
    * Create a pipe. Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized knowledge and integration code.
    */
  def createPipe(params: CreatePipeRequest): Request[CreatePipeResponse, AWSError] = js.native
  def createPipe(
    params: CreatePipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipeResponse, Unit]
  ): Request[CreatePipeResponse, AWSError] = js.native
  
  /**
    * Delete an existing pipe. For more information about pipes, see Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def deletePipe(): Request[DeletePipeResponse, AWSError] = js.native
  def deletePipe(callback: js.Function2[/* err */ AWSError, /* data */ DeletePipeResponse, Unit]): Request[DeletePipeResponse, AWSError] = js.native
  /**
    * Delete an existing pipe. For more information about pipes, see Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def deletePipe(params: DeletePipeRequest): Request[DeletePipeResponse, AWSError] = js.native
  def deletePipe(
    params: DeletePipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePipeResponse, Unit]
  ): Request[DeletePipeResponse, AWSError] = js.native
  
  /**
    * Get the information about an existing pipe. For more information about pipes, see Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def describePipe(): Request[DescribePipeResponse, AWSError] = js.native
  def describePipe(callback: js.Function2[/* err */ AWSError, /* data */ DescribePipeResponse, Unit]): Request[DescribePipeResponse, AWSError] = js.native
  /**
    * Get the information about an existing pipe. For more information about pipes, see Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def describePipe(params: DescribePipeRequest): Request[DescribePipeResponse, AWSError] = js.native
  def describePipe(
    params: DescribePipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipeResponse, Unit]
  ): Request[DescribePipeResponse, AWSError] = js.native
  
  /**
    * Get the pipes associated with this account. For more information about pipes, see Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def listPipes(): Request[ListPipesResponse, AWSError] = js.native
  def listPipes(callback: js.Function2[/* err */ AWSError, /* data */ ListPipesResponse, Unit]): Request[ListPipesResponse, AWSError] = js.native
  /**
    * Get the pipes associated with this account. For more information about pipes, see Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def listPipes(params: ListPipesRequest): Request[ListPipesResponse, AWSError] = js.native
  def listPipes(
    params: ListPipesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipesResponse, Unit]
  ): Request[ListPipesResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with a pipe.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with a pipe.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Start an existing pipe.
    */
  def startPipe(): Request[StartPipeResponse, AWSError] = js.native
  def startPipe(callback: js.Function2[/* err */ AWSError, /* data */ StartPipeResponse, Unit]): Request[StartPipeResponse, AWSError] = js.native
  /**
    * Start an existing pipe.
    */
  def startPipe(params: StartPipeRequest): Request[StartPipeResponse, AWSError] = js.native
  def startPipe(
    params: StartPipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPipeResponse, Unit]
  ): Request[StartPipeResponse, AWSError] = js.native
  
  /**
    * Stop an existing pipe.
    */
  def stopPipe(): Request[StopPipeResponse, AWSError] = js.native
  def stopPipe(callback: js.Function2[/* err */ AWSError, /* data */ StopPipeResponse, Unit]): Request[StopPipeResponse, AWSError] = js.native
  /**
    * Stop an existing pipe.
    */
  def stopPipe(params: StopPipeRequest): Request[StopPipeResponse, AWSError] = js.native
  def stopPipe(
    params: StopPipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopPipeResponse, Unit]
  ): Request[StopPipeResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified pipe. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a pipe that already has tags. If you specify a new tag key, this tag is appended to the list of tags associated with the pipe. If you specify a tag key that is already associated with the pipe, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a pipe.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified pipe. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a pipe that already has tags. If you specify a new tag key, this tag is appended to the list of tags associated with the pipe. If you specify a tag key that is already associated with the pipe, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a pipe.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified pipes.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified pipes.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update an existing pipe. When you call UpdatePipe, only the fields that are included in the request are changed, the rest are unchanged. The exception to this is if you modify any Amazon Web Services-service specific fields in the SourceParameters, EnrichmentParameters, or TargetParameters objects. The fields in these objects are updated atomically as one and override existing values. This is by design and means that if you don't specify an optional field in one of these Parameters objects, that field will be set to its system-default value after the update. For more information about pipes, see  Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def updatePipe(): Request[UpdatePipeResponse, AWSError] = js.native
  def updatePipe(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipeResponse, Unit]): Request[UpdatePipeResponse, AWSError] = js.native
  /**
    * Update an existing pipe. When you call UpdatePipe, only the fields that are included in the request are changed, the rest are unchanged. The exception to this is if you modify any Amazon Web Services-service specific fields in the SourceParameters, EnrichmentParameters, or TargetParameters objects. The fields in these objects are updated atomically as one and override existing values. This is by design and means that if you don't specify an optional field in one of these Parameters objects, that field will be set to its system-default value after the update. For more information about pipes, see  Amazon EventBridge Pipes in the Amazon EventBridge User Guide.
    */
  def updatePipe(params: UpdatePipeRequest): Request[UpdatePipeResponse, AWSError] = js.native
  def updatePipe(
    params: UpdatePipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePipeResponse, Unit]
  ): Request[UpdatePipeResponse, AWSError] = js.native
}
