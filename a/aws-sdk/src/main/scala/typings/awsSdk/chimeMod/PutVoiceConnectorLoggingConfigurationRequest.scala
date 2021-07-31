package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorLoggingConfigurationRequest extends StObject {
  
  /**
    * The logging configuration details to add.
    */
  var LoggingConfiguration: typings.awsSdk.chimeMod.LoggingConfiguration
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorLoggingConfigurationRequest {
  
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorLoggingConfigurationRequestMutableBuilder[Self <: PutVoiceConnectorLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
