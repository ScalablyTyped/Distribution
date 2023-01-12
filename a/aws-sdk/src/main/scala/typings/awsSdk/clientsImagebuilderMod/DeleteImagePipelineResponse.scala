package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImagePipelineResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that was deleted.
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object DeleteImagePipelineResponse {
  
  inline def apply(): DeleteImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImagePipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteImagePipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineArnUndefined: Self = StObject.set(x, "imagePipelineArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
