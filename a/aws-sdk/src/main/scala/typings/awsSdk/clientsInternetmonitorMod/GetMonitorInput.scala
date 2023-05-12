package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMonitorInput extends StObject {
  
  /**
    * The name of the monitor.
    */
  var MonitorName: ResourceName
}
object GetMonitorInput {
  
  inline def apply(MonitorName: ResourceName): GetMonitorInput = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMonitorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMonitorInput] (val x: Self) extends AnyVal {
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
  }
}
