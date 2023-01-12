package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImagePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image whose policy you want to retrieve.
    */
  var imageArn: ImageBuildVersionArn
}
object GetImagePolicyRequest {
  
  inline def apply(imageArn: ImageBuildVersionArn): GetImagePolicyRequest = {
    val __obj = js.Dynamic.literal(imageArn = imageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImagePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setImageArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageArn", value.asInstanceOf[js.Any])
  }
}
