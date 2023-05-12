package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceProfileDomainsResponse extends StObject {
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of voice profile domains.
    */
  var VoiceProfileDomains: js.UndefOr[VoiceProfileDomainSummaryList] = js.undefined
}
object ListVoiceProfileDomainsResponse {
  
  inline def apply(): ListVoiceProfileDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceProfileDomainsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVoiceProfileDomainsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVoiceProfileDomains(value: VoiceProfileDomainSummaryList): Self = StObject.set(x, "VoiceProfileDomains", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainsUndefined: Self = StObject.set(x, "VoiceProfileDomains", js.undefined)
    
    inline def setVoiceProfileDomainsVarargs(value: VoiceProfileDomainSummary*): Self = StObject.set(x, "VoiceProfileDomains", js.Array(value*))
  }
}
