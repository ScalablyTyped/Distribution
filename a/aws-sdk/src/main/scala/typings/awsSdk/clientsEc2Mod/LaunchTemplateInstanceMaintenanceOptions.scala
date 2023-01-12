package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMaintenanceOptions extends StObject {
  
  /**
    * Disables the automatic recovery behavior of your instance or sets it to default.
    */
  var AutoRecovery: js.UndefOr[LaunchTemplateAutoRecoveryState] = js.undefined
}
object LaunchTemplateInstanceMaintenanceOptions {
  
  inline def apply(): LaunchTemplateInstanceMaintenanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMaintenanceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateInstanceMaintenanceOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoRecovery(value: LaunchTemplateAutoRecoveryState): Self = StObject.set(x, "AutoRecovery", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoveryUndefined: Self = StObject.set(x, "AutoRecovery", js.undefined)
  }
}
