package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMonitorInput extends StObject {
  
  /**
    * The name of the monitor to delete.
    */
  var MonitorName: ResourceName
}
object DeleteMonitorInput {
  
  inline def apply(MonitorName: ResourceName): DeleteMonitorInput = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMonitorInput] (val x: Self) extends AnyVal {
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
  }
}
