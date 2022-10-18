package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConferenceProviderRequest extends StObject {
  
  /**
    * The ARN of the newly created conference provider.
    */
  var ConferenceProviderArn: Arn
}
object GetConferenceProviderRequest {
  
  inline def apply(ConferenceProviderArn: Arn): GetConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConferenceProviderRequest]
  }
  
  extension [Self <: GetConferenceProviderRequest](x: Self) {
    
    inline def setConferenceProviderArn(value: Arn): Self = StObject.set(x, "ConferenceProviderArn", value.asInstanceOf[js.Any])
  }
}
