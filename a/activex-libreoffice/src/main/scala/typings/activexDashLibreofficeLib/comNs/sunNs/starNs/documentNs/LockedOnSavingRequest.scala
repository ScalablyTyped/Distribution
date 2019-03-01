package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document on saving.
  * @since OOo 3.1
  */
trait LockedOnSavingRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The URL of the locked document. */
  var DocumentURL: java.lang.String
  /** The user information of the locked document. */
  var UserInfo: java.lang.String
}

object LockedOnSavingRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DocumentURL: java.lang.String,
    Message: java.lang.String,
    UserInfo: java.lang.String
  ): LockedOnSavingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("DocumentURL")(DocumentURL)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("UserInfo")(UserInfo)
    __obj.asInstanceOf[LockedOnSavingRequest]
  }
}

