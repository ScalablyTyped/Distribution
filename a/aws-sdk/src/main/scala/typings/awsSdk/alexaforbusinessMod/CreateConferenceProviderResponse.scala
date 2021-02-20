package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConferenceProviderResponse extends StObject {
  
  /**
    * The ARN of the newly-created conference provider.
    */
  var ConferenceProviderArn: js.UndefOr[Arn] = js.native
}
object CreateConferenceProviderResponse {
  
  @scala.inline
  def apply(): CreateConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceProviderResponse]
  }
  
  @scala.inline
  implicit class CreateConferenceProviderResponseMutableBuilder[Self <: CreateConferenceProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceProviderArn(value: Arn): Self = StObject.set(x, "ConferenceProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceProviderArnUndefined: Self = StObject.set(x, "ConferenceProviderArn", js.undefined)
  }
}
