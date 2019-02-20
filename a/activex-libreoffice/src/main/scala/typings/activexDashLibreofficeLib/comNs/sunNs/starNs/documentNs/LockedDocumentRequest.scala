package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.0
  */
trait LockedDocumentRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The URL of the locked document. */
  var DocumentURL: java.lang.String
  /** The user information of the locked document. */
  var UserInfo: java.lang.String
}

