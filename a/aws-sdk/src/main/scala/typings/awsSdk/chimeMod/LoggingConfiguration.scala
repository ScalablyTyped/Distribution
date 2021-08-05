package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
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
    
    inline def setEnableSIPLogs(value: Boolean): Self = StObject.set(x, "EnableSIPLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSIPLogsUndefined: Self = StObject.set(x, "EnableSIPLogs", js.undefined)
  }
}
