package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSetup extends StObject {
  
  /**
    * If a log type is enabled, that log type exports its control plane logs to CloudWatch Logs. If a log type isn't enabled, that log type doesn't export its control plane logs. Each individual log type can be enabled or disabled independently.
    */
  var enabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The available cluster control plane log types.
    */
  var types: js.UndefOr[LogTypes] = js.undefined
}
object LogSetup {
  
  inline def apply(): LogSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSetup]
  }
  
  extension [Self <: LogSetup](x: Self) {
    
    inline def setEnabled(value: BoxedBoolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTypes(value: LogTypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: LogType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
