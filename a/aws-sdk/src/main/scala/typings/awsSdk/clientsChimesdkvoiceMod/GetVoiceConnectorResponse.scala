package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorResponse extends StObject {
  
  /**
    * The Voice Connector details.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceConnector] = js.undefined
}
object GetVoiceConnectorResponse {
  
  inline def apply(): GetVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
