package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerServiceResult extends StObject {
  
  /**
    * An object that describes a container service.
    */
  var containerService: js.UndefOr[ContainerService] = js.undefined
}
object UpdateContainerServiceResult {
  
  inline def apply(): UpdateContainerServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerServiceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContainerServiceResult] (val x: Self) extends AnyVal {
    
    inline def setContainerService(value: ContainerService): Self = StObject.set(x, "containerService", value.asInstanceOf[js.Any])
    
    inline def setContainerServiceUndefined: Self = StObject.set(x, "containerService", js.undefined)
  }
}
