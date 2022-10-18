package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerPolicyOutput extends StObject {
  
  /**
    * The contents of the access policy.
    */
  var Policy: ContainerPolicy
}
object GetContainerPolicyOutput {
  
  inline def apply(Policy: ContainerPolicy): GetContainerPolicyOutput = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerPolicyOutput]
  }
  
  extension [Self <: GetContainerPolicyOutput](x: Self) {
    
    inline def setPolicy(value: ContainerPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
