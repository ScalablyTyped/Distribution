package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConferenceProviderResponse extends StObject {
  
  /**
    * The ARN of the newly-created conference provider.
    */
  var ConferenceProviderArn: js.UndefOr[Arn] = js.undefined
}
object CreateConferenceProviderResponse {
  
  inline def apply(): CreateConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceProviderResponse]
  }
  
  extension [Self <: CreateConferenceProviderResponse](x: Self) {
    
    inline def setConferenceProviderArn(value: Arn): Self = StObject.set(x, "ConferenceProviderArn", value.asInstanceOf[js.Any])
    
    inline def setConferenceProviderArnUndefined: Self = StObject.set(x, "ConferenceProviderArn", js.undefined)
  }
}
