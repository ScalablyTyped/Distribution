package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.0
  */
trait LockedDocumentRequest
  extends StObject
     with Exception {
  
  /** The URL of the locked document. */
  var DocumentURL: String
  
  /** The user information of the locked document. */
  var UserInfo: String
}
object LockedDocumentRequest {
  
  inline def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedDocumentRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockedDocumentRequest]
  }
  
  extension [Self <: LockedDocumentRequest](x: Self) {
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: String): Self = StObject.set(x, "UserInfo", value.asInstanceOf[js.Any])
  }
}
