package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceProfilesResponse extends StObject {
  
  /**
    * The token used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of voice profiles.
    */
  var VoiceProfiles: js.UndefOr[VoiceProfileSummaryList] = js.undefined
}
object ListVoiceProfilesResponse {
  
  inline def apply(): ListVoiceProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVoiceProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVoiceProfiles(value: VoiceProfileSummaryList): Self = StObject.set(x, "VoiceProfiles", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfilesUndefined: Self = StObject.set(x, "VoiceProfiles", js.undefined)
    
    inline def setVoiceProfilesVarargs(value: VoiceProfileSummary*): Self = StObject.set(x, "VoiceProfiles", js.Array(value*))
  }
}
