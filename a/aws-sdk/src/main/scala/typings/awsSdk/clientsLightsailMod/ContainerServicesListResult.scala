package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServicesListResult extends StObject {
  
  /**
    * An array of objects that describe one or more container services.
    */
  var containerServices: js.UndefOr[ContainerServiceList] = js.undefined
}
object ContainerServicesListResult {
  
  inline def apply(): ContainerServicesListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServicesListResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerServicesListResult] (val x: Self) extends AnyVal {
    
    inline def setContainerServices(value: ContainerServiceList): Self = StObject.set(x, "containerServices", value.asInstanceOf[js.Any])
    
    inline def setContainerServicesUndefined: Self = StObject.set(x, "containerServices", js.undefined)
    
    inline def setContainerServicesVarargs(value: ContainerService*): Self = StObject.set(x, "containerServices", js.Array(value*))
  }
}
