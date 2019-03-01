package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.1
  */
trait OwnLockOnDocumentRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The URL of the locked document. */
  var DocumentURL: java.lang.String
  /** Whether the request is related to storing process */
  var IsStoring: scala.Boolean
  /** The time from which the document is locked. */
  var TimeInfo: java.lang.String
}

object OwnLockOnDocumentRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DocumentURL: java.lang.String,
    IsStoring: scala.Boolean,
    Message: java.lang.String,
    TimeInfo: java.lang.String
  ): OwnLockOnDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("DocumentURL")(DocumentURL)
    __obj.updateDynamic("IsStoring")(IsStoring)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("TimeInfo")(TimeInfo)
    __obj.asInstanceOf[OwnLockOnDocumentRequest]
  }
}

