package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutContainerPolicyInput extends StObject {
  
  /**
    * The name of the container.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
  
  /**
    * The contents of the policy, which includes the following:    One Version tag   One Statement tag that contains the standard tags for the policy.  
    */
  var Policy: ContainerPolicy
}
object PutContainerPolicyInput {
  
  inline def apply(ContainerName: ContainerName, Policy: ContainerPolicy): PutContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutContainerPolicyInput]
  }
  
  extension [Self <: PutContainerPolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: ContainerPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
