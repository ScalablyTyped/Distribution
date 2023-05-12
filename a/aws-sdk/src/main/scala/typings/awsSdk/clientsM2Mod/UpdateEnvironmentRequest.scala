package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentRequest extends StObject {
  
  /**
    * Indicates whether to update the runtime environment during the maintenance window. The default is false. Currently, Amazon Web Services Mainframe Modernization accepts the engineVersion parameter only if applyDuringMaintenanceWindow is true. If any parameter other than engineVersion is provided in UpdateEnvironmentRequest, it will fail if applyDuringMaintenanceWindow is set to true.
    */
  var applyDuringMaintenanceWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The desired capacity for the runtime environment to update.
    */
  var desiredCapacity: js.UndefOr[CapacityValue] = js.undefined
  
  /**
    * The version of the runtime engine for the runtime environment.
    */
  var engineVersion: js.UndefOr[EngineVersion] = js.undefined
  
  /**
    * The unique identifier of the runtime environment that you want to update.
    */
  var environmentId: Identifier
  
  /**
    * The instance type for the runtime environment to update.
    */
  var instanceType: js.UndefOr[String20] = js.undefined
  
  /**
    * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random system-generated value will be assigned.
    */
  var preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
}
object UpdateEnvironmentRequest {
  
  inline def apply(environmentId: Identifier): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setApplyDuringMaintenanceWindow(value: Boolean): Self = StObject.set(x, "applyDuringMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setApplyDuringMaintenanceWindowUndefined: Self = StObject.set(x, "applyDuringMaintenanceWindow", js.undefined)
    
    inline def setDesiredCapacity(value: CapacityValue): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: String20): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
  }
}
