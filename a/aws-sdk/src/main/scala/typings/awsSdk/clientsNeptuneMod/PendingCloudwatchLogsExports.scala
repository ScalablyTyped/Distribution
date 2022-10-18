package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingCloudwatchLogsExports extends StObject {
  
  /**
    * Log types that are in the process of being enabled. After they are enabled, these log types are exported to CloudWatch Logs.
    */
  var LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Log types that are in the process of being deactivated. After they are deactivated, these log types aren't exported to CloudWatch Logs.
    */
  var LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined
}
object PendingCloudwatchLogsExports {
  
  inline def apply(): PendingCloudwatchLogsExports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingCloudwatchLogsExports]
  }
  
  extension [Self <: PendingCloudwatchLogsExports](x: Self) {
    
    inline def setLogTypesToDisable(value: LogTypeList): Self = StObject.set(x, "LogTypesToDisable", value.asInstanceOf[js.Any])
    
    inline def setLogTypesToDisableUndefined: Self = StObject.set(x, "LogTypesToDisable", js.undefined)
    
    inline def setLogTypesToDisableVarargs(value: String*): Self = StObject.set(x, "LogTypesToDisable", js.Array(value*))
    
    inline def setLogTypesToEnable(value: LogTypeList): Self = StObject.set(x, "LogTypesToEnable", value.asInstanceOf[js.Any])
    
    inline def setLogTypesToEnableUndefined: Self = StObject.set(x, "LogTypesToEnable", js.undefined)
    
    inline def setLogTypesToEnableVarargs(value: String*): Self = StObject.set(x, "LogTypesToEnable", js.Array(value*))
  }
}
