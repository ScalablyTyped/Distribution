package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRegressionCurve
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Calculator: XRegressionCurveCalculator
  var EquationProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  def getCalculator(): XRegressionCurveCalculator
  def getEquationProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  def setEquationProperties(xEquationProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
}

object XRegressionCurve {
  @scala.inline
  def apply(
    Calculator: XRegressionCurveCalculator,
    EquationProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: () => scala.Unit,
    getCalculator: () => XRegressionCurveCalculator,
    getEquationProperties: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setEquationProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => scala.Unit
  ): XRegressionCurve = {
    val __obj = js.Dynamic.literal(Calculator = Calculator, EquationProperties = EquationProperties, acquire = js.Any.fromFunction0(acquire), getCalculator = js.Any.fromFunction0(getCalculator), getEquationProperties = js.Any.fromFunction0(getEquationProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEquationProperties = js.Any.fromFunction1(setEquationProperties))
  
    __obj.asInstanceOf[XRegressionCurve]
  }
}

