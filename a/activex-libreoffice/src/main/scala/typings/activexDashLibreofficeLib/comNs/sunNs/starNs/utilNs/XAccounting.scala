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

object XAccounting {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    estimateUsage: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccounting = {
    val __obj = js.Dynamic.literal(acquire = acquire, estimateUsage = estimateUsage, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAccounting]
  }
}

