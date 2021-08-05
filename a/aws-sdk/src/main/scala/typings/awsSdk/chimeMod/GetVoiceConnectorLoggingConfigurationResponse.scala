package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorLoggingConfigurationResponse extends StObject {
  
  /**
    * The logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.LoggingConfiguration] = js.undefined
}
object GetVoiceConnectorLoggingConfigurationResponse {
  
  inline def apply(): GetVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationResponse]
  }
  
  extension [Self <: GetVoiceConnectorLoggingConfigurationResponse](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
