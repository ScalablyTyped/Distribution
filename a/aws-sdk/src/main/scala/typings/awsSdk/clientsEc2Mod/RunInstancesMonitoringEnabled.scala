package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunInstancesMonitoringEnabled extends StObject {
  
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: Boolean
}
object RunInstancesMonitoringEnabled {
  
  inline def apply(Enabled: Boolean): RunInstancesMonitoringEnabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunInstancesMonitoringEnabled]
  }
  
  extension [Self <: RunInstancesMonitoringEnabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
