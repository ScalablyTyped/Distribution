package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceProfilesRequest extends StObject {
  
  /**
    * The maximum number of results in the request.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the voice profile domain.
    */
  var VoiceProfileDomainId: NonEmptyString256
}
object ListVoiceProfilesRequest {
  
  inline def apply(VoiceProfileDomainId: NonEmptyString256): ListVoiceProfilesRequest = {
    val __obj = js.Dynamic.literal(VoiceProfileDomainId = VoiceProfileDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoiceProfilesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVoiceProfilesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
  }
}
