package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactResponse extends StObject {
  
  /**
    * The ARN of the newly created address book.
    */
  var ContactArn: js.UndefOr[Arn] = js.undefined
}
object CreateContactResponse {
  
  inline def apply(): CreateContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContactResponse] (val x: Self) extends AnyVal {
    
    inline def setContactArn(value: Arn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContactArnUndefined: Self = StObject.set(x, "ContactArn", js.undefined)
  }
}
