package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConferenceProviderResponse extends StObject {
  
  /**
    * The conference provider.
    */
  var ConferenceProvider: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ConferenceProvider] = js.undefined
}
object GetConferenceProviderResponse {
  
  inline def apply(): GetConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConferenceProviderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConferenceProviderResponse] (val x: Self) extends AnyVal {
    
    inline def setConferenceProvider(value: ConferenceProvider): Self = StObject.set(x, "ConferenceProvider", value.asInstanceOf[js.Any])
    
    inline def setConferenceProviderUndefined: Self = StObject.set(x, "ConferenceProvider", js.undefined)
  }
}
