package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows access to a one-dimensional sequence of double precision floating-point numbers. */
trait XNumericalDataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves data as `double` values. */
  val NumericalData: stdLib.SafeArray[scala.Double]
  /** retrieves data as `double` values. */
  def getNumericalData(): stdLib.SafeArray[scala.Double]
}

object XNumericalDataSequence {
  @scala.inline
  def apply(
    NumericalData: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getNumericalData: () => stdLib.SafeArray[scala.Double],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNumericalDataSequence = {
    val __obj = js.Dynamic.literal(NumericalData = NumericalData, acquire = js.Any.fromFunction0(acquire), getNumericalData = js.Any.fromFunction0(getNumericalData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumericalDataSequence]
  }
}

