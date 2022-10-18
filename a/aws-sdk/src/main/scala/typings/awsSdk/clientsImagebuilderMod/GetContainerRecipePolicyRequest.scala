package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerRecipePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
    */
  var containerRecipeArn: ContainerRecipeArn
}
object GetContainerRecipePolicyRequest {
  
  inline def apply(containerRecipeArn: ContainerRecipeArn): GetContainerRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(containerRecipeArn = containerRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerRecipePolicyRequest]
  }
  
  extension [Self <: GetContainerRecipePolicyRequest](x: Self) {
    
    inline def setContainerRecipeArn(value: ContainerRecipeArn): Self = StObject.set(x, "containerRecipeArn", value.asInstanceOf[js.Any])
  }
}
