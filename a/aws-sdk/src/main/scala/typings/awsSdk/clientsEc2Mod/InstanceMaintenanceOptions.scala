package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMaintenanceOptions extends StObject {
  
  /**
    * Provides information on the current automatic recovery behavior of your instance.
    */
  var AutoRecovery: js.UndefOr[InstanceAutoRecoveryState] = js.undefined
}
object InstanceMaintenanceOptions {
  
  inline def apply(): InstanceMaintenanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMaintenanceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceMaintenanceOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoRecovery(value: InstanceAutoRecoveryState): Self = StObject.set(x, "AutoRecovery", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoveryUndefined: Self = StObject.set(x, "AutoRecovery", js.undefined)
  }
}
