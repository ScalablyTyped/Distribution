package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.0
  */
@js.native
trait LockedDocumentRequest extends Exception {
  /** The URL of the locked document. */
  var DocumentURL: String = js.native
  /** The user information of the locked document. */
  var UserInfo: String = js.native
}

object LockedDocumentRequest {
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedDocumentRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockedDocumentRequest]
  }
  @scala.inline
  implicit class LockedDocumentRequestOps[Self <: LockedDocumentRequest] (val x: Self) extends AnyVal {
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
    def setUserInfo(value: String): Self = this.set("UserInfo", value.asInstanceOf[js.Any])
  }
  
}

