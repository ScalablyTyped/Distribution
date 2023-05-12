package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * Boolean that enables logging of detailed media metrics for Voice Connectors to Amazon CloudWatch logs.
    */
  var EnableMediaMetricLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean that enables SIP message logs to Amazon CloudWatch logs.
    */
  var EnableSIPLogs: js.UndefOr[Boolean] = js.undefined
}
object LoggingConfiguration {
  
  inline def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnableMediaMetricLogs(value: Boolean): Self = StObject.set(x, "EnableMediaMetricLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableMediaMetricLogsUndefined: Self = StObject.set(x, "EnableMediaMetricLogs", js.undefined)
    
    inline def setEnableSIPLogs(value: Boolean): Self = StObject.set(x, "EnableSIPLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSIPLogsUndefined: Self = StObject.set(x, "EnableSIPLogs", js.undefined)
  }
}
