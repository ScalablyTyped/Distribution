package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * Boolean that enables the logging of Voice Connector metrics to Cloudwatch.
    */
  var EnableMediaMetricLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
    */
  var EnableSIPLogs: js.UndefOr[Boolean] = js.undefined
}
object LoggingConfiguration {
  
  inline def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  extension [Self <: LoggingConfiguration](x: Self) {
    
    inline def setEnableMediaMetricLogs(value: Boolean): Self = StObject.set(x, "EnableMediaMetricLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableMediaMetricLogsUndefined: Self = StObject.set(x, "EnableMediaMetricLogs", js.undefined)
    
    inline def setEnableSIPLogs(value: Boolean): Self = StObject.set(x, "EnableSIPLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSIPLogsUndefined: Self = StObject.set(x, "EnableSIPLogs", js.undefined)
  }
}
