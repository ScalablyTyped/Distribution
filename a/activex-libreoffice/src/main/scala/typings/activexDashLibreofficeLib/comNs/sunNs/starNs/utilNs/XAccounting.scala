package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows estimating the memory usage of a service.
  * @since LibreOffice 5.3
  */
trait XAccounting
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an estimate of the current memory usage, in octets. */
  def estimateUsage(): scala.Double
}

