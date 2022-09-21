package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConferenceProvidersResponse extends StObject {
  
  /**
    * The conference providers.
    */
  var ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.undefined
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
}
object ListConferenceProvidersResponse {
  
  inline def apply(): ListConferenceProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConferenceProvidersResponse]
  }
  
  extension [Self <: ListConferenceProvidersResponse](x: Self) {
    
    inline def setConferenceProviders(value: ConferenceProvidersList): Self = StObject.set(x, "ConferenceProviders", value.asInstanceOf[js.Any])
    
    inline def setConferenceProvidersUndefined: Self = StObject.set(x, "ConferenceProviders", js.undefined)
    
    inline def setConferenceProvidersVarargs(value: ConferenceProvider*): Self = StObject.set(x, "ConferenceProviders", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
