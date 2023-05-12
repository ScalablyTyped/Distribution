package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGlobalSettingsResponse extends StObject {
  
  /**
    * The Voice Connector settings.
    */
  var VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
}
object GetGlobalSettingsResponse {
  
  inline def apply(): GetGlobalSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGlobalSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGlobalSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnector(value: VoiceConnectorSettings): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
