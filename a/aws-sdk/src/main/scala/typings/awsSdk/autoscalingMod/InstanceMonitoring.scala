package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMonitoring extends StObject {
  
  /**
    * If true, detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[MonitoringEnabled] = js.undefined
}
object InstanceMonitoring {
  
  inline def apply(): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMonitoring]
  }
  
  extension [Self <: InstanceMonitoring](x: Self) {
    
    inline def setEnabled(value: MonitoringEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
