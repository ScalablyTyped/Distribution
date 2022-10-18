package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImagePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image that this policy should be applied to.
    */
  var imageArn: ImageBuildVersionArn
  
  /**
    * The policy to apply.
    */
  var policy: ResourcePolicyDocument
}
object PutImagePolicyRequest {
  
  inline def apply(imageArn: ImageBuildVersionArn, policy: ResourcePolicyDocument): PutImagePolicyRequest = {
    val __obj = js.Dynamic.literal(imageArn = imageArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImagePolicyRequest]
  }
  
  extension [Self <: PutImagePolicyRequest](x: Self) {
    
    inline def setImageArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageArn", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
