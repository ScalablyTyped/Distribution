package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConferenceProviderResponse extends StObject {
  
  /**
    * The conference provider.
    */
  var ConferenceProvider: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ConferenceProvider] = js.native
}
object GetConferenceProviderResponse {
  
  @scala.inline
  def apply(): GetConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConferenceProviderResponse]
  }
  
  @scala.inline
  implicit class GetConferenceProviderResponseMutableBuilder[Self <: GetConferenceProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceProvider(value: ConferenceProvider): Self = StObject.set(x, "ConferenceProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceProviderUndefined: Self = StObject.set(x, "ConferenceProvider", js.undefined)
  }
}
