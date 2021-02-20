package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVoiceConnectorsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The details of the Amazon Chime Voice Connectors.
    */
  var VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.native
}
object ListVoiceConnectorsResponse {
  
  @scala.inline
  def apply(): ListVoiceConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorsResponse]
  }
  
  @scala.inline
  implicit class ListVoiceConnectorsResponseMutableBuilder[Self <: ListVoiceConnectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVoiceConnectors(value: VoiceConnectorList): Self = StObject.set(x, "VoiceConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorsUndefined: Self = StObject.set(x, "VoiceConnectors", js.undefined)
    
    @scala.inline
    def setVoiceConnectorsVarargs(value: VoiceConnector*): Self = StObject.set(x, "VoiceConnectors", js.Array(value :_*))
  }
}
