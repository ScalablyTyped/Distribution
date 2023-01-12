package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCorsPolicyInput extends StObject {
  
  /**
    * The name of the container to remove the policy from.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object DeleteCorsPolicyInput {
  
  inline def apply(ContainerName: ContainerName): DeleteCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCorsPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCorsPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
