package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows access to a one-dimensional sequence of double precision floating-point numbers. */
trait XNumericalDataSequence extends XInterface {
  /** retrieves data as `double` values. */
  val NumericalData: SafeArray[Double]
  /** retrieves data as `double` values. */
  def getNumericalData(): SafeArray[Double]
}

object XNumericalDataSequence {
  @scala.inline
  def apply(
    NumericalData: SafeArray[Double],
    acquire: () => Unit,
    getNumericalData: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumericalDataSequence = {
    val __obj = js.Dynamic.literal(NumericalData = NumericalData, acquire = js.Any.fromFunction0(acquire), getNumericalData = js.Any.fromFunction0(getNumericalData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumericalDataSequence]
  }
}

