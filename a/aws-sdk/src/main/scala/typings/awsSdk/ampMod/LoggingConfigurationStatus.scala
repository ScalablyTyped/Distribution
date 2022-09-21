package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfigurationStatus extends StObject {
  
  /**
    * Status code of the logging configuration.
    */
  var statusCode: LoggingConfigurationStatusCode
  
  /**
    * The reason for failure if any.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object LoggingConfigurationStatus {
  
  inline def apply(statusCode: LoggingConfigurationStatusCode): LoggingConfigurationStatus = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationStatus]
  }
  
  extension [Self <: LoggingConfigurationStatus](x: Self) {
    
    inline def setStatusCode(value: LoggingConfigurationStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
