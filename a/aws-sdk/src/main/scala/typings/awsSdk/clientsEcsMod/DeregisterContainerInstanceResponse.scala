package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterContainerInstanceResponse extends StObject {
  
  /**
    * The container instance that was deregistered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object DeregisterContainerInstanceResponse {
  
  inline def apply(): DeregisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterContainerInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterContainerInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
