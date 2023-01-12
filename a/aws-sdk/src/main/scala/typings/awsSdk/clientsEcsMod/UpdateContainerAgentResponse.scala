package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerAgentResponse extends StObject {
  
  /**
    * The container instance that the container agent was updated for.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object UpdateContainerAgentResponse {
  
  inline def apply(): UpdateContainerAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerAgentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContainerAgentResponse] (val x: Self) extends AnyVal {
    
    inline def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
