package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRegressionCurve extends XInterface {
  val Calculator: XRegressionCurveCalculator
  var EquationProperties: XPropertySet
  def getCalculator(): XRegressionCurveCalculator
  def getEquationProperties(): XPropertySet
  def setEquationProperties(xEquationProperties: XPropertySet): Unit
}

object XRegressionCurve {
  @scala.inline
  def apply(
    Calculator: XRegressionCurveCalculator,
    EquationProperties: XPropertySet,
    acquire: () => Unit,
    getCalculator: () => XRegressionCurveCalculator,
    getEquationProperties: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEquationProperties: XPropertySet => Unit
  ): XRegressionCurve = {
    val __obj = js.Dynamic.literal(Calculator = Calculator, EquationProperties = EquationProperties, acquire = js.Any.fromFunction0(acquire), getCalculator = js.Any.fromFunction0(getCalculator), getEquationProperties = js.Any.fromFunction0(getEquationProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEquationProperties = js.Any.fromFunction1(setEquationProperties))
  
    __obj.asInstanceOf[XRegressionCurve]
  }
}

