package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceConnectorsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the Amazon Chime Voice Connectors.
    */
  var VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
}
object ListVoiceConnectorsResponse {
  
  inline def apply(): ListVoiceConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorsResponse]
  }
  
  extension [Self <: ListVoiceConnectorsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVoiceConnectors(value: VoiceConnectorList): Self = StObject.set(x, "VoiceConnectors", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorsUndefined: Self = StObject.set(x, "VoiceConnectors", js.undefined)
    
    inline def setVoiceConnectorsVarargs(value: VoiceConnector*): Self = StObject.set(x, "VoiceConnectors", js.Array(value :_*))
  }
}
