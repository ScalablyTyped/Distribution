package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImagePolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image that this policy was applied to.
    */
  var imageArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object PutImagePolicyResponse {
  
  inline def apply(): PutImagePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImagePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutImagePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setImageArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageArn", value.asInstanceOf[js.Any])
    
    inline def setImageArnUndefined: Self = StObject.set(x, "imageArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
