package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorResponse extends StObject {
  
  /**
    * The details of the Voice Connector.
    */
  var VoiceConnector: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceConnector] = js.undefined
}
object CreateVoiceConnectorResponse {
  
  inline def apply(): CreateVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnector(value: VoiceConnector): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
