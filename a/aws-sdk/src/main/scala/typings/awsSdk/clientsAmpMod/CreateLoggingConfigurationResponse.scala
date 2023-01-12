package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoggingConfigurationResponse extends StObject {
  
  /**
    * The status of the logging configuration.
    */
  var status: LoggingConfigurationStatus
}
object CreateLoggingConfigurationResponse {
  
  inline def apply(status: LoggingConfigurationStatus): CreateLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: LoggingConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
