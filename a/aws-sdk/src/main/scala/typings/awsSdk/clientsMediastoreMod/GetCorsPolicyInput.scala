package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCorsPolicyInput extends StObject {
  
  /**
    * The name of the container that the policy is assigned to.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object GetCorsPolicyInput {
  
  inline def apply(ContainerName: ContainerName): GetCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCorsPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
