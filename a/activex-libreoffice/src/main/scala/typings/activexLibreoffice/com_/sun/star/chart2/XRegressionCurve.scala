package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRegressionCurve extends XInterface {
  val Calculator: XRegressionCurveCalculator = js.native
  var EquationProperties: XPropertySet = js.native
  def getCalculator(): XRegressionCurveCalculator = js.native
  def getEquationProperties(): XPropertySet = js.native
  def setEquationProperties(xEquationProperties: XPropertySet): Unit = js.native
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
  @scala.inline
  implicit class XRegressionCurveOps[Self <: XRegressionCurve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalculator(value: XRegressionCurveCalculator): Self = this.set("Calculator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEquationProperties(value: XPropertySet): Self = this.set("EquationProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCalculator(value: () => XRegressionCurveCalculator): Self = this.set("getCalculator", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEquationProperties(value: () => XPropertySet): Self = this.set("getEquationProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEquationProperties(value: XPropertySet => Unit): Self = this.set("setEquationProperties", js.Any.fromFunction1(value))
  }
  
}

