package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorConfig extends StObject {
  
  /**
    * The name of the monitor resource.
    */
  var MonitorName: Name
}
object MonitorConfig {
  
  inline def apply(MonitorName: Name): MonitorConfig = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorConfig] (val x: Self) extends AnyVal {
    
    inline def setMonitorName(value: Name): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
  }
}
