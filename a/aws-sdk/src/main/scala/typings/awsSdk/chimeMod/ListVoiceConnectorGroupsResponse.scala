package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceConnectorGroupsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the Amazon Chime Voice Connector groups.
    */
  var VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList] = js.undefined
}
object ListVoiceConnectorGroupsResponse {
  
  inline def apply(): ListVoiceConnectorGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorGroupsResponse]
  }
  
  extension [Self <: ListVoiceConnectorGroupsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVoiceConnectorGroups(value: VoiceConnectorGroupList): Self = StObject.set(x, "VoiceConnectorGroups", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorGroupsUndefined: Self = StObject.set(x, "VoiceConnectorGroups", js.undefined)
    
    inline def setVoiceConnectorGroupsVarargs(value: VoiceConnectorGroup*): Self = StObject.set(x, "VoiceConnectorGroups", js.Array(value :_*))
  }
}
