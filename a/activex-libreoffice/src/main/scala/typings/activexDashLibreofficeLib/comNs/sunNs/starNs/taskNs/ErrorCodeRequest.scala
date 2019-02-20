package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a general error exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 1.1.2
  */
trait ErrorCodeRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** specifies the error code. */
  var ErrCode: scala.Double
}

