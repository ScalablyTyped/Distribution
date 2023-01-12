package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorInstancesResult extends StObject {
  
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined
}
object MonitorInstancesResult {
  
  inline def apply(): MonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceMonitorings(value: InstanceMonitoringList): Self = StObject.set(x, "InstanceMonitorings", value.asInstanceOf[js.Any])
    
    inline def setInstanceMonitoringsUndefined: Self = StObject.set(x, "InstanceMonitorings", js.undefined)
    
    inline def setInstanceMonitoringsVarargs(value: InstanceMonitoring*): Self = StObject.set(x, "InstanceMonitorings", js.Array(value*))
  }
}
