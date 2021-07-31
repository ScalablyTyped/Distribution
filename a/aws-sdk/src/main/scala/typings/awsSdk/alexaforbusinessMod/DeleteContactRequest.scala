package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactRequest extends StObject {
  
  /**
    * The ARN of the contact to delete.
    */
  var ContactArn: Arn
}
object DeleteContactRequest {
  
  @scala.inline
  def apply(ContactArn: Arn): DeleteContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactRequest]
  }
  
  @scala.inline
  implicit class DeleteContactRequestMutableBuilder[Self <: DeleteContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
  }
}
