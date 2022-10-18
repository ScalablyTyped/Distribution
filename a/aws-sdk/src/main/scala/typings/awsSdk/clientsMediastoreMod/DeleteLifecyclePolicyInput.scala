package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLifecyclePolicyInput extends StObject {
  
  /**
    * The name of the container that holds the object lifecycle policy.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object DeleteLifecyclePolicyInput {
  
  inline def apply(ContainerName: ContainerName): DeleteLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyInput]
  }
  
  extension [Self <: DeleteLifecyclePolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
