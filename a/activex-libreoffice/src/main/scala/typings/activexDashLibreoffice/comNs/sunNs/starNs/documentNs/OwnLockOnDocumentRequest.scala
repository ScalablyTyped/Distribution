package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.1
  */
trait OwnLockOnDocumentRequest extends Exception {
  /** The URL of the locked document. */
  var DocumentURL: String
  /** Whether the request is related to storing process */
  var IsStoring: Boolean
  /** The time from which the document is locked. */
  var TimeInfo: String
}

object OwnLockOnDocumentRequest {
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, IsStoring: Boolean, Message: String, TimeInfo: String): OwnLockOnDocumentRequest = {
    val __obj = js.Dynamic.literal(Context = Context, DocumentURL = DocumentURL, IsStoring = IsStoring, Message = Message, TimeInfo = TimeInfo)
  
    __obj.asInstanceOf[OwnLockOnDocumentRequest]
  }
}

