package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImagePipelineRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
    */
  var imagePipelineArn: ImagePipelineArn
}
object GetImagePipelineRequest {
  
  inline def apply(imagePipelineArn: ImagePipelineArn): GetImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImagePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
  }
}
