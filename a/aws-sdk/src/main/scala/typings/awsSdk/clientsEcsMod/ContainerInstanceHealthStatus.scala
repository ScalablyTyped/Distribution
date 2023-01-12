package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerInstanceHealthStatus extends StObject {
  
  /**
    * An array of objects representing the details of the container instance health status.
    */
  var details: js.UndefOr[InstanceHealthCheckResultList] = js.undefined
  
  /**
    * The overall health status of the container instance. This is an aggregate status of all container instance health checks.
    */
  var overallStatus: js.UndefOr[InstanceHealthCheckState] = js.undefined
}
object ContainerInstanceHealthStatus {
  
  inline def apply(): ContainerInstanceHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerInstanceHealthStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerInstanceHealthStatus] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: InstanceHealthCheckResultList): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: InstanceHealthCheckResult*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setOverallStatus(value: InstanceHealthCheckState): Self = StObject.set(x, "overallStatus", value.asInstanceOf[js.Any])
    
    inline def setOverallStatusUndefined: Self = StObject.set(x, "overallStatus", js.undefined)
  }
}
