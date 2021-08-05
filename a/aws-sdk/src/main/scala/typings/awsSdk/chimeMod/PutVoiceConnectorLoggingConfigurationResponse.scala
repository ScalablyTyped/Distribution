package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorLoggingConfigurationResponse extends StObject {
  
  /**
    * The updated logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.LoggingConfiguration] = js.undefined
}
object PutVoiceConnectorLoggingConfigurationResponse {
  
  inline def apply(): PutVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationResponse]
  }
  
  extension [Self <: PutVoiceConnectorLoggingConfigurationResponse](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
