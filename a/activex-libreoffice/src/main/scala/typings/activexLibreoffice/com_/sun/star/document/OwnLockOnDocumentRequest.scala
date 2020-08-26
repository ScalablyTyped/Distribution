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
  implicit class OwnLockOnDocumentRequestOps[Self <: OwnLockOnDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("DocumentURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStoring(value: Boolean): Self = this.set("IsStoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeInfo(value: String): Self = this.set("TimeInfo", value.asInstanceOf[js.Any])
  }
  
}

