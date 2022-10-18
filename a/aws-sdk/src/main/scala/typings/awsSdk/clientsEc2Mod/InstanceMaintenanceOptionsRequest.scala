package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMaintenanceOptionsRequest extends StObject {
  
  /**
    * Disables the automatic recovery behavior of your instance or sets it to default. For more information, see Simplified automatic recovery.
    */
  var AutoRecovery: js.UndefOr[InstanceAutoRecoveryState] = js.undefined
}
object InstanceMaintenanceOptionsRequest {
  
  inline def apply(): InstanceMaintenanceOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMaintenanceOptionsRequest]
  }
  
  extension [Self <: InstanceMaintenanceOptionsRequest](x: Self) {
    
    inline def setAutoRecovery(value: InstanceAutoRecoveryState): Self = StObject.set(x, "AutoRecovery", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoveryUndefined: Self = StObject.set(x, "AutoRecovery", js.undefined)
  }
}
