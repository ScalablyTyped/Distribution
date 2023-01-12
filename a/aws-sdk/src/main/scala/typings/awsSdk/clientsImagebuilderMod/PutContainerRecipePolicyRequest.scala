package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutContainerRecipePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe that this policy should be applied to.
    */
  var containerRecipeArn: ContainerRecipeArn
  
  /**
    * The policy to apply to the container recipe.
    */
  var policy: ResourcePolicyDocument
}
object PutContainerRecipePolicyRequest {
  
  inline def apply(containerRecipeArn: ContainerRecipeArn, policy: ResourcePolicyDocument): PutContainerRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(containerRecipeArn = containerRecipeArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutContainerRecipePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutContainerRecipePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setContainerRecipeArn(value: ContainerRecipeArn): Self = StObject.set(x, "containerRecipeArn", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
