package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.1
  */
@js.native
trait OwnLockOnDocumentRequest extends Exception {
  
  /** The URL of the locked document. */
  var DocumentURL: String = js.native
  
  /** Whether the request is related to storing process */
  var IsStoring: Boolean = js.native
  
  /** The time from which the document is locked. */
  var TimeInfo: String = js.native
}
object OwnLockOnDocumentRequest {
  
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, IsStoring: Boolean, Message: String, TimeInfo: String): OwnLockOnDocumentRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], IsStoring = IsStoring.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TimeInfo = TimeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnLockOnDocumentRequest]
  }
  
  @scala.inline
  implicit class OwnLockOnDocumentRequestMutableBuilder[Self <: OwnLockOnDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStoring(value: Boolean): Self = StObject.set(x, "IsStoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInfo(value: String): Self = StObject.set(x, "TimeInfo", value.asInstanceOf[js.Any])
  }
}
