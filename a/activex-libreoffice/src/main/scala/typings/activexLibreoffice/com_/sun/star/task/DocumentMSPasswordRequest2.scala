package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this request specifies if a password for opening or modifying of an encrypted Microsoft Office document is requested.
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @see com.sun.star.task.PasswordRequest
  * @see com.sun.star.task.DocumentMSPasswordRequest
  * @since OOo 3.3
  */
@js.native
trait DocumentMSPasswordRequest2 extends DocumentMSPasswordRequest {
  
  /** specifies if the requested password is for opening a document or for modifying it. */
  var IsRequestPasswordToModify: Boolean = js.native
}
object DocumentMSPasswordRequest2 {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    IsRequestPasswordToModify: Boolean,
    Message: String,
    Mode: PasswordRequestMode,
    Name: String
  ): DocumentMSPasswordRequest2 = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], IsRequestPasswordToModify = IsRequestPasswordToModify.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMSPasswordRequest2]
  }
  
  @scala.inline
  implicit class DocumentMSPasswordRequest2MutableBuilder[Self <: DocumentMSPasswordRequest2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequestPasswordToModify(value: Boolean): Self = StObject.set(x, "IsRequestPasswordToModify", value.asInstanceOf[js.Any])
  }
}
