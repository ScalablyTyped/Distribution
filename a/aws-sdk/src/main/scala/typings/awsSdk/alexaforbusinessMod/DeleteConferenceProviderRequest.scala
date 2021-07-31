package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConferenceProviderRequest extends StObject {
  
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn
}
object DeleteConferenceProviderRequest {
  
  @scala.inline
  def apply(ConferenceProviderArn: Arn): DeleteConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConferenceProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteConferenceProviderRequestMutableBuilder[Self <: DeleteConferenceProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceProviderArn(value: Arn): Self = StObject.set(x, "ConferenceProviderArn", value.asInstanceOf[js.Any])
  }
}
