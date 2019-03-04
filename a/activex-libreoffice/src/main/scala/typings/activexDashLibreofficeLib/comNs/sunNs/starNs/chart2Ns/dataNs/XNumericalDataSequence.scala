package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows access to a one-dimensional sequence of double precision floating-point numbers. */
trait XNumericalDataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves data as `double` values. */
  val NumericalData: activexDashInteropLib.SafeArray[scala.Double]
  /** retrieves data as `double` values. */
  def getNumericalData(): activexDashInteropLib.SafeArray[scala.Double]
}

object XNumericalDataSequence {
  @scala.inline
  def apply(
    NumericalData: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getNumericalData: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNumericalDataSequence = {
    val __obj = js.Dynamic.literal(NumericalData = NumericalData, acquire = acquire, getNumericalData = getNumericalData, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNumericalDataSequence]
  }
}

