package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorLoggingConfigurationResponse extends StObject {
  
  /**
    * The updated logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.LoggingConfiguration] = js.undefined
}
object PutVoiceConnectorLoggingConfigurationResponse {
  
  inline def apply(): PutVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
