package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceConnectorsResponse extends StObject {
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the Voice Connectors.
    */
  var VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
}
object ListVoiceConnectorsResponse {
  
  inline def apply(): ListVoiceConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVoiceConnectorsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVoiceConnectors(value: VoiceConnectorList): Self = StObject.set(x, "VoiceConnectors", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorsUndefined: Self = StObject.set(x, "VoiceConnectors", js.undefined)
    
    inline def setVoiceConnectorsVarargs(value: VoiceConnector*): Self = StObject.set(x, "VoiceConnectors", js.Array(value*))
  }
}
