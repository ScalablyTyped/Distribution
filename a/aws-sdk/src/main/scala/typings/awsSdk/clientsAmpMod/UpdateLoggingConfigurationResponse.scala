package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLoggingConfigurationResponse extends StObject {
  
  /**
    * The status of the logging configuration.
    */
  var status: LoggingConfigurationStatus
}
object UpdateLoggingConfigurationResponse {
  
  inline def apply(status: LoggingConfigurationStatus): UpdateLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoggingConfigurationResponse]
  }
  
  extension [Self <: UpdateLoggingConfigurationResponse](x: Self) {
    
    inline def setStatus(value: LoggingConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
