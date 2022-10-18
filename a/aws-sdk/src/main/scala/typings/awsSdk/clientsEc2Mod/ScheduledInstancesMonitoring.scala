package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesMonitoring extends StObject {
  
  /**
    * Indicates whether monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object ScheduledInstancesMonitoring {
  
  inline def apply(): ScheduledInstancesMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesMonitoring]
  }
  
  extension [Self <: ScheduledInstancesMonitoring](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
