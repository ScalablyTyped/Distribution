package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagePipelinesResponse extends StObject {
  
  /**
    * The list of image pipelines.
    */
  var imagePipelineList: js.UndefOr[ImagePipelineList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListImagePipelinesResponse {
  
  inline def apply(): ListImagePipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagePipelinesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImagePipelinesResponse] (val x: Self) extends AnyVal {
    
    inline def setImagePipelineList(value: ImagePipelineList): Self = StObject.set(x, "imagePipelineList", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineListUndefined: Self = StObject.set(x, "imagePipelineList", js.undefined)
    
    inline def setImagePipelineListVarargs(value: ImagePipeline*): Self = StObject.set(x, "imagePipelineList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
