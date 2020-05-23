package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], IsStoring = IsStoring.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TimeInfo = TimeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnLockOnDocumentRequest]
  }
}

