package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePolicyInput extends StObject {
  
  /**
    * The name of the container that the object lifecycle policy is assigned to.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object GetLifecyclePolicyInput {
  
  inline def apply(ContainerName: ContainerName): GetLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyInput]
  }
  
  extension [Self <: GetLifecyclePolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
