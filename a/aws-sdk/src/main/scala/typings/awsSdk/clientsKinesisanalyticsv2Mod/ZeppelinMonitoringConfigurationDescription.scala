package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeppelinMonitoringConfigurationDescription extends StObject {
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.LogLevel] = js.undefined
}
object ZeppelinMonitoringConfigurationDescription {
  
  inline def apply(): ZeppelinMonitoringConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeppelinMonitoringConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZeppelinMonitoringConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
  }
}
