package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.0
  */
trait LockedDocumentRequest extends Exception {
  /** The URL of the locked document. */
  var DocumentURL: String
  /** The user information of the locked document. */
  var UserInfo: String
}

object LockedDocumentRequest {
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedDocumentRequest = {
    val __obj = js.Dynamic.literal(Context = Context, DocumentURL = DocumentURL, Message = Message, UserInfo = UserInfo)
  
    __obj.asInstanceOf[LockedDocumentRequest]
  }
}

