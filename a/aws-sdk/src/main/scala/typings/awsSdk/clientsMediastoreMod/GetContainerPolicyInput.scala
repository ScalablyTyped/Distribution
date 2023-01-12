package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerPolicyInput extends StObject {
  
  /**
    * The name of the container. 
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object GetContainerPolicyInput {
  
  inline def apply(ContainerName: ContainerName): GetContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContainerPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
