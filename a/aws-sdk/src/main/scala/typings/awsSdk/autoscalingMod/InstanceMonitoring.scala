package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceMonitoring extends StObject {
  
  /**
    * If true, detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[MonitoringEnabled] = js.native
}
object InstanceMonitoring {
  
  @scala.inline
  def apply(): InstanceMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMonitoring]
  }
  
  @scala.inline
  implicit class InstanceMonitoringMutableBuilder[Self <: InstanceMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: MonitoringEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
