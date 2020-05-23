package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Calculator = Calculator.asInstanceOf[js.Any], EquationProperties = EquationProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCalculator = js.Any.fromFunction0(getCalculator), getEquationProperties = js.Any.fromFunction0(getEquationProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEquationProperties = js.Any.fromFunction1(setEquationProperties))
    __obj.asInstanceOf[XRegressionCurve]
  }
}

