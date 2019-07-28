package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document on saving.
  * @since OOo 3.1
  */
trait LockedOnSavingRequest extends Exception {
  /** The URL of the locked document. */
  var DocumentURL: String
  /** The user information of the locked document. */
  var UserInfo: String
}

object LockedOnSavingRequest {
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedOnSavingRequest = {
    val __obj = js.Dynamic.literal(Context = Context, DocumentURL = DocumentURL, Message = Message, UserInfo = UserInfo)
  
    __obj.asInstanceOf[LockedOnSavingRequest]
  }
}

