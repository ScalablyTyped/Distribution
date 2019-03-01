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
    acquire: js.Function0[scala.Unit],
    getCalculator: js.Function0[XRegressionCurveCalculator],
    getEquationProperties: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setEquationProperties: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit]
  ): XRegressionCurve = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Calculator")(Calculator)
    __obj.updateDynamic("EquationProperties")(EquationProperties)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCalculator")(getCalculator)
    __obj.updateDynamic("getEquationProperties")(getEquationProperties)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setEquationProperties")(setEquationProperties)
    __obj.asInstanceOf[XRegressionCurve]
  }
}

