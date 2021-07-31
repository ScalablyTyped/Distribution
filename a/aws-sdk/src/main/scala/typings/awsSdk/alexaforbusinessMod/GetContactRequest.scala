package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactRequest extends StObject {
  
  /**
    * The ARN of the contact for which to request details.
    */
  var ContactArn: Arn
}
object GetContactRequest {
  
  @scala.inline
  def apply(ContactArn: Arn): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactRequest]
  }
  
  @scala.inline
  implicit class GetContactRequestMutableBuilder[Self <: GetContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
  }
}
