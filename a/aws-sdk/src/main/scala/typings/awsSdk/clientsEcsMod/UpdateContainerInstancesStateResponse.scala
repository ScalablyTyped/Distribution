package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerInstancesStateResponse extends StObject {
  
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.undefined
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
}
object UpdateContainerInstancesStateResponse {
  
  inline def apply(): UpdateContainerInstancesStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerInstancesStateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContainerInstancesStateResponse] (val x: Self) extends AnyVal {
    
    inline def setContainerInstances(value: ContainerInstances): Self = StObject.set(x, "containerInstances", value.asInstanceOf[js.Any])
    
    inline def setContainerInstancesUndefined: Self = StObject.set(x, "containerInstances", js.undefined)
    
    inline def setContainerInstancesVarargs(value: ContainerInstance*): Self = StObject.set(x, "containerInstances", js.Array(value*))
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value*))
  }
}
