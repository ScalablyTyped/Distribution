package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutComponentPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component that this policy should be applied to.
    */
  var componentArn: ComponentBuildVersionArn
  
  /**
    * The policy to apply.
    */
  var policy: ResourcePolicyDocument
}
object PutComponentPolicyRequest {
  
  inline def apply(componentArn: ComponentBuildVersionArn, policy: ResourcePolicyDocument): PutComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComponentPolicyRequest]
  }
  
  extension [Self <: PutComponentPolicyRequest](x: Self) {
    
    inline def setComponentArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
