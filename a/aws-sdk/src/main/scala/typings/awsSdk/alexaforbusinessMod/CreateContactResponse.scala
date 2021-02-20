package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactResponse extends StObject {
  
  /**
    * The ARN of the newly created address book.
    */
  var ContactArn: js.UndefOr[Arn] = js.native
}
object CreateContactResponse {
  
  @scala.inline
  def apply(): CreateContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactResponse]
  }
  
  @scala.inline
  implicit class CreateContactResponseMutableBuilder[Self <: CreateContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactArnUndefined: Self = StObject.set(x, "ContactArn", js.undefined)
  }
}
