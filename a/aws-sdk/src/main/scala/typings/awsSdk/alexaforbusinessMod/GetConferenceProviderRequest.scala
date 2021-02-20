package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConferenceProviderRequest extends StObject {
  
  /**
    * The ARN of the newly created conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
}
object GetConferenceProviderRequest {
  
  @scala.inline
  def apply(ConferenceProviderArn: Arn): GetConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConferenceProviderRequest]
  }
  
  @scala.inline
  implicit class GetConferenceProviderRequestMutableBuilder[Self <: GetConferenceProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceProviderArn(value: Arn): Self = StObject.set(x, "ConferenceProviderArn", value.asInstanceOf[js.Any])
  }
}
